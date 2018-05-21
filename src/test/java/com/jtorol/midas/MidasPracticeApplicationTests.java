package com.jtorol.midas;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MidasPracticeApplication.class)
@WebAppConfiguration
public class MidasPracticeApplicationTests {

	@Autowired
	private DataSource ds;

	@Autowired
	private SqlSessionFactory sqlSession;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testConnection() throws Exception {
		System.out.println("ds : " + ds);
		Connection con = ds.getConnection();
		System.out.println("con : " + con);
		con.close();
	}

	// SqlSessionFactory 잘 받아지는지 확인
	@Test
	public void testSqlSession() throws Exception {
		System.out.println("sqlSession : " + sqlSession);
	}
}
