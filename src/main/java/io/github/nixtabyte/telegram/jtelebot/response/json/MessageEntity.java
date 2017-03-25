package io.github.nixtabyte.telegram.jtelebot.response.json;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Knjaz89 on 23.03.2017.
 *
 * @see <a href="https://core.telegram.org/bots/api#messageentity">http://google.com</a>
 */
public class MessageEntity {

    /**
     * Type of the entity. Can be mention (@username), hashtag, bot_command, url, email, bold (bold text),
     * italic (italic text), code (monowidth string), pre (monowidth block), text_link (for clickable text URLs),
     * text_mention
     * (for users without usernames @see <a href="https://telegram.org/blog/edit#new-mentions">http://google.com</a>)
     */
    @JsonProperty("type")
    private String type;

    @JsonProperty("offset")
    private int offset;

    @JsonProperty("length")
    private int length;

    /**
     * Optional
     */

    @JsonProperty("url")
    private String url;

    @JsonProperty("user")
    private User user;

    @Override
    public String toString() {
        return "\nMessageEntity{" +
                "type='" + type + '\'' +
                ", offset=" + offset +
                ", length=" + length +
                ", url='" + url + '\'' +
                ", user=" + user +
                '}';
    }

    /**
     * Getter and setter
     */

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
