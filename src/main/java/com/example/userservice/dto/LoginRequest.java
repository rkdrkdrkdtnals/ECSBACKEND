package com.example.userservice.dto;

public class LoginRequest {

    private String username;
    private String password;

    // 기본 생성자 (JSON 매핑에 필요)
    public LoginRequest() {}

    // 생성자
    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // getter, setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
