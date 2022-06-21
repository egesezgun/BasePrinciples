package src;
public class Main {

    public static void main(String[] args){
        Book lordOfTheRings = new Book("lordOfTheRings", -100);
        lordOfTheRings.setPageNumber(-1000);
        System.out.print(lordOfTheRings.getPageNumber());

    }
}