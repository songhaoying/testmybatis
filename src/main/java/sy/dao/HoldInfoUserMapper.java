package sy.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sy.model.HoldInfoUser;
import sy.model.HoldInfoUserExample;

public interface HoldInfoUserMapper {
    int countByExample(HoldInfoUserExample example);

    int deleteByExample(HoldInfoUserExample example);

    int insert(HoldInfoUser record);

    int insertSelective(HoldInfoUser record);

    List<HoldInfoUser> selectByExample(HoldInfoUserExample example);

    int updateByExampleSelective(@Param("record") HoldInfoUser record, @Param("example") HoldInfoUserExample example);

    int updateByExample(@Param("record") HoldInfoUser record, @Param("example") HoldInfoUserExample example);
}