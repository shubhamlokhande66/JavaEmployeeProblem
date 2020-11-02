class Emppresence {
public static void main(String args[]) {
int presence=(int)Math.floor(Math.random()*10)%2;
if(presence==0){
System.out.println("Employee is absent");
}
if(presence==1){
System.out.println("Employee is present");
}
}
}
