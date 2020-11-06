public class Empwagebuilder {
public static void main(String args[]) {

EmpWageBuilder1 ob = new EmpWageBuilder1(50,20,8,4);
ob.EmpWageBuilder1();

EmpWageBuilder2 ob2 =new EmpWageBuilder2(40,22,7,3);
ob2.EmpWageBuilder2();
EmpWageBuilder3 ob3 =new  EmpWageBuilder3(70,25,9,5);
ob3.EmpWageBuilder3();
}
}
class EmpWageBuilder1 {
int wages,workingdays,workinghrsperday,part_timeworkinghrsperday;
EmpWageBuilder1(int wages,int workingdays,int workinghrsperday,int part_timeworkinghrsperday) {
this.wages=wages;
this.workingdays=workingdays;
this.workinghrsperday=workinghrsperday;
this.part_timeworkinghrsperday=part_timeworkinghrsperday;
}

public void EmpWageBuilder1() {
int presence=(int)Math.floor(Math.random()*10)%3;
int Empsalary=wages*workingdays*workinghrsperday;
int Part_timesalary=wages*workingdays*part_timeworkinghrsperday;

switch (presence) {
case 0:
System.out.println("Company1 Employee is absent");
break;
case 1:
System.out.println("Company1 Employee is present");
System.out.println("Wages:" +Empsalary);
break;
case 2:
System.out.println("Company1 part_time worker is present ");
System.out.println("Wages:" +Part_timesalary);
break;

}
}
}
class EmpWageBuilder2 {
int wages,workingdays,workinghrsperday,part_timeworkinghrsperday;
EmpWageBuilder2(int wages,int workingdays,int workinghrsperday,int part_timeworkinghrsperday){
this.wages=wages;
this.workingdays=workingdays;
this.workinghrsperday=workinghrsperday;
this.part_timeworkinghrsperday=part_timeworkinghrsperday;
}

public void EmpWageBuilder2(){

int presence=(int)Math.floor(Math.random()*10)%3;
int Empsalary=wages*workingdays*workinghrsperday;
int Part_timesalary=wages*workingdays*part_timeworkinghrsperday;

switch (presence) {
case 0:
System.out.println("Company2 Employee is absent");
break;
case 1:
System.out.println("Company2 Employee is present");
System.out.println("Wages:" +Empsalary);
break;
case 2:
System.out.println("Company2 part_time worker is present");
System.out.println("Wages:" +Part_timesalary);
break;

}
}

}
class EmpWageBuilder3 {
int wages,workingdays,workinghrsperday,part_timeworkinghrsperday;
EmpWageBuilder3(int wages,int workingdays,int workinghrsperday,int part_timeworkinghrsperday){
this.wages=wages;
this.workingdays=workingdays;
this.workinghrsperday=workinghrsperday;
this.part_timeworkinghrsperday=part_timeworkinghrsperday;

}
public  void EmpWageBuilder3(){
int presence=(int)Math.floor(Math.random()*10)%3;
int Empsalary=wages*workingdays*workinghrsperday;
int Part_timesalary=wages*workingdays*part_timeworkinghrsperday;

switch (presence) {
case 0:
System.out.println("company3 Employee is absent");
break;
case 1:
System.out.println("Company3 Employee is present");
System.out.println("Wages:" +Empsalary);
break;
case 2:
System.out.println("Company3 part_time worker is present");
System.out.println("Wages:" +Part_timesalary);
break;

}
}



}

