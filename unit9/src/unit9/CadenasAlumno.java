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
         String cadena5;
         Scanner sc = new Scanner(System.in);
         Scanner sc2 = new Scanner(System.in);
         System.out.print("Introduce una cadena de texto: \n");
         String cadena = sc.nextLine();
         System.out.print("Introduce una segunda cadena de texto: \n");
         String cadena2 = sc.nextLine();
         if(sonIguales(cadena,cadena2)){
             System.out.print("Las dos cadenas son iguales \n");
         }else{
              System.out.print("Las cadenas escritas no son iguales \n");
         }
         if(esMayor(cadena,cadena2)){
             System.out.print("La primera cadena escrita es mayor \n");
         }else{
              System.out.print("La primera cadena escrita no es mayor que la segunda \n");
         }
         if(esMenor(cadena,cadena2)){
             System.out.print("La primera cadena escrita es menor \n");
         }else{
              System.out.print("La primera cadena escrita no es menor que la segunda \n");
         }
          if(comparaIgnorandoMayusculas(cadena,cadena2)){
             System.out.print("Las dos cadenas son iguales ignorando las mayusculas \n");
         }else{
              System.out.print("Las cadenas escritas no son iguales ignorando las mayusculas \n");
         }
         System.out.print("Introduce una cadena de texto para quitar los espacios: \n");
         cadena5 = sc.nextLine();
         String cadena6=quitaEspacios(cadena5);
         System.out.print(cadena6);
          System.out.print("\nEspacios quitados \n");
         System.out.print("Introduce una regla: \n");
         String regla = sc.nextLine();
         System.out.print("Introduce un cambio: \n");
         String cambio = sc.nextLine();
         String cadena3 = reemplazaTodos(cadena,regla,cambio);
         System.out.print("Cambia todas: \n");
         System.out.print(cadena3);
          System.out.print("\n");
         String cadena4 = reemplazaPrimero(cadena,regla,cambio);
         System.out.print("Cambia la primera: \n");
         System.out.print(cadena4);
           System.out.print("\n");
         System.out.print("Introduce una regla para separacion : \n");
         String regla2 = sc.nextLine();
         System.out.print("Introduce un limite para la separacion : \n");
         int limite = sc2.nextInt();
         muestraSplitLimite(cadena, regla2, limite);
         System.out.print("Separacion de la cadena entera: \n");
         muestraSplit(cadena, regla2);
         System.out.print("Introduce una cadena para convertir a mayusculas : \n");
         String cadena20 = sc.nextLine();
         String cadena24=convertirMayusculas(cadena20);
         System.out.print("Mayusculas "+cadena24+"\n");
         System.out.print("Introduce una cadena para convertir a minusculas : \n");
         String cadena21 = sc.nextLine();
         String cadena23=convertirMinusculas(cadena21);
         System.out.print("Minusculas "+cadena23+"\n");
         System.out.print("Introduce una cadena para saber su tamaño : \n");
         String cadena25 = sc.nextLine();
         long tam = longitudCadena(cadena25);
         System.out.print("Tamaño de la cadena : "+tam+"\n");
         System.out.print("Introduce una cadena de texto: \n");
         String cadena9 = sc.nextLine();
         System.out.print("Introduce un prefijo: \n");
         String prefijo = sc.nextLine();
         if(empiezaCon(cadena9,prefijo)){
             System.out.print("La cadena introducida empieza con el prefijo introducido \n");
         }else{
              System.out.print("La cadena introducida no empieza con el prefijo introducido \n");
         }
          System.out.print("Introduce una cadena de texto: \n");
         String cadena10 = sc.nextLine();
         System.out.print("Introduce un sufijo: \n");
         String prefijo2 = sc.nextLine();
         if(acabaEn(cadena10,prefijo2)){
             System.out.print("La cadena introducida termina con el sufijo introducido \n");
         }else{
              System.out.print("La cadena introducida no termina con el sufijo introducido \n");
         }
         System.out.print("Introduce una cadena de texto: \n");
         String cadena26 = sc.nextLine();
         System.out.print("Introduce un indice: \n");
         int indice = sc2.nextInt();
         System.out.print(caracterPosicion(cadena26,indice)+"\n");
          System.out.print("Introduce una cadena de texto: \n");
         String cadena27 = sc.nextLine();
         System.out.print("Introduce una letra o conjunto de letras: \n");
         String letra = sc.nextLine();
         System.out.print(posicionPrimeraCadena(cadena27,letra)+"\n");
          System.out.print("Introduce una cadena de texto: \n");
         String cadena28 = sc.nextLine();
         System.out.print("Introduce la posicion desde la cual quieres cortar la frase: \n");
         int posicionInicio = sc2.nextInt();
         System.out.print(extraerSubstring(cadena28,posicionInicio)+"\n");
          System.out.print("Introduce una cadena de texto: \n");
         String cadena29 = sc.nextLine();
         System.out.print("Introduce la posicion desde la cual quieres cortar la frase: \n");
         int posicionInicio2 = sc2.nextInt();
         System.out.print("Introduce la posicion hasta la cual quieres cortar la frase: \n");
         int posicionFinal = sc2.nextInt();
         System.out.print(extraerSubstring(cadena29, posicionInicio2,posicionFinal)+"\n");
         System.out.print("Introduce un numero para convertir en String: \n");
         int numero = sc2.nextInt();
         System.out.print(convertirEnteroString(numero)+"\n");
         System.out.print("Introduce una cadena para convertirla a entero: \n");
         String cadena11 = sc.nextLine();
         System.out.print(convertirStringEntero(cadena11)+"\n");
          System.out.print("Introduce una cadena para convertirla a double: \n");
         String cadena12 = sc.nextLine();
         System.out.print(convertirStringDouble(cadena12)+"\n");
         System.out.print("Introduce una cadena: \n");
         String cadena31 = sc.nextLine();
         System.out.print("Introduce una cadena: \n");
         String cadena32 = sc.nextLine();
         System.out.print(" Cadenas concatenadas : \n");
          System.out.print(concatenaCadenasConcat(cadena31,cadena32)+"\n");
          System.out.print(" Cadenas concatenadasx2 : \n");
          System.out.print(concatenaCadenas(cadena31,cadena32)+"\n");         
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
          String str = "";
          int longitud;
         char [] cad1 = cadena1.toCharArray();
          char [] cad2 = cadena2.toCharArray();
          if(cad1.length>=cad2.length){
             longitud=cad2.length;
         }else{
              longitud=cad1.length;
         }
         int r=32, value, value2,c=0;
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
