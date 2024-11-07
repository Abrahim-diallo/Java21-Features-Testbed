package com.Java21_Features.java_21_string_templates;

public class StringTemplatesExample {
    //============================ Utilité : Les templates de chaînes Java 21.====================================
    public static void main(String[] args) {
        String name = "Java";
        String template = STR."Hello, \{name}!";
        System.out.println(template);
    }
}
