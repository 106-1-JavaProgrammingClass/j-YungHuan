public class archer extends man{
    private String dex;
    public archer(String name1,String country1,String oid1,String dex1){
       super(name1,country1,oid1);
        this.setDex(dex1);
    }

    public void setDex(String dex1){
        this.dex=dex1;
    }

    public String getDex() {
        return dex;
    }
}
