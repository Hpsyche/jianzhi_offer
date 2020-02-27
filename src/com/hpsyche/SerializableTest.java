package com.hpsyche;

/**
 * @author hpsyche
 * Create on 2020/2/16
 */
public class SerializableTest {
    public static void main(String[] args) {
        User.setName("abc");
                
    }
}
class User{
    static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        User.name = name;
    }
}