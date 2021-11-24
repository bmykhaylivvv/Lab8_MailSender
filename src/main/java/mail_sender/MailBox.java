package mail_sender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MailBox {
    private HashMap<MailStatusEnum, List<MailInfo>> infos;

    public MailBox() {
        List<MailInfo> waiting = new ArrayList<MailInfo>();
        List<MailInfo> sent = new ArrayList<MailInfo>();

        infos = new HashMap<MailStatusEnum, List<MailInfo>>();
        infos.put(MailStatusEnum.WAITING, waiting);
        infos.put(MailStatusEnum.SENT, sent);
    }

    public List<MailInfo> getWaiting() {
        return infos.get(MailStatusEnum.WAITING);
    }

    public List<MailInfo> getSent() {
        return infos.get(MailStatusEnum.SENT);
    }

    public void addMailInfo(MailInfo info) {
        infos.get(MailStatusEnum.WAITING).add(info);
    }

    public void sendAll(MailSender sender) {
        for (MailInfo info : infos.get(MailStatusEnum.WAITING)) {
            sender.sendMail(info);
            // add mails after sending to list with send mails
            infos.get(MailStatusEnum.SENT).add(info);
        }
        // remove send mails
        for (MailInfo info : infos.get(MailStatusEnum.SENT)) {
            infos.get(MailStatusEnum.WAITING).remove(info);
        }
    }
}
