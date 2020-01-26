package edu.alenasoft.gildedrose;


public class ItemFactory {
 
    public  ItemInterface getItem(String name  ){

      if (name.equalsIgnoreCase("Aged Brie")) {
         return   new AgedBrieItem();
      }        
      else if (name.equalsIgnoreCase("Sulfuras, Hand of Ragnaros")){
          return  new SulfurasItem();
      }
      else if (name.equalsIgnoreCase("Elixir of the Mongoose")){
          return new ElixirItem();
      }
      else if (name.equalsIgnoreCase("Conjured Mana Cake")){
           return new ConjuredItem();
      }
      else if (name.equalsIgnoreCase("Backstage passes to a TAFKAL80ETC concert")){
           return new BackstageItem();
      }
      else if (name.equalsIgnoreCase("+5 Dexterity Vest")){
           return new DextriItem();
      }
      else {  return null;}
  }   
}
