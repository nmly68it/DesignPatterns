package dylan.coder.designpattern.singleton;

public class SingletonAppTest {
	public static void main(String[] args) {
		SingletonSyncClass obj1 = SingletonSyncClass.getInstance();
		SingletonSyncClass obj2 = SingletonSyncClass.getInstance();
		System.out.println(obj1 == obj2);
	}
}
