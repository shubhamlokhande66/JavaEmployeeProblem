import java.util.*;
public class MultipleCompaniesarraylist {

public static void main(String args[]){

Companybuilder company1= new Companybuilder("Company1",40,8,20);

Companybuilder company2= new Companybuilder("Company2",50,7,22);
Companybuilder company3= new  Companybuilder("Company3",60,8,20);
ArrayList<Companybuilder> al = new ArrayList<Companybuilder>();
al.add(company1);
al.add(company2);
al.add(company3);
Iterator itr =al.iterator();
while(itr.hasNext()) {

Companybuilder cb=(Companybuilder)itr.next();
System.out.println("DAILY WAGE FOR "+ cb.companyname+":"+cb.wage);
System.out.println(" Total Wages for "+ cb.companyname+" Employee "+cb.wagecalculation());
}
}
}


class Companybuilder {
int wage, workinghrsperday, workingdays;
String companyname;
int totalwage;
Companybuilder(String companyname,int wage, int workinghrsperday, int workingdays) {
this.companyname=companyname;
this.wage=wage;
this.workinghrsperday=workinghrsperday;
this.workingdays=workingdays;

}
public int wagecalculation() {
totalwage=wage*workinghrsperday*workingdays;
return totalwage;

}

}
