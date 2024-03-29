public class laptop {



    public static extract_details(String laptopdetails){
        // split
        String[] Prithvi= moviedetails.split(":");
        // as we are creating array of string we will get no. of tickets as string so convert it to integer

        String screenNumber = Prithvi[0];
        String noOfTickets = Integer.parceInt(Prithvi[1]);
        String mobileno= Prithvi[2];
        String modeofPay = Prithvi[3];
       
        return new film(screenNumber,noOfTickets,mobileno,modeofPay);
        


    }


    public double calculateLaptopPrice(){
        double price =0;



        
        
        if (brandName.equals("lenovo")){
            return -1;
        }
        if (laptoptype.equals("notebook")){
            cost=45000;

        }
        else if(laptoptype.equals("ultraportable")){
            cost=52000;
        }
        else if(laptoptype.equals("MacBook")){
            cost="55000";
        }
        else{
            return -1;
        }
        return cost ;
        
    }


}
