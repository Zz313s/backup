
public class HelloWorld {

	public static void main(String[] args) {
		// Hello World
		int age = 35;
		if(age < 20){
			System.out.println("未成年");
		}else if(age >= 20 && age <= 80){
			System.out.println("成人");
		}else{
			System.out.println("高齢者");
		}
	}

}
