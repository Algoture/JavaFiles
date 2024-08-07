import java.util.Random;
public class RandomPogo {
    public static void main(String[] args) {
        Random rd = new Random();
        // int num=rd.nextInt(50);
        // System.out.println(num);
        String [] states = new String[]{"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttarakhand","Uttar Pradesh","West Bengal"};
        int index = rd.nextInt(states.length);
        System.out.println("You Have To Travel To : "+states[index]);
        
    }
}
