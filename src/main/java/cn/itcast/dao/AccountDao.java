package cn.itcast.dao;

import cn.itcast.domain.Account;
import com.sun.org.glassfish.gmbal.IncludeSubclass;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author：Mr.Ji;
 * @date:2020/3/6;
 * @description:
 */

@Repository
public interface AccountDao {


  //查询所有账户信息
  @Select("select * from account")
  public List<Account> findAll();
  //保存账户信息
  @Insert("insert into account(name,money) values(#{name},#{money})")
  public void saveAccount(Account account);
}
