package com.company;


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

        String[] persons = {"Izz al-Din al-Qassam Brigades",
                "III.",
                "Religious Groupings",
                "Nizar",
                "Aviv University",
                "Institutions",
                "Sheikh Ahmed Yassin",
                "From Arafat",
                "by Grad",
                "Bush",
                "of Ashdod",
                "Edith Cresson",
                "July",
                "Al Quds",
                "Antoine Sfeir",
                "Constantinople",
                "Urdu",
                "Philosopher",
                "Ido Mizrahi",
                "Zionist",
                "Transatlantic Institute",
                "Al-Dura‘s",
                "Hamas Web",
                "Czech Ambassador",
                "Article Seventeen",
                "June",
                "Luigi Vittorio Ferraris",
                "March",
                "Ivory Coast",
                "Sharon",
                "Koran",
                "against Zionism",
                "October",
                "the Zionists",
                "Waqf",
                "Valentine",
                "Jordan",
                "Christian West",
                "Palestinians",
                "Kibbutz Zikkim",
                "Chairman",
                "Czech Republic",
                "Pierre Kipre",
                "Mushir al-Masri",
                "Kibbutz Shamir",
                "Muhammad Al Dura",
                "Story - Ayman Muhanna",
                "May 1",
                "Shean",
                "Ismail Haniyyeh",
                "Jean Christophe Rufin",
                "Article V.",
                "Jamal Abdel Ghani Rashid Nazer",
                "Dana Lindaman",
                "Mahmoud Ahmad Marmash",
                "Middle East Forum",
                "Abdullah ibn al-Mubarak",
                "for Hamas",
                "Marwan Abu Ras",
                "David Agreement",
                "Johannes Jansen",
                "My Grandmother",
                "Al-Aqsa's Soldiers",
                "by Israeli",
                "Italy",
                "Article Sixteen",
                "August 1",
                "Greater Syria",
                "Rafael L. Bardaji Lopez",
                "Mrs. Meridor",
                "the Al Aqsa Mosque",
                "Afghanistan",
                "Ideological Affinity",
                "September",
                "Khaled Ali Rian",
                "Senator François Roelants",
                "Beit",
                "Noa Meridor",
                "Ahmad Bahr",
                "Shadi Zakaria al-Tubasi",
                "Grant",
                "the Byzantine Empire",
                "shahid Imam Hassan al-Banna",
                "Hamas Prime Minister Ismail Haniyeh",
                "Nafha Prison",
                "Emanuel Ottolenghi",
                "Hamas Charter",
                "Sykes and Picot",
                "Din al Kassam",
                "Intellectuals",
                "April 1",
                "Issue 8",
                "Professor",
                "Canaanite Arabs",
                "Sheikh Ahmad Yassin",
                "Islamic Viewpoint",
                "The Arab",
                "Atallah Abu al-Sabah",
                "E. Nationalist",
                "Al-Mustafa",
                "Muhammad al-Def",
                "Istanbul",
                "Faim",
                "Allahu Akbar",
                "viii",
                "the Hamas",
                "General Allenby",
                "senior Hamas",
                "Ayatollah Ruholla Khomeini",
                "Director",
                "ambulance",
                "Abbas and Hamas",
                "President Mahmoud Abbas",
                "Michael Dennis",
                "Turkey",
                "Tatar",
                "the Shahid",
                "Islamic Caliphate",
                "Imam Khomeini",
                "Noble Sanctuary",
                "Al-Aqsa Intifada",
                "Umm Rihan",
                "Al-Fateh",
                "Georges Tadonki",
                "north",
                "Abd al-Aziz Rantisi",
                "called Qassam",
                "Vivier",
                "Al-Andalus",
                "Emmanuel Sivan",
                "Arnon Groiss",
                "Article Eleven",
                "waifs",
                "Dominique Sopo",
                "Sheikh Radwan Mosque",
                "Yasser Mohammad Taha",
                "Comparative Theology",
                "of Allah",
                "Daniel Pipes",
                "the Gaza Strip",
                "Yasmin Shamalawi",
                "Sykes-Picot Agreement",
                "Berg International",
                "Spain",
                "Capitalist West",
                "Orit Ichilov",
                "Sayyid Qutb",
                "Umm Kulthum",
                "the Freemasons",
                "Self-Destruction",
                "Sa‘id Siyyam",
                "Kemal Kirisci",
                "Daryoush Homayoun",
                "F. Followers",
                "Goncourt Laureate",
                "Muhammad… Muhammad",
                "Zeitouna University",
                "Rosa Alonso",
                "I. The",
                "D. Arab",
                "Charles",
                "Brussels",
                "of Salah el-Din",
                "Al-Aqsa Mosque",
                "Rohan",
                "Jana Hybaskova",
                "of Islam",
                "Fatima Ibrahim Elbeltagi",
                "Balfour Declaration",
                "Hassan Nasrallah",
                "Jibril Deal",
                "the West",
                "Genghis Khan",
                "II. Content",
                "Deligitimizing Israel",
                "non-Arab",
                "Herod‘s Temple",
                "Zeynab Abu Salam",
                "Preיface d'Antoine Sfeir",
                "France",
                "February",
                "of Muhammad",
                "Holland",
                "portray Israel",
                "January 1",
                "Ahmed al-Bahar",
                "Al-Aqqad",
                "Article Thirteen",
                "Hajj Amin al-Husseini",
                "Khalil al-Hayyah",
                "Article Seven",
                "Na‘aman Abu Hahal",
                "Yahya Ayyash",
                "Quran",
                "al-Bukhari",
                "Hulagu Khan",
                "My Dear",
                "Al-Aqsa Martyrs Brigades",
                "Paris",
                "Orientalists"};

        String[] persons2 = { "Szász Károly",
                "Tisztelt Doktor Úr",
                "Tóth Ildikó",
                "Katona Gábor Dezső",
                "משה רבנו",
                "Balogh Emília Dalmát",
                "Herod‘s Temple",
                "Zeynab Abu Salam",
                "Preיface d'Antoine Sfeir",
                "France",
                "February",
                "of Muhammad",
                "Holland",
                "portray Israel",
                "સ્વાગત",
                "ஜான் ஸ்மித்",
                "জন স্মিথ",
                "Edith Cresson",
                "July",
                "Al Quds"};


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


        for(String name : persons2){
            //System.out.println("illeszkedik..MIX..in ARRAY...bengali.." + m.find()); //true/
          //  name = name.replaceAll("\\p{InBengali}|\\p{InGujarati}|\\p{InHebrew}|\\p{InTamil}", "_");
            m = unsupportedLanguage.matcher(name);
            if(m.find()){
                System.out.println("Not SUPPORTED...." + name);
            }
        }


        System.out.println("hebrewDetected=" + hebrewDetected); //true

    }
}
