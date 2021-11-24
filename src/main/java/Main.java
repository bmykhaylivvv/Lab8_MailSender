import mail_sender.*;

public class Main {
    public static void main(String[] args) {
        MailBox mailBox = new MailBox();
        MailSender mailSender = new MailSender();

        Client client1 = new Client("Jack", 19, ClientSexEnum.MALE, "jack@gmail.com");
        Client client2 = new Client("Tina", 19, ClientSexEnum.FEMALE, "tina@gmail.com");

        MailInfo mailInfo1 = new MailInfo(client1, MailCode.HAPPY_BIRTHDAY);
        MailInfo mailInfo2 = new MailInfo(client2, MailCode.GREETINGS);

        mailBox.addMailInfo(mailInfo1);
        mailBox.addMailInfo(mailInfo2);

        System.out.println(mailBox.getWaiting());
        System.out.println(mailBox.getSent());

        mailBox.sendAll(mailSender);

        System.out.println(mailBox.getWaiting());
        System.out.println(mailBox.getSent());

    }
}
