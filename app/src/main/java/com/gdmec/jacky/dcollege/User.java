package com.gdmec.jacky.dcollege;

public class User {
    private String userId;
    private String userName;
    private int userIcon;
    private String lastMessage;

    public User(String userId, String userName, int userIcon, String lastMessage) {
        this.userId = userId;
        this.userName = userName;
        this.userIcon = userIcon;
        this.lastMessage = lastMessage;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(int userIcon) {
        this.userIcon = userIcon;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}
