package edu.alenasoft.gildedrose;

public class DextriItem  implements ItemInterface{

    @Override
    public void UpdateQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
          }
         item.setSellIn(item.getSellIn() - 1);
         
         if (item.getSellIn() < 0) {
             if (item.getQuality() > 0){
             item.setQuality(item.getQuality() - 1); }
          } 
    }    
}