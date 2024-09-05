class Invoice{
    private String partNumber;
    private String partDescription;
    private int qty;
    private double price;

    Invoice(String partNumber, String partDescription, int qty, double price){
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if(qty < 0){
            this.qty = 0;
        }else{
            this.qty = qty;
        }

        if(price < 0.0){
            this.price = 0.0;
        }else{
            this.price = price;
        }
    }

    public void setPartNumber(String partNumber){
         this.partNumber = partNumber;
    }

    public String getPartNumber(){
        return partNumber;
    }

    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }

    public String getPartDescription(){
        return partDescription;
    }

    public void setQty(int qty){
        if(qty < 0){
            this.qty = 0;
        }else{
            this.qty = qty;
        }
    }

    public int getqty(){
        return qty;
    }

    public void setPrice(double price){
        if(price < 0.0){
            this.price = 0.0;
        }else{
            this.price = price;
        }
    }

    public double getPrice(){
        return price;
    }
    
    public double getInvoice(){
        return qty * price;
    }

    public String toString(){
        return "Product Id : "+partNumber+" , "+"Product : "+partDescription+" , "+"Qty : "+qty+" , "+"Price : "+price;

    }

}

class InvoiceTest{
    public static void main(String args[]){

        Invoice invoice = new Invoice("Product 101","Dell Computer",2,250000);
        System.out.println(invoice);
        System.out.println("Invoice : "+ invoice.getInvoice());
        
    }
}