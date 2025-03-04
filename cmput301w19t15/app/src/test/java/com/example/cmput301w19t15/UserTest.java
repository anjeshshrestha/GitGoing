package com.example.cmput301w19t15;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void testUser() {
        User x = new User("user123", "first last", "example@email.com", "111-111-1111");
        assertEquals(x.getUsername(),"user123");
        assertEquals(x.getName(),"first last");
        assertEquals(x.getEmail(),"example@email.com");
        assertEquals(x.getPhone(),"111-111-1111");
    }

    @Test
    public void testSetUsername() {
        User x = new User("user123", "first last", "example@email.com", "111-111-1111");
        x.setUsername("Gradle");
        assertEquals(x.getUsername(),"Gradle");
        x.setUsername("Example2");
        assertEquals(x.getUsername(),"Example2");
    }
    @Test
    public void testSetName() {
        User x = new User("user123", "first last", "example@email.com", "111-111-1111");
        x.setName("Gradle Build");
        assertEquals(x.getName(),"Gradle Build");
        x.setName("Example Name");
        assertEquals(x.getName(),"Example Name");
    }
    @Test
    public void testSetEmail() {
        User x = new User("user123", "first last", "example@email.com", "111-111-1111");
        x.setEmail("gradle@build.com");
        assertEquals(x.getEmail(),"gradle@build.com");
        x.setEmail("Uptown@funk.com");
        assertEquals(x.getEmail(),"Uptown@funk.com");
    }
    @Test
    public void testSetPhone() {
        User x = new User("user123", "first last", "example@email.com", "111-111-1111");
        x.setPhone("800-267-2001");
        assertEquals(x.getPhone(),"800-267-2001");
        x.setPhone("737-373-773");
        assertEquals(x.getPhone(),"737-373-7373");
    }
    @Test
    // Don't understand how photos work yet
    public void testSetRating() {
        User x = new User("user123", "first last", "example@email.com", "111-111-1111");
        x.setRating(5f);
        assertEquals(x.getRating(),(Float) 5f);
        x.setRating(4f);
        assertEquals(x.getRating(),(Float) 4f);
    }

}
