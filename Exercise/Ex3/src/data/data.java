package data;

public class data {

    private String owner;
    private int dai;
    private int rong;
    private int canh;
    private int bankinh;
    private String color;

    public data(String owner, int dai, int rong, int canh, int bankinh, String color) {
        this.owner = owner;
        this.dai = dai;
        this.rong = rong;
        this.canh = canh;
        this.bankinh = bankinh;
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getDai() {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public int getRong() {
        return rong;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }

    public int getBankinh() {
        return bankinh;
    }

    public void setBankinh(int bankinh) {
        this.bankinh = bankinh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("|Owner: %8s|Chieu dai: %4d|Chieu rong: %4d|Color: %8s|\n",
                owner, dai, rong, color);
    }

    public void showInformation() {
        switch (owner) {
            case "Na":
                System.out.printf("|Owner: %8s|Chieu dai: %4d|Chieu rong: %4d|Color: %8s|\n|Chu vi: %4.2f| Dien tich: %4.2f|",
                        owner, dai, rong, color, (float) ((dai + rong) * 2), (float) (dai * rong));
                break;
            case "Cifer":
                System.out.printf("|Owner: %8s|Ban kinh: %4d|Color: %8s|\n|Chu vi: %4.2f| Dien tich: %4.2f|",
                        owner, bankinh, color, (float) (bankinh * 2 * Math.PI), (float) (bankinh * bankinh * Math.PI));
                break;
            case "Ghe tao":
                System.out.printf("|Owner: %8s|Canh: %4d|Color: %8s|\n|Chu vi: %4.2f| Dien tich: %4.2f|",
                        owner, canh, color, (float) (canh * 4), (float) (canh * canh));
                break;
            default:
                break;
        }
    }
}
