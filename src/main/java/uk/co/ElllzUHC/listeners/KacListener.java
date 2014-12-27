package uk.co.ElllzUHC.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import uk.co.ElllzUHC.Krenzinator;

/**
 * Created by Elliot on 03/12/2014.
 */
public class KacListener implements Listener {

    private final Krenzinator krenzinator;

    public KacListener(Krenzinator krenzinator) {
        this.krenzinator = krenzinator;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onDeath(final PlayerDeathEvent playerDeathEvent) {

        if (!krenzinator.getScenarioState()) {
            return;
        }

        Player victim =  playerDeathEvent.getEntity();

        if (victim.getName().equals("kacperrutka26")
                || victim.getName().equals("SergeantGnome")) {

            ItemStack diamonds = new ItemStack(Material.DIAMOND, 10);

            playerDeathEvent.getDrops().add(diamonds);
        }
    }
}
