class Lemonade {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        for(int val : bills){
            if(val == 5) five++;
            else if (val == 10){
                if(five >0){
                    five --;
                    ten++;
                }
                else return false;
            }
            else{
                if(five >0 && ten >0){
                    five--;
                    ten--;
                }
                else if( five >=3){
                    five-=3;
                }
                else return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] bills = {5, 5, 5, 10, 20};
        System.out.print("Queues of customers: ");
        for (int bill : bills) {
            System.out.print(bill + " ");
        }
        System.out.println();
        Lemonade solution = new Lemonade();
        boolean ans = solution.lemonadeChange(bills);
        if (ans)
            System.out.println("It is possible to provide change for all customers.");
        else
            System.out.println("It is not possible to provide change for all customers.");
    }
}