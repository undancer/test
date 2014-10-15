package sss;

import org.apache.commons.mail.SimpleEmail;

public class TextEmail implements EmailSendInterface {
    private SimpleEmail email = new SimpleEmail();
    private String username;
    private String password;
    private String sender;
    private String receiver;
	public TextEmail(String username, String password,String sender, String receiver) {
		this.username = username;
		this.password = password;
		this.sender = sender;
		this.receiver = receiver;
	}
	public void sendText(String content) throws Exception {
		email.setHostName(hostname);//发送服务器
		email.setAuthentication(this.username,this.password);//发送邮件的用户名和密码
		email.addTo(this.receiver);//接受邮箱
		email.setFrom(this.sender);//发送邮箱
		email.setSubject("");//主题
		email.setMsg(content);//内容
		email.setCharset("utf-8");//编码方式
		System.out.println(email.send());
	}
	public void sendHtml(String htmlcontent) throws Exception {
		// TODO Auto-generated method stub
		
	}
	public void sendAttachment(String content, String apath) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
