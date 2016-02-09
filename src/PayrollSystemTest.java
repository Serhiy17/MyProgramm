package src;

public class PayrollSystemTest {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new
                SalariedEmployee("John","Smith","111-11-1111",06,15,1975,800.00);
        HourlyEmployee hourlyEmployee = new
                HourlyEmployee("Karen", "Price", "222-22-2222",11,11,1960, 16.75, 40);
        CommissionEmployee commissionEmployee = new
                CommissionEmployee("Sue", "Jones", "333-33-3333",02,28,1983, 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new
                BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444",9,12,1971, 5000, .04, 300);
        PieceWorker pieceWorker = new
                PieceWorker("Darya","Saliy", "555-55-5555", 04,01,1994, 5, 200);

        System.out.println("Employees processed individually: \n");
        System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee,
                "earner", salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee,
                "earner", hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee,
                "earner", commissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee,
                "earner", basePlusCommissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", pieceWorker,
                "earner", pieceWorker.earnings());

        Employee1 [] employees = new Employee1[5];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = pieceWorker;

        for (Employee1 currentEmployee1 : employees){

            System.out.println(currentEmployee1);

            if (currentEmployee1 instanceof BasePlusCommissionEmployee){

                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee)currentEmployee1;
                employee.setBaseSalary(1.10*employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%,.2f\n",
                        employee.getBaseSalary());
            }

            System.out.printf("earned $%,.2f\n\n",
                    currentEmployee1.earnings());

        }

        System.out.print("          Employee          ");

        for (int i = 1; i <= 12; i++){
            System.out.printf("%10d", i);
        }
        System.out.println();

        for( int j = 0; j < employees.length; j++){
            System.out.printf("%-30s",
                    employees[j].getClass().getName());

            for(int i = 1; i <= 12; i++){
                if(employees[j].getDate() == i){
                    System.out.printf("%10s",
                            employees[j].earnings()+100);
                }
                else
                System.out.printf("%10s",
                        employees[j].earnings());
            }

            System.out.println();

        }
    }
}
