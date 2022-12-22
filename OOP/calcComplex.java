public class calcComplex {
    public static void main(String [] args)
    {
        //first complex number:
        Complex c1=new Complex(2,3);
        //second complex number:
        Complex c2=new Complex(3,2);
        Complex sum=Complex.add(c1,c2);
        sum.print();
        Complex diff=Complex.sub(c1,c2);
        diff.print();
        Complex prod=Complex.mul(c1,c2);
        prod.print();
    }
}

class Complex{
    int real;
    int img;
    Complex(int real,int img)
    {
        this.real=real;
        this.img=img;
    }
//utility function to calculate sum,difference and product of complex numbers
     static Complex add(Complex c1,Complex c2){
        return new Complex(c1.real+c2.real,c1.img+c2.img);        //returns a new Complex Number.
     }
     static Complex sub(Complex c1,Complex c2){
        return new Complex(c1.real-c2.real,c1.img-c2.img);        //returns a new Complex Number ,a value of the type Complex or class Complex.
     }
     static Complex mul(Complex c1,Complex c2){
        return new Complex(((c1.real*c2.real)-(c1.img*c2.img)),((c1.real*c2.img)+(c1.img*c2.real)));        //returns a new Complex Number.
     }
    void print()
     {
        if(real==0 && img!=0)
        {
            System.out.println("i"+img);
        }else if(real!=0 && img==0)
        {
            System.out.println(real);
        }else{
            System.out.println(real+"+"+"i"+img);
        }
     }
}