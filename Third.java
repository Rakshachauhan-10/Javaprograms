class Emp 
{
     int eno;
     String ename;
     float sal;
     void setEmp(int no,String name,float sa)
     { 
        eno=no;
        ename=name;
        sal=sa;
     }
    void display()
     {
       System.out.println("Eno:\t"+eno);
       System.out.println("Ename:\t"+ename);
       System.out.println("Sal:\t"+sal);
     }
}
class EmpDemo
{
    public static void main(String args[])
    {
        Emp e1=new Emp();
    e1.setEmp(1,"Raksha",2000.00f);
        e1.display();
    }
}