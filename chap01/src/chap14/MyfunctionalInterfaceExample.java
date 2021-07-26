package chap14;

public class MyfunctionalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyfunctionalInterface fi;
		
		fi=()->{
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		fi = ()->{System.out.println("method call2");};
		fi.method();
		
		fi=()->System.out.println("method call3");
		fi.method();
					
		}
	}


