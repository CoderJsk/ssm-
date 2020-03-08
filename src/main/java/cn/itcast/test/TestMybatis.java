//package cn.itcast.test;
//
//import cn.itcast.dao.AccountDao;
//import cn.itcast.domain.Account;
//import org.apache.ibatis.io.Resources;
//
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.Test;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
///**
// * @author：Mr.Ji;
// * @date:2020/3/7;
// * @description:
// */
//
//
//public class TestMybatis {
//  @Test
//  public void run1() throws Exception {
//    //加载mybatis配置文件
//    InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
//    //创建sqlsessionfactory对象
//    SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//    //创建sqlsession对象
//    SqlSession session = factory.openSession();
//    //获取到代理对象
//    AccountDao dao = session.getMapper(AccountDao.class);
//    //查询所有数据
//    List<Account> list = dao.findAll();
//    for (Account account : list) {
//      System.out.println(account);
//    }
//    //关闭资源
//    session.close();
//    in.close();
//  }
//
//
//  @Test
//  public void run2() throws Exception {
//    Account  account = new Account();
//    //加载mybatis配置文件
//    InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
//    //创建sqlsessionfactory对象
//    SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//    //创建sqlsession对象
//    SqlSession session = factory.openSession();
//    //获取到代理对象
//    AccountDao dao = session.getMapper(AccountDao.class);
//    //保存数据
//    account.setName("ddd");
//    account.setMoney(1000d);
//    dao.saveAccount(account);
//    //提交数据
//    session.commit();
//    //关闭资源
//    session.close();
//    in.close();
//  }
//}
