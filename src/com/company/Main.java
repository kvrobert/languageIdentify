package com.company;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String fileNameh = "ףךלחףךלחץ.msg";
        String fileNameg = "સ્વાગત";
        String fileNamet = "sdasd asஜான் ஸ்மித்as s as sad dsad";
        String fileNamebeng = "জন স্মিথ";
        String fileName2 = "sdasdasdsad";

        String[] names = {"સ્વાગત","ஜான் ஸ்மித்","জন স্মিথ", "sdasdasdsad"};


        Pattern ph = Pattern.compile("\\p{InHebrew}", Pattern.UNICODE_CASE);
        Pattern pg = Pattern.compile("\\p{InGujarati}", Pattern.UNICODE_CASE);
        Pattern pt = Pattern.compile("\\p{InTamil}", Pattern.UNICODE_CASE);
        Pattern pb = Pattern.compile("\\p{InBengali}", Pattern.UNICODE_CASE);


        Pattern unsupportedLanguage = Pattern.compile("\\p{InBengali}|\\p{InGujarati}|\\p{InHebrew}|\\p{InTamil}", Pattern.UNICODE_CASE);
        Matcher m = null;

        boolean hebrewDetected = false;
       /* for (int i = 0; i < fileName.length() && !hebrewDetected; i++){
            String letter = fileName.charAt(i) + "";
            m = p.matcher(letter);
            hebrewDetected = m.matches();
            if (hebrewDetected){
                break;
            }
        }*/

        m = ph.matcher(fileNameh);
        System.out.println("illeszkedik..heber.." + m.find()); //true

        m = pg.matcher(fileNameg);
        System.out.println("illeszkedik..gujarati.." + m.find()); //true

        m = pt.matcher(fileNamet);
        System.out.println("illeszkedik..tamil.." + m.find()); //true

        m = pb.matcher(fileNamebeng);
        System.out.println("illeszkedik..bengali.." + m.find()); //true

        m = ph.matcher(fileName2);
        System.out.println("illeszkedik..heber de nem heber " + m.find()); //true

        m = pg.matcher(fileName2);
        System.out.println("illeszkedik..gujarati, de nem gujarati.." + m.find()); //true

        m = pt.matcher(fileName2);
        System.out.println("illeszkedik..tamil, de nem tamil.." + m.find()); //true

        m = pb.matcher(fileName2);
        System.out.println("illeszkedik..bengali, de nem bengali.." + m.find()); //true

        m = unsupportedLanguage.matcher(fileNamebeng);
        System.out.println("illeszkedik..MIX.....bengali.." + m.find()); //true


       for(String name : names){
           m = unsupportedLanguage.matcher(name);
           System.out.println("illeszkedik..MIX..in ARRAY...bengali.." + m.find()); //true
       }


        System.out.println("hebrewDetected=" + hebrewDetected); //true

    }
}
