/**
 * 
 * Copyright (C) 2015 Roberto Dominguez Estrada and Juan Carlos Sedano Salas
 *
 * This material is provided "as is", with absolutely no warranty expressed
 * or implied. Any use is at your own risk.
 *
 */
package io.github.nixtabyte.telegram.jtelebot.response.json;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * This object represents an incoming update.
 *
 * @since 0.0.1
 * @see <a href="https://core.telegram.org/bots/api#update">http://google.com</a>
 */
public class Update {
	/**
	 * The update?????????s unique identifier. Update identifiers start from a certain
	 * positive number and increase sequentially. This ID becomes especially
	 * handy if you?????????re using Webhooks, since it allows you to ignore repeated
	 * updates or to restore the correct update sequence, should they get out of
	 * order.
	 */
	@JsonProperty("update_id")
	private Integer updateId;

	/**
	 * Optional. New incoming message of any kind ????????? text, photo, sticker, etc.
	 */

	@JsonProperty("message")
	private Message message;

	@JsonProperty("edited_message")
	private Message editedMessage;

	@JsonProperty("channel_post")
	private Message channelPost;

	@JsonProperty("edited_channel_post")
	private Message editedChannelPost;

	@JsonProperty("inline_query")
	private InlineQuery inlineQuery;

	@JsonProperty("chosen_inline_result")
	private ChosenInlineResult chosenInlineResult;

	@JsonProperty("callback_query")
	private CallbackQuery callbackQuery;

	/**
	 * <p>Getter for the field <code>updateId</code>.</p>
	 *
	 * @return a {@link java.lang.Long} object.
	 */
	public Integer getUpdateId() {
		return updateId;
	}

	/**
	 * <p>Setter for the field <code>updateId</code>.</p>
	 *
	 * @param updateId a {@link java.lang.Long} object.
	 */
	public void setUpdateId(final Integer updateId) {
		this.updateId = updateId;
	}

	/**
	 * <p>Getter for the field <code>message</code>.</p>
	 *
	 * @return a {@link io.github.nixtabyte.telegram.jtelebot.response.json.Message} object.
	 */
	public Message getMessage() {
		return message;
	}

	/**
	 * <p>Setter for the field <code>message</code>.</p>
	 *
	 * @param message a {@link io.github.nixtabyte.telegram.jtelebot.response.json.Message} object.
	 */
	public void setMessage(final Message message) {
		this.message = message;
	}

	/** {@inheritDoc} */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result
				+ ((updateId == null) ? 0 : updateId.hashCode());
		return result;
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Update other = (Update) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (updateId == null) {
			if (other.updateId != null)
				return false;
		} else if (!updateId.equals(other.updateId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nUpdate{" +
				"updateId=" + updateId +
				", message=" + message +
				", editedMessage=" + editedMessage +
				", channelPost=" + channelPost +
				", editedChannelPost=" + editedChannelPost +
				", inlineQuery=" + inlineQuery +
				", chosenInlineResult=" + chosenInlineResult +
				", callbackQuery=" + callbackQuery +
				'}';
	}

	/**
	 * Getter and setter NEW
	 */

	public Message getEditedMessage() {
		return editedMessage;
	}

	public void setEditedMessage(Message editedMessage) {
		this.editedMessage = editedMessage;
	}

	public Message getChannelPost() {
		return channelPost;
	}

	public void setChannelPost(Message channelPost) {
		this.channelPost = channelPost;
	}

	public Message getEditedChannelPost() {
		return editedChannelPost;
	}

	public void setEditedChannelPost(Message editedChannelPost) {
		this.editedChannelPost = editedChannelPost;
	}

	public InlineQuery getInlineQuery() {
		return inlineQuery;
	}

	public void setInlineQuery(InlineQuery inlineQuery) {
		this.inlineQuery = inlineQuery;
	}

	public ChosenInlineResult getChosenInlineResult() {
		return chosenInlineResult;
	}

	public void setChosenInlineResult(ChosenInlineResult chosenInlineResult) {
		this.chosenInlineResult = chosenInlineResult;
	}

	public CallbackQuery getCallbackQuery() {
		return callbackQuery;
	}

	public void setCallbackQuery(CallbackQuery callbackQuery) {
		this.callbackQuery = callbackQuery;
	}
}
