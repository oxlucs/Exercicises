package com.aplicattion;

import java.util.Scanner;
import entities.Tenant;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int room = 0;
        int n = 10;
        int rental = 0;
        Tenant [] vect = new Tenant [n];

        System.out.println("How many rooms will be rented:");
        int nroom = sc.nextInt();

        for (int i=0; i<nroom; i++){
            rental += 1;
            System.out.printf("Rental #%d %n", rental);
            System.out.println("Enter name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter tenant e-mail:");
            String email = sc.nextLine();
            System.out.println("Enter the room number: ");
            room = sc.nextInt();
            vect [room] = new Tenant (name, email);
        }
        System.out.println();
        System.out.println("Busy Rooms: ");
        for (int i=0; i<vect.length; i++){
            if (vect[i] != null){
                /*
                Dessa forma, como instanciei o meu objeto dentro do vetor na linha 28
                Quando array for mostrar a posição, ele irá mostrar o método toString
                Da minha classe, isso porque eu instanciei o vetor como sendo do tipo
                classe.
                 */
                System.out.println(i+ ":    " + vect[i]);
            }

        }

    sc.close();
    }
}
