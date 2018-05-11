package project.joseph.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by josephgan on 5/11/18.
 */
@Configuration
@EnableWebMvc
@ComponentScan("project.joseph")
public class ServletConfig extends WebMvcConfigurerAdapter {
    @Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
        resourceViewResolver.setPrefix("/");
        resourceViewResolver.setSuffix(".jsp");
        return resourceViewResolver;
    }
}
