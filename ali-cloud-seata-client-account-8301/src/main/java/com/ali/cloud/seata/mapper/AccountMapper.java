package com.ali.cloud.seata.mapper;


import com.ali.cloud.seata.entity.AccountDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.math.BigDecimal;

@Mapper
public interface AccountMapper  {
//    @Update("update account_tbl set count=count - #{count} where user_id = #{userId}")
    int updateAccountMemony(@Param("userId") String userId, @Param("money") BigDecimal money);

    AccountDTO selectAccount(@Param("userId")String userId);
}
