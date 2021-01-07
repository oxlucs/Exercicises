package Entities;


import java.time.LocalDate;




public class Clients {
    private String name;
    private String email;
    private LocalDate birthDate;

    public Clients (){

    }

    public Clients (String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    /*
    Assim como na classe OrderItem, devemos implementar um toString,
    para realizar o ponteiro para que a impressão dos dados do pedido sejam
    exibidos corretamente.
     */
    public String toString(){
        return name + " " + birthDate + " - " + email;
    }
}
