package com.example.den.lesson7.Interfaces;

import java.io.Serializable;

public interface PhotoItem extends Serializable {
    String getID();
    String getImgUrl();
    String getAuthorName();

    // ORM
    void saveToDatabase();
    void deleteFromDatabase();
    boolean isSavedToDatabase();
}
