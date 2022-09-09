package spielwiese;

public class test{
	
	private String name="Michael";
	public void setName(String name) {
		
		this.name=name;
	}
	public String getname() {
		return this.name;
	}
	
	public static void main(String[]args) {
		test b=new test();
		b.setName("Tim");
		System.out.println(b.getname());
		System.out.println("test");
	}
	
}
