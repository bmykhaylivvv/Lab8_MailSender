package mail_sender;

import static org.junit.Assert.*;


class ClientTest {
    public Client client;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        client = new Client("Jack", 19, ClientSexEnum.MALE, "jack@gmail.com");
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        assertEquals(client.getEmail(), "jack@gmail.com");
    }
}