package Entities.Enums;

import Entities.Order;

public enum OrderStatus {

    PENDING_PAYMENT ("PENDING_PAYMENT"),
    PROCESSING ("PROCESSING"),
    SHIPPED ("SHIPPED"),
    DELIVERED ("DELIVERED");


/*
    private String status;

*/
    OrderStatus(String status) {
        /*
        this.status = status;
         */
    }
/*
    @Override
    public String toString(){
        return status;
    }

 */

}
