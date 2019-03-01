package fr.alex92380.nodamage.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import fr.alex92380.nodamage.Main;

public class NODamageListener implements Listener {
	private Main main;

	
	  public NODamageListener(Main main) { this.main = main; }
	 
	@EventHandler
	public void onDamage(EntityDamageEvent event) {
		
	
			event.setCancelled(main.getConfig().getBoolean("Damage."+ event.getCause()));
		

		}
	}

