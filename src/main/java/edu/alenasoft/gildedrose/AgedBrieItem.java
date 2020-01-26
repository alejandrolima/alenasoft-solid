package edu.alenasoft.gildedrose;

import static edu.alenasoft.gildedrose.GildedRose.items;

public class AgedBrieItem  implements ItemInterface{
    
    @Override
    public void UpdateQuality(Item item) {
        if (item.getQuality() < 50) {
          item.setQuality(item.getQuality() + 1);
        }
        
        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0) {
            if (item.getQuality() < 50) {
                item.setQuality(item.getQuality() + 1);
            }
        }
    }	
}   