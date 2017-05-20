package com.qfwj.quarzspring.quartz.factory;


import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.stereotype.Component;

/**
 * Created by zhbo on 2017/5/13.
 */
@Component
public class QuartzUnionFactory extends AdaptableJobFactory {
    @Autowired
    private AutowireCapableBeanFactory capableBeanFactory;

    @Override
    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
        Object instance =   super.createJobInstance(bundle);
        capableBeanFactory.autowireBean(instance);
        return instance;
    }
}
