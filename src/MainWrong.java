
public class MainWrong {
    
    public static void main(String[] args) {
        Parent p = new Child();
        p.compute();
    }
    
}

class Parent {
    int n = 0;
    public Parent() {
        compute(); // Warning: overridable method call in constructor
    }
    
    public void compute() {
        System.out.println("compute at Parent: n = " + n);
        n = 99;
    }
}

class Child extends Parent {
    public Child() {
        // if no explicit super constructor call, super() is called
    }
    
    @Override
    public void compute() {
        System.out.println("compute at Child: n = " + n);
    }
}
