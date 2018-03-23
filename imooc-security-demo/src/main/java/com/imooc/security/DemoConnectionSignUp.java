/**
 * 
 */
package com.imooc.security;

import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;

/**
 * @author zhailiang
 *
 */
//@Component  //此组件如果打开，将会告知social，客户端程序已经 后台静默处理了用户的绑定，无需在跳转到 注册绑定页 /singUp
public class DemoConnectionSignUp implements ConnectionSignUp {

	/* (non-Javadoc)
	 * @see org.springframework.social.connect.ConnectionSignUp#execute(org.springframework.social.connect.Connection)
	 */
	@Override
	public String execute(Connection<?> connection) {
		//根据社交用户信息默认创建用户并返回用户唯一标识，这里假设用社交用户的显示名称创建用户，并返回创建后的唯一标识
		// 下面创建用户的过程略，假设创建的用户id是 connection.getDisplayName ，直接返回
		return connection.getDisplayName();
	}

}
