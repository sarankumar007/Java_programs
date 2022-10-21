import java.util.*;
public class date_validation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] date1=sc.nextLine().split("/");
        int date=Integer.parseInt(date1[0]);
        int month=Integer.parseInt(date1[1]);
        int year=Integer.parseInt(date1[2]);
        String flag="";
        if(year%4==0){
            if(month==1 || month==3 || month==5 || month==7|| month==8 || month==10 || month==12){
                if(date>0 && date<=31){
                    flag="Valid";
                }
                else
                    flag="Invalid";
            }
            if(month==2){
                if(date>0 && date<=29){
                    flag="Valid";
                }
                else
                    flag="Invalid";
            }
            if(month==4|| month==6|| month==9||month==11){
                if(date>0 && date<=30){
                    flag="Valid";
                }
                else
                    flag="Invalid";
            }
        }
        else{
            if(month==1 || month==3 || month==5 || month==7|| month==8 || month==10 || month==12){
                if(date>0 && date<=31){
                    flag="Valid";
                }
                else
                    flag="Invalid";
            }
            if(month==2){
                if(date>0 && date<=28){
                    flag="Valid";
                }
                else
                    flag="Invalid";
            }
            if(month==4|| month==6|| month==9||month==11){
                if(date>0 && date<=30){
                    flag="Valid";
                }
                else
                    flag="Invalid";
            }

        }
        System.out.println(flag);


    }
}

