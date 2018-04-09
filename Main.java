public class Main {

    public static void main(String[] args) {
        magic mg=new magic("家偉","狼國","19","99");
        archer ar=new archer("永環","虎國","19","100");
        warrior wa=new warrior("振閎","蛇國","19","190");
        System.out.println("姓名:"+mg.getName()+"\t"+"國家:"+mg.getCountry()+"\t"+"年紀:"+mg.getOid()+"\t"+"魔力:"+mg.getMp());
        System.out.println("姓名:"+ar.getName()+"\t"+"國家:"+ar.getCountry()+"\t"+"年紀:"+ar.getOid()+"\t"+"敏捷:"+ar.getDex());
        System.out.println("姓名:"+wa.getName()+"\t"+"國家:"+wa.getCountry()+"\t"+"年紀:"+wa.getOid()+"\t"+"力量:"+wa.getStr());
    }
}
