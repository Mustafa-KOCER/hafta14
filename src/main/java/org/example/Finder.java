package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Finder<T> {

    public void fndr(T[] array, T key){

        if(Arrays.stream(array).anyMatch(match -> match.equals(key))){
            System.out.println(key);
        }
        else {
            System.out.println(-1);
        }

    }

}
