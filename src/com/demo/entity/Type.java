package com.demo.entity;

/**
 * @Author: 汪飞洋
 * @project: PetManager
 * @Date: 2023/8/21
 */
public class Type {
    int t_id;
    String t_name;

    public Type() {
    }

    public Type(int t_id, String t_name) {
        this.t_id = t_id;
        this.t_name = t_name;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }
}
