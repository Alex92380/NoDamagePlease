package fr.alex92380.nodamage.event;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import fr.alex92380.nodamage.Main;

public class NODamageListener implements Listener {
	private Main main;

	
	  public NODamageListener(Main main) { this.main = main; }
	 
	@EventHandler
	public void onDamage(EntityDamageEvent event) {
		
		switch (event.getCause()) {
		case BLOCK_EXPLOSION:
			event.setCancelled(main.getConfig().getBoolean("Damage.BLOCK_EXPLOSION"));
			break;
		case CONTACT:
			event.setCancelled(main.getConfig().getBoolean("Damage.CONTACT"));
			break;

		case CRAMMING:
			event.setCancelled(main.getConfig().getBoolean("Damage.CRAMMING"));
			break;
		case CUSTOM:
			event.setCancelled(main.getConfig().getBoolean("Damage.CUSTOM"));
			break;
		case DRAGON_BREATH:
			event.setCancelled(main.getConfig().getBoolean("Damage.DRAGON_BREATH"));
			break;
		case DROWNING:
			event.setCancelled(main.getConfig().getBoolean("Damage.DROWNING"));
			break;
		case DRYOUT:
			event.setCancelled(main.getConfig().getBoolean("Damage.DRYOUT"));
			break;
		case ENTITY_ATTACK:
			event.setCancelled(main.getConfig().getBoolean("Damage.ENTITY_ATTACK"));
			break;
		case ENTITY_EXPLOSION:
			event.setCancelled(main.getConfig().getBoolean("Damage.ENTITY_EXPLOSION"));
			break;
		case ENTITY_SWEEP_ATTACK:
			event.setCancelled(main.getConfig().getBoolean("Damage.ENTITY_SWEEP_ATTACK"));
			break;
		case FALL:
			event.setCancelled(main.getConfig().getBoolean("Damage.FALL"));
			break;
		case FALLING_BLOCK:
			event.setCancelled(main.getConfig().getBoolean("Damage.FALLING_BLOCK"));
			break;
		case FIRE:
			event.setCancelled(main.getConfig().getBoolean("Damage.FIRE"));
			break;
		case FIRE_TICK:
			event.setCancelled(main.getConfig().getBoolean("Damage.FIRE_TICK"));
			break;
		case FLY_INTO_WALL:
			event.setCancelled(main.getConfig().getBoolean("Damage.FLY_INTO_WALL"));
			break;
		case HOT_FLOOR:
			event.setCancelled(main.getConfig().getBoolean("Damage.HOT_FLOOR"));
			break;
		case LAVA:
			event.setCancelled(main.getConfig().getBoolean("Damage.LAVA"));
			break;
		case LIGHTNING:
			event.setCancelled(main.getConfig().getBoolean("Damage.LIGHTNING"));
			break;
		case MAGIC:
			event.setCancelled(main.getConfig().getBoolean("Damage.MAGIC"));
			break;
		case MELTING:
			event.setCancelled(main.getConfig().getBoolean("Damage.MELTING"));
			break;
		case POISON:
			event.setCancelled(main.getConfig().getBoolean("Damage.POISON"));
			break;
		case PROJECTILE:
			event.setCancelled(main.getConfig().getBoolean("Damage.PROJECTILE"));
			break;
		case STARVATION:
			event.setCancelled(main.getConfig().getBoolean("Damage.STARVATION"));
			break;
		case SUFFOCATION:
			event.setCancelled(main.getConfig().getBoolean("Damage.SUFFOCATION"));
			break;
		case SUICIDE:
			event.setCancelled(main.getConfig().getBoolean("Damage.SUICIDE"));
			break;
		case THORNS:
			event.setCancelled(main.getConfig().getBoolean("Damage.THORNS"));
			break;
		case VOID:
			event.setCancelled(main.getConfig().getBoolean("Damage.VOID"));
			break;
		case WITHER:
			event.setCancelled(main.getConfig().getBoolean("Damage.WITHER"));
			break;

		}
	}
}
