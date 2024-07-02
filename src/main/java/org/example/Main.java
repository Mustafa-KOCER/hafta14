package org.example;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        LinkedList<Secret> secrets = new LinkedList<Secret>();
        Finder finder = new Finder();

        System.out.println("------------------------------------------------------BIRINCI MADDE------------------------------------------------------");

        Secret<String> rule_1 = new Secret<>();
        rule_1.setSecret("fıght club hakkında konusmamak");
        secrets.add(rule_1);

        Secret<String> rule_2 = new Secret<>();
        rule_2.setSecret("fıght club hakkında konusmamak");
        secrets.add(rule_2);

        Secret<String> rule_3 = new Secret<>();
        rule_3.setSecret("biri dur derse veya topallamaya başlarsa, dövüş sona ermiştir");
        secrets.add(rule_3);

        Secret<String> rule_4 = new Secret<>();
        rule_4.setSecret("aynı anda iki kişi kavga eder");
        secrets.add(rule_4);

        Secret<String> rule_5 = new Secret<>();
        rule_5.setSecret("dövüşler tek tek yapılır");
        secrets.add(rule_5);

        Secret<String> rule_6 = new Secret<>();
        rule_6.setSecret("tshırt, gömlek ve ayakkabı yok");
        secrets.add(rule_6);

        Secret<String> rule_7 = new Secret<>();
        rule_7.setSecret("dövüş, dövüşenler devam ettiği sürece devam eder");
        secrets.add(rule_7);

        Secret<String> rule_8 = new Secret<>();
        rule_8.setSecret("bu fight clubda ilk gecense, düvüşmek zorundasın");
        secrets.add(rule_8);

        Secret<Integer> pin = new Secret<>();
        pin.setSecret(80235);
        secrets.add(pin);

        Secret<Character> key = new Secret<>();
        key.setSecret('x');
        secrets.add(key);

        for( Secret data : secrets){
            System.out.println(data.getSecret());
        }


        System.out.println("------------------------------------------------------IKINCI MADDE------------------------------------------------------");

        Integer[] intArray = {3,5,7,8};
        String[] strArray = {"deneme","deneme3"};

        finder.fndr(intArray,3);
        finder.fndr(intArray, 4);
        finder.fndr(strArray,"deneme");
        finder.fndr(strArray,"deneme2");


    }
}