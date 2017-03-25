package io.github.nixtabyte.telegram.jtelebot.response.json;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Knjaz89 on 24.03.2017.
 *
 * @see <a href="https://core.telegram.org/bots/api#choseninlineresult">http://google.com</a>
 */
public class ChosenInlineResult {

    @JsonProperty("result_id")
    private String resultId;

    @JsonProperty("from")
    private User from;

    @JsonProperty("query")
    private String query;

    /**
     * Optional
     */

    @JsonProperty("location")
    private Location location;

    @JsonProperty("inline_message_id")
    private String inlineMessageId;

    @Override
    public String toString() {
        return "\nChosenInlineResult{" +
                "resultId='" + resultId + '\'' +
                ", from=" + from +
                ", query='" + query + '\'' +
                ", location=" + location +
                ", inlineMessageId='" + inlineMessageId + '\'' +
                '}';
    }

    /**
     * Getter and setter
     */

    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public void setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
    }
}
