package HW;

abstract class  Shop {
    String productName;
    double price;
    int employer;


    public abstract void buy();

    public abstract void selling();

    public void shipping(){
        System.out.println("shipping is available for both of them ");
    }

}
class Main{
    public static void main(String[] args) {

        Shop obj = new Online(35);
        System.out.println(obj);
        System.out.println(obj.employer);
        System.out.println("-------------------");
        System.out.println(obj.price);
        System.out.println("-------------------");
        System.out.println(obj.productName);
        System.out.println("-------------------");


        obj.buy();
        obj.selling();



        Shop obj1 = new InPerson();
        System.out.println("-------------------");
        System.out.println(obj1);

        System.out.println(obj1.productName);
        System.out.println("-------------------");

        System.out.println(obj1.price);
        System.out.println("-------------------");

        System.out.println(obj1.employer);
        System.out.println("-------------------");


        obj1.buy();
        obj1.selling();

    }
}

class Online extends Shop {

    public Online(int productNumbers){
        super.price = 5.8;
        super.employer = 25;
        super.productName = "Disney";
        // productNumbers = 35; gerek yok
    }

    @Override
    public void buy() {
        System.out.println("buying is available for 24hours");

    }

    @Override
    public void selling() {
        System.out.println("selling by online");

    }
}
class InPerson extends Shop {
    public InPerson(){
        super.price = 7.8;
        super.employer = 4;
        super.productName = "Hallmark";

    }



    @Override
    public void buy() {
        System.out.println("buying is from store");

    }

    @Override
    public void selling() {
        System.out.println("selling is available for 10 hours");

    }
}
