/**
 * 
 */
package com.imooc.security.app.social;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.imooc.security.core.properties.SecurityConstants;
import com.imooc.security.core.social.support.ImoocSpringSocialConfigurer;

/**
 * 每个bean 实例化前后的 处理
 *
 */
@Component
public class SpringSocialConfigurerPostProcessor implements BeanPostProcessor {

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessBeforeInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		/*
		当bean的名称是 imoocSocialSecurityConfig 时，重新设置社交登录成功后的跳转页，此代码只在app下有用，因为app下才
		有这个类，app下应当是跳转到后台的一个Controller方法，然后返回json信息给app，而非直接跳转到html页面
		 ，browser下 的 登录成功后跳转页不变，直接到 如 imooc_singUp.html
		*/
		if(StringUtils.equals(beanName, "imoocSocialSecurityConfig")){
			ImoocSpringSocialConfigurer config = (ImoocSpringSocialConfigurer)bean;
			config.signupUrl(SecurityConstants.DEFAULT_SOCIAL_USER_INFO_URL);
			return config;
		}
		return bean;
	}

}
