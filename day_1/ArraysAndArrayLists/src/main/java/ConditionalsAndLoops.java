import java.util.ArrayList;

public class ConditionalsAndLoops {
    public static void main(String[] args) {

//        for(initialization;
//         Boolean expression;
//         Update) {
//        }

        ArrayList<Double> myList = new ArrayList();
        myList.add(1.4);
        myList.add(2.6);
        myList.add(4.5);
        myList.add(5.6);
        myList.add(6.4);

        for(int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

//        for(Double number : myList) {
//            System.out.println(number);
//        }

//        int x = 21;
//
//        do {
//            System.out.println("value of x: " + x);
//            x ++;
//        } while (x < 20);






//        char grade = 'A';
//
//        switch(grade) {
//            case 'A':
//                System.out.println("Excellent");
//                break;
//            case 'B':
//            case 'C':
//                System.out.println("Well done");
//                break;
//            case 'D':
//            case 'E':
//                System.out.println("Try harder");
//                break;
//            case 'F':
//                System.out.println("Better Try Again");
//                break;
//            default:
//                System.out.println("Error. Invalid Grade");
//                break;
//        }
//        System.out.println("You're grade is " + grade);

//        int x = 30;
//
//        if (x < 20) {
//            System.out.println("This is an if statement");
//        } else {
//            System.out.println("This is an else statement");
//        }
    }
}
