package com.zipcodewilmington.phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 1/23/18.
 */
//add(String name, String phoneNumber)
//remove(String name)
//lookup(String name)
//reverseLookup(String phoneNumber)
//display()

/**
 * class PhoneBook2 handles multiple phonenumbers for a given user.
 */


public class PhoneBook2 {

private   Map< String , ArrayList<String>> phonebookMap;

    public PhoneBook2() {

        phonebookMap = new HashMap<String,  ArrayList<String>>();

    }

    /**
     *
     * to add a user with List of Phone Number
     * @param name
     * @param phoneNumberList
     */

public  void add(String name,ArrayList<String> phoneNumberList){


    phonebookMap.put(name,phoneNumberList);

}

    /**
     *
     * @param name
     * @return ListPhoneNumber
     *
     *
     * using the name we removing the phoneList.
     */

    public ArrayList<String> remove(String name) {


        return (phonebookMap.remove(name));



    }

    public ArrayList<String> lookup(String name) {

        return phonebookMap.get(name);


    }

   }




