package HomeworksAll;

public class Shoes {
    String Brand;
    double Size;
    String Type;
    double Price;

    public void SetInfo(String brand, double size, String type, double price){
        Brand = brand;
        Size = size;
        Type = type;
        Price = price;
    }

    public void Print(){
        System.out.println("Brand: "+Brand);
        System.out.println("Size: "+Size);
        System.out.println("Type: "+Type);
        System.out.println("Price: "+Price);
    }
}
