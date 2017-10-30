package CallBack;

public class Student {
	Teacher teacher = new Teacher();
	
	public <T> void doTask() {
		teacher.execute(new CallBack<T>() {

			@Override
			public void taskResult() {
				for(int m=1;m<6;m++) {
					System.out.println("张三完成了任务:"+m);
				}				
			}
		});
		
	}

}
