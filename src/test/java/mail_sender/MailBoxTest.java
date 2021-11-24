package mail_sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

class MailBoxTest {
    public MailBox mailBox;
    public MailSender mailSender;
    public Client client;
    public MailInfo mailInfo;
    public List<MailInfo> waiting;
    public List<MailInfo> sent;

    @BeforeEach
    void setUp() {
        mailBox = new MailBox();
        mailSender = new MailSender();
        client = new Client("Jack", 19, ClientSexEnum.MALE, "jack@gmail.com");
        mailInfo = new MailInfo(client, MailCode.HAPPY_BIRTHDAY);

        mailBox.addMailInfo(mailInfo);

        waiting = new ArrayList<MailInfo>();
        waiting.add(mailInfo);

        sent = new ArrayList<MailInfo>();
        sent.add(mailInfo);
    }

    @Test
    void getWaiting() {
        assertEquals(mailBox.getWaiting(), waiting);
    }

    @Test
    void getSent() {
        mailBox.sendAll(mailSender);
        assertEquals(mailBox.getSent(), sent);
    }
}