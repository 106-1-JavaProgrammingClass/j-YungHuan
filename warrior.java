public class warrior extends man {
    private String str;
    public warrior(String name1,String country1,String oid1,String str1){
        super(name1,country1,oid1);
        this.setStr(str1);
    }
    public void setStr(String str1){
        this.str=str1;
    }

    public String getStr() {
        return str;
    }
}
