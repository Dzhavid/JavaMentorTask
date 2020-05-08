import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RomNumbers {
    public static void main(String[] args) {
        String rom[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};
        String rom1[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VII", "VIII", "IX", "X"};
        String mas[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        Scanner s = new Scanner(System.in);
        String vvod = s.next();
        if (vvod.contains("+")) {
            StringTokenizer st = new StringTokenizer(vvod, "+");
            while (st.hasMoreTokens()) {
                int a = 0, b = 0, c = 0, d = 0;
                String key = st.nextToken();
                String val = st.nextToken();
                for(int i = 0;i<rom1.length;i++){
                    if(key.contains(rom1[i])){
                        for (int j = 0; j <mas.length ; j++) {
                            if(val.contains(mas[j])){
                                try{
                                    throw new RomNumbersException("Некорректный ввод.Программа умеет работать только с арабскими или римскими цифрами одновременно!");
                                }catch(RomNumbersException e){
                                    e.printStackTrace();
                                    System.exit(1);
                                }
                            }
                        }
                    }
                }
                for(int i = 0;i<mas.length;i++){
                    if(key.contains(mas[i])){
                        for (int j = 0; j <rom1.length; j++) {
                            if(val.contains(rom1[j])){
                                try{
                                    throw new RomNumbersException("Некорректный ввод.Программа умеет работать только с арабскими или римскими цифрами одновременно!");
                                }catch(RomNumbersException e){
                                    e.printStackTrace();
                                    System.exit(1);
                                }
                            }
                        }
                    }
                }
                for (int i = 0; i < 8; i++) {
                    if (key.contains(mas[i])) {
                        a = Integer.parseInt(key);
                        if(a>10 | a<=0){
                            try{
                                throw new RomNumbersException("Некорректный ввод.Введите число от 1 до 10");
                            }catch(RomNumbersException e){
                                e.printStackTrace();
                                System.exit(1);
                            }
                        }
                        //System.out.println(a);
                    }
                }
                for (int i = 0; i < 8; i++) {
                    if (val.contains(mas[i])) {
                        b = Integer.parseInt(val);
                        if(b>10 | b<=0){
                            try{
                                throw new RomNumbersException("Некорректный ввод.Введите число от 1 до 10");
                            }catch(RomNumbersException e){
                                e.printStackTrace();
                                System.exit(1);
                            }
                        }
                        //System.out.println(b);
                    }
                }
                for (int i = 0; i < rom.length - 1; i++) {
                    if (key.equals(rom[i])) {
                        c = romanToArabic(key);
                        if(c>10 | c<=0){
                            try{
                                throw new RomNumbersException("Некорректный ввод.Введите число от 1 до 10");
                            }catch(RomNumbersException e){
                                e.printStackTrace();
                                System.exit(1);
                            }
                        }
                        //System.out.println(c);
                    }
                }
                for (int i = 0; i < rom.length - 1; i++) {
                    if (val.equals(rom[i])) {
                        d = romanToArabic(val);
                        if(d>10 | d<=0){
                            try{
                                throw new RomNumbersException("Некорректный ввод.Введите число от 1 до 10");
                            }catch(RomNumbersException e){
                                e.printStackTrace();
                                System.exit(1);
                            }
                        }
                        // System.out.println(d);
                    }
                }
                if (a>0 && b>0) {
                    System.out.println(a + b);
                } if(c>0 && d>0)System.out.println(arabicToRoman(c + d));
            }

        }
       else if (vvod.contains("-")) {
            StringTokenizer st = new StringTokenizer(vvod, "-");
            while (st.hasMoreTokens()) {
                int a = 0, b = 0, c = 0, d = 0;
                String key = st.nextToken();
                String val = st.nextToken();
                for(int i = 0;i<rom1.length;i++){
                    if(key.contains(rom1[i])){
                        for (int j = 0; j <mas.length ; j++) {
                            if(val.contains(mas[j]) ){
                                try{
                                    throw new RomNumbersException("Некорректный ввод.Программа умеет работать только с арабскими или римскими цифрами одновременно!");
                                }catch(RomNumbersException e){
                                    e.printStackTrace();
                                    System.exit(1);
                                }
                            }
                        }
                    }
                }
                for(int i = 0;i<mas.length;i++){
                    if(key.contains(mas[i])){
                        for (int j = 0; j <rom1.length; j++) {
                            if(val.contains(rom1[j])){
                                try{
                                    throw new RomNumbersException("Некорректный ввод.Программа умеет работать только с арабскими или римскими цифрами одновременно!");
                                }catch(RomNumbersException e){
                                    e.printStackTrace();
                                    System.exit(1);
                                }
                            }
                        }
                    }
                }
                for (int i = 0; i < 8; i++) {
                    if (key.contains(mas[i])) {
                        a = Integer.parseInt(key);
                        if(a>10 | a<=0){
                            try{
                                throw new RomNumbersException("Некорректный ввод.Введите число от 1 до 10");
                            }catch(RomNumbersException e){
                                e.printStackTrace();
                                System.exit(1);
                            }
                        }
                        //System.out.println(a);
                    }
                }
                for (int i = 0; i < 8; i++) {
                    if (val.contains(mas[i])) {
                        b = Integer.parseInt(val);
                        if(b>10 | b<=0){
                            try{
                                throw new RomNumbersException("Некорректный ввод.Введите число от 1 до 10");
                            }catch(RomNumbersException e){
                                e.printStackTrace();
                                System.exit(1);
                            }
                        }
                        //System.out.println(b);
                    }
                }
                for (int i = 0; i < rom.length - 1; i++) {
                    if (key.equals(rom[i])) {
                        c = romanToArabic(key);
                        if(c>10 | c<=0){
                            try{
                                throw new RomNumbersException("Некорректный ввод.Введите число от 1 до 10");
                            }catch(RomNumbersException e){
                                e.printStackTrace();
                                System.exit(1);
                            }
                        }
                        //System.out.println(c);
                    }
                }
                for (int i = 0; i < rom.length - 1; i++) {
                    if (val.equals(rom[i])) {
                        d = romanToArabic(val);
                        if(d>10 | d<=0){
                            try{
                                throw new RomNumbersException("Некорректный ввод.Введите число от 1 до 10");
                            }catch(RomNumbersException e){
                                e.printStackTrace();
                                System.exit(1);
                            }
                        }
                         //System.out.println(d);
                    }
                }

                if (a>0 && b>0) {
                    System.out.println(a - b);
                } else System.out.println(arabicToRoman(c - d));
            }
        }
          else  if (vvod.contains("*")) {
                StringTokenizer st = new StringTokenizer(vvod, "*");
                while (st.hasMoreTokens()) {
                    int a = 0, b = 0, c = 0, d = 0;
                    String key = st.nextToken();
                    String val = st.nextToken();
                    for(int i = 0;i<rom1.length;i++){
                        if(key.contains(rom1[i])){
                            for (int j = 0; j <mas.length ; j++) {
                                if(val.contains(mas[j])){
                                    try{
                                        throw new RomNumbersException("Некорректный ввод.Программа умеет работать только с арабскими или римскими цифрами одновременно!");
                                    }catch(RomNumbersException e){
                                        e.printStackTrace();
                                        System.exit(1);
                                    }
                                }
                            }
                        }
                    }
                    for(int i = 0;i<mas.length;i++){
                        if(key.contains(mas[i])){
                            for (int j = 0; j <rom1.length; j++) {
                                if(val.contains(rom1[j])){
                                    try{
                                        throw new RomNumbersException("Некорректный ввод.Программа умеет работать только с арабскими или римскими цифрами одновременно!");
                                    }catch(RomNumbersException e){
                                        e.printStackTrace();
                                        System.exit(1);
                                    }
                                }
                            }
                        }
                    }
                    for (int i = 0; i < 8; i++) {
                        if (key.contains(mas[i])) {
                            a = Integer.parseInt(key);
                            if(a>10 | a<=0){
                                try{
                                    throw new RomNumbersException("Некорректный ввод.Введите число от 1 до 10");
                                }catch(RomNumbersException e){
                                    e.printStackTrace();
                                    System.exit(1);
                                }
                            }
                            //System.out.println(a);
                        }
                    }
                    for (int i = 0; i < 8; i++) {
                        if (val.contains(mas[i])) {
                            b = Integer.parseInt(val);
                            if(b>10 | b<=0){
                                try{
                                    throw new RomNumbersException("Некорректный ввод.Введите число от 1 до 10");
                                }catch(RomNumbersException e){
                                    e.printStackTrace();
                                    System.exit(1);
                                }
                            }
                            //System.out.println(b);
                        }
                    }
                    for (int i = 0; i < rom.length - 1; i++) {
                        if (key.equals(rom[i])) {
                            c = romanToArabic(key);
                            if(c>10 | c<=0){
                                try{
                                    throw new RomNumbersException("Некорректный ввод.Введите число от 1 до 10");
                                }catch(RomNumbersException e){
                                    e.printStackTrace();
                                    System.exit(1);
                                }
                            }
                            //System.out.println(c);
                        }
                    }
                    for (int i = 0; i < rom.length - 1; i++) {
                        if (val.equals(rom[i])) {
                            d = romanToArabic(val);
                            if(d>10 | d<=0){
                                try{
                                    throw new RomNumbersException("Некорректный ввод.Введите число от 1 до 10");
                                }catch(RomNumbersException e){
                                    e.printStackTrace();
                                    System.exit(1);
                                }
                            }
                            //System.out.println(d);
                        }
                    }

                    if (a>0 && b>0) {
                        System.out.println(a * b);
                    }
                     if(c>0&&d>0) System.out.println(arabicToRoman(c * d));
                }
            }
           else if (vvod.contains("/")) {
                StringTokenizer st = new StringTokenizer(vvod, "/");
                while (st.hasMoreTokens()) {
                    int a = 0, b = 0, c = 0, d = 0;
                    String key = st.nextToken();
                    String val = st.nextToken();
                    for(int i = 0;i<rom1.length;i++){
                        if(key.contains(rom1[i])){
                            for (int j = 0; j <mas.length ; j++) {
                                if(val.contains(mas[j])){
                                    try{
                                        throw new RomNumbersException("Некорректный ввод.Программа умеет работать только с арабскими или римскими цифрами одновременно!");
                                    }catch(RomNumbersException e){
                                        e.printStackTrace();
                                        System.exit(1);
                                    }
                                }
                            }
                        }
                    }
                    for(int i = 0;i<mas.length;i++){
                        if(key.contains(mas[i])){
                            for (int j = 0; j <rom1.length; j++) {
                                if(val.contains(rom1[j])){
                                    try{
                                        throw new RomNumbersException("Некорректный ввод.Программа умеет работать только с арабскими или римскими цифрами одновременно!");
                                    }catch(RomNumbersException e){
                                        e.printStackTrace();
                                        System.exit(1);
                                    }
                                }
                            }
                        }
                    }
                    for (int i = 0; i < 8; i++) {
                        if (key.contains(mas[i])) {
                            a = Integer.parseInt(key);
                            if(a>10 | a<=0){
                                try{
                                    throw new RomNumbersException("Некорректный ввод.Введите число от 1 до 10");
                                }catch(RomNumbersException e){
                                    e.printStackTrace();
                                    System.exit(1);
                                }
                            }
                            //System.out.println(a);
                        }
                    }
                    for (int i = 0; i < 8; i++) {
                        if (val.contains(mas[i])) {
                            b = Integer.parseInt(val);
                            if(b>10 | b<=0){
                                try{
                                    throw new RomNumbersException("Некорректный ввод.Введите число от 1 до 10");
                                }catch(RomNumbersException e){
                                    e.printStackTrace();
                                    System.exit(1);
                                }
                            }
                            //System.out.println(b);
                        }
                    }
                    for (int i = 0; i < rom.length - 1; i++) {
                        if (key.equals(rom[i])) {
                            c = romanToArabic(key);
                            if(c>10 | c<=0){
                                try{
                                    throw new RomNumbersException("Некорректный ввод.Введите число от 1 до 10");
                                }catch(RomNumbersException e){
                                    e.printStackTrace();
                                    System.exit(1);
                                }
                            }
                            //System.out.println(c);
                        }
                    }
                    for (int i = 0; i < rom.length - 1; i++) {
                        if (val.equals(rom[i])) {
                            d = romanToArabic(val);
                            if(d>10 | d<=0){
                                try{
                                    throw new RomNumbersException("Некорректный ввод.Введите число от 1 до 10");
                                }catch(RomNumbersException e){
                                    e.printStackTrace();
                                    System.exit(1);
                                }
                            }
                            //System.out.println(d);
                        }
                    }

                    if (a>0 & b>0) {
                        System.out.println(a / b);
                    }
                    if(c>0 & d>0) {System.out.println(arabicToRoman(c / d));}
                }
            }
           else {
               try{
                   throw new RomNumbersException("Операция нераспознана!Введите еще раз пример.");
               }catch (RomNumbersException e) {
                   e.printStackTrace();
                   System.exit(1);
               }
        }
        }
        public static int romanToArabic (String input){
            String romanNumeral = input.toUpperCase();
            int result = 0;

            List<Rom> romanNumerals = Rom.getReverseSortedValues();

            int i = 0;

            while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
                Rom symbol = romanNumerals.get(i);
                if (romanNumeral.startsWith(symbol.name())) {
                    result += symbol.getValue();
                    romanNumeral = romanNumeral.substring(symbol.name().length());
                } else {
                    i++;
                }
            }

            if (romanNumeral.length() > 0) {
                throw new IllegalArgumentException(input + " cannot be converted to a Roman Numeral");
            }

            return result;
        }
        public static String arabicToRoman ( int number){
            if ((number <= 0) || (number > 4000)) {
                throw new IllegalArgumentException(number + " is not in range (0,4000]");
            }

            List<Rom> romanNumerals = Rom.getReverseSortedValues();

            int i = 0;
            StringBuilder sb = new StringBuilder();

            while ((number > 0) && (i < romanNumerals.size())) {
                Rom currentSymbol = romanNumerals.get(i);
                if (currentSymbol.getValue() <= number) {
                    sb.append(currentSymbol.name());
                    number -= currentSymbol.getValue();
                } else {
                    i++;
                }
            }

            return sb.toString();
        }
    }

