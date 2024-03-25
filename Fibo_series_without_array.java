package pro_buddy;

public class Fibo_series_without_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] temp=new int[12];
temp[0] =1;
temp[1] = 2;
//int temp1 = b+temp;
//int temp2 = temp1+temp;
//int temp3 = temp1+temp2;
//int temp4 = temp2+temp3;
//int temp5 = temp3+temp4;
//int temp6 = temp5+temp4;
//System.out.println("fibonacci numbers are as follows");
//System.out.println(a);
//System.out.println(b);
//System.out.println(temp);
//System.out.println(temp1);
//System.out.println(temp2);
//System.out.println(temp3);
//System.out.println(temp4);
//System.out.println(temp5);
//System.out.println(temp6);
//System.out.println(a);
for(int i=0;i<5;i++) {
	temp[i+2] =temp[i]+temp[i+1];
	System.out.print(" ,"+temp[i]);
}

	}

}
