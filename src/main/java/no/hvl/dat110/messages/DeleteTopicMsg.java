package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

    private String topic; // Removed the 'user' field, will use 'user' from Message

    // message sent from client to delete topic on the broker
    public DeleteTopicMsg(String user, String topic) {
        super(MessageType.DELETETOPIC, user);
        this.topic = topic;
    }

    // getter and setter methods for topic
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    // toString method
    @Override
    public String toString() {
        return "DeleteTopicMsg{" +
                "user='" + getUser() + '\'' + // Use getUser() method from Message class
                ", topic='" + topic + '\'' +
                '}';
    }
}
