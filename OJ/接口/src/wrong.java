import java.util.*;

public class wrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            try {
                String a=sc.next();
                String b=sc.next();
                for (char s:a.toCharArray()){
                    if (s=='.'||!Character.isDigit(s))
                        throw new InputMismatchException();
                }
                for (char s:b.toCharArray()){
                    if (s=='.'||!Character.isDigit(s))
                        throw new InputMismatchException();
                }
                int sum1=0;
                int sum2=0;
                int sum=0;
                for (char s:a.toCharArray()){
                    sum1=sum1*10+s-'0';
                }

                for (char s:b.toCharArray()){
                    sum2=sum2*10+s-'0';
                }
                sum=sum1+sum2;
                System.out.println(sum);

            } catch (Exception e) {
                System.out.println("Wrong input!Please enter int value.");
            }
        }

        sc.close();
    }
}
/*
import java.util.*;

public class wrong {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String s;
			try{
				s = scan.nextLine();
				for(int i=0;i<s.length();i++){
					if(s.charAt(i)=='.'||((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')))
						throw new InputMismatchException();
				}
				int sum = 0;
				String [] arr = s.split("\\s+");
				for(int j=0;j<=1;j++){
					int a=0;
					for(int i=0;i<arr[j].length();i++){
						a=a*10+(arr[j].charAt(i)-'0');
					}
					sum+=a;
				}
				System.out.println(sum);
			}catch(InputMismatchException e){
				System.out.println("Wrong input!Please enter int value.");
			}
		}
	}
}*/
