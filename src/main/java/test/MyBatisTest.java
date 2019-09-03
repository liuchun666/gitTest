package test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Author:邓世友
 * Date: 2019/2/27 9:07
 */
public class MyBatisTest {
    private static Logger logger = Logger.getLogger(Test.class);
    public void excute() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //2.得到执行sql的对象
        SqlSession sqlSession = build.openSession();
        //3.执行sql语句
        logger.info("日志记录：");
        List<Map> list = sqlSession.selectList("selectStudent");
        //4.结果
        for (Map map : list) {
            System.out.println(map);
        }
        logger.info("日志记录ok：");
    }
    @Test
    public void excute1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //2.得到执行sql的对象
        SqlSession sqlSession = build.openSession();
        //3.执行sql语句
        logger.info("日志记录：");
        List<Map> list = sqlSession.selectList("selectUser");
        //4.结果
        for (Map map : list) {
            System.out.println(map);
        }
        logger.info("日志记录ok：");
        //5.关闭数据库
        sqlSession.close();
    }
}
