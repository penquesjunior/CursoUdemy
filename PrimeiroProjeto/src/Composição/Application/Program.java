package Composição.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Composição.Entities.Departmant;
import Composição.Entities.HourContract;
import Composição.Entities.Worker;
import Composição.Entities.EntitiesEnums.WorkerLevel;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter Department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter Worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();

        // aqui to passando nome do trabalhador, o nivel do trabalhador, salario base e
        // instanciando um departamento
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
                new Departmant(departmentName));

        System.out.print("How many crontracts to this worker ?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Contract #" + i + " data");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            // passa os parametros do obj
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            // adiciona o contrato a lista do funcionario
            worker.addContract(contract);
        }

        System.out.print("\nEntre month and year to calculete income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartmant().getName());
        System.out.println("Income for: " + monthAndYear + ": " + 
        String.format("%.2f",worker.income(year, month)));

        sc.close();
    }
}
