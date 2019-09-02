package me.limx.propertydemo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

/**
 * @author limingxing
 * @date 2019-09-01
 * @since 1.0
 */
@Configuration
@ConditionalOnProperty(value = "key")
public class PropertyConfiguration implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("my configuration init..");
    }
}
