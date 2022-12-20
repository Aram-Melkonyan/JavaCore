package chapter3;

public class Array {
    public static void main(String[] args) {
        int mont_days[];
        mont_days= new int[12];
        mont_days[0]=31;
        mont_days[1]=28;
        mont_days[2]=31;
        mont_days[3]=30;
        mont_days[4]=31;
        mont_days[5]=30;
        mont_days[6]=31;
        mont_days[7]=31;
        mont_days[8]=30;
        mont_days[9]=31;
        mont_days[10]=30;
        mont_days[11]=31;
        System.out.println("В апреле "+ mont_days [3]+ " Дней");
    }
}
