package web.model;

import java.util.Objects;

public class Car {

    private int num;
    private String auto_age;
    private int series;

    public Car(){

    }


    public Car( int num, String auto_age, int series) {
        this.num = num;
        this.auto_age = auto_age;
        this.series = series;

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String get_age() {
        return auto_age;
    }

    public void set_age(String auto_age) {
        this.auto_age = auto_age;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return num == car.num && Objects.equals(auto_age, car.auto_age) && Objects.equals(series, car.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auto_age, series, num);
    }

    @Override
    public String toString() {
        return "Car [" +
                "model: '" + auto_age + '\'' +
                ", series: '" + series + '\'' +
                ", age:  " + num +
                ']';
    }
}
