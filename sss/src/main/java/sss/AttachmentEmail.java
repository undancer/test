package sss;

import javax.mail.internet.MimeUtility;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;

public class AttachmentEmail implements EmailSendInterface {
	private EmailAttachment attach = null;
	private MultiPartEmail email = null;
	private String username;
	private String password;
	private String sender;
    private String receiver;
	public AttachmentEmail(String username, String password,String sender, String receiver) {
		this.attach = new EmailAttachment();
		this.email = new MultiPartEmail();
		this.username = username;
		this.password = password;
		this.sender = sender;
		this.receiver = receiver;
	}

	public void sendAttachment(String content, String apath) throws Exception {
		attach.setDisposition(EmailAttachment.ATTACHMENT);
		attach.setDescription("附件");
		attach.setPath(apath);// 附件地址
		attach.setName(MimeUtility.encodeText("附件.txt"));

		email.setHostName(hostname);
		email.setAuthentication(this.username, this.password);
		email.addTo(this.receiver);
		email.setFrom(this.sender);
		email.setSubject("");
		email.setMsg(content);
		email.setCharset("utf-8");
		email.attach(attach);
		System.out.println(email.send());

	}

	public void sendText(String content) throws Exception {
		// TODO Auto-generated method stub

	}

	public void sendHtml(String htmlcontent) throws Exception {
		// TODO Auto-generated method stub

	}

}
