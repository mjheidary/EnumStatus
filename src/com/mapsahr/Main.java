package com.mapsahr;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Arrays.stream(BookEnumStatus.values()).forEach(System.out::println);
        System.out.println(BookEnumStatus.RETURN.getStatus());
        System.out.println(BookEnumStatus.findValue(1));

    }
}
