package sy.test;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sy.model.HonestWeixinUser;
import sy.model.User;
import sy.service.HonestWeixinUserServiceI;
import sy.service.UserServiceI;

import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestMybatis {

	private static final Logger logger = Logger.getLogger(TestMybatis.class);

	private UserServiceI userService;
	private HonestWeixinUserServiceI honestWeixinUserService;
	/**
	 * @return the honestWeixinUserService
	 */
	public HonestWeixinUserServiceI getHonestWeixinUserService() {
		return honestWeixinUserService;
	}

@Autowired
	public void setHonestWeixinUserService(HonestWeixinUserServiceI honestWeixinUserService) {
		this.honestWeixinUserService = honestWeixinUserService;
	}

	public UserServiceI getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}

	@Test
	public void test1() {
		User u = userService.getUserById("1");
		logger.info(JSON.toJSONStringWithDateFormat(u, "yyyy-MM-dd HH:mm:ss"));
	}

	@Test
	public void test2() {
		List<User> l = userService.getAll();
		logger.info(JSON.toJSONStringWithDateFormat(l, "yyyy-MM-dd HH:mm:ss"));
	}

	@Test
	public void test3() {
		List<User> l = userService.getAll2();
		logger.info(JSON.toJSONStringWithDateFormat(l, "yyyy-MM-dd HH:mm:ss"));
	}

	@Test
	public void test4() {
		List<User> l = userService.getAll3();
		logger.info(JSON.toJSONStringWithDateFormat(l, "yyyy-MM-dd HH:mm:ss"));
	}
	
	@Test
	public void test5(){
		logger.info("ok");
		logger.info( JSON.toJSONString(honestWeixinUserService.getHonestWeixinUserByOpenId("o53-7js5FdmNiuN0BWQ01uhbXYoI")));
	}
	
	public static void main(String args[]){
		ApplicationContext appLicationContext=null;
		String[] fileUrl= new String[]{"classpath*:*spring*.xml"};
		appLicationContext= new ClassPathXmlApplicationContext(fileUrl);
		UserServiceI us=(UserServiceI)appLicationContext.getBean("userService");
		HonestWeixinUserServiceI honestWeixinUserS= (HonestWeixinUserServiceI)appLicationContext.getBean("honestWeixinUserService");
		System.out.println("ok1");
		logger.info("ok!!!!");
		HonestWeixinUser wxUser=null;
		wxUser= honestWeixinUserS.getHonestWeixinUserByOpenId("o53-7js5FdmNiuN0BWQ01uhbXYoI");
		logger.info("111111111111"+JSON.toJSONString(wxUser));
		wxUser.getHeadImgUrl();
		List<HonestWeixinUser> users=honestWeixinUserS.getAllHonestWeixinUser();
		for(HonestWeixinUser u:users){
			logger.info(u.getHeadImgUrl());
		}
	}
}
