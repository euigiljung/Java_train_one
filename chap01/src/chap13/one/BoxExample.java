package chap13.one;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.Set("ȫ�浿");
		String name = (String) box.get();
		
		box.Set(new Apple());
		Apple apple = (Apple) box.get();
		
	}

}
