package data;

public class Dog {
    private String name;  
    private int yob;      
    private double weight; 

    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        //có 1 hàm static tên là format() khá giống với hàm printf
        //có thể sửa lại toString()
        return String.format("|GOGO|%-10s|%d|%f", name, yob, weight);
        //return "Dog{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
    }
    
    //1 object luôn có hồ sơ thông tin mô tả như người có cmnd, hồ sơ sv, CV,....
    //hàm show all info được đổ nếu tự generate đó là hàm toString() biến mọi thứ info ta có thành 1 dạng như thẻ CCCD
    public void Bark() {
        System.out.println("My dog's name is " + name);
        System.out.println("My dog's yob is " + yob);
        System.out.println("My dog's weight is " + weight);
    }
    //ai có nhiều thông tin nhất, object đó phải xử lí info trước
    public int getAge() {
        return 2023 - yob; 
        //dữ liệu sang năm sau là 2024, sẽ bị sai
    }
}
