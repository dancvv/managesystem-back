package org.dlut.job.task;


import org.dlut.common.core.utils.StringUtils;
import org.springframework.stereotype.Component;

/**
 * 定时调度任务
 */
@Component("uavTask")
public class RemoteTask {
    public void MultipleParams(String s, Boolean b, Long l, Double d, Integer i)
    {
        System.out.println(StringUtils.format("执行多参方法： 字符串类型{}，布尔类型{}，长整型{}，浮点型{}，整形{}", s, b, l, d, i));
    }

    public void Params(String params)
    {
        System.out.println("执行有参方法：" + params);
    }

    public void NoParams()
    {
        System.out.println("执行无参方法");
    }

}
