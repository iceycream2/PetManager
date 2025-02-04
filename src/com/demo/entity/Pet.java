package com.demo.entity;

/**
 * @Author: 汪飞洋
 * @project: PetManager
 * @Date: 2023/8/21
 */
public class Pet {
    int p_id;
    String p_name;
    String p_m_name;
    String p_m_phone;
    String p_m_address;
    String p_type;

    public Pet() {
    }

    public Pet(int p_id, String p_name, String p_m_name, String p_m_phone, String p_m_address, String p_type) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_m_name = p_m_name;
        this.p_m_phone = p_m_phone;
        this.p_m_address = p_m_address;
        this.p_type = p_type;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_m_name() {
        return p_m_name;
    }

    public void setP_m_name(String p_m_name) {
        this.p_m_name = p_m_name;
    }

    public String getP_m_phone() {
        return p_m_phone;
    }

    public void setP_m_phone(String p_m_phone) {
        this.p_m_phone = p_m_phone;
    }

    public String getP_m_address() {
        return p_m_address;
    }

    public void setP_m_address(String p_m_address) {
        this.p_m_address = p_m_address;
    }

    public String getP_type() {
        return p_type;
    }

    public void setP_type(String p_type) {
        this.p_type = p_type;
    }
}
