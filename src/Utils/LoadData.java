package Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LoadData {

    String routeStockMarketActions;
    String routeCovars;
    ArrayList<StockMarketAction> data = new ArrayList<>();
    public LoadData(String routeStockMarketActions, String routeCovars) {
        this.routeStockMarketActions = routeStockMarketActions;
        this.routeCovars = routeCovars;

        this.loadStockMarketActions();
    }

    public void loadStockMarketActions() {
        try (FileReader fr = new FileReader(this.routeStockMarketActions)) {
            BufferedReader br = new BufferedReader(fr);

            String linea;

            while((linea=br.readLine())!=null){

                StockMarketAction dataObj = new StockMarketAction();

                dataObj.name = linea.split(" ")[0];
                dataObj.var = Double.parseDouble(linea.split(" ")[1]);
                dataObj.profit = Double.parseDouble(linea.split(" ")[2]);

                this.data.add(dataObj);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<StockMarketAction> getData (){
        return  this.data;
    }

}
