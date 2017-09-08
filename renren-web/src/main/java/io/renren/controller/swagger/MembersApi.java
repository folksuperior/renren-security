package io.renren.controller.swagger;

import io.renren.annotation.IgnoreAuth;
import io.renren.service.SysLogService;
import io.renren.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;

@Api(value = "/api/memberType/")
@Controller
@RequestMapping("/api/memberType")
public class MembersApi {

	@Autowired
	private SysLogService sysLogService;
    @RequestMapping(value = "/getMemberInfoByGrowthValue", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "根据成长值，查询会员信息", httpMethod = "POST")
    @IgnoreAuth
    public R getMemberInfoByGrowthValue(@RequestParam("growthValue") String growthValue){
        //处理掉小数点的内容
        Long value = null;
        if (growthValue.contains(".")){
            value = new Long(growthValue.substring(0,growthValue.indexOf(".")));
        }else{
            value = new Long(growthValue);
        }
        return R.ok().put("success",true).put("data",value);
    }

    //@SysLog("查询会员体系列表")
    @RequestMapping(value = "/getAllMembersInfo", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "查询会员体系列表", httpMethod = "POST")
    @IgnoreAuth
    public R getMemberInfoByGrowthValue(){
        int all = sysLogService.queryTotal(new HashMap<String,Object>());
        return R.ok().put("success",true).put("data",all);
    }
}
