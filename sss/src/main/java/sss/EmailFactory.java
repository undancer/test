package sss;

public class EmailFactory {
	private static EmailSendInterface esi = null;
	private static String username = "postmaster@boxfish.sendcloud.org";
	private static String password = "gD3fO7G6DNf1XPK3";
	private static String sender = "noreply@app.boxfish.cn";
	private static String receiver = "925060109@qq.com";

	public static EmailSendInterface getIntance(String type) {
		if ("html".equals(type))
			esi = new HtmEmail(username, password, sender, receiver);
		else if ("simple".equals(type))
			esi = new TextEmail(username, password, sender, receiver);
		else
			esi = new AttachmentEmail(username, password, sender, receiver);
		return esi;
	}
}
