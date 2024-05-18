package com.level1;

import java.util.ArrayList;
import java.util.List;

public class Iterate {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add( 2 );
        list.add( 3 );
        list.add( 4 );
        list.add( 5 );
        list.add( 6 );
        list.add( 7 );
        list.add( 8 );
        list.add( 9 );

// Traditional way of iterating
        for(int i=0;i<list.size();i++){
            System.out.print(list.get( i )+" ");
        }
        System.out.println();
// Using for each
        for(int element : list){
            System.out.print(element+" ");
        }
        System.out.println();

//using Java 8 feature
        list.stream().forEach( System.out::print );
        System.out.println();
        list.stream().forEach( i ->  System.out.print(i+" "));
    }
}
