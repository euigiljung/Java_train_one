package chap13.three;

public class Product <T, M> {
	private T kind;
	private T model;
	
	public T getKind() {return this.kind;}
	public T getModel() {return this.model;}

	public void setKind(T kind) {this.kind = kind;}
	public void setModel(T model) {this.model = model;}
	public void setModel(String string) {
		// TODO Auto-generated method stub
		
	}

}
