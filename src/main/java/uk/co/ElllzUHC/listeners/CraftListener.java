package uk.co.ElllzUHC.listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import uk.co.ElllzUHC.Krenzinator;

/**
 * Created by Elliot on 03/12/2014.
 */
public class CraftListener implements Listener {

    private final Krenzinator krenzinator;

    public CraftListener(Krenzinator krenzinator) {
        this.krenzinator = krenzinator;
    }

    @EventHandler
    public void onCraft(final CraftItemEvent craftItemEvent)  {

        if (!krenzinator.getScenarioState() || craftItemEvent.isCancelled()) {
            return;
        }

        if(craftItemEvent.getCurrentItem().getType().equals(Material.DIAMOND_SWORD)) {
            craftItemEvent.getWhoClicked().damage(2);
        }
    }
}
