
public class Test {
	public static void main(String[] args){
		Person taro = new Person();
		taro.name ="山田太郎";
		taro.age = 20;
		taro.phoneNumber ="080-1234-5678";
		taro.address = "abc@yahoo.co.jp";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		Person ziro = new Person();
		ziro.name = "木村次郎";
		ziro.age = 18;
		ziro.phoneNumber ="090-1234-5678";
		ziro.address = "abc@softbank.ne.jp";
		System.out.println(ziro.name);
		System.out.println(ziro.age);
		System.out.println(ziro.phoneNumber);
		System.out.println(ziro.address);
		ziro.talk();
		ziro.walk();
		ziro.run();

		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "0120-12-3456";
		hanako.address = "abc@docomo.ne.jp";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();

		Person momoe = new Person();
		momoe.name ="木村百恵";
		momoe.age = 27;
		momoe.phoneNumber = "08011223344";
		momoe.address = "gdm23r@docomo.ne.jp";
		System.out.println(momoe.name);
		System.out.println(momoe.age);
		System.out.println(momoe.phoneNumber);
		System.out.println(momoe.address);
		momoe.talk();
		momoe.walk();
		momoe.run();

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
		pepper.name ="ペッパー";
		pepper.talk();
		pepper.walk();
		pepper.run();

		Robot doraemon = new Robot();
		doraemon.name ="ドラえもん";
		doraemon.talk();
		doraemon.walk();
		doraemon.run();
	}

}
