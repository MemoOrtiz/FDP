package Unidad3;


import javax.swing.JOptionPane;


//Escribir un programa que lea un número de 3 dígitos e imprima el equivalente en número romano

public class NumeroRomano
{
    public static void main (String [] args)
    {
        //declaracion de variables
        int numero,decenas,centenas,unidades;
        String decenas1,centenas1,unidades1, numeroRomanoc, numeroRomanod, numeroRomanou;

        //entrada de datos
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el numero de 3 digitos: "));

        //Operaciones
        centenas = (numero /100);
        decenas = (numero %100)/10;
        unidades = (numero%100)%10;
        //centenas

        switch(centenas)
        {
            case 1: numeroRomanoc=("C"); break;
            case 2: numeroRomanoc=("CC"); break;
            case 3: numeroRomanoc=("CCC"); break;
            case 4: numeroRomanoc=("CD"); break;
            case 5: numeroRomanoc = "D"; break;
            case 6: numeroRomanoc  = "DC"; break;
            case 7: numeroRomanoc  = "DCC"; break;
            case 8: numeroRomanoc = "DCCC"; break;
            case 9: numeroRomanoc= "CM"; break;
            default : numeroRomanoc = "Error"; break;
        }
        //decenas

        switch(decenas)
        {
            case 1: numeroRomanod = "X"; break;
            case 2: numeroRomanod = "XX"; break;
            case 3: numeroRomanod = "XXX"; break;
            case 4: numeroRomanod = "XL"; break;
            case 5: numeroRomanod = "L"; break;
            case 6: numeroRomanod = "LX"; break;
            case 7: numeroRomanod = "LXX"; break;
            case 8: numeroRomanod = "LXXX"; break;
            case 9: numeroRomanod = "XC"; break;
            default : numeroRomanod = "Error"; break;
        }

        //unidades 

        switch(unidades)
        {
            case 1: numeroRomanou = "l"; break;
            case 2: numeroRomanou = "ll"; break;
            case 3: numeroRomanou = "lll"; break;
            case 4: numeroRomanou = "lV"; break;
            case 5: numeroRomanou = "V"; break;
            case 6: numeroRomanou = "Vl"; break;
            case 7: numeroRomanou = "Vll"; break;
            case 8: numeroRomanou = "Vlll"; break;
            case 9: numeroRomanou = "lX"; break;
            default : numeroRomanou = "Error"; break;
        }

        //imprimir resultados 
        JOptionPane.showMessageDialog(null,"El numero romano es: " +numeroRomanoc + numeroRomanod + numeroRomanou);

    }
}
