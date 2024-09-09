public class Main {
    public static void main(String[] args) {
        System.out.println("#1");
        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(8));
        System.out.println("#2");
        System.out.println(fitCalc(15, 1));
        System.out.println(fitCalc(24, 2));
        System.out.println(fitCalc(41, 3));
        System.out.println("#3");
        System.out.println(containers(3, 4, 2));
        System.out.println(containers(5, 0, 2));
        System.out.println(containers(4, 1, 4));
        System.out.println("#4");
        System.out.println(triangleType(5, 5, 5));
        System.out.println(triangleType(5, 4, 5));
        System.out.println(triangleType(3, 4, 5));
        System.out.println(triangleType(5, 1, 1));
        System.out.println("#5");
        System.out.println(ternaryEvaluation(8, 4));
        System.out.println(ternaryEvaluation(1, 11));
        System.out.println(ternaryEvaluation(5, 9));
        System.out.println("#6");
        System.out.println(howManyItems(22, 1.4, 2));
        System.out.println(howManyItems(45, 1.8, 1.9));
        System.out.println(howManyItems(100, 2, 2));
        System.out.println("#7");
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(7));
        System.out.println("#8");
        System.out.println(gcd(48, 18));
        System.out.println(gcd(52, 8));
        System.out.println(gcd(259, 28));
        System.out.println("#9");
        System.out.println(ticketSaler(70, 1500));
        System.out.println(ticketSaler(24, 950));
        System.out.println(ticketSaler(53, 1250));
        System.out.println("#10");
        System.out.println(tables(5, 2));
        System.out.println(tables(31, 20));
        System.out.println(tables(123, 58));
    }
    public static double convert(int gallons){
        return gallons * 3.785;
    }
    public static int fitCalc(int min, int intensity){
        return min * intensity;
    }
    public static int containers(int box, int bag, int barrel){
        return 20*box + 50*bag + 100*barrel;
    }
    public static String triangleType(int x, int y, int z){
        if((x+y<z) || (x+z<y) || (y+z<x)){
            return "not a triangle";
        } else if(x==y && y==z && x==z){
            return "isosceles";
        } else if (x == y || x == z && x != y || y == z && y != x) {
            return "equilateral";
        } else{
            return "different-sided";
        }

    }
    public static int ternaryEvaluation(int a, int b){
        return (a>b ? a:b);
    }
    public static int howManyItems(double n, double w, double h){
        return (int)Math.floor(n/(w*h*2));
    }
    public static int factorial(int f){
        int fac = 1;
        for(int i=2; i<=f; i++){
            fac*=i;
        }
        return fac;
    }
    public static int gcd(int a, int b){
        int maxDivisor = 1;
        for(int i=Math.max(a, b)/2; i>=2; i--){
            if(a%i==0 && b%i==0){
                maxDivisor=i;
                break;
            }
        }
        return maxDivisor;
    }
    public static double ticketSaler(int amount, int price){
        return amount*price*0.72;
    }
    public static int tables(int students, int table){
        if(table*2<students){
            int left = students-table*2;
            return (left%2==0) ? (left/2): (left/2+1);
        }else{
            return 0;
        }

    }
}