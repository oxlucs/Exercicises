package Entities;

import Entities.Enums.OrderStatus;

import java.util.ArrayList;
import java.util.List;

public class Order {
    /*
    Na realidade o moment será String pois vou utilizar a classe
    LocalDateTime, e transforma-la em string por meio da função
    format que eixste dentro dessa classe, tornando mais fácil
    a aquisição de data e hora do sistema.
     */
    private String momentDate;
    private Integer status;
    private String momentHour;
    private Clients client;

    private List <OrderItem> orderItem = new ArrayList<>();

    public Order (){

    }

    public Order (String momentDate, String momentHour,Integer status, Clients client){
        this.momentDate = momentDate;
        this.status = status;
        this.momentHour = momentHour;
        this.client = client;
    }

    public String getMomentDate() {
        return momentDate;
    }

    public String getMomentHour (){
        return momentHour;
    }

    public String getStatus() {
        String os = null;
        if (status == 0){
            os = OrderStatus.PENDING_PAYMENT.name();;
        }
        if(status == 1){
            os = OrderStatus.PROCESSING.name();;
        }
        if(status == 2){
            os = OrderStatus.SHIPPED.name();
        }
        if (status == 3) {
          os = OrderStatus.DELIVERED.name();
        }

        return os;
    }

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setMomentDate(String moment) {
        this.momentDate = moment;
    }

    public void setMomentHour (String momentHour){
        this.momentHour = momentHour;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public void addItem (OrderItem item){
        orderItem.add(item);
    }
    public void removeItem(OrderItem item){
        orderItem.remove(item);
    }

    public Clients getClient() {
        return client;
    }

    public void setClient(Clients client) {
        this.client = client;
    }

    /*
        Abaixo instanciamos um novo for each para
        que fosse possível percorrer todos
        os itens presentes no pedido para que os sub totais
        fossem somados ao total do pedido.
         */
    public double total (){
       Double total = 0.0;
        for(OrderItem c : orderItem){
            total += c.subTotal();
        }
        return total;
    }

    public String toString(){
       StringBuilder sb = new StringBuilder();
       sb.append("Order Data: ");
       sb.append("Order Moment: ");
       sb.append(momentDate + " " + momentHour + "\n");
       sb.append("Order Status: ");
       sb.append(getStatus() + "\n");
       sb.append("Client Data: ");
       sb.append(client + "\n");
       sb.append("Order itens: \n");
       for (OrderItem itens : orderItem){
           sb.append(itens + "\n");
       }
       sb.append("Total Price: $");
       sb.append(String.format("%.2f", total()));
       return sb.toString();
    }
/*
  if (status == 0){
            System.out.println(OrderStatus.PENDING_PAYMENT);
        }
        if(status == 1){
            System.out.println(OrderStatus.PROCESSING);
        }
        if(status == 2){
            System.out.println(OrderStatus.SHIPPED);
        }
        if (status == 3){
            System.out.println(OrderStatus.DELIVERED);
        }
 */
/*
 String name = null;
        Double price = 0.0;
        Integer quantity = 0;
        Double subTotal = 0.0;
        for (OrderItem c : orderItem){
            name = c.getProduct().getName();
            price = c.getProduct().getPrice();
            quantity = c.getQuantity();
            subTotal = c.subTotal();

        }
        return
                "Product: " + name + ", " +
                "Price: " + price + ", " +
                "Quantity: " + quantity + ", " +
                "Subtotal: " + subTotal;
* */
 }
