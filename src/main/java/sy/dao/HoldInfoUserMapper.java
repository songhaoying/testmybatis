package sy.dao;

import sy.model.HoldInfoUser;

public interface HoldInfoUserMapper {
    int insert(HoldInfoUser record);

    int insertSelective(HoldInfoUser record);
}