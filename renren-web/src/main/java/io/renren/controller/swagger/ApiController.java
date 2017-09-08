package io.renren.controller.swagger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.renren.annotation.IgnoreAuth;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "api")
@Controller
@RequestMapping("/api")
public class ApiController {
	
	//计算还款时间  --加状态还款前三天
	@ApiOperation("获取用户借款状态 返回用户最近一条借款记录 如果为空则表示用户无有效借款记录")
	@RequestMapping(value = "/getBorrowStatus",method = RequestMethod.POST)
	@IgnoreAuth
	@ResponseBody
	public boolean getBorrowStatus(@RequestParam(value = "user_id",required = true) Integer user_id) {
		
		return true;
	}

}
