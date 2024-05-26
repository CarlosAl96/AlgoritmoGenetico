import Utils.LoadData;
import Utils.StockMarketAction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        LoadData read = new LoadData("src/Data/stock-market-actions.txt", "src/Data/covars.txt");

        ArrayList<StockMarketAction> data = read.getData();

        for(StockMarketAction dataObj: data) {
            System.out.println(dataObj.toString());
        }
    }
}