package creational.designpattern.builder;

public class BuilderEverydayDemo {

	public static void main(String[] args) {
    
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(1);
		stringBuilder.append(" This is an example of");
		stringBuilder.append(" Stringbuilder design pattern");
		System.out.println(stringBuilder.toString());
	}

}
