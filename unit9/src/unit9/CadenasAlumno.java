/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit9;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class CadenasAlumno {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Introduce una cadena de texto: \n");
         String cadena = sc.nextLine();
         System.out.print("Introduce una segunda cadena de texto: \n");
         String cadena2 = sc.nextLine();
         if(comparaIgnorandoMayusculas(cadena,cadena2)){
             System.out.print("Las dos cadenas son iguales \n");
         }else{
              System.out.print("Las cadenas escritas no son iguales \n");
         }
               
     }
      public static boolean sonIguales(String cadena1, String cadena2){
         char [] cad1 = cadena1.toCharArray();
         char [] cad2 = cadena2.toCharArray();
         int c=0;
         if(cad1.length!=cad2.length){
             c++;
         }else{
             for (int i = 0; i < cad1.length; i++) {
                 if(cad1[i]!=cad2[i]) c++;
             }
         }
          if(c==0){
              return true ;
          }else{
              return false;
          }
     }
      public static boolean esMayor(String cadena1, String cadena2){
         char [] cad1 = cadena1.toCharArray();
         char [] cad2 = cadena2.toCharArray();
         int c=0,longitud=0;
         if(cad1.length>=cad2.length){
             longitud=cad2.length;
         }else{
              longitud=cad1.length;
         }
         for (int i = 0; i < longitud; i++) {
             if(cad1[i]>cad2[i]){
                 c=1;
                 i=longitud;
             }
         }
          if(c==1){
              return true ;
          }else{
              return false;
          }
      }
      public static boolean esMenor(String cadena1, String cadena2){
         char [] cad1 = cadena1.toCharArray();
         char [] cad2 = cadena2.toCharArray();
         int c=0,longitud=0;
         if(cad1.length>=cad2.length){
             longitud=cad2.length;
         }else{
              longitud=cad1.length;
         }
         for (int i = 0; i < longitud; i++) {
             if(cad1[i]>cad2[i]){
                 c=1;
                 i=longitud;
             }
         }
          if(c==1){
              return false ;
          }else{
              return true;
          }
      }
      public static boolean comparaIgnorandoMayusculas(String cadena1, String cadena2){
          int r=32, value, value2,c=0;
          String str = "";
          int longitud;
         char [] cad1 = cadena1.toCharArray();
          char [] cad2 = cadena2.toCharArray();
          if(cad1.length>cad2.length){
             longitud=cad2.length;
             c++;
         }else{
              if(cad1.length==cad2.length){
                  longitud=cad2.length;
              }else{
                  longitud=cad1.length;
                  c++;
              }
         }
         for (int i = 0; i < longitud; i++) {
             value = (int) cad1[i];
             if(value<91 & value>64) value=value+r;
              value2 = (int) cad2[i];
             if(value2<91 & value2>64) value2=value2+r;
            if(value2!=value) c++;
         }
         if(c==0){
              return true ;
          }else{
              return false;
          }
      }
      public static String reemplazaTodos(String cadena, String regla, String cambio){
          char[] cadena2 = new char[cadena.length()];
           char[] regla2 = new char[regla.length()];
           regla2[0] = (char)regla.charAt(0);
            char[] cambio2 = new char[cambio.length()];
              cambio2[0] = (char)cambio.charAt(0);
        for (int i = 0; i < cadena.length(); i++) {
            cadena2[i] = (char)cadena.charAt(i);
            if(cadena2[i]==regla2[0]){
                cadena2[i]=cambio2[0];
            }
        }
        cadena = String.valueOf(cadena2);
         return cadena;
      }
      public static String reemplazaPrimero(String cadena, String regla, String cambio){
           int c=0;
           char[] cadena2 = new char[cadena.length()];
           char[] regla2 = new char[regla.length()];
           regla2[0] = (char)regla.charAt(0);
            char[] cambio2 = new char[cambio.length()];
              cambio2[0] = (char)cambio.charAt(0);
        for (int i = 0; i < cadena.length(); i++) {
            cadena2[i] = (char)cadena.charAt(i);
            if(c==0){
                if(cadena2[i]==regla2[0]){
                  cadena2[i]=cambio2[0];
                  c++;
                }
            } 
        }
        cadena = String.valueOf(cadena2);
         return cadena;
      }
      public static void muestraSplitLimite(String cadena, String regla, int limite){
          String[] t;
        t = cadena.split(regla);
        for(int i =0; i < t.length ; i++){
             if(limite>i) System.out.println(t[i]);
        }
      }
      public static void muestraSplit(String cadena, String regla){
           String[] t;
        t = cadena.split(regla);
        for(int i =0; i < t.length ; i++){
             System.out.println(t[i]);
        }
      }
      public static String quitaEspacios(String cadena){
          int c=0;
          char[] cadena2 = new char[cadena.length()];
          if (cadena.endsWith(" ")){
              c++;
                for (int i = 0; i < cadena.length(); i++) {
                 if(i < cadena.length()-1) cadena2[i+1] = (char)cadena.charAt(i);
                 cadena2[0] =(char)cadena.charAt(cadena.length()-1);
              }
           }
          if (c!=0) {
              cadena = String.valueOf(cadena2);
              while(cadena.startsWith(" ")) {
              for (int i = 1; i < cadena.length(); i++) {
                 cadena2[i-1] = (char)cadena.charAt(i);
                 cadena2[cadena.length()-1] =(char)cadena.charAt(0);
              }
              cadena = String.valueOf(cadena2);
              }
          }else{
              if (cadena.startsWith(" ")) {
              for (int i = 1; i < cadena.length(); i++) {
                 cadena2[i-1] = (char)cadena.charAt(i);
                 cadena2[cadena.length()-1] =(char)cadena.charAt(0);
              }
              }
          }
                       
          
        cadena = String.valueOf(cadena2);
         return cadena;
      }
      public static String convertirMayusculas(String cadena){
         String str = "";
         char [] cad1 = cadena.toCharArray();
         int r=32, value;
         for (int i = 0; i < cad1.length; i++) {
             value = (int) cad1[i];
             if(value<123 & value>96) value=value-r;
             cad1[i] = (char) value;
            str += cad1[i];
         }
         return str;
      }
      public static String convertirMinusculas(String cadena){
           String str = "";
         char [] cad1 = cadena.toCharArray();
         int r=32, value;
         for (int i = 0; i < cad1.length; i++) {
             value = (int) cad1[i];
             if(value<91 & value>64) value=value+r;
             cad1[i] = (char) value;
            str += cad1[i];
         }
         return str;
      }
      public static String convierteCharToString(char [] cadena1){
          return cadena1.toString();
      }
      public static long longitudCadena(String cadena){
         char [] cad1 = cadena.toCharArray();
         long l=0;
         for (int i = 0; i < cad1.length; i++) {
             l++;
         }
         return l;
      }
      public static boolean empiezaCon(String cadena, String prefijo){
         char [] cad1 = cadena.toCharArray();
         char [] cad2 = prefijo.toCharArray();
         int c=0,value,value2;
        for (int i = 0; i < cad2.length; i++) {
             value = (int) cad1[i];
              value2 = (int) cad2[i];
            if(value2!=value) c++;
         }
         if(c==0){
              return true ;
          }else{
              return false;
          }
      }
      public static boolean acabaEn(String cadena, String sufijo){
            char [] cad1 = cadena.toCharArray();
         char [] cad2 = sufijo.toCharArray();
         int c=0,value,value2;
        for (int i = cad1.length-1; i>cad1.length-cad2.length-1 ; i--) {
             value = (int) cad1[i];
              value2 = (int) cad2[i-(cad1.length-cad2.length)];
            if(value2!=value) c++;
         }
         if(c==0){
              return true ;
          }else{
              return false;
          }
      }
      public static char caracterPosicion(String cadena, int indice){
          char [] cad1 = cadena.toCharArray();
          return cad1[indice-1];
      }        
      public static long posicionPrimeraCadena(String cadena, String letra){
          char [] cad1 = cadena.toCharArray();
         char [] cad2 = letra.toCharArray();
         int value,value2;
         long c=0;
         for (int i = 0; i < cad1.length; i++) {
             value = (int) cad1[i];
              value2 = (int) cad2[0];
            if(value2!=value){
                c=i-1;
                i=1000;
            }
         }
         return c;
      }
      public static String extraerSubstring(String cadena, int posicionInicio){
          char [] cad1 = cadena.toCharArray();
          String str="";
         int value,value2;
         long c=0;
         for (int i = posicionInicio; i < cad1.length; i++) {
             str += cad1[i];
         }
         return str;
      }
      public static String extraerSubstring(String cadena, int posicionInicio, int
posicionFinal){
           char [] cad1 = cadena.toCharArray();
          String str="";
         int value,value2;
         long c=0;
         for (int i = posicionInicio; i < posicionFinal; i++) {
             str += cad1[i];
         }
         return str;
      }
      public static String convertirEnteroString(int numero){
         String str = "";
         str += numero;
         return str;
      }
      public static int convertirStringEntero(String cadena){
           char [] cad1 = cadena.toCharArray();
             return (int)cad1[0];
      }
      public static double convertirStringDouble(String cadena){
           char [] cad1 = cadena.toCharArray();
             return (double)cad1[0];
      }
      public static String concatenaCadenasConcat(String cadena1, String cadena2){
         char [] cad1 = cadena1.toCharArray();
         char [] cad2 = cadena2.toCharArray();
         String str="";
         int value,value2;
         for (int i = 0; i < cad1.length; i++) {
             str += cad1[i];
         }
         for (int i = 0; i < cad2.length; i++) {
             str += cad2[i];
         }
         return str;
      }
      public static String concatenaCadenas(String cadena1, String cadena2){
           return cadena1+cadena2;
      }
   
}
