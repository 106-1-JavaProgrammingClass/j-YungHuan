public class man {
    private String name,country,oid;
    public man(String name1,String country1,String oid1){
        this.setName(name1);
        this.setCountry(country1);
        this.setOid(oid1);
    }
    public void setName(String name1){
        this.name=name1;
    }

    public String getName() {
        return name;
    }
    public void setCountry(String country1){
        this.country=country1;
    }

    public String getCountry() {
        return country;
    }
    public void setOid(String oid1){
        this.oid=oid1;
    }

    public String getOid() {
        return oid;
    }
}
