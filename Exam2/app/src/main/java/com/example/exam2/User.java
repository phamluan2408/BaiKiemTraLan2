package com.example.exam2;

public class User {
    private String Name,Loai,Gia,Anh,IDSP;

    public User() {
    }

    public User(String name, String loai, String gia, String anh, String idsp) {
        this.Name = name;
        this.Loai = loai;
        this.Gia = gia;
        this.Anh = anh;
        this.IDSP = idsp;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Loai;
    }

    public String getUsername() {
        return Gia;
    }

    public String getPassword() {
        return Anh;
    }

    public String getUserId() {
        return IDSP;
    }
}
