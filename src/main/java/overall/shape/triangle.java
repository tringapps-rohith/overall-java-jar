package overall.shape;
class Triangle implements Shape
{
        private double a;
        private double b;
        private double c;
        private double h;
        public Triangle(double a,double b,double c,double h)
        {
                this.a=a;
                this.b=b;
                this.c=c;
                this.h=h;
        }
        public double area()
        {
                return 0.5*b*h;
        }
        public double perimeter()
        {
                return a+b+c;
        }
}
