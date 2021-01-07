package Entities;

public class OrderItem {

    private Integer quantity;
    //A composição do tipo tem um está sendo feita aqui.
    private Product product;


    public OrderItem (){

    }
    public OrderItem (Integer quantity, Product product){
        this.quantity = quantity;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double subTotal(){
        return quantity * product.getPrice();
    }

    /*
    Para que seja possível realizar a impressão dos itens corretamente, deve-se
    criar um método toString aqui nessa classe para o ponteiro ser estabelecido corretamente.
     */

    public String toString(){
        return product.getName() + ", " + "Price: " +
               product.getPrice() + ", " + "Quantity: " +
               quantity + ", " + "Subtotal: " + subTotal();
    }
}
