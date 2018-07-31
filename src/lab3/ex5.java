package lab3;

public class ex5 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            //System.out.println("Hello");
            //1-100

            //เลขคู่ ที่อยู่ระหว่าง 1-100
//            if(i%2==0)
            //เลขที่หารด้วย 3 ลงตัว ที่อยู่ระหว่าง 1-100
//            if (i%3==0)
            //เลขที่หารด้วย 3 และ 5 ลงตัว ที่อยู่ระหว่าง 1-100
//            if (i%3==0)
//                if (i%5==0)
            if (i%3==0 && i%5==0)
            System.out.print(i+" ");
        }



    }

}
