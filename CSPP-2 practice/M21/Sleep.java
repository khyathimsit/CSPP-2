class Sleep extends Log {
    String endtime;
    Sleep (String d, String t, String etime) {
        this.setDate(d);
        this.setTime(t);
        endtime = etime;
    }
    public String getEndTime() {
        return endtime;
    }
    public void setEndTime(String et) {
        this.endtime = et;
    }
    public String toString() {
        System.out.println("Sleep");
        return "Date:"+this.getDate() + "\n" + "Starttime:"+this.getTime() + "\n" +"Endtime:"+this.getEndTime();
    }
}
