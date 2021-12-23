package com.lenovo;
import java.util.ArrayList;
/*
扑克牌算法
 */
public  class PKCompare {

    public static String compareString(String comString) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("3");
        al.add("4");
        al.add("5");
        al.add("6");
        al.add("7");
        al.add("8");
        al.add("9");
        al.add("10");
        al.add("J");
        al.add("Q");
        al.add("K");
        al.add("A");
        al.add("2");
        al.add("joker");
        al.add("JOKER");
        String errorString = "ERROR";
        if (comString == null || comString.equals("")) {
            return errorString;
        }
        String[] pkString = comString.split("-");
        if (pkString[0] == null || pkString[0].equals("") || pkString[1] == null || pkString[1].equals("")){
            return errorString;
        }
        if (pkString[0].contains("joker JOKER") || pkString[1].contains("joker JOKER")){
            return "joker JOKER";
        }

        String[] p0Array = pkString[0].split(" ");
        String[] p1Array = pkString[1].split(" ");
        if (p0Array.length == 4 || p1Array.length == 4) {

            if (p0Array.length == 4 && p1Array.length==4) {
                String p0 = pkString[0].substring(0,1);
                String p1 = pkString[1].substring(0,1);
                if (al.indexOf(p0) > al.indexOf(p1)) {
                    return pkString[0];
                } else {
                    return pkString[1];
                }

            } else if (p0Array.length == 4) {
                return pkString[0];
            } else {
                return pkString[1];
            }

        } else {

            if (p0Array.length != p1Array.length) {
                return errorString;
            } else {

                if (pkString[0].equals("joker") || pkString[0].equals("JOKER") || pkString[1].equals("joker") || pkString[1].equals("JOKER")){
                    if (pkString[0].equals("JOKER")) {
                        return pkString[0];
                    } else if (pkString[1].equals("JOKER")) {
                        return pkString[1];
                    } else  if (pkString[0].equals("joker")){
                        return pkString[0];
                    } else {
                        return pkString[1];
                    }
                }  else {

                    String po = pkString[0].substring(0,1);
                    String p1 = pkString[1].substring(0,1);
                    if (al.indexOf(po) > al.indexOf(p1)) {
                        return pkString[0];
                    } else {
                        return pkString[1];
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        //String cString = "3 3 3 3-4 4 4 4";
        System.out.println("args======>" + args.length);
        if(args == null) {
            return;
        }
        String cString = "";
        for(String s:args) {
            cString = cString + s;
        }
        //cString = "3 3 3 3-4 4 4 4";
        String result = compareString(cString);
        System.out.println(result);
    }
}
