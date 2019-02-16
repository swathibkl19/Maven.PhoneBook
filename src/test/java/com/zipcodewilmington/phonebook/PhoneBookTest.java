package com.zipcodewilmington.phonebook;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBookTest {


    @Test
    public void addTest() {
        //given
        String name = "aaa";
        String phoneNumber = "111-222-3333";

        //when

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(name, phoneNumber);

        //then
        String retrivedPhoneNumber = phoneBook.lookup(name);
        Assert.assertEquals(retrivedPhoneNumber, phoneNumber);
        //Assert.assertEquals(phoneNumber,phoneBook.phonebookMap);


    }

    @Test
    public void removeTest() {
        //given
        String name = "aaa";
        String phoneNumber = "111-222-3333";


        //when

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(name, phoneNumber);
        phoneBook.remove(name);


        //then

        String retrivedPhoneNumber = phoneBook.lookup(name);

        Assert.assertNull(retrivedPhoneNumber);

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
