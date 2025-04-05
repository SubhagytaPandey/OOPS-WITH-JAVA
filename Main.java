
class SuperClass {

    //private String privateMember = "This is a private member";  //variable
    protected String privateMember = "This is a private member";

    public String getPrivateMember() {     //function or method
        return privateMember;
    }
}

class SubClass extends SuperClass {

    public void display() {

        System.out.println(privateMember);  // Study access modifier
        System.out.println("Accessing private member through method: " + getPrivateMember());
    }
}

public class Main {

    public static void main(String[] args) {

        SubClass obj = new SubClass();
        obj.display();
    }
}
