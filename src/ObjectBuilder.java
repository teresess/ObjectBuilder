
public class ObjectBuilder {
	
	public ObjectBuilder send() {
		System.out.printf(
				   "    %s   \n"
				+  "-----%s------\n\n"
				+ "%s\n\n"
				+ "-----%s------", getTitle(), getHeader(), getDiscription(), getFooter(), getFooter()
				);
		return this;
	}
	
	private ObjectBuilder.Title title;
	private ObjectBuilder.Discription discription;
	private ObjectBuilder.Header header;
	private ObjectBuilder.Footer footer;
	
	
	public String getTitle() {
		return title.getTitle();
	}
	public String getDiscription() {
		return discription.getDiscription();
	}
	public String getHeader() {
		return header.getHeader();
	}
	public String getFooter() {
		return footer.getFooter();
	}

	public ObjectBuilder setTitle(String title) {

		this.title = new ObjectBuilder.Title(title, 10);
		
		return this;
	}

	public ObjectBuilder setDiscription(String discription) {
		
		this.discription = new ObjectBuilder.Discription(discription, 2);
		
		return this;
	}
	
	public ObjectBuilder setHeader(String header) {
		
		this.header = new ObjectBuilder.Header(header, 5);
		
		return this;
	}
	
	public ObjectBuilder setFooter(String footer) {
		
		this.footer = new ObjectBuilder.Footer(footer, 7);
		
		return this;
	}

	public ObjectBuilder() {
		System.out.println(getClass()+" запущен.");
	}
	
	
	public static class Footer {
		
		private String footer;
		private int count;
		
		public Footer(String footer, int count) {
			this.footer = footer;
			this.count = count;
		}

		public String getFooter() {
			return footer;
		}

		public int getCount() {
			return count;
		}
	}
	
	public static class Header {

		private String header;
		private int count;
		
		public Header(String header, int count) {
			this.header = header;
			this.count = count;
		}
		
		public String getHeader() {
			return header;
		}

		public int getCount() {
			return count;
		}
	}
	
	public static class Discription {

		private String discription;
		private int count;
		
		public Discription(String discription, int count) {
			this.discription = discription;
			this.count = count;
		}
		
		public String getDiscription() {
			return discription;
		}

		public int getCount() {
			return count;
		}
		
	}
	
	public static class Title {

		private String title;
		private int count;
		
		public Title(String title, int count) {
			this.title = title;
			this.count = count;
		}

		public String getTitle() {
			return title;
		}

		public int getCount() {
			return count;
		}
	}
}