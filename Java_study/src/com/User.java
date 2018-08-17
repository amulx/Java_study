package com;

public class User {
    public static final char SEX_MALE = '男';
    public static final char SEX_FAILMALE = '女';
    String username =  "guest";

    public User(){

    }

    public User(String username,byte  userage){
        this.username = username;
        this.userage = userage;
    }

    public void check() {
        String[] str = {"张三","李四"};
        for (int i=0;i<str.length;i++) {
            if (this.username == str[i]){
                this.username = this.username + "_check";
                break;
            }
        }
//        if(this.username=="张三"){
//            this.username = "中国";
//        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public byte getUserage() {
        return userage;
    }

    public void setUserage(byte userage) {
        this.userage = userage;
    }

    public char getUsersex() {
        return usersex;
    }

    public void setUsersex(char usersex) {
        this.usersex = usersex;
    }

    public int getUserscore() {
        return userscore;
    }

    public void setUserscore(int userscore) {
        this.userscore = userscore;
    }

    byte userage = 10;
    char usersex = '男';
    int userscore = 0;
}
