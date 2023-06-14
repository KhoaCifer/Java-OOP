package data;

public class Dog {
    //trong khuôn chứa info qua biến = value
    //chừa chỗ để lấp value
    private String name;   //_______
    private int yob;       //_______
    private double weight; //_______
    
    public Dog(String iName, int iYob, double iWeight) {
        name = iName;
        yob = iYob;
        weight = iWeight;
    }
    
    //còn được gọi là constructor, hàm khởi tạo, tạo ra object
    //mỗi lần xài là có 1 object mới
    //không có giá trị trả về
    //tên giống tên class
    //viết các hàm xử lí data
    //hàm gọi n lần mà các obj lặp đi lặp lại
    //hành động obj gọi n lần trên obj đó
    
    //các hàm khác của object là những quy tắc xử lí info
    //1 obj sẽ có nhiều hành động xử lí data, hoạt động hàng ngày đều liên quan đến data
    //hàm - method, hành vi - behavior
    public void Bark() {
        System.out.println("My dog's name is " + name);
        System.out.println("My dog's yob is " + yob);
        System.out.println("My dog's weight is " + weight);
    }
    //thay đổi info gốc
    public void setNewWeight(double newWeight) {
        weight = newWeight;
    }
    //info mặc định là giấu, khi mình giao tiếp mới sử dụng
    //phương thức chia sẽ info khi được hỏi, là method hàm, hành động get()
    public int getYob() {
        return yob;
    }
}
