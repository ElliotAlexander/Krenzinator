package uk.co.ElllzUHC.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleEnterEvent;
import uk.co.ElllzUHC.Krenzinator;

/**
 * Created by Elliot on 03/12/2014.
 */
public class HorseListener implements Listener {


    private final Krenzinator krenzinator;

    public HorseListener(Krenzinator krenzinator) {
        this.krenzinator = krenzinator;
    }

    @EventHandler
    public void onMount(final VehicleEnterEvent e) {

        if (!krenzinator.getScenarioState()) {
            return;
        }

        if (((e.getVehicle() instanceof Horse)) && ((e.getEntered() instanceof Player))) {

            Horse horse = (Horse)e.getVehicle();

            if(horse.getVariant().equals(Horse.Variant.DONKEY)) {
                return;
            }

            ((Player)e.getEntered()).sendMessage(ChatColor.RED + "You can't mount horses in this gamemode!");
            e.setCancelled(true);
        }
    }
}
