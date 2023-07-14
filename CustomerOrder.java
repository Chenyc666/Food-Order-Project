
import java.math.BigDecimal;
import java.util.LinkedList;

public class CustomerOrder {

    String cust_name;
    LinkedList<Menu.Node> items;
    BigDecimal orderTotal;
    BigDecimal summingTotal;

    public CustomerOrder (String cust_name, LinkedList<Menu.Node> items, BigDecimal orderTotal){
            this.cust_name=cust_name;
            this.items=items;
            this.orderTotal=orderTotal;

    }

    public String getCustomerName(){
        return this.cust_name;
    }

    public LinkedList<Menu.Node> getItemsLinkedList(){
        return this.items;
    }

    public BigDecimal getOrderTotal(){
        return this.orderTotal;
    }


}
