class Weight extends Log {
    String weight;
    String fat;

    Weight (String d, String t, String w, String f) {
        this.setDate(d);
        this.setTime(t);
        weight = w;
        fat = f;
        
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getFat() {
        return fat;
    }
    public void setFat(String fat) {
        this.fat = fat;
    }
    public String toString() {
        System.out.println("Weight");
        return  "Date:" +this.getDate() + "\n" + "Time:" +this.getTime()+"\n"+ "Weight:" +this.getWeight() + "\n" + "Fat:"+ this.getFat();
    }
}
