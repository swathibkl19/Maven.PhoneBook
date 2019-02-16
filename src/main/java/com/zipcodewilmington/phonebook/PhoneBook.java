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
public class PhoneBook {

    String name;
    String phoneNumber;

 //  Map< String , ArrayList<String>> phonebookMap;
 Map< String , String> phonebookMap;

    public PhoneBook () {

      // phonebookMap = new HashMap<String,  ArrayList<String>>();
        phonebookMap = new HashMap<String, String>();
    }

public  void add(String name,String phoneNumber){


    phonebookMap.put(name,phoneNumber);

}

    public String remove(String name) {


        return (phonebookMap.remove(name));



    }

    public String lookup(String name) {

        return phonebookMap.get(name);


    }

    /**
     *
     *
     * @param  Input --- phoneNumber
     * @return Name of the user
     */

    public String reverseLookup(String phoneNumber) {

       // public void keySet(name);

       for(String mapNameKey : phonebookMap.keySet()) {
           String mapPhoneNumber = phonebookMap.get(mapNameKey);
           if(mapPhoneNumber.equals(phoneNumber))
               return mapNameKey;
       }

        return null;


    }
}



