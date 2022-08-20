public class Buses {
    int busNo;
    int capacity;
    boolean ac;

    public Buses(int i, int i1, boolean b) {
        this.busNo = i;
        this.capacity = i1;
        this.ac = b;
    }
    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }
  public String  toString(){
        String ac = "";
        if(this.ac == false)
            ac = "non ac";
        else
            ac = "available";
  return "BusName: "+busNo+"  Capacity: "+capacity+"  ac: "+ac;

    }
}
