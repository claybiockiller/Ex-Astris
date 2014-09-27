package ExAstris.Data;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.ModMetadata;

public class ModData {
	public static final String ID = "exastris";
	public static final String NAME = "Ex Astris";
	public static final String VERSION = "For 1.7.10";
    public static final String DEPENDENCIES = "required-after:Forge@[10.13.0.1180,);required-after:exnihilo;after:ThermalExpansion;after:Thaumcraft;after:TConstruct;after:TSteelworks;after:RedstoneArsenal;";
    
    public static void setMetadata(ModMetadata data)
	{
		data.autogenerated = false;		
		data.url = "http://mc.loveholy.kr";
		data.credits = "...";
		//data.authorList.add("LoveHoly");
		data.description = "Ex Nihilo Addon, Thaumcraft, ThermalExpansion, etc..";
		data.logoFile = "";
		data.updateUrl = "";
		data.parent = "";
	}
    
    public static final String TEXTURE_LOCATION = ID;
    
    public static String CATEGORY_OPTIONS = "options";
    
    //BLOCKS
    public static String ALLOW_BARREL_THAUMIUM_KEY = "barrel thaumium allowed";
	public static boolean ALLOW_BARREL_THAUMIUM = true;
	
	public static String ALLOW_BEE_TRAP_INFUSED_KEY = "infused atificial hive allowed";
	public static boolean ALLOW_BEE_TRAP_INFUSED = true;

	public static String ALLOW_ENDCAKE_KEY = "infused atificial hive allowed";
	public static boolean ALLOW_ENDCAKE = true;
	
	public static String ALLOW_SIEVE_AUTOMATIC_KEY = "automatic sieve allowed";
	public static boolean ALLOW_SIEVE_AUTOMATIC = true;
	
	//ITEMS
	public static String ALLOW_DOLL_FREEZING_KEY = "freezing doll allowed";
	public static boolean ALLOW_DOLL_FREEZING = true;
	
	public static String ALLOW_DOLL_THAUMIC_KEY = "thaumic doll allowed";
	public static boolean ALLOW_DOLL_THAUMIC = true;

	public static String ALLOW_HAMMER_RF_KEY = "flux-infused hammer allowed";
	public static boolean ALLOW_HAMMER_RF = true;

	public static String ALLOW_HAMMER_THAUMIUM_KEY = "thaumium hammer allowed";
	public static boolean ALLOW_HAMMER_THAUMIUM = true;
	
	public static String ALLOW_UNCHARGED_NETHERSTAR_KEY = "uncharged nether star allowed";
	public static boolean ALLOW_UNCHARGED_NETHERSTAR = true;
	
	//BRIDGES
	public static String ALLOW_MFR_COMPOST_KEY = "Compost MineFactory Reloaded leaves and rubber sapling allowed";
	public static boolean ALLOW_MFR_COMPOST = true;
	
	public static String ALLOW_ADD_TCONSTRUCT_NETHERORE_KEY = "Add NetherOre Cobalt and Ardite recipe allowed";
	public static boolean ALLOW_ADD_TCONSTRUCT_NETHERORE = true;
	
	public static String ALLOW_TCONSTRUCT_HEAT_REGISTRY_KEY = "heat registry stone torch allowed";
	public static boolean ALLOW_TCONSTRUCT_HEAT_REGISTRY = true;
	
	//THAUMCRAFT RESEARCH
	public static String ALLOW_THAUMCRAFT_RESEARCH_KEY = "thaumcraft research allowed";
	public static boolean ALLOW_THAUMCRAFT_RESEARCH = true;
	
	public static String ALLOW_THAUMCRAFT_HEAT_REGISTRY_KEY = "heat registry thaumcraft candle and nitor allowed";
	public static boolean ALLOW_THAUMCRAFT_HEAT_REGISTRY = true;
	
	//Thermal Expansion
	public static String ALLOW_THERMAL_EXPANSION_HEAT_REGISTRY_KEY = "heat registry pyro and cry allowed";
	public static boolean ALLOW_THERMAL_EXPANSION_HEAT_REGISTRY = true;

	public static String ALLOW_THERMAL_EXPANSION_HIVE_REGISTRY_KEY = "hive registry thermalexpansion allowed";
	public static boolean ALLOW_THERMAL_EXPANSION_HIVE_REGISTRY = true;
	
	public static String ALLOW_TSTEELWORKS_MELTING_KEY = "Tsteelworks melting allowed";
	public static boolean ALLOW_TSTEELWORKS_MELTING = true;
	
	public static String ALLOW_TCONSTRUCT_MODIFIERS_KEY = "Tconstruct modifiers allowed";
	public static boolean ALLOW_TCONSTRUCT_MODIFIERS = true;
	
	public static String ALLOW_STRONGLY_COMPRESSED_STONE_KEY = "Rotary Strongly Compressed Stone allowed";
	public static boolean ALLOW_STRONGLY_COMPRESSED_STONE = true;
	
	public static String[] oreType = { "Gravel","Sand","Dust" };
	
	public static void load(Configuration config)
	{
		ALLOW_BARREL_THAUMIUM  = config.get(CATEGORY_OPTIONS, ALLOW_BARREL_THAUMIUM_KEY, ALLOW_BARREL_THAUMIUM).getBoolean(ALLOW_BARREL_THAUMIUM);
		ALLOW_BEE_TRAP_INFUSED  = config.get(CATEGORY_OPTIONS, ALLOW_BEE_TRAP_INFUSED_KEY, ALLOW_BEE_TRAP_INFUSED).getBoolean(ALLOW_BEE_TRAP_INFUSED);
		ALLOW_ENDCAKE  = config.get(CATEGORY_OPTIONS, ALLOW_ENDCAKE_KEY, ALLOW_ENDCAKE).getBoolean(ALLOW_ENDCAKE);
		ALLOW_SIEVE_AUTOMATIC  = config.get(CATEGORY_OPTIONS, ALLOW_SIEVE_AUTOMATIC_KEY, ALLOW_SIEVE_AUTOMATIC).getBoolean(ALLOW_SIEVE_AUTOMATIC);
		ALLOW_DOLL_FREEZING  = config.get(CATEGORY_OPTIONS, ALLOW_DOLL_FREEZING_KEY, ALLOW_DOLL_FREEZING).getBoolean(ALLOW_DOLL_FREEZING);
		ALLOW_DOLL_THAUMIC  = config.get(CATEGORY_OPTIONS, ALLOW_DOLL_THAUMIC_KEY, ALLOW_DOLL_THAUMIC).getBoolean(ALLOW_DOLL_THAUMIC);
		ALLOW_HAMMER_RF  = config.get(CATEGORY_OPTIONS, ALLOW_HAMMER_RF_KEY, ALLOW_HAMMER_RF).getBoolean(ALLOW_HAMMER_RF);
		ALLOW_HAMMER_THAUMIUM  = config.get(CATEGORY_OPTIONS, ALLOW_HAMMER_THAUMIUM_KEY, ALLOW_HAMMER_THAUMIUM).getBoolean(ALLOW_HAMMER_THAUMIUM);
		ALLOW_UNCHARGED_NETHERSTAR  = config.get(CATEGORY_OPTIONS, ALLOW_UNCHARGED_NETHERSTAR_KEY, ALLOW_UNCHARGED_NETHERSTAR).getBoolean(ALLOW_UNCHARGED_NETHERSTAR);
		ALLOW_MFR_COMPOST  = config.get(CATEGORY_OPTIONS, ALLOW_MFR_COMPOST_KEY, ALLOW_MFR_COMPOST).getBoolean(ALLOW_MFR_COMPOST);
		ALLOW_ADD_TCONSTRUCT_NETHERORE  = config.get(CATEGORY_OPTIONS, ALLOW_ADD_TCONSTRUCT_NETHERORE_KEY, ALLOW_ADD_TCONSTRUCT_NETHERORE).getBoolean(ALLOW_ADD_TCONSTRUCT_NETHERORE);
		ALLOW_TCONSTRUCT_HEAT_REGISTRY  = config.get(CATEGORY_OPTIONS, ALLOW_TCONSTRUCT_HEAT_REGISTRY_KEY, ALLOW_TCONSTRUCT_HEAT_REGISTRY).getBoolean(ALLOW_TCONSTRUCT_HEAT_REGISTRY);
		ALLOW_THAUMCRAFT_RESEARCH  = config.get(CATEGORY_OPTIONS, ALLOW_THAUMCRAFT_RESEARCH_KEY, ALLOW_THAUMCRAFT_RESEARCH).getBoolean(ALLOW_THAUMCRAFT_RESEARCH);
		ALLOW_THAUMCRAFT_HEAT_REGISTRY  = config.get(CATEGORY_OPTIONS, ALLOW_THAUMCRAFT_HEAT_REGISTRY_KEY, ALLOW_THAUMCRAFT_HEAT_REGISTRY).getBoolean(ALLOW_THAUMCRAFT_HEAT_REGISTRY);
		ALLOW_THERMAL_EXPANSION_HEAT_REGISTRY  = config.get(CATEGORY_OPTIONS, ALLOW_THERMAL_EXPANSION_HEAT_REGISTRY_KEY, ALLOW_THERMAL_EXPANSION_HEAT_REGISTRY).getBoolean(ALLOW_THERMAL_EXPANSION_HEAT_REGISTRY);
		ALLOW_THERMAL_EXPANSION_HIVE_REGISTRY  = config.get(CATEGORY_OPTIONS, ALLOW_THERMAL_EXPANSION_HIVE_REGISTRY_KEY, ALLOW_THERMAL_EXPANSION_HIVE_REGISTRY).getBoolean(ALLOW_THERMAL_EXPANSION_HIVE_REGISTRY);
		ALLOW_TSTEELWORKS_MELTING  = config.get(CATEGORY_OPTIONS, ALLOW_TSTEELWORKS_MELTING_KEY, ALLOW_TSTEELWORKS_MELTING).getBoolean(ALLOW_TSTEELWORKS_MELTING);
		ALLOW_TCONSTRUCT_MODIFIERS  = config.get(CATEGORY_OPTIONS, ALLOW_TCONSTRUCT_MODIFIERS_KEY, ALLOW_TCONSTRUCT_MODIFIERS).getBoolean(ALLOW_TCONSTRUCT_MODIFIERS);
		ALLOW_STRONGLY_COMPRESSED_STONE  = config.get(CATEGORY_OPTIONS, ALLOW_STRONGLY_COMPRESSED_STONE_KEY, ALLOW_STRONGLY_COMPRESSED_STONE).getBoolean(ALLOW_STRONGLY_COMPRESSED_STONE);
	}
	
}
