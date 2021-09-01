package com.sofka.app;

import java.util.Scanner;

public class Menu
{
    Scanner s = new Scanner(System.in);

    public void crear()
    {
        System.out.println("1. para sumar");
        System.out.println("2. para restar");
        System.out.println("3. para multiplicar");
        System.out.println("4. para dividir");

        System.out.print("Ingrese la opcion del menu: ");
        int opcion = s.nextInt();
        System.out.println("Ingrese numero 1");
        int num1 = s.nextInt();
        System.out.println("Ingrese numero 2");
        int num2 = s.nextInt();

        do
        {
            switch (opcion)
            {
                case 1:
                    System.out.println(Operaciones.suma(num1, num2));
                    break;
                case 2: break;
                case 3: break;
                case 4: break;
            }
        }while (opcion>4 || opcion < 1);
    }
}
