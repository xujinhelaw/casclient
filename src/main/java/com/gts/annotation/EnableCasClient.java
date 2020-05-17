package com.gts.annotation;

import com.gts.configuration.CasClientConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Import(CasClientConfiguration.class)
public @interface EnableCasClient {
}
