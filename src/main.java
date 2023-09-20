
public class main extends SendObject {

	public static void main(String[] args) {

		new ObjectBuilder()
			.setTitle("title")
			.setDiscription("disc")
			.setFooter("footer")
			.setHeader("header")
				.send();
	}
}