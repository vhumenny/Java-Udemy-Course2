package nested_classes.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(21,4);
    }
}

class Math {
    public void getResult(int a, int b) {
//        int a = 21;
        class Divide {
            //            private int a;
            private int b;

//            public int getA() {
//                return a;
//            }
//
//            public void setA(int a) {
//                this.a = a;
//            }

//            public int getB() {
//                return b;
//            }
//
//            public void setB(int b) {
//                this.b = b;
//            }

            public int getResultOfDivide() {
                return a / b;
            }

            public int getModulo() {
                return a % b;
            }
        }
        Divide divide = new Divide();
//        divide.setA(21);
//        divide.setB(4);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("result of divide = " + divide.getResultOfDivide());
        System.out.println("Modulo = " + divide.getModulo());
    }
}
