//Ez a program kiszámolj a rombusz területét. Reiter Milán, 2024.10.02.

/*
* File: Rombter.java
* Author: Reiter Milán
* Copyright: 2024, Reiter Milán
* Group: Szoft II/I/N
* Date: 2024-10-02
* Github: https://github.com/Milus03
* Licenc: GNU GPL
*/

import java.util.Scanner;

public class Rombter {

    public void RombArea(){
        System.out.println("Ez a program kiszámolj a rombusz területét.");
        System.out.println("Reiter Milán, II-1-N");
        Scanner sc = new Scanner(System.in);
        System.out.println("Első átló: ");
        String first = sc.nextLine();
        Double elsoAtlo = Double.valueOf(first);

        System.out.print("Második átló: ");
        String second = sc.nextLine();
        Double masodikAtlo = Double.valueOf(second);

        Double eredmeny = (1.0/2.0) * elsoAtlo * masodikAtlo;

        System.out.println("A rombusz területe: " + eredmeny);

        sc.close();
    }
}
