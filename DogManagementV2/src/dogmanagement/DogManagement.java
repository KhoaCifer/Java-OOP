package dogmanagement;

import data.Dog;

public class DogManagement {
    public static void main(String[] args) {
        Dog chiHu = new Dog("Zang", 2003, 1);
        Dog ngaoDa = new Dog("Ngao vl", 2001, 5);
        chiHu.Bark();
        System.out.println("After overweight ");
        System.out.println("ND YOB: " + ngaoDa.getYob());
        System.out.println("CH YOB: " + chiHu.getName());
        System.out.println(ngaoDa.toString());
        System.out.println(chiHu.toString());
        //ngon hơn nữa chỉ có ở toString()
        //chiHu và ngaoDa là 2 biến con trỏ, reference, đứng từ đây chiếu qua new ở DogManagement
        System.out.println(chiHu);
        //khi sout (biến con trỏ, biến object, biến reference) mặc định hàm toString() được gọi
        //chỉ toString() mới được ưu tiên, hàm khác muốn xài bắt buộc phải gọi
        //in ra tuổi chiHu
        System.out.println("Chihu age: " + chiHu.getAge());
    }   
}

