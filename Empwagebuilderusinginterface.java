interface Companyempwage {
public void wagecalculation();
}

class Empwagebuilder implements Companyempwage {
private int wages,workingdays,workinghrsperday,part_timeworkinghrsperday;
private String company_name;
Empwagebuilder(int wages,int workingdays,int workinghrsperday,int part_timeworkinghrsperday, String company_name) {
this.wages=wages;
this.workingdays=workingdays;
this.workinghrsperday=workinghrsperday;
this.part_timeworkinghrsperday=part_timeworkinghrsperday;
this.company_name=company_name;
}


public void wagecalculation(){
int presence=(int)Math.floor(Math.random()*10)%3;
int Empsalary=wages*workingdays*workinghrsperday;
int Part_timesalary=wages*workingdays*part_timeworkinghrsperday;

switch (presence) {
case 0:
System.out.println("Company Employee is absent");
break;
case 1:
System.out.println("Company Employee is present");
System.out.println("Wages:" +Empsalary);
break;
case 2:
System.out.println("Company part_time worker is present ");
System.out.println("Wages:" +Part_timesalary);
break;



}
}
}

public class Empwagebuilderusinginterface {
public static void main(String args[]) {
Empwagebuilder company1 = new Empwagebuilder(50,20,8,4,"company1");
System.out.println("EMPLOYEE WAGE FOR COMPANY1");
company1.wagecalculation();
Empwagebuilder company2 = new Empwagebuilder(40,20,7,6,"company2");
System.out.println("EMPLOYEE WAGE FOR COMPANY2");

company2.wagecalculation();
Empwagebuilder company3= new Empwagebuilder(30,22,6,3,"company3");
System.out.println("EMPLOYEE WAGE FOR COMPANY3");

company3.wagecalculation();


}
}
