package com.lifeshs.product.api.controller.pojo;

public class Doctor {
    private String userCode;
    private String userName;
    private String password;
    private String content;

    public Doctor() {
    }

    public Doctor(String userCode, String username, String password, String content) {
        this.userCode = userCode;
        this.userName = username;
        this.password = password;
        this.content = content;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
