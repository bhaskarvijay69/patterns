import java.util.*;
class Diamond{
public static void main(String[] args){
	Scanner io=new Scanner(System.in);
	int n=io.nextInt();
for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){
		if((i<j&&j==i+1)||(i==j+1&&j<i)){
			System.out.print("*");
		}
		else{
			System.out.print(" ");
		}
		
	}
	System.out.println("");
}
}
}
