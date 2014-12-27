package uk.co.ElllzUHC.listeners;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import uk.co.ElllzUHC.Krenzinator;

/**
 * Created by Elliot on 03/12/2014.
 */
public class DamageListener implements Listener {


     private final Krenzinator krenzinator;

     public DamageListener(Krenzinator krenzinator) {
         this.krenzinator = krenzinator;
     }

     @EventHandler(priority = EventPriority.HIGH)
     public void death(final EntityDamageByEntityEvent entityDamageByEntityEvent) {

         if (!krenzinator.getScenarioState()) {
             return;
         }

         if(entityDamageByEntityEvent.getDamager().getType().equals(EntityType.EGG)) {
             entityDamageByEntityEvent.setDamage(1);
         }

     }

}
