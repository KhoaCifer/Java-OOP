package dogmanagement;

import data.Dog;

public class DogManagement {
    public static void main(String[] args) {
        //lấy khuôn Dog ra để nhập info
        //đặt tên cho object
        Dog chiHu = new Dog("Zang", 2003, 1);
        Dog ngaoDa = new Dog("Ngao vl", 2001, 5);
                        //object
        //có object thì object sẽ làm gì đó
        //CaSi chiPu {name: NTC; yob: 1993}
                    //JSON JavaScript
        chiHu.Bark();
        //Dog ngaoDa = new Dog("NGÁO ĐÁ", 2020, 50);
        //ngaoDa.Bark();
        //ngaoDa va chiHu la 2 data rueng biet, ko de len nhau, ngaoDa ko thay the data cua chiHu
        chiHu.setNewWeight(5);
        System.out.println("After overweight ");
        chiHu.Bark();
        int chYob = chiHu.getYob();
        System.out.println("ND YOB: " + ngaoDa.getYob());
        System.out.println("CH YOB: " + chYob);
    }   
}
//Encapsulation: tính đóng gói của thông tin và hành động 
//hàm và biến đi kèm với nhau, mô tả cho 1 object

