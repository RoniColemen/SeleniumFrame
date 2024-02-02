package JavaPrograms;

class add{
    private int a, b, c;

    public void add(){
        a= 11;
        b= 12;
        c= 0;
    }

    public  add(int x, int y){
        a= x;
        b=y;
    }

    void display(){
        c = a + b;
        System.out.println(c);
    }
}

public  class addition{
    public  static  void main(String args[]){
            add a = new add(5, 11);
            add a1 = new add(11, 12);

            a.display();
    }
}
