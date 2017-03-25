package io.github.nixtabyte.telegram.jtelebot.response.json;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Arrays;

/**
 * Created by Knjaz89 on 24.03.2017.
 *
 * @see <a href="https://core.telegram.org/bots/api#webhookinfo">http://google.com</a>
 */
public class WebhookInfo {

    @JsonProperty("url")
    private String url;

    @JsonProperty("has_custom_certificate")
    private Boolean hasCustomCertificate;

    @JsonProperty("pending_update_count")
    private Integer pendingUpdateCount;

    /**
     * Optional
     */

    @JsonProperty("last_error_date")
    private Integer lastErrorDate;

    @JsonProperty("last_error_message")
    private String lastErrorMessage;

    @JsonProperty("max_connections")
    private Integer maxConnections;

    @JsonProperty("allowed_updates")
    private String[] allowedUpdates;

    @Override
    public String toString() {
        return "\nWebhookInfo{" +
                "url='" + url + '\'' +
                ", hasCustomCertificate=" + hasCustomCertificate +
                ", pendingUpdateCount=" + pendingUpdateCount +
                ", lastErrorDate=" + lastErrorDate +
                ", lastErrorMessage='" + lastErrorMessage + '\'' +
                ", maxConnections=" + maxConnections +
                ", allowedUpdates=" + Arrays.toString(allowedUpdates) +
                '}';
    }

    /**
     * Getter and setter
     */

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getHasCustomCertificate() {
        return hasCustomCertificate;
    }

    public void setHasCustomCertificate(Boolean hasCustomCertificate) {
        this.hasCustomCertificate = hasCustomCertificate;
    }

    public Integer getPendingUpdateCount() {
        return pendingUpdateCount;
    }

    public void setPendingUpdateCount(Integer pendingUpdateCount) {
        this.pendingUpdateCount = pendingUpdateCount;
    }

    public Integer getLastErrorDate() {
        return lastErrorDate;
    }

    public void setLastErrorDate(Integer lastErrorDate) {
        this.lastErrorDate = lastErrorDate;
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }

    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
    }

    public Integer getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
    }

    public String[] getAllowedUpdates() {
        return allowedUpdates;
    }

    public void setAllowedUpdates(String[] allowedUpdates) {
        this.allowedUpdates = allowedUpdates;
    }
}
