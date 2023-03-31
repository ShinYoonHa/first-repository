package com.kit.dormitory;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
                classes = Configuration.class)
)
public class ComAppConfig {

}
