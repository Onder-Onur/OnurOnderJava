package HomeworksAll;

public class Car {
    String Model;
    int Year;
    double Speed;

    public void SetAttributes(String model, int year, double speed){
        Model = model;
        Year = year;
        Speed = speed;
    }

    public void Print(){
        System.out.println("Model: "+Model);
        System.out.println("Year: "+Year);
        System.out.println("Speed: "+Speed);
    }

    public void IncreaseSpeed(double add){
        Speed+=add;
    }

    public void DeccreaseSpeed(double minus){
        Speed-=minus;
    }
}
