package sss;

import javax.mail.Authenticator;

import org.apache.commons.mail.HtmlEmail;


 public class  HtmEmail implements EmailSendInterface{
	 private HtmlEmail  email = null;
	 private String username;
	 private String password;
	 private String sender;
	    private String receiver;
	 public HtmEmail(String username, String password, String sender, String receiver){
		 email = new HtmlEmail();
		 this.username = username;
		 this.password = password;
		 this.sender = sender;
		 this.receiver = receiver;
	 }
	public void sendHtml(String content) throws Exception {
		email.setHostName(hostname);
		email.setAuthentication(this.username,this.password);
		email.addTo(this.receiver);
		email.setFrom(this.sender);
		email.setSubject("");
		email.setHtmlMsg(content);
		email.setCharset("utf-8");
		System.out.println(email.send());
		
	}
	public void sendText(String content) throws Exception {
		// TODO Auto-generated method stub
		
	}
	public void sendAttachment(String content, String apath) throws Exception {
		// TODO Auto-generated method stub
		
	}
	


	
}
