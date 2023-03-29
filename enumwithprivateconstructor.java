public enum enumwithprivateconstructor {

    SUNDAY(), MONDAY, TUESDAY(23,5), WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    int productid;
    int noofsales;

    private enumwithprivateconstructor(int productid , int noofsales) {
        System.out.println("arg cons");
        this.productid = productid;
        this.noofsales=noofsales;
    }

    private enumwithprivateconstructor() {
        System.out.println("no arg cons");
    }

    public static void main(String args[]) {

    }

}