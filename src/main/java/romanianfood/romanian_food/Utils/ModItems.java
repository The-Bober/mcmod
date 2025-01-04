package romanianfood.romanian_food.Utils;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import romanianfood.romanian_food.RomanianFood;

import java.util.function.Function;

public class ModItems {

    public static final Item MAMALIGA = ModItems.RegisterItem("mamaliga", Item::new, new Item.Settings());

    public static Item RegisterItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings){
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM,Identifier.of(RomanianFood.MOD_ID,name));
        return Items.register(registryKey, factory, settings);
    }
    private static void customItems(FabricItemGroupEntries entries){
        entries.add(MAMALIGA);
    }
    public static void initialize(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::customItems);
    }
}
