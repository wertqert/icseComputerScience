class classInfiniteLoop{
    public static void main(String args[]){
        for (byte i = 127; i > -129; i++) // try i == 1
            System.out.println(i);
    }
}