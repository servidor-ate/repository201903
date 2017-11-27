package pe.royalsystems.springerp.commons.service;
import java.util.Date;
import java.util.List;
import java.util.Properties; 
import javax.activation.CommandMap; 
import javax.activation.DataHandler; 
import javax.activation.DataSource; 
import javax.activation.FileDataSource; 
import javax.activation.MailcapCommandMap; 
import javax.mail.BodyPart; 
import javax.mail.Multipart; 
import javax.mail.PasswordAuthentication; 
import javax.mail.Session; 
import javax.mail.Transport; 
import javax.mail.internet.InternetAddress; 
import javax.mail.internet.MimeBodyPart; 
import javax.mail.internet.MimeMessage; 
import javax.mail.internet.MimeMultipart; 


public class EmailServiceGen extends javax.mail.Authenticator { 
  private String _user; 
  private String _pass; 
  private String _account;

  private String[] _to; 
  private String _from; 

  private String _port; 
  private String _sport; 

  private String _host; 

  private String _subject; 
  private String _body; 

  private boolean _auth; 
  private boolean _starttls;
  private boolean _debuggable; 

  private Multipart _multipart; 
  
	
  public EmailServiceGen() { 
    //_host = "smtp.gmail.com"; // default smtp server 
    //_port = "465"; // default smtp port (465)    
    //_sport = "465"; // default socketfactory port 
    _user = ""; // username 
    _pass = ""; // password 
    _from = ""; // email sent from 
    _subject = ""; // email subject 
    _body = ""; // email body 

    _debuggable = false; // debug mode on or off - default off 
    _auth = true; // smtp authentication - default on 
    _starttls=false;
    _multipart = new MimeMultipart(); 

    // There is something wrong with MailCap, javamail can not find a handler for the multipart/mixed part, so this bit needs to be added. 
    MailcapCommandMap mc = (MailcapCommandMap) CommandMap.getDefaultCommandMap(); 
    mc.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html"); 
    mc.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml"); 
    mc.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain"); 
    mc.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed"); 
    mc.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822"); 
    CommandMap.setDefaultCommandMap(mc); 
  } 

  
  public void setParametrosMail(String par_host, String par_port, String par_sport,String par_TTL) {
	    _host =par_host; // default smtp server 
	    _port =par_port; // default smtp port (465)    
	    _sport =par_sport; // default socketfactory port
	    if("S".equals(par_TTL)){
	    	_starttls=true; // ACTIVO  TTL  (S o N)	
	    }
	     
  }
  
  public EmailServiceGen(String user, String pass) { 
    this(); 
    _user = user; 
    _pass = pass; 
  } 

  public boolean send() throws Exception { 
    Properties props = _setProperties(); 
    if(!_user.equals("") && !_pass.equals("") && _to.length > 0 && !_from.equals("") && !_subject.equals("") && !_body.equals("")) { 
      Session session = Session.getInstance(props, this); 
      MimeMessage msg = new MimeMessage(session); 
      msg.setFrom(new InternetAddress(_from)); 
      InternetAddress[] addressTo = new InternetAddress[_to.length]; 
      for (int i = 0; i < _to.length; i++) { 
        addressTo[i] = new InternetAddress(_to[i]); 
      } 
        msg.setRecipients(MimeMessage.RecipientType.TO, addressTo); 

      msg.setSubject(_subject,"utf-8"); 
      msg.setSentDate(new Date()); 
      msg.setText(_body, "utf-8", "html");
      // setup message body 
      BodyPart messageBodyPart = new MimeBodyPart(); 
      //messageBodyPart.setText(_body); 
      //_multipart.addBodyPart(messageBodyPart); 
      // Put parts in message
      if(_multipart.getCount()>0){
    	  msg.setContent(_multipart);  
      }       
      // send email 
      Transport.send(msg); 

      return true; 
    } else { 
      return false; 
    } 
  } 

  public void addAttachment(String filename) throws Exception { 
    BodyPart messageBodyPart = new MimeBodyPart(); 
    DataSource source = new FileDataSource(filename); 
    messageBodyPart.setDataHandler(new DataHandler(source)); 
    messageBodyPart.setFileName(filename); 

    _multipart.addBodyPart(messageBodyPart); 
  } 

  public void addAttachment(List<String> listFilename) throws Exception { 
	for(String filename : listFilename){
		BodyPart messageBodyPart = new MimeBodyPart(); 
		DataSource source = new FileDataSource(filename); 
		messageBodyPart.setDataHandler(new DataHandler(source)); 
		messageBodyPart.setFileName(filename); 	
		_multipart.addBodyPart(messageBodyPart); 
	}
  } 
  
  
  /*	
  @Override 
  public PasswordAuthentication getPasswordAuthentication() { 
    return new PasswordAuthentication(_user, _pass); 
  } 
  */
  @Override 
  public PasswordAuthentication getPasswordAuthentication() { 
    return new PasswordAuthentication(_account!=null?_account:_user, _pass); 
  } 
  
  private Properties _setProperties() { 
    Properties props = new Properties();             
    if(_debuggable) { 
      props.put("mail.debug", "true"); 
    } 
    if(_auth) { 
      props.put("mail.smtp.auth", "true"); 
    }
    props.put("mail.smtp.host", _host);
    props.put("mail.smtp.port", _port);
    if(_starttls) {
    	props.put("mail.smtp.starttls.enable", "true");	
    }             
    if(!_starttls){
    	props.put("mail.smtp.socketFactory.port", _sport);
    	props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");	
    }     
    props.put("mail.smtp.socketFactory.fallback", "false");     
    /*
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", true);
    props.put("mail.smtp.port", "587");
    props.put("mail.transport.protocol", "smtp");
    props.put("mail.debug", "true");
    */
    return props; 
  } 

  // the getters and setters 
  public String getBody() { 
    return _body; 
  } 

  public void setBody(String _body) { 
    this._body = _body; 
  }

  public void setTo(String[] toArr) {     
      this._to=toArr;
  }

  public void setFrom(String string) {     
      this._from=string;
  }

  public void setSubject(String string) {
	  this._subject=string;
  }  
  public void setAccount(String account) {     
      this._account=account;
  }

  // more of the getters and setters -..
}