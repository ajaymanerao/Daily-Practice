package Design_class_obj;

class InvoiceItem{
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    InvoiceItem(String id, String desc, int qty, double unitPrice){
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }

    String getID(){
        return id;
    }

    String getDesc(){
        return desc;
    }

    int getQty(){
        return qty;
    }

    void setQty(int qty){
        this.qty=qty;
    }

    double getUnitPrice(){
        return unitPrice;
    }

    void setUnitPrice(double unitPrice){
        this.unitPrice=unitPrice;
    }

    double getTotal(){
        return unitPrice*qty;
    }

    public String toString(){
        return "InvoiceItem [Id="+id+", Desc="+desc+", Qty="+qty+", unitPrice="+unitPrice+"]";
    }

}

public class TestInvoiceItem {

    public static void main(String[] args) {
        InvoiceItem I=new InvoiceItem("101","Monitor",4, 6545.34);
        System.out.println("ID: "+I.getID());
        System.out.println("Desc: "+I.getDesc());
        System.out.println("Qty: "+I.getQty());
        I.setQty(5);
        System.out.println("UnitPrice: "+I.getUnitPrice());
        I.setUnitPrice(6523.12);
        System.out.println("Total: "+I.getTotal());
        System.out.println(I);

    }
    
}
