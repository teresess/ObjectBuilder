public class SendObject {
	public static void send(ObjectBuilder setObjectMain) {
		System.out.printf(
				  "-----%s------\n\n"
				+ "header: %s\n\n"
				+ "%s\n\n"
				+ "-----%s------", setObjectMain.getTitle(), setObjectMain.getHeader(), setObjectMain.getDiscription(), setObjectMain.getFooter(), setObjectMain.getFooter()
				);
	}
}
