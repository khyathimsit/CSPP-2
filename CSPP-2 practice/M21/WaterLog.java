class WaterLog extends Log {
    int quantity;
    WaterLog (int quant, String d, String t) {
        quantity = quant;
        this.setDate(d);
        this.setTime(t);
        
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity (int quant) {
        this.quantity = quant;
    }
    public String toString() {
        System.out.println("Water");
        return "Date:" +this.getDate() + "\n" + "Quantity:" + this.getQuantity() + "ml";
    }
}
