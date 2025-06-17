
class ConstructorExamples{
   
   
   int id;
   String name;
   //Explicit default constructor
   ConstructorExamples(){
      System.out.println("Default constructor called..");
   }
   //Parameterized constructor
   ConstructorExamples(int userId,String userName){

      //By default super() called because this is the subclass of Object class.
      this.id = userId;
      this.name = userName;

   }
   //Print the values
   public void printUserData(){
      System.out.println("User id : "+this.id+", User name : "+this.name);
   }

} 

class ConstructorMain{
   public static void main(String[]args){
      ConstructorExamples cobj = new ConstructorExamples();// we created the object and allocated the memory but the value assinged the default of the given type.
      ConstructorExamples cobj2 = new ConstructorExamples(1,"Nagaraj S"); //We initialized the value while creating the object

      //user data of cobj
      cobj.printUserData(); //0 and null because we didn't initialize the value;
      cobj.id = 2;
      cobj.name = "Jhon wick";
      cobj.printUserData(); //2 and Jhon wick

      //User data of cobj2
      cobj2.printUserData();
   }
}