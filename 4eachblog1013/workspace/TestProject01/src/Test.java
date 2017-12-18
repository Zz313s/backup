
public class Test {

	public static void main(String[] args) {
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber ="08019269534";
		taro.address = "avfiew";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.walk();
		taro.talk();
		taro.run();

		Person ziro = new Person();
		ziro.name = "木村次郎";
		ziro.age = 18;
		ziro.phoneNumber = "1234-45-4549";
		ziro.address = "fjeoajpre";
		ziro.talk();
		ziro.walk();
		ziro.run();

		Person hanako = new person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber ="018-25-5493";
		hanako.address = "fhoresho";
		hanako.talk();
		hanako.walk();
		hanako.run();

		Robot aibo = new Robot();
		aibo.name ="アイボ";
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo = new Robot();
		asimo.name = "アシモ";
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper =new Robot();
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
