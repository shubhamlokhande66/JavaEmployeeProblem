class Empwagebuilder{

private int wages,workingdays,workinghrsperday,part_timeworkinghrsperday;

Empwagebuilder(int wages,int workingdays,int workinghrsperday,int part_timeworkinghrsperday) {
this.wages=wages;
this.workingdays=workingdays;
this.workinghrsperday=workinghrsperday;
this.part_timeworkinghrsperday=part_timeworkinghrsperday;
}
public void ArrayforCompany1(int wages, int workingdays, int workinghrsperday, int part_timeworkinghrsperday) {
int a[]=new int[4];

a[0]=wages;
a[1]=workingdays;
a[2]=workinghrsperday;
a[3]=part_timeworkinghrsperday;
System.out.println("WAGES,WORKINGDAYS, WORKINGHRSPERDAY, PART-TIMEWORKINGHRSPERDAY FOR COMPANY1 ARE AS FOLLOWS:");
for(int i=0;i<=3;i++){
System.out.println(a[i]+" ");
}

}
public void ArrayforCompany2(int wages, int workingdays, int workinghrsperday, int part_timeworkinghrsperday){
int a[]=new int[4];

a[0]=wages;
a[1]=workingdays;
a[2]=workinghrsperday;
a[3]=part_timeworkinghrsperday;
System.out.println("WAGES,WORKINGDAYS, WORKINGHRSPERDAY, PART-TIMEWORKINGHRSPERDAY FOR COMPANY1 ARE AS FOLLOWS:");


for(int i=0;i<=3;i++){
System.out.println(a[i]+" ");
}


}

public void ArrayforCompany3(int wages, int workingdays, int workinghrsperday, int part_timeworkinghrsperday){
int a[]=new int[4];

a[0]=wages;
a[1]=workingdays;
a[2]=workinghrsperday;
a[3]=part_timeworkinghrsperday;
System.out.println("WAGES,WORKINGDAYS, WORKINGHRSPERDAY, PART-TIMEWORKINGHRSPERDAY FOR COMPANY1 ARE AS FOLLOWS:");

for(int i=0;i<=3;i++){
System.out.println(a[i]+" ");
}


}





public void wagecalculation(){
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

class Empwageusingarray {
public static void main(String args[]) {
Empwagebuilder company1 = new Empwagebuilder(50,20,8,4);
company1.wagecalculation();
company1.ArrayforCompany1(50,20,8,4);
Empwagebuilder company2 = new Empwagebuilder(40,20,7,6);
company2.wagecalculation();
company2.ArrayforCompany2(40,20,7,6);
Empwagebuilder company3= new Empwagebuilder(30,22,6,3);
company3.wagecalculation();
company3.ArrayforCompany3(30,22,6,3);

}
}
