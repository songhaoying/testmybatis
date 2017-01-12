package sy.dao;

import java.util.List;

import sy.model.HonestWeixinUser;

public interface HonestWeixinUserMapper {
    int deleteByPrimaryKey(String openId);

    int insert(HonestWeixinUser record);

    int insertSelective(HonestWeixinUser record);

    HonestWeixinUser selectByPrimaryKey(String openId);

    int updateByPrimaryKeySelective(HonestWeixinUser record);

    int updateByPrimaryKey(HonestWeixinUser record);
    
   List<HonestWeixinUser> getAllHonestWeixinUser(); 
}