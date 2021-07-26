package chap08.mydefault;

public interface MyInterface {
	public void method1();
	
	public default void method2() {
		System.out.println("MyclassA-method2() ½ÇÇà");
	}
}
