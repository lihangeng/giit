package JDKProxy;

public class ForumServiceImpl implements ForumService {

	@Override
	public void removeTopic(int topId) {

		System.out.println("删除Topic:"+topId);
		try {
			Thread.currentThread().sleep(20);
		} catch (InterruptedException e) {
			throw new RuntimeException();
		}
	}

	@Override
	public void removeForum(int forumId) {
		System.out.println("删除Forum："+forumId);
		try {
			Thread.currentThread().sleep(20);
		} catch (InterruptedException e) {
			throw new RuntimeException();
		}
	}

}
