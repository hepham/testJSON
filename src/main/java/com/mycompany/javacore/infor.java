/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacore;

/**
 *
 * @author phamh
 */
public class infor {
    private int id;
    private String username;
    public infor(int id,String username){
        this.id=id;
        this.username=username;
            
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void display(){
        System.out.println("ID:"+id);
        System.out.println("username:"+username);
    }
}
