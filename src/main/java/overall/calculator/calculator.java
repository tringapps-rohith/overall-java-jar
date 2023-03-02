package overall.calculator;
abstract class Calculator
{
        private double a;
        private double b;
        public void setA(double a)
        {
                this.a=a;
        }
        public double getA()
        {
                return a;
        }
        public void setB(double b)
        {
                this.b=b;
        }
        public double getB()
        {
                return b;
        }
        abstract double calculate();
}
