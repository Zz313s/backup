
public class Test {
	public static void main(String[] args){
		Person taro = new Person();
		taro.name="山田太郎";
		taro.age = 20;
		taro.birthplace ="北海道";
		taro.phoneNumber = "08011111111";
		taro.address = "abc@yahoo.co.jp";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.birthplace);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		Person ziro = new Person();
		ziro.name = "木村次郎";
		ziro.age = 18;
		ziro.birthplace ="大阪";
		ziro.phoneNumber = "08022222222";
		ziro.address = "abc@gmail.com";
		System.out.println(ziro.name);
		System.out.println(ziro.age);
		System.out.println(ziro.birthplace);
		System.out.println(ziro.phoneNumber);
		System.out.println(ziro.address);

		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.birthplace ="京都";
		hanako.phoneNumber = "08033333333";
		hanako.address = "abc@softbank.ne.jp";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.birthplace);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);

		Person momoe = new Person();
		momoe.name ="木村百恵";
		momoe.age =27;
		momoe.birthplace ="鳥取";
		momoe.phoneNumber = "08044444444";
		momoe.address = "abc@docomo.ne.jp";
		System.out.println(momoe.name);
		System.out.println(momoe.age);
		System.out.println(momoe.birthplace);
		System.out.println(momoe.phoneNumber);
		System.out.println(momoe.address);
		
		Person saburo = new Person("saburo",20);
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		
		Robot aibo = new Robot();
		aibo.name = "アイボ";
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		Robot asimo = new Robot();
		asimo.name = "アシモ";
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		Robot pepper = new Robot();
		pepper.name = "ペッパー";
		pepper.talk();
		pepper.walk();
		pepper.run();
		
		Robot doraemon = new Robot();
		doraemon.name = "ドラえもん";
		doraemon.talk();
		doraemon.walk();
		doraemon.run();
	}

}
