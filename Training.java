import java.util.Scanner;

public class Training {
        public static void main(String[] args) {
                Scanner input=new Scanner(System.in);

//        int total=0;
//        Scanner input=new Scanner(System.in);
//        int num=input.nextInt();
//        while (num!=0){
//            int i=num%10;
//                num/=10;
//                total+=i;
//        }
//        System.out.println("这个数总和为："+total);

//        double saving_mon=input.nextFloat();
//        double rate=1+0.00417;
//        double saving = 0;
//        int i=0;
//        double sum=0;
//        while(i<6){
//                i+=1;
//                sum=(saving_mon+saving)*rate;
//                saving=sum;
//                }
//                System.out.println("当前的金额为"(float) sum);
                int cardNum=((int)(Math.random()*13+1));
                int cardColor=(int)(Math.random()*4);
                System.out.println(cardColor);
                System.out.println(cardNum);
                String cardname=new String();
                String color=new String();
                if (cardColor==0){
                        color="Clubs (黑梅花)";
                                switch (cardNum){
                                case 1:cardname="Ace";break;
                                case 2:cardname="2";break;
                                case 3:cardname="3";break;
                                case 4:cardname="4";break;
                                case 5:cardname="5";break;
                                case 6:cardname="6";break;
                                case 7:cardname="7";break;
                                case 8:cardname="8";break;
                                case 9:cardname="9";break;
                                case 10:cardname="10";break;
                                case 11:cardname="Jack";break;
                                case 12:cardname="Queen";break;
                                case 13:cardname="King";break;}
                        }
                        else if(cardColor==1){color="Diamonds (红方块)";
                                switch (cardNum){
                                        case 1:cardname="Ace";break;
                                        case 2:cardname="2";break;
                                        case 3:cardname="3";break;
                                        case 4:cardname="4";break;
                                        case 5:cardname="5";break;
                                        case 6:cardname="6";break;
                                        case 7:cardname="7";break;
                                        case 8:cardname="8";break;
                                        case 9:cardname="9";break;
                                        case 10:cardname="10";break;
                                        case 11:cardname="Jack";break;
                                        case 12:cardname="Queen";break;
                                        case 13:cardname="King";break;}

                                }
                        else if (cardColor==2){color="Hearts (红心）";
                                switch (cardNum){
                                        case 1:cardname="Ace";break;
                                        case 2:cardname="2";break;
                                        case 3:cardname="3";break;
                                        case 4:cardname="4";break;
                                        case 5:cardname="5";break;
                                        case 6:cardname="6";break;
                                        case 7:cardname="7";break;
                                        case 8:cardname="8";break;
                                        case 9:cardname="9";break;
                                        case 10:cardname="10";break;
                                        case 11:cardname="Jack";break;
                                        case 12:cardname="Queen";break;
                                        case 13:cardname="King";break;}
                                }
                        else if(cardColor==3){color="Spades (黑桃）";
                                switch (cardNum){
                                case 1:cardname="Ace";break;
                                case 2:cardname="2";break;
                                case 3:cardname="3";break;
                                case 4:cardname="4";break;
                                case 5:cardname="5";break;
                                case 6:cardname="6";break;
                                case 7:cardname="7";break;
                                case 8:cardname="8";break;
                                case 9:cardname="9";break;
                                case 10:cardname="10";break;
                                case 11:cardname="Jack";break;
                                case 12:cardname="Queen";break;
                                case 13:cardname="King";break;}
                                }
                        System.out.println("The card you picked is " +cardname +" of "+color);
                }
        }

