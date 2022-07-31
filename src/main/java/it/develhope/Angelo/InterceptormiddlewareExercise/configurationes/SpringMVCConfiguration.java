package it.develhope.Angelo.InterceptormiddlewareExercise.configurationes;

import it.develhope.Angelo.InterceptormiddlewareExercise.interceptors.APILoggingInterceptor;
import it.develhope.Angelo.InterceptormiddlewareExercise.interceptors.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMVCConfiguration implements WebMvcConfigurer {

    //injection
    @Autowired
    private APILoggingInterceptor apiLoggingInterceptor;

    @Autowired
    private LegacyInterceptor legacyInterceptor;

    //add interceptor
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(apiLoggingInterceptor);
        registry.addInterceptor(legacyInterceptor);
    }
}
