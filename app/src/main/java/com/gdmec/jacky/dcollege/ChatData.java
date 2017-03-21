package com.gdmec.jacky.dcollege;

public class ChatData {
    private int messageId;
    private int userId;
    private int userIcon;
    private String userName;
    private String message;
    private int image;
    private int voice;
    private int status;
    private String sendTime;

    public ChatData(String userName, int userIcon, String message) {
        //this.messageId = messageId;
        //this.userId = userId;
        this.userIcon = userIcon;
        this.userName = userName;
        this.message = message;
        //this.image = image;
        //this.voice = voice;
        //this.status = status;
        //this.sendTime = sendTime;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(int userIcon) {
        this.userIcon = userIcon;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getVoice() {
        return voice;
    }

    public void setVoice(int voice) {
        this.voice = voice;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }
}
