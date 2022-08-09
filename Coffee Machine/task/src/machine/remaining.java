package machine;

import static machine.CoffeeMachine.*;

public class remaining {
    int remainingwater = wateravailable;
    int remainingmilk = milkavailable;
    int remainingbeans = beansavailable;
    int remainingcups = cupsavailable;
    int remainingmoney = costavailable;

    public remaining(int remainingwater, int remainingbeans, int remainingcups, int remainingmilk, int remainingmoney){
        this.remainingbeans=remainingbeans;
        this.remainingwater=remainingwater;
        this.remainingcups=remainingcups;
        this.remainingmoney=remainingmoney;
        this.remainingmilk=remainingmilk;

    }

    public int getRemainingbeans() {
        return remainingbeans;
    }
    public int getRemainingwater(){
        return remainingwater;
    }
    public int getRemainingcups(){
        return remainingcups;
    }
    public int getRemainingmoney(){
        return remainingmoney;
    }
    public int getRemainingmilk(){
        return remainingmilk;
    }

    public void setRemainingbeans(int remainingbeans) {
        this.remainingbeans = remainingbeans;
    }

    public void setRemainingcups(int remainingcups) {
        this.remainingcups = remainingcups;
    }

    public void setRemainingmilk(int remainingmilk) {
        this.remainingmilk = remainingmilk;
    }

    public void setRemainingmoney(int remainingmoney) {
        this.remainingmoney = remainingmoney;
    }

    public void setRemainingwater(int remainingwater) {
        this.remainingwater = remainingwater;
    }

}
