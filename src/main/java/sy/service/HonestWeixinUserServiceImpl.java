package sy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.HonestWeixinUserMapper;
import sy.model.HonestWeixinUser;

@Service("honestWeixinUserService")
public class HonestWeixinUserServiceImpl implements HonestWeixinUserServiceI {

	private HonestWeixinUserMapper honestWeixinUserMapper;
	public HonestWeixinUserMapper getHonestWeixinUserMapper() {
		return honestWeixinUserMapper;
	}
	
	@Autowired
	public void setHonestWeixinUserMapper(HonestWeixinUserMapper honestWeixinUserMapper) {
		this.honestWeixinUserMapper = honestWeixinUserMapper;
	}
	@Override
	public HonestWeixinUser getHonestWeixinUserByOpenId(String openId) {
		return honestWeixinUserMapper.selectByPrimaryKey(openId) ;
	}

	@Override
	public List<HonestWeixinUser> getAllHonestWeixinUser() {
		 return this.honestWeixinUserMapper.getAllHonestWeixinUser();
	}

}
