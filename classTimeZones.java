import java.util.Scanner;
class classTimeZones{

    public static void funcTime(int varHours, float varChange, int varMin, String varName) {
        varHours += (int)varChange;
        if (varHours >= 23){
            varHours -= 24;
        }
        else if(varHours < 0){
            varHours += 24;
        }
        varChange -= (int)varChange;
        //System.out.println(varChange);
        varChange *= 100;
        varMin += (int) varChange;
        if (varMin >= 59) {
            varMin -= 60;
        }
        else if(varMin < 0){
            varMin += 60;
        }
        System.out.println("The time at "  + varName + " place will be " + varHours + ":" + varMin + " hours");
    }

    public static void funcCst(int varHours, int varMin, char varTimeZone) {
        switch (varTimeZone) {
            case 'I':
                funcTime(varHours, +11.30f, varMin, "Aditi's and Monish's");
            case 'S':
                funcTime(varHours, -8.00f, varMin, "Evangellos' and Ana S.'");
            case 'E':
                funcTime(varHours, +1.00f, varMin, "Athena's");
        }
    }

    public static void funcEst(int varHours, int varMin, char varTimeZone) {
        switch (varTimeZone) {
            case 'I':
                funcTime(varHours, +10.30f, varMin, "Aditi's and Monish's");
            case 'E':
                funcTime(varHours, +8.00f, varMin, "Evangellos' and Ana S.'");
            case 'C':
                funcTime(varHours, -1.00f, varMin, "Ana B.'s ");
        }
    }

    public static void funcEest(int varHours, int varMin, char varTimeZone) {
        switch (varTimeZone) {
            case 'I':
                funcTime(varHours, +3.30f, varMin, "Aditi's and Monish's");
            case 'S':
                funcTime(varHours, -8.00f, varMin, "Athena's");
            case 'C':
                funcTime(varHours, -9.00f, varMin, "Ana B.'s");
        }
    }

    public static void funcIst(int varHours, int varMin, char varTimeZone) {
        switch (varTimeZone) {
            case 'I':
                funcTime(varHours, -3.30f, varMin, "Evangellos' and Ana S.'");
            case 'S':
                funcTime(varHours, -10.30f, varMin, "Athena's");
            case 'C':
                funcTime(varHours, -11.30f, varMin, "Ana B.'s");
        }
    }
        
    public static void main(String[] args){
        Scanner objScan = new Scanner(System.in);
        byte varCheck;
        do {
            System.out.print("Enter the local time (hours) in the 24 hour clock: ");
            int varHours = objScan.nextInt();
            System.out.print("Enter the local time (minutes): ");
            int varMin = objScan.nextInt();
            System.out.println("Enter the time zone you are living in : (IST: Enter I; EEST: Enter E; CST: Enter C; EST: Enter S)");
            char varTimeZone = objScan.next().charAt(0);
            switch (varTimeZone) {
                case 'I':
                    funcIst(varHours, varMin, varTimeZone);
                    break;
                case 'S':
                    funcEst(varHours, varMin, varTimeZone);
                    break;
                case 'C':
                    funcCst(varHours, varMin, varTimeZone);
                    break;
                case 'E':
                    funcEest(varHours, varMin, varTimeZone);
                    break;
            }
            System.out.println(" /n To experiment with other settings, enter any other number");
            System.out.println("Else, enter 0 to exit the program");
            varCheck = objScan.nextByte();
        } while (varCheck != 0);
    }
}
