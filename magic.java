public class magic extends man{
    private String mp;
    public magic(String name1,String country1,String oid1,String mp1){
        super(name1,country1,oid1);
        this.setMp(mp1);
    }


public void setMp(String mp1){
        this.mp=mp1;
    }

    public String getMp() {
        return mp;
    }
}
