package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * @author：Mr.Ji;
 * @date:2020/3/6;
 * @description:
 */
public interface AccountService {
  //查询所有账户信息
  public List<Account> findAll();
  //保存账户信息
  public void saveAccount(Account account);
}
