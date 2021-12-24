public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double taxBonusSalary;
    double finalSumary;


     Employee(String name,double salary,int workHours,int hireYear){

        this.name = name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        this.taxBonusSalary= salary;

    }

    double tax(){
        if(this.salary<1000){

            finalSumary=this.salary;
           return 0;
        }
        else {
            finalSumary = this.salary-this.salary*0.03;
           taxBonusSalary =taxBonusSalary-this.salary*0.03;
            return this.salary*0.03;
        }
    }
    double bonus(){
        int extra = this.workHours-40;
        if(extra>0){
            finalSumary = this.salary+extra*30;
            taxBonusSalary=taxBonusSalary+extra*30;
            return extra*30;
        }
        else {
            return extra*0;
        }
    }
    double raiseSalary(){
         int workYear= 2021-this.hireYear;
         if(workYear<10){
             finalSumary = this.salary+this.salary*0.05;
             return this.salary*0.05;
         }
         if(workYear>9 && workYear<20) {
             finalSumary = this.salary + this.salary * 0.1;
             return this.salary * 0.1;
         }
         else {

             finalSumary = this.salary +this.salary*0.15;
             return this.salary*0.15;
         }
    }
    @Override
    public String toString(){

        return "Adı: "+this.name +"\n"+"Maaşı: "+this.salary+"\n"+"Çalışma Saati: "+this.workHours+"\n"+"Başlangıç Yılı: "+this.hireYear+"\n"
                +"Vergi: "+tax()+"\nBonus: "+bonus()+"\nMaaş Artışı: "+raiseSalary()+"\nVergi ve Bonuslar ile birlikte maaş: "+taxBonusSalary+"\nToplam Maaş: "+finalSumary;

    }

}
