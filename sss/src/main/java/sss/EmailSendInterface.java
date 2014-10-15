package sss;

public interface EmailSendInterface {
	String hostname="smtpcloud.sohu.com";
	void sendText(String content) throws Exception;
	void sendHtml(String htmlcontent) throws Exception;
	void sendAttachment(String content, String apath) throws Exception;
}
