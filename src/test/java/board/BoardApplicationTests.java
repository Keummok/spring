package board;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import board.board.controller.BoardController;

@RunWith(SpringRunner.class)
@SpringBootTest
class BoardApplicationTests {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private BoardController boardController;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testSqlSession() throws Exception {
		System.out.println(sqlSession.toString());
	}
	
	@Test
	public void testController() throws Exception {
		System.out.println(boardController.toString());
	}

}
