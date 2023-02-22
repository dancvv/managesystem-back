package org.dlut.gateway.service;

import java.io.IOException;
import org.dlut.common.core.exception.CaptchaException;
import org.dlut.common.core.web.domain.AjaxResult;

/**
 * 验证码处理
 *
 */
public interface ValidateCodeService
{
    /**
     * 生成验证码
     */
    public AjaxResult createCaptcha() throws IOException, CaptchaException;

    /**
     * 校验验证码
     */
    public void checkCaptcha(String key, String value) throws CaptchaException;
}
