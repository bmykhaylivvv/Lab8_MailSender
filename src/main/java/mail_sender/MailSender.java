package mail_sender;


public class MailSender {
    public void sendMail(MailInfo info) {
        System.out.println("Text: \n" + "---\n" + info.getText() + "---\n" + "has been send to " + info.getEmail());
    }
}
