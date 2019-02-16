package com.zipcodewilmington.phonebook;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook2Test {


    @Test
    public void addTest() {
        //given
        String name1 = "aaa";
        ArrayList<String> phoneNumberList = new ArrayList<String>();
        phoneNumberList.add("222-333-5453") ;
        phoneNumberList.add("666-222-4445");
        phoneNumberList.add("222-333-5555");


        String name2 = "bbb";
        ArrayList<String> phoneNumberList2 = new ArrayList<String>();
        phoneNumberList2.add("111-333-5453") ;
        phoneNumberList2.add("777-666-4445");
        phoneNumberList2.add("888-333-5555");



        //Expeted:

        ArrayList<String> expectedPhoneList = new ArrayList<String>();
        expectedPhoneList.add("222-333-5453");
        expectedPhoneList.add("666-222-4445");
        expectedPhoneList.add("222-333-5555");


        //when

        PhoneBook2 phoneBook = new PhoneBook2();

        phoneBook.add(name1, phoneNumberList);
        phoneBook.add(name2,phoneNumberList2);

        //then
        ArrayList<String> retrivedPhoneNumberList = phoneBook.lookup(name1);
        Assert.assertEquals(retrivedPhoneNumberList, expectedPhoneList);


    }

    /**
     * remove the username from the phone directory
     */
    @Test
    public void removeTest() {
        //given
        String name1 = "aaa";
        ArrayList<String> phoneNumberList = new ArrayList<String>();
        phoneNumberList.add("222-333-5453") ;
        phoneNumberList.add("666-222-4445");
        phoneNumberList.add("222-333-5555");


        String name2 = "bbb";
        ArrayList<String> phoneNumberList2 = new ArrayList<String>();
        phoneNumberList2.add("111-333-5453") ;
        phoneNumberList2.add("777-666-4445");
        phoneNumberList2.add("888-333-5555");


        //when

        PhoneBook2 phoneBook = new PhoneBook2();
        phoneBook.add(name1, phoneNumberList);
        phoneBook.add(name2,phoneNumberList2);


        PhoneBook2 expectedPhoneBook = new PhoneBook2();

        expectedPhoneBook.add(name2,phoneNumberList2);


      phoneBook.remove(name1);
      Assert.assertEquals(phoneBook.lookup(name2),expectedPhoneBook.lookup(name2));


    }

    @Test
    public void lookupTest() {
        //given
        String name = "aaa";
        String phoneNumber = "111-222-3333";


        //when

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.lookup(name);


        //then

        Assert.assertNull(phoneBook.name);

    }


    @Test
    public void reverseLookupTest() {
        //given
        String name = "aaa";
        String phoneNumber = "111-222-3333";

        String name1 = "Joe";
        String phoneNumber1 = "484-222-3333";


        //when

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(name,phoneNumber);
        phoneBook.add(name1,phoneNumber1);


        String retrivedName = phoneBook.reverseLookup(phoneNumber);



        //then

        Assert.assertEquals(name,retrivedName);

    }
}
