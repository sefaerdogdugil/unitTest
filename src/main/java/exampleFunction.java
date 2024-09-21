public class exampleFunction {
public Object addition (int a, int b, int c) {
    int add = a + b + c;
    System.out.println("Toplama İslemi Sonucu =" + add);
    return add;
}
    public Object subtraction (int d, int e, int f) {
        int sub = d - e - f;
        System.out.println("Çıkarma İslemi Sonucu =" + sub);
        return sub;
    }
            public Object multiple(int x, int y,int z){
            int multi = x *  y * z;
            System.out.println("Çarpma İslemi Sonucu ="+multi);
            return multi;
        }
    public int division(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
    public String getMyname(){
        return "Sefa Erdoğdugil";

    }

}


