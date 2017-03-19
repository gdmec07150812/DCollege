package com.gdmec.jacky.dcollege;

public class User {
    private String name;
    private int userIcon;
    private String chatInfo;

    public User(String name, int userIcon, String chatInfo) {
        this.name = name;
        this.userIcon = userIcon;
        this.chatInfo = chatInfo;
    }

    public String getChatInfo() {
        return chatInfo;

    }

    public void setChatInfo(String chatInfo) {
        this.chatInfo = chatInfo;
    }

    public int getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(int userIcon) {
        this.userIcon = userIcon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
