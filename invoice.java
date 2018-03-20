public class invoice {
    private String title, address, postcode;

    public invoice() {
        title = "亞大資工系";
        address = "柳豐路500號";
        postcode = "41354";
    }

    public invoice(String name, String add, String code) {
        title = name;
        address = add;
        postcode = code;
    }
    public String getTitle(){return this.title;}
    public void showInto(){
        System.out.println("店名"+":"+this.title);
        System.out.println("地址"+":"+this.address);
        System.out.println("郵遞區號"+":"+this.postcode);
    }
    }
