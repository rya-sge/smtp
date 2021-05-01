package mail;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Message {
    private String from;
    private String body;
    private String subject;

    private List<String> to = new ArrayList();
    private List<String> cc = new ArrayList();
    private List<String> bcc = new ArrayList();

    /**
     *
     * @return
     */
    public List<String> getTo() {
        return to;
    }

    /**
     *
     * @return
     */
    public List<String> getCc() {
        return cc;
    }

    /**
     *
     * @return
     */
    public List<String> getBcc() {
        return bcc;
    }

    /**
     *
     * @param cc
     */
    public void setCc(List<String> cc) {
        this.cc.addAll(cc);
    }

    /**
     *
     * @param to
     */
    public void setTo(List<String> to) {
        this.to.addAll(to);
    }


    /**
     *
     * @param body
     */
    public void setBody(String body) {
        int iend = body.indexOf("\r\n"); //this finds the first occurrence of "."
        String subString="";
        if (iend != -1)
        {
            subString= body.substring(0 , iend); //this will give abc
            subString = "Subject:" + subString +  "\r\n";
        }
        this.subject = subString;
        this.body = "Subject:" +body;
    }

    /**
     *
     * @return
     */
    public String getSubject() {
        return subject;
    }

    /**
     *
     * @return
     */
    public String getBody() {
        return body;
    }


    /**
     *
     * @return
     */
    public String getFrom(){
        return from;
    }

    /**
     *
     * @param from
     */
    public void setFrom(String from){
        this.from = from;
    }

}
