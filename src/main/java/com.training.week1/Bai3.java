package com.training.week1;

public class Bai3 {
    public static class ComplexNumber{
        //cho phần thực và phần ảo của số phức
        double real;
        double img;

        //constructor để khởi tạo số phức
        /*ComplexNumber(double r, double i){
            this.real = r;
            this.img = i;
        }*/

       /* public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
        {
            //tạo một số phức tạm thời để giữ tổng của hai số
            ComplexNumber temp = new ComplexNumber(0, 0);

            temp.real = c1.real + c2.real;//cộng các phần thực
            temp.img = c1.img + c2.img;//cộng các phần ảo

            //trả về số phức đầu ra
            return temp;
        }*/

        public static double sumReal(double r1,double r2) {
            return r1 + r2;
         }
        public static double sumImg(double i1,double i2) {
            return i1 + i2;
        }

        public static double sumDouble(double r1,double r2) {

            return r1 + r2;
        }

        public static void main(String args[]) {
            /*ComplexNumber c1 = new ComplexNumber(5.2, 4.4);//nhập vào phần thực và phần ảo của số phức thứ nhất
            ComplexNumber c2 = new ComplexNumber(2.0, 7.3);//nhập vào phần thực và phần ảo của số phức thứ hai
            ComplexNumber temp = sum(c1, c2);
            System.out.printf("Kết quả là: "+ temp.real+" + "+ temp.img +"i");//hiển thị kết qua ra màn hình*/
            double sumReal = sumDouble(5.2,2.0);
            double sumImg = sumDouble(4.4,7.3);
            System.out.println("sumReal: " + sumReal);
            System.out.println("sumImg: " + sumImg);

        }
    }
}
