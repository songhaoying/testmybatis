package sy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sy.model.HonestWeixinUser;
import sy.service.HonestWeixinUserServiceI;

@Controller
@RequestMapping("/weixinUserController")
public class WeixinUserController {
	
	
	private HonestWeixinUserServiceI honestWeixinUserService;
	
	public HonestWeixinUserServiceI getHonestWeixinUserService() {
		return honestWeixinUserService;
	}
	
	@Autowired
	public void setHonestWeixinUserService(
			HonestWeixinUserServiceI honestWeixinUserService) {
		this.honestWeixinUserService = honestWeixinUserService;
	}

	@RequestMapping("/showUserImg")
	public String showUserImg( HttpServletRequest request ){
	//	List<HonestWeixinUser> weixinUsers= this.honestWeixinUserService.getAllHonestWeixinUser();
		request.setAttribute("weixinUserImgs", this.honestWeixinUserService.getAllUserHeadImg());
		return "showUserImg";
	}
}
