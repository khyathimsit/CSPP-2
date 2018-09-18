class PhysicalActivityLog extends Log{
    String actname;
    String endtime;
    String notes;

    PhysicalActivityLog (String aname, String d, String t, String etime, String note) {
        actname = aname;
        this.setDate(d);
        this.setTime(t);
        endtime = etime;
        notes = note;
    }
    public String getActivityname() {
        return actname;
    }
    public void setActivityname(String aname) {
        this.actname = aname;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String note) {
        this.notes = note;
    }
    public String getEndTime() {
        return endtime;
    }
    public void setEndTime(String et) {
        this.endtime = et;
    }
    public String toString() {
        System.out.println("PhysicalActivity");
        return "Name:" + this.getActivityname() + "\n" +"Notes:"+ this.getNotes()+ " \n" +"Date:" +this.getDate() + "\n" +"Starttime:" +this.getTime() + "\n" + "Endtime:" +this.getEndTime();
    }
}
