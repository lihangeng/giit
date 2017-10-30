package CallBack;

public class Teacher{

	public <T> void execute(CallBack<T> callBack) {
		callBack.taskResult();
	}
}
