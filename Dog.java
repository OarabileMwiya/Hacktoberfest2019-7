
public class Dog{
String name;
int age;
boolean Dead=false;
public Dog (int a,String n){
age=a;
name=n;

}

public Dog(){
age=0;
name="";

}

public void setName(String n){
name=n;
}public void setAge(int a){
age=a;
}

public String getName(){
return name;}

public int getAge(){
return age;
}
public int inHumanAge(){
return age*7;}

public String toString(){
String d="your dog's name is "+getName()+",it is "+getAge()+" years old, which is "+inHumanAge()+" years in human age";
return d;}

public void Kill(){
Dead =true;
}
public boolean isDead(){
  if(Dead)
      return true;
  else 
    return false;

}
}