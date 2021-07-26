package chap13.four;

public class BoxingMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Box<Integer>box1 = Util.<Integer>boxing(100);
	int intValue = box1.get();
	
	Box<Integer>box2 = Util.boxing("ȫ�浿");
	Integer strValue = box2.get();
		
	}

}
