
public class main extends SendObject {

	public static void main(String[] args) {

		new ObjectBuilder()
			.setTitle("JAVA")
			.setDiscription("Я использую Java.")
			.setFooter("пока")
			.setHeader("оглавление")
				.send();
	}
}