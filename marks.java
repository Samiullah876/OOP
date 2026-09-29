public class marks {
    public int english;
    public int math;
    public int oop;
    public marks(){
        english=50;
        math=70;
        oop=85;
    }
    public void sum() {
        int s;
        s = english + math + oop;
        System.out.println(s);
    }
    public static void main(String[] args){
        marks m=new marks();
        m.sum();
        marks m1=new marks();
        m.sum();
    }
}
