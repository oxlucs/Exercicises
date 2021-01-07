package com.Aplication;

import Entities.Clients;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
int status = 0;
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        //Pegando a data e hora do sistema utilizando a Classe LocalDateTime
        LocalDateTime date = LocalDateTime.now();
        //Formantando a data e hora local por meio da classe DateTimeFormatter
        //Aqui criamos uma instancia do DateTimeFormatter, com o nome da variavel de dateFormat
        //Ou seja, quando formos formatar a data realmente, chamamos o método format.
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String momentDate = dateFormat.format(date);
        //Aqui formatamos as horas que o pedido foi feito, por meio tambem de uma instancia da clase DateTimeFormatter
        DateTimeFormatter hourFormat = DateTimeFormatter.ofPattern("hh:MM:ss");
        String momentHour = hourFormat.format(date);


        //Inicio da interação com o Usuário
        System.out.println("Enter client data:");
        System.out.print("Name :");
        String name = sc.nextLine();
        System.out.print("E-mail :");
        String email = sc.nextLine();
        //Para utilizar a classe LocalDate, deve-se utilizar o formato de datas
        //ISO-8601 - Que leva em conta o sistema de datas internacional.
        System.out.print("Birth Date (yyyy-mm-dd):");
        String birthDate = sc.nextLine();
        LocalDate bdayDate = LocalDate.parse(birthDate);


        //Instanciando o Cliente
        Clients c = new Clients (name, email, bdayDate);

        System.out.println("Enter order Data: ");
        System.out.printf("0 - PENDING PAYMENT \n" + "1 - PROCESSING \n" +
                "2 - SHIPPED \n" + "3 - DELIVERED \n");
        int status = sc.nextInt();

        //Instanciando o pedido para utiliza-lo como escopo global.
        Order oc = new Order (momentDate,momentHour,status, c);


        System.out.println("How many Itens to this order?");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=1; i<=n; i++){
        System.out.println("Enter #" + i + " item data");
        System.out.print("Enter product name: ");
        String productName = sc.nextLine();
        System.out.print("Enter product price: ");
        Double price = sc.nextDouble();
        System.out.print("Quantity: ");
        Integer quantity = sc.nextInt();
        sc.nextLine();
        OrderItem orderItem = new OrderItem(quantity, new Product(productName, price));
        oc.addItem(orderItem);
        }
        System.out.println();
        System.out.println(oc);


        sc.close();
        }









}

