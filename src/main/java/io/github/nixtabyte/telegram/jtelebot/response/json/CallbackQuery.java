package io.github.nixtabyte.telegram.jtelebot.response.json;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Knjaz89 on 24.03.2017.
 *
 * @see <a href="https://core.telegram.org/bots/api#callbackquery">http://google.com</a>
 */

public class CallbackQuery {

    @JsonProperty("id")
    private String id;

    @JsonProperty("from")
    private User from;

    @JsonProperty("message")
    private Message message;

    @JsonProperty("chat_instance")
    private String chatInstance;

    /**
     * Optional
     */

    @JsonProperty("inline_message_id")
    private String inlineMessageId;

    @JsonProperty("data")
    private String data;

    @JsonProperty("game_short_name")
    private String gameShortName;

    @Override
    public String toString() {
        return "\nCallbackQuery{" +
                "id='" + id + '\'' +
                ", from=" + from +
                ", message=" + message +
                ", chatInstance='" + chatInstance + '\'' +
                ", inlineMessageId='" + inlineMessageId + '\'' +
                ", data='" + data + '\'' +
                ", gameShortName='" + gameShortName + '\'' +
                '}';
    }

    /**
     * Getter and setter
     */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getChatInstance() {
        return chatInstance;
    }

    public void setChatInstance(String chatInstance) {
        this.chatInstance = chatInstance;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public void setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getGameShortName() {
        return gameShortName;
    }

    public void setGameShortName(String gameShortName) {
        this.gameShortName = gameShortName;
    }
}
