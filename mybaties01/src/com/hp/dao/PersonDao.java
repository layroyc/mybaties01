package com.hp.dao;

import com.hp.bean.Person;

import java.util.ArrayList;

public interface PersonDao {
    //全查
    ArrayList<Person> selectAll();
}
