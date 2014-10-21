package com.mymonas.ngobrol.io.model;

import com.mymonas.ngobrol.model.ThreadItem;

import java.io.Serializable;

/**
 * Created by Huteri on 10/19/2014.
 */
public class PostData implements Serializable{
    private int id;
    private String text;
    private String dateCreated;
    private UserData user;
    private ThreadItem thread;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public UserData getUser() {
        return user;
    }

    public void setUser(UserData user) {
        this.user = user;
    }

    public ThreadItem getThread() {
        return thread;
    }

    public void setThread(ThreadItem thread) {
        this.thread = thread;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}