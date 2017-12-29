package com.example.oana.myvet;

/**
 * Created by oanaelena on 26/12/2017.
 */

public class User {
    private String uid,email,password;

    public User(String _uid,String _email,String _password)
    {
        uid=_uid;
        email=_email;
        password=_password;
    }

    public String getUid(){
        return uid;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public void setUid(String _uid)
    {
        uid=_uid;
    }

    public void setPassword(String _password)
    {
        password=_password;
    }

    public void setUsername(String _username)
    {
        email=_username;
    }





}
