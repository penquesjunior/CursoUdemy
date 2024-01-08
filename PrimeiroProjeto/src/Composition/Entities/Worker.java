package Composition.Entities;

import java.util.ArrayList;
import java.util.List;

import Composition.Entities.EntitiesEnums.WorkerLevel;

import java.util.Calendar;


public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    // um trabalhador tem apenas 1 departamento mais pode ter varios contratos
    private Departmant departmant;
    private List<HourContract> contracts = new ArrayList<>();
    // ja vou declarar a lista antes pois quando tem muitos nao inclui no construtor

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departmant departmant) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departmant = departmant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departmant getDepartmant() {
        return departmant;
    }

    public void setDepartmant(Departmant departmant) {
        this.departmant = departmant;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    // os dois metodos fazendo a associação entre contrato de empregado adicionando
    // e removendo.
    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month){
        //CALENDARIO NAO PRECISA DO NEW JA VEM INSTANCIADO
        Calendar cal = Calendar.getInstance();
        double sum = baseSalary;
        for(HourContract c : contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH); // foi adicionado mais 1 porq o mes do calendar começa com 0
            if(year == c_year && month == c_month){
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
