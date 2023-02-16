package ie.atu.Productv6;

public class ProductDB  {

    public static Productable getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product p = null;

        if (productCode.equalsIgnoreCase("java"))
        {
           Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }


        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;
        }

        if(productCode.equalsIgnoreCase("Pitbull")){
            Dog myDog = new Dog();
            myDog.setType(productCode);
            myDog.setAge("8");
            myDog.setBreed(" French Pitbull");
            myDog.setPrice(100);
            myDog.setVaccination("yes");
            myDog.setShedding("no");
            myDog.setNeuttered("yes");
            p = myDog;
        }

        if(productCode.equalsIgnoreCase("Horse")){
            Horse myHorse= new Horse();
            myHorse.setType(productCode);
            myHorse.setAge("5");
            myHorse.setBreed("Arabian");
            myHorse.setPrice(1000);
            myHorse.setDam("Arabian");
            myHorse.setSire("Arabian");
            myHorse.setHeight("5'5");
            p = myHorse;
        }
        return p;
    }
}

