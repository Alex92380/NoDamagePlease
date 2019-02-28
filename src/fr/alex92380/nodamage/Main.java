package fr.alex92380.nodamage;

import org.bukkit.plugin.java.JavaPlugin;

import fr.alex92380.nodamage.event.NODamageListener;

public class Main extends JavaPlugin{

	@Override
public void onEnable() {
	
		saveDefaultConfig();
		getServer().getPluginManager().registerEvents(new NODamageListener(this), this);
	  
	
}
	
}	
