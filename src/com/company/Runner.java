package com.company;

public class Runner extends Thread {
    private int number1 = 1;
    private int number2 = 1;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    @Override
    public void run() {
        System.out.println(getName() + " берет палочку ");
        if (getNumber1()-1==5){
            System.out.println("Runner 5 бежит к финишу");
            System.out.println(getName() + " бежит к Runner 4");
        }else if (getNumber1()==1){
            System.out.println(getName() + " бежит к Runner " + getNumber1());
            System.out.println("Runner "+ getNumber1() + " берет палочку");
        }else {
            System.out.println(getName() + " бежит к Runner " + getNumber1());
        }
        try {
            sleep(5000);
        }catch (InterruptedException e){

        }
    }
}
