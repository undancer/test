package sss;

public class EmailSendTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		EmailSendInterface simple = EmailFactory.getIntance("simple");
//		simple.sendText("hello");
//		EmailSendInterface html = EmailFactory.getIntance("html");
//		html.sendHtml("<html><body>2342</body></html>");
		EmailSendInterface attach = EmailFactory.getIntance("attach");
		attach.sendAttachment("nihaoa ", "/Users/java/Desktop/user.txt");
		
	}

}
