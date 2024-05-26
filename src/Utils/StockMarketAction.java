package Utils;

import Interfaces.Covar;

public class StockMarketAction {
    String name;
    double profit;
    double var;

    Covar[] covars;

    public StockMarketAction(){
        name = "";
        profit = 0;
        var = 0;
        covars = new Covar [0];
    }
    @Override
    public String toString(){

        return "Action: " + this.name + " Variance: " + this.var + " Profit: " + this.profit;
    }
}
