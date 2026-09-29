public class distance {
    public int feet;
    public int inch;
    public distance(){
        feet=35;
        inch=5;
    }
    public distance(int f,int i){
        feet=f;
        inch=i;
    }
    public void display(){
        System.out.println("Feet="+feet+"\nInch="+inch);
    }
    public static void main(String[] args){
        distance d=new distance();
        d.display();
        distance d1=new distance(55, 9);
        d1.display();
    }
}
