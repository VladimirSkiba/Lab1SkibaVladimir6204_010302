<<<<<<< HEAD

class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(0,0);
        int i, j;
        for (i = 1; i <= 8; i++) {
            for(j = 1; j <= 8; j++) {
                o.setNum1(i);
                o.setNum2(j);
                System.out.print(o.mult());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

    class MySecondClass{
        private int number1, number2;
        public void setNum1(int number1) {
            this.number1 = number1;
        }
        public void setNum2(int number2) {
            this.number2 = number2;
        }
        public int getNum1() {
            return number1;
        }
        public int getNum2() {
            return number2;
        }
        public MySecondClass(int number1, int number2){
            this.number1 = number1;
            this.number2 = number2;
        }
        public int mult() {
            return number1 * number2;
        }
=======

class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(0,0);
        int i, j;
        for (i = 1; i <= 8; i++) {
            for(j = 1; j <= 8; j++) {
                o.setNum1(i);
                o.setNum2(j);
                System.out.print(o.mult());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

    class MySecondClass{
        private int number1, number2;
        public void setNum1(int number1) {
            this.number1 = number1;
        }
        public void setNum2(int number2) {
            this.number2 = number2;
        }
        public int getNum1() {
            return number1;
        }
        public int getNum2() {
            return number2;
        }
        public MySecondClass(int number1, int number2){
            this.number1 = number1;
            this.number2 = number2;
        }
        public int mult() {
            return number1 * number2;
        }
>>>>>>> e8a1752d9f8a817a3b68f303af8acd3cdcf783f0
    }