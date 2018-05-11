package com.xa.jans.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 * @author zyl
 * @date 2018年2月27日
 * @desc 添加自己的web配置
 */
@Configuration
public class MyConfig implements WebMvcConfigurer{

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addViewControllers(org.springframework.web.servlet.config.annotation.ViewControllerRegistry)
	 * 这里重写的addViewControllers方法并不会覆盖WebMvnAutoConfiguration中的addViewControllers方法（在此方法中，SpringBoot把/映射到index.html页面）。
	 * 这也就意味着自己的配置和SpringBoot的自动配置同时生效。这是推荐的方式。
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/index.html").setViewName("/index");
		registry.addViewController("/chart.html").setViewName("/chart");
		registry.addViewController("/empty.html").setViewName("/empty");
		registry.addViewController("/form.html").setViewName("/form");
		registry.addViewController("/tab-panel.html").setViewName("/tab-panel");
		registry.addViewController("/table.html").setViewName("/table");
		registry.addViewController("/ui-elements.html").setViewName("/ui-elements");
	}
	

}
