package Advice;

import java.sql.SQLException;
import java.text.Normalizer.Form;

public class ForumService {

	public void removeForum(int forumId) {
		throw new RuntimeException("运行异常");
	}
	
	public void updateForum(Forum forum) throws Exception {
		throw new SQLException("数据更新操作异常");
	}
}
