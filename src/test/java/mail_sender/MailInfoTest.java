package mail_sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


class MailInfoTest {
    public Client client;
    public MailInfo mailInfo;
    @BeforeEach
    void setUp() {
        client = new Client("Jack", 19, ClientSexEnum.MALE, "jack@gmail.com");
        mailInfo = new MailInfo(client, MailCode.GREETINGS);
    }

    @Test
    void getText() {
        assertEquals(mailInfo.getText(), "Hi Jack! What's up?\n");
    }

    @Test
    void getEmail() {
        assertEquals(mailInfo.getEmail(), "jack@gmail.com");
    }
}