package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Predicate;


public class Main {

    public static void main(String[] args) {
       String [] name = {"george", "john", "james", "jacob", "henry"};
       Set s = new TreeSet();
       Collections.addAll(s, name);
        System.out.println(s);

    }
}
