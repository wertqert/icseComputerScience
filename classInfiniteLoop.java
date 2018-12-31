class classInfiniteLoop{
    public static void main(String args[]){
        for (int i = (int)(Math.pow(2, 31) - 1); i != 1; i++) // try i == 1
            System.out.println(i);
    }
}