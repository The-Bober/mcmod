package romanianfood.romanian_food.Utils;

import net.minecraft.item.Item;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import romanianfood.romanian_food.RomanianFood;

public class ModItems {
    public static Item register(Item item, String id){
        Identifier ItemID = Identifier.of(RomanianFood.MOD_ID, id);
        return Registry.register(Registries.ITEM, ItemID, item);
    }
    public static final Item MAMALIGA = register(new Item(new Item.Settings()), "mamaliga");
    public static void initialize(){}
}
