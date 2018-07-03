package com.hhen.controller;

import com.hhen.config.JsonResult;
import com.hhen.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: imsprojo2Fan
 * @Description:
 * @Date: Created in 11:40 2018/7/2
 * @Modified By:
 */
@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private UserService userService;


	@RequestMapping(value = "/")
	public String index(){
		return "html/login.html";
	}

	/*@GetMapping(value = "/login")
	public String loginIndex(){
		return "html/login.html";
	}*/


	/**
	 * 根据ID查询用户
	 * @param account password
	 * @return
	 */
	@ApiOperation(value="用户登录验证", notes="根据表单账号及密码验证用户")
	@ApiImplicitParams({
			@ApiImplicitParam(
					paramType = "form", dataType = "String", name = "account", value = "用户账号", required = true),
			@ApiImplicitParam(
					paramType = "form", dataType = "String", name = "password", value = "用户密码", required = true)
	})
	@PostMapping(value = "/login")
	@ResponseBody
	public Object  login(String account,String password) {
		System.out.println("account:"+account+"-password:"+password);
		return new JsonResult(1,"success",null);
	}


}
