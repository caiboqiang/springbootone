package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        //从集合中创建
        list.stream();
        //并行流
        list.parallelStream();

        //从数组创建
        Arrays.stream(new int[]{1,2,3,4});


        //创建数字流
        IntStream.of(1,2,3);
        IntStream.rangeClosed(1,10);//创建一个1-10的流

        //new Random().ints()这样创建的流是无线的，要调用个limit
        new Random().ints().limit(10);
        Random random = new Random();

        //自己产生流
        Stream.generate(() ->random.nextInt()).limit(10);


    }
}
