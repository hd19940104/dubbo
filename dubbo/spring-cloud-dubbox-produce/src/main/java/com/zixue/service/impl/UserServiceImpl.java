
package com.zixue.service.impl;

import com.zixue.service.UserService;

public class UserServiceImpl implements UserService {

	public String getUser(Integer id) {
		System.out.println("被客户端(消费者)消费....id:" + id);
		if (id == 1) {
			return "余胜军";
		}
		if (id == 2) {
			return "扎克伯格";
		}
		if (id == 1) {
			return "码云";
		}
		return "未找到...";

	}

}
