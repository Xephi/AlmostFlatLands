package uk.co.jacekk.bukkit.almostflatlands;

import java.util.Arrays;

import org.bukkit.TreeType;
import org.bukkit.block.Biome;

import uk.co.jacekk.bukkit.baseplugin.config.PluginConfigKey;

public class Config {
	
	public static final PluginConfigKey PREVENT_SPAWNING		= new PluginConfigKey("prevent-spawning", true);
	public static final PluginConfigKey SET_WORLD_TYPE			= new PluginConfigKey("set-world-type", true);
	
	public static final PluginConfigKey WORLD_HEIGHT			= new PluginConfigKey("world-height", 32);
	public static final PluginConfigKey WORLD_BIOME				= new PluginConfigKey("world-biome", Biome.PLAINS.name());
	public static final PluginConfigKey WORLD_GRASS_CHANCE		= new PluginConfigKey("world-grass-chance", 14);
	public static final PluginConfigKey WORLD_FLOWER_CHANCE		= new PluginConfigKey("world-flower-chance", 1);
	public static final PluginConfigKey WORLD_TREE_CHANCE		= new PluginConfigKey("world-tree-chance", 15);
	public static final PluginConfigKey WORLD_TREE_TYPES		= new PluginConfigKey("world-tree-types", Arrays.asList(TreeType.TREE.name(), TreeType.BIRCH.name(), TreeType.BIG_TREE.name()));
	public static final PluginConfigKey WORLD_CREATE_ORE		= new PluginConfigKey("world-create-ore", true);
	public static final PluginConfigKey WORLD_ORES_GRAVEL		= new PluginConfigKey("world-ores.gravel", true);
	public static final PluginConfigKey WORLD_ORES_COAL_ORE		= new PluginConfigKey("world-ores.gold-ore", true);
	public static final PluginConfigKey WORLD_ORES_IRON_ORE		= new PluginConfigKey("world-ores.iron-ore", true);
	public static final PluginConfigKey WORLD_ORES_GOLD_ORE		= new PluginConfigKey("world-ores.gold-ore", true);
	public static final PluginConfigKey WORLD_ORES_REDSTONE_ORE	= new PluginConfigKey("world-ores.redstone-ore", true);
	public static final PluginConfigKey WORLD_ORES_DIAMOND_ORE	= new PluginConfigKey("world-ores.diamond-ore", true);
	public static final PluginConfigKey WORLD_ORES_LAPIS_ORE	= new PluginConfigKey("world-ores.lapis-ore", true);
	
}
