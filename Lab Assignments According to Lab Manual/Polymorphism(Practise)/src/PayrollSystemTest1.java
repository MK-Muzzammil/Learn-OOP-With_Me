public class PayrollSystemTest1
{
    public static void main( String[] args )
    {
        SalariedEmployee salariedEmployee = new SalariedEmployee ("John",
                "Smith", "111-11-1111", 800.00 );
        HourlyEmployee hourlyEmployee= new HourlyEmployee( "Karen", "Price",
                "222-22-2222", 16.75, 40 );
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Sue", "Jones", "333-33-3333", 2, .02 );
        BasePlusCommissionEmployee basePlusCommissionEmployee = new
                BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04,
                300 );
        Employee[] employees = new Employee[ 4 ];
// initialize array with Employees
        employees[ 0 ] = salariedEmployee;

        employees[ 1 ] = hourlyEmployee;
        employees[ 2 ] = commissionEmployee;
        employees[ 3 ] = basePlusCommissionEmployee;
        for (int i=0; i<4 ;i++)
        {
            //instance of is used to check weither the instance at index 3 is instance of BasePlusComissionEmploeye  or not
            if (employees [i] instanceof CommissionEmployee)
            {
                System.out.println(i);
                BasePlusCommissionEmployee emp= (BasePlusCommissionEmployee )
                        employees[i];
                emp.setBaseSalary( 1.10 * emp.getBaseSalary() );
                System.out.println("New base salary with 10 percent increase is " +
                        emp.getBaseSalary() );
                employees[i]=emp;
            }
            System.out.println("Earning is " + employees[i].earnings());
        } //end for
    }
}
