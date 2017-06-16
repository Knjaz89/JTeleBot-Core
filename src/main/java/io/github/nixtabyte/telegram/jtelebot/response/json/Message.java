/**
 *
 * Copyright (C) 2015 Roberto Dominguez Estrada and Juan Carlos Sedano Salas
 *
 * This material is provided "as is", with absolutely no warranty expressed
 * or implied. Any use is at your own risk.
 *
 */
package io.github.nixtabyte.telegram.jtelebot.response.json;

import java.util.Arrays;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * This object represents a message.
 *
 * @since 0.0.1
 * @see <a href="https://core.telegram.org/bots/api#message">http://google.com</a>
 */
public class Message {
	/**
	 * Unique message identifier
	 */
	@JsonProperty("message_id")
	private Integer messageId;
	@JsonProperty("id")
	private Integer id;
	/**
	 * Date the message was sent in Unix time
	 */
	@JsonProperty("date")
	private Integer date;
	/**
	 * Conversation the message belongs to
	 */
	@JsonProperty("chat")
	private Chat chat;

	/**
	 * Optional
	 */

	/**
	 * Sender, can be empty for messages sent to channels
	 */
	@JsonProperty("from")
	private User from;
	/**
	 * Optional. For forwarded messages, sender of the original message
	 */
	@JsonProperty("forward_from")
	private User forwardFrom;
	/**
	 * Optional. For messages forwarded from a channel, information about the original channel
	 */
	@JsonProperty("forward_from_chat")
	private Chat forwardFromChat;
	/**
	 * For forwarded channel posts, identifier of the original message in the channel
	 */
	@JsonProperty("forward_from_message_id")
	private Integer forwardFromMessageId;
	/**
	 * For forwarded messages, date the original message was sent in Unix time
	 */
	@JsonProperty("forward_date")
	private Integer forwardDate;
	/**
	 * Optional. For replies, the original message. Note that the Message object
	 * in this field will not contain further reply_to_message fields even if it
	 * itself is a reply.
	 */
	@JsonProperty("reply_to_message")
	private Message replyToMessage;
	/**
	 * Date the message was last edited in Unix time
	 */
	@JsonProperty("edit_date")
	private Integer edit_date;
	/**
	 * For text messages, the actual UTF-8 text of the message, 0-4096 characters.
	 */
	@JsonProperty("text")
	private String text;
	/**
	 * For text messages, special entities like usernames, URLs, bot commands, etc. that appear in the text
	 */
	@JsonProperty("entities")
	private MessageEntity[] entities;
	/**
	 * Optional. Message is an audio file, information about the file
	 * */
	@JsonProperty("audio")
	private Audio audio;

	/**
	 * Optional. Message is a general file, information about the file
	 * */
	@JsonProperty("document")
	private Document document;

	/**
	 * Optional. Message is a general file, information about the file
	 * */
	@JsonProperty("game")
	private Game game;
	/**
	 * Optional. Message is a photo, available sizes of the photo
	 * */
	@JsonProperty("photo")
	private PhotoSize[] photo;

	/**
	 * Optional. Message is a sticker, information about the sticker
	 * */
	@JsonProperty("sticker")
	private Sticker sticker;

	/**
	 * Optional. Message is a video, information about the video
	 * */
	@JsonProperty("video")
	private Video video;
	/**
	 *  Message is a voice message, information about the file
	 */
	@JsonProperty("voice")
	private Voice voice;
	/**
	 * Caption for the document, photo or video, 0-200 characters
	 */
	@JsonProperty("caption")
	private String caption;
	/**
	 * Optional. Message is a shared contact, information about the contact
	 * */
	@JsonProperty("contact")
	private Contact contact;

	/**
	 * Optional. Message is a shared location, information about the location
	 * */
	@JsonProperty("location")
	private Location location;

	/**
	 * Optional. Message is a venue, information about the venue
	 * */
	@JsonProperty("venue")
	private Venue venue;

	/**
	 * Optional. A new member was added to the group, information about them (this member may be the bot itself)
	 */
	@JsonProperty("new_chat_member")
	private User newChatMember;
	/**
	 * Optional. A member was removed from the group, information about them (this member may be the bot itself)
	 */
	@JsonProperty("left_chat_member")
	private User leftChatMember;
	/**
	 * Optional. A group title was changed to this value
	 */
	@JsonProperty("new_chat_title")
	private String newChatTitle;

	/**
	 * new_chat_photo Array of PhotoSize Optional. A group photo was change to
	 * this value
	 */
	@JsonProperty("new_chat_photo")
	private PhotoSize[] newChatPhoto;

	/**
	 * Optional. Informs that the group photo was deleted
	 */
	@JsonProperty("delete_chat_photo")
	private Boolean deleteChatPhoto;
	/**
	 * Optional. Informs that the group has been created
	 */
	@JsonProperty("group_chat_created")
	private Boolean groupChatCreated;

	@JsonProperty("supergroup_chat_created")
	private Boolean supergroupChatCreated;

	@JsonProperty("channel_chat_created")
	private Boolean channelChatCreated;


	@JsonProperty("migrate_to_chat_id")
	private String migrate_to_chat_id;

	@JsonProperty("migrate_from_chat_id")
	private String migrate_from_chat_id;

	@JsonProperty("pinned_message")
	private Message pinnedMessage;

	@JsonProperty("new_chat_participant")
	private Message new_chat_participant;

	@JsonProperty("first_name")
	private String firstName;

	@JsonProperty("last_name")
	private String lastName;

	@JsonProperty("left_chat_participant")
	private Message left_chat_participant;

	@JsonProperty("new_chat_members")
	private User[] newChatMembers;

	@JsonProperty("video_note")
	private VideoNote video_note;


	@Override
	public String toString() {
		return "\nMessage{" +
				"messageId=" + messageId +
				", id=" + id +
				", date=" + date +
				", chat=" + chat +
				", from=" + from +
				", forwardFrom=" + forwardFrom +
				", forwardFromChat=" + forwardFromChat +
				", forwardFromMessageId=" + forwardFromMessageId +
				", forwardDate=" + forwardDate +
				", replyToMessage=" + replyToMessage +
				", edit_date=" + edit_date +
				", text='" + text + '\'' +
				", entities=" + Arrays.toString(entities) +
				", audio=" + audio +
				", document=" + document +
				", game=" + game +
				", photo=" + Arrays.toString(photo) +
				", sticker=" + sticker +
				", video=" + video +
				", voice=" + voice +
				", caption='" + caption + '\'' +
				", contact=" + contact +
				", location=" + location +
				", venue=" + venue +
				", newChatMember=" + newChatMember +
				", leftChatMember=" + leftChatMember +
				", newChatTitle='" + newChatTitle + '\'' +
				", newChatPhoto=" + Arrays.toString(newChatPhoto) +
				", deleteChatPhoto=" + deleteChatPhoto +
				", groupChatCreated=" + groupChatCreated +
				", supergroupChatCreated=" + supergroupChatCreated +
				", channelChatCreated=" + channelChatCreated +
				", migrate_to_chat_id='" + migrate_to_chat_id + '\'' +
				", migrate_from_chat_id='" + migrate_from_chat_id + '\'' +
				", pinnedMessage=" + pinnedMessage +
				", new_chat_participant=" + new_chat_participant +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", left_chat_participant=" + left_chat_participant +
				", newChatMembers=" + Arrays.toString(newChatMembers) +
				", video_note=" + video_note +
				'}';
	}

	@Override
	public int hashCode() {
		final int prime = 31;

		int result = 1;
		result = prime * result + ((audio == null) ? 0 : audio.hashCode());
		result = prime * result + ((chat == null) ? 0 : chat.hashCode());
		result = prime * result + ((contact == null) ? 0 : contact.hashCode());
		/** {@inheritDoc} */
		result = prime * result
				+ ((deleteChatPhoto == null) ? 0 : deleteChatPhoto.hashCode());
		result = prime * result
				+ ((document == null) ? 0 : document.hashCode());
		result = prime * result
				+ ((forwardDate == null) ? 0 : forwardDate.hashCode());
		result = prime * result
				+ ((forwardFrom == null) ? 0 : forwardFrom.hashCode());
		result = prime * result
				+ ((from == null) ? 0 : from.hashCode());
		result = prime
				* result
				+ ((groupChatCreated == null) ? 0 : groupChatCreated.hashCode());
		result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
		result = prime
				* result
				+ ((leftChatMember == null) ? 0
				: leftChatMember.hashCode());
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		result = prime
				* result
				+ ((newChatMember == null) ? 0
				: newChatMember.hashCode());
		result = prime * result + Arrays.hashCode(newChatPhoto);
		result = prime * result
				+ ((newChatTitle == null) ? 0 : newChatTitle.hashCode());
		result = prime * result + Arrays.hashCode(photo);
		result = prime * result
				+ ((replyToMessage == null) ? 0 : replyToMessage.hashCode());
		result = prime * result + ((sticker == null) ? 0 : sticker.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result
				+ ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((video == null) ? 0 : video.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
		/** {@inheritDoc} */
			return false;
		Message other = (Message) obj;
		if (audio == null) {
			if (other.audio != null)
				return false;
		} else if (!audio.equals(other.audio))
			return false;
		if (chat == null) {
			if (other.chat != null)
				return false;
		} else if (!chat.equals(other.chat))
			return false;
		if (contact == null) {
			if (other.contact != null)
				return false;
		} else if (!contact.equals(other.contact))
			return false;
		if (deleteChatPhoto == null) {
			if (other.deleteChatPhoto != null)
				return false;
		} else if (!deleteChatPhoto.equals(other.deleteChatPhoto))
			return false;
		if (document == null) {
			if (other.document != null)
				return false;
		} else if (!document.equals(other.document))
			return false;
		if (forwardDate == null) {
			if (other.forwardDate != null)
				return false;
		} else if (!forwardDate.equals(other.forwardDate))
			return false;
		if (forwardFrom == null) {
			if (other.forwardFrom != null)
				return false;
		} else if (!forwardFrom.equals(other.forwardFrom))
			return false;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (groupChatCreated == null) {
			if (other.groupChatCreated != null)
				return false;
		} else if (!groupChatCreated.equals(other.groupChatCreated))
			return false;
		if (messageId == null) {
			if (other.messageId != null)
				return false;
		} else if (!messageId.equals(other.messageId))
			return false;
		if (leftChatMember == null) {
			if (other.leftChatMember != null)
				return false;
		} else if (!leftChatMember
				.equals(other.leftChatMember))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (newChatMember == null) {
			if (other.newChatMember != null)
				return false;
		} else if (!newChatMember.equals(other.newChatMember))
			return false;
		if (!Arrays.equals(newChatPhoto, other.newChatPhoto))
			return false;
		if (newChatTitle == null) {
			if (other.newChatTitle != null)
				return false;
		} else if (!newChatTitle.equals(other.newChatTitle))
			return false;
		if (!Arrays.equals(photo, other.photo))
			return false;
		if (replyToMessage == null) {
			if (other.replyToMessage != null)
				return false;
		} else if (!replyToMessage.equals(other.replyToMessage))
			return false;
		if (sticker == null) {
			if (other.sticker != null)
				return false;
		} else if (!sticker.equals(other.sticker))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (video == null) {
			if (other.video != null)
				return false;
		} else if (!video.equals(other.video))
			return false;
		return true;
	}

	public Integer getMessageId() {
		return messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDate() {
		return date;
	}

	public void setDate(Integer date) {
		this.date = date;
	}

	public Chat getChat() {
		return chat;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
	}

	public User getForwardFrom() {
		return forwardFrom;
	}

	public void setForwardFrom(User forwardFrom) {
		this.forwardFrom = forwardFrom;
	}

	public Chat getForwardFromChat() {
		return forwardFromChat;
	}

	public void setForwardFromChat(Chat forwardFromChat) {
		this.forwardFromChat = forwardFromChat;
	}

	public Integer getForwardFromMessageId() {
		return forwardFromMessageId;
	}

	public void setForwardFromMessageId(Integer forwardFromMessageId) {
		this.forwardFromMessageId = forwardFromMessageId;
	}

	public Integer getForwardDate() {
		return forwardDate;
	}

	public void setForwardDate(Integer forwardDate) {
		this.forwardDate = forwardDate;
	}

	public Message getReplyToMessage() {
		return replyToMessage;
	}

	public void setReplyToMessage(Message replyToMessage) {
		this.replyToMessage = replyToMessage;
	}

	public Integer getEdit_date() {
		return edit_date;
	}

	public void setEdit_date(Integer edit_date) {
		this.edit_date = edit_date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public MessageEntity[] getEntities() {
		return entities;
	}

	public void setEntities(MessageEntity[] entities) {
		this.entities = entities;
	}

	public Audio getAudio() {
		return audio;
	}

	public void setAudio(Audio audio) {
		this.audio = audio;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public PhotoSize[] getPhoto() {
		return photo;
	}

	public void setPhoto(PhotoSize[] photo) {
		this.photo = photo;
	}

	public Sticker getSticker() {
		return sticker;
	}

	public void setSticker(Sticker sticker) {
		this.sticker = sticker;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Voice getVoice() {
		return voice;
	}

	public void setVoice(Voice voice) {
		this.voice = voice;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public User getNewChatMember() {
		return newChatMember;
	}

	public void setNewChatMember(User newChatMember) {
		this.newChatMember = newChatMember;
	}

	public User getLeftChatMember() {
		return leftChatMember;
	}

	public void setLeftChatMember(User leftChatMember) {
		this.leftChatMember = leftChatMember;
	}

	public String getNewChatTitle() {
		return newChatTitle;
	}

	public void setNewChatTitle(String newChatTitle) {
		this.newChatTitle = newChatTitle;
	}

	public PhotoSize[] getNewChatPhoto() {
		return newChatPhoto;
	}

	public void setNewChatPhoto(PhotoSize[] newChatPhoto) {
		this.newChatPhoto = newChatPhoto;
	}

	public Boolean getDeleteChatPhoto() {
		return deleteChatPhoto;
	}

	public void setDeleteChatPhoto(Boolean deleteChatPhoto) {
		this.deleteChatPhoto = deleteChatPhoto;
	}

	public Boolean getGroupChatCreated() {
		return groupChatCreated;
	}

	public void setGroupChatCreated(Boolean groupChatCreated) {
		this.groupChatCreated = groupChatCreated;
	}

	public Boolean getSupergroupChatCreated() {
		return supergroupChatCreated;
	}

	public void setSupergroupChatCreated(Boolean supergroupChatCreated) {
		this.supergroupChatCreated = supergroupChatCreated;
	}

	public Boolean getChannelChatCreated() {
		return channelChatCreated;
	}

	public void setChannelChatCreated(Boolean channelChatCreated) {
		this.channelChatCreated = channelChatCreated;
	}

	public String getMigrate_to_chat_id() {
		return migrate_to_chat_id;
	}

	public void setMigrate_to_chat_id(String migrate_to_chat_id) {
		this.migrate_to_chat_id = migrate_to_chat_id;
	}

	public String getMigrate_from_chat_id() {
		return migrate_from_chat_id;
	}

	public void setMigrate_from_chat_id(String migrate_from_chat_id) {
		this.migrate_from_chat_id = migrate_from_chat_id;
	}

	public Message getPinnedMessage() {
		return pinnedMessage;
	}

	public void setPinnedMessage(Message pinnedMessage) {
		this.pinnedMessage = pinnedMessage;
	}

	public Message getNew_chat_participant() {
		return new_chat_participant;
	}

	public void setNew_chat_participant(Message new_chat_participant) {
		this.new_chat_participant = new_chat_participant;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public User[] getNewChatMembers() {
		return newChatMembers;
	}

	public void setNewChatMembers(User[] newChatMembers) {
		this.newChatMembers = newChatMembers;
	}

	public Message getLeft_chat_participant() {
		return left_chat_participant;
	}

	public void setLeft_chat_participant(Message left_chat_participant) {
		this.left_chat_participant = left_chat_participant;
	}

	public VideoNote getVideo_note() {
		return video_note;
	}

	public void setVideo_note(VideoNote video_note) {
		this.video_note = video_note;
	}
}
