
package javaapplication32;
    class ParentClass {
    protected String protectedProperty = "This is a protected property";
    String defaultProperty = "This is a default property";
}
class ChildClass extends ParentClass 
{
    public void accessProperties() 
    {
        System.out.println(protectedProperty);
        System.out.println(defaultProperty);
        
    }
}
public class JavaApplication32  {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.accessProperties();
    }
}



   
   
