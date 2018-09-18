class FoodLog extends Log {
    String foodItem;
    int quantity;
    FoodLog (String fname, int quant, String d, String t) {
        foodItem = fname;
        quantity = quant;
        this.setDate(d);
        this.setTime(t);
    }
    public String getFoodItem() {
        return foodItem;
    }
    public void setFoodItem (String fitem) {
        this.foodItem = fitem;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity (int quant) {
        this.quantity = quant;
    }
    public String toString() {
        System.out.println("Food");
        return "Date:" + this.getDate() +"\n"+ "Time:" + this.getTime() + "\n" +"Name:"+this.getFoodItem() + "\n" + "Quantity:" +this.getQuantity();
    }
}
