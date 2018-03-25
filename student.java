public class student {
    private String name,gender,department;
    private float english,chinese,math;
    public student (String name1,String gender1,String department1,float english1,float chinese1,float math1){
        name=name1;
        gender=gender1;
        department=department1;
        english=english1;
        chinese=chinese1;
        math=math1;
    }
    public void showinto(){
        System.out.println(this.name+"\t"+this.gender+"\t\t"+this.department+"\t"+this.english+"\t"+this.chinese+"\t"+this.math);
    }
    public float getEnglish(){return english;}
    public float getChinese(){return chinese;}
    public float getMath(){return math;}

}
