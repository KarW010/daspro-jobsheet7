import java.util.Scanner;
public class DoWhileLeaveEntitlement09 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int leaveEntitlement;
        int numLeave;
        String confirmation;

        System.out.print("Input The Number of Leave Entitlement: ");
        leaveEntitlement = input.nextInt();
        do {
            System.out.print("Do you want to take a leave (y/n)? ");
            confirmation = input.next();
            if (confirmation.equalsIgnoreCase("y")) {
                while (true) {
                    System.out.print("How many day(s)? ");
                    numLeave = input.nextInt();
                    if(numLeave <= leaveEntitlement) {
                        leaveEntitlement -= numLeave;
                        System.out.println("Remaining leave entitlement: "+leaveEntitlement);
                        break;
                    } else {
                        System.out.println("You dont have enough leave entitlement");
                    }
                }  
            }
        } while(leaveEntitlement > 0);
    
        System.out.println("You have no more leave entitlement left.");
    }
}