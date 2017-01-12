package sy.service;

import java.util.List;

import sy.model.HonestWeixinUser;

public interface HonestWeixinUserServiceI {
	public HonestWeixinUser getHonestWeixinUserByOpenId(String openId);
	public List<HonestWeixinUser>getAllHonestWeixinUser();
}
