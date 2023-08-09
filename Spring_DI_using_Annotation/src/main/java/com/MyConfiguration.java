package com;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration				// == beans.xml file 
@ComponentScan(basePackages = {"com"})	// == <context:component-scan base-package="com"></context:component-scan> & enable the @Component annotation
public class MyConfiguration {

    //  No need to create any @Bean bcoz we are using @Component for each POJOs. 
    //  @Component takes the responsibility to create beans. 
    //  By default 'Bean-id' consider as Class name in camel naming rule which helps to pull the object from the container.
  
}
