package org.dlut.fastdfs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.dlut.common.core.utils.file.FileTypeUtils;

/**
 * FastDFS 文件存储
 *
 */
@Primary
@Service
public class FastDfsSysFileServiceImpl implements ISysFileService
{
    /**
     * 域名或本机访问地址
     */
    @Value("${fdfs.domain}")
    public String domain;

    @Autowired
    private FastFileStorageClient storageClient;

    /**
     * FastDfs文件上传接口
     * 
     * @param file 上传的文件
     * @return 访问地址
     * @throws Exception
     */
    @Override
    public String uploadFile(MultipartFile file) throws Exception
    {
        StorePath storePath = storageClient.uploadFile(file.getInputStream(), file.getSize(),
                FileTypeUtils.getExtension(file), null);
        return domain + ":8888" + "/" + storePath.getFullPath();
    }

    @Override
    public void deleteFile(String filePath) {
        StorePath storePath = StorePath.parseFromUrl(filePath);
        String group = storePath.getGroup();
        String path = storePath.getPath();
        storageClient.deleteFile(group, path);
    }
}
