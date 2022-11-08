package car;

public class Cars {
    public String nameCar;
    public String Cartype;
    public int Horsepower;
    public int Year;

    public Cars(String nameCar, String Cartype, int Horsepower, int Year) {
        this.nameCar = nameCar;
        this.Cartype = Cartype;
        this.Horsepower = Horsepower;
        this.Year = Year;
    }

    public String Horsepower() {
        return Integer.toString(Horsepower);
    }

    public String Year() {
        return Integer.toString(Year);
    }

    @Override
    public String toString() {
        return nameCar + " ("  + Cartype + ", " + Horsepower + ")";
    }
}
