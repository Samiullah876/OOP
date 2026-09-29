public class point {
    int x;
    int y;
    public void display(){
        System.out.println("x coordinate="+x+",y coordinate="+y);
    }
    public void movepoint(int a,int b){
        x=x+a;
        y=y+b;
        System.out.println("x coordinate after moving="+x+",y coordinate after moving="+y);
    }
}

class runner{
    public static void main(String[] args){
        point p1=new point();
        p1.display();
        p1.movepoint(2, 3);
        point p2=new point();
        p2.display();
        p2.movepoint(2, 7);
    }
}