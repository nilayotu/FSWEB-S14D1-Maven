package com.workintech.developers;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;

    private MidDeveloper[] midDevelopers;

    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary,
                     JuniorDeveloper[] juniorDevelopers,
                     MidDeveloper[] midDevelopers,
                     SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper){

    }

    public void addEmployee(int index, MidDeveloper midDeveloper){

    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper){

    }

    @Override
    public void work() {
        System.out.println(getName() + " HR Manager starts to working...");
    }
}
