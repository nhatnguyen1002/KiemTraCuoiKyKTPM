/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nhom13.lop01;

/**
 *
 * @author Admin
 */
public class Student {
    private String id;
    private String name;

    
    
    public Student(String id, String name){
        this.id = id;
        this.name = name;
    }
    // getters and setters
    public String getId(){
        return id;
    }
    public String getId(String newid){
        newid = id;
        return newid;
    }
    public String getName(){
        return name;
    }
    public String getName(String newname){
        newname = name;
        return newname;
    }
    
}
