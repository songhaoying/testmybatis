package sy.service;

import java.util.List;

import sy.model.HonestWeixinUser;

public interface HonestWeixinUserServiceI {
	public HonestWeixinUser getHonestWeixinUserByOpenId(String openId);
	public List<HonestWeixinUser>getAllHonestWeixinUser();
	/**
	 * 获得所有关注用户的头像URL
	 * @return List<String>
	 */
	public List<String> getAllUserHeadImg();
}
