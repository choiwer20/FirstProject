
public class MainClass {
	public MainClass() {
	// TODO Auto-generated constructor stub
	}
	
	//master��� �θ�
	public static void main(String[] args) {
		
			//branch..
			System.out.println("ù��° ������Ʈ");
			
				for(int i=0;i<5;i++) {
					System.out.println(""+i);
				}			
				
			System.out.println("[ù��° ������Ʈ]");
			
			for(int i=0;i<4;i++){
				for(int j=0;j<10;j++){
					System.out.println(i*j);
					
				}
			}
			Second second =new Second();
			System.out.println("������");
			second.show();
			second.three=4;//protected	 ��뿹��
			System.out.println("������");
			second.show();	
	}
	
}

class static_test{
	static String name;
	static int number;
	
	public static_test() {
	// TODO Auto-generated constructor stub
		this("������",1);
	}

	public static_test(String string, int i) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.number=number;
	}	
}

class First{
	
public	int one;
private	int two;
protected int three;

public First() {
	this(1,2,3);
	// TODO Auto-generated constructor stub
}
public First(int one,int two,int three) {
	
		this.one=one;
		this.three=three;
		this.two=two;
	}
void show(){
	
	System.out.println("one:"+one);
	System.out.println("two:"+two);
	System.out.println("three:"+three);
}
}

class Second extends First{
	
	
}