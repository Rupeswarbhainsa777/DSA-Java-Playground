package Top_100_Coding_Question.Opps_JavaBasics;



interface Printable{
     void printId();
     void printName();

}

class User implements Printable{
    private  int id;
    private String name;
    User(int id , String name){
        this.name=name;
        this.id=id;
    }

    @Override
    public void printId() {
        System.out.println(id);

    }

    @Override
    public void printName() {
        System.out.println(name);
    }
}



public class Multiple {
    public static void main(String[] args) {
        Printable tabl = new User(1,"Sumit");
        tabl.printId();
        tabl.printName();

    }
}
