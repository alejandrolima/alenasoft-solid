package edu.alenasoft.gildedrose;

public class SulfurasItem  implements ItemInterface{

    @Override
    public void UpdateQuality(Item item) {
        
        if (item.getSellIn() < 0) {
            if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
          }    
        }        
    }
	
}