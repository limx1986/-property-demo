package me.limx.propertydemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author limingxing
 * @date 2019-09-01
 * @since 1.0
 */
@Configuration
@PropertySource(value = "classpath:my.properties")
public class MyPropertySource {
}
