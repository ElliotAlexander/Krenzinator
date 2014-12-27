package uk.co.ElllzUHC;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import uk.co.ElllzUHC.Scenarios.Scenario;
import uk.co.ElllzUHC.Scenarios.ScenarioInterface;
import uk.co.ElllzUHC.listeners.CraftListener;
import uk.co.ElllzUHC.listeners.DamageListener;
import uk.co.ElllzUHC.listeners.HorseListener;
import uk.co.ElllzUHC.listeners.KacListener;

/**
 * Created by Elliot on 29/11/2014.
 */
public class Krenzinator extends JavaPlugin implements ScenarioInterface {

    private boolean state;
    private String scenarioName;
    private String scenarioDescription;

    public void onEnable(){

        state  = false;
        scenarioName = "Krenzinator";
        scenarioDescription = "Various game tweaks in the play style of Krenzinator.";

        Scenario manager = (Scenario) Bukkit.getPluginManager().getPlugin("ScenarioManager");
        manager.registerScenario(this);


        getServer().getPluginManager().registerEvents(new KacListener(this), this);
        getServer().getPluginManager().registerEvents(new CraftListener(this), this);
        getServer().getPluginManager().registerEvents(new DamageListener(this), this);
        getServer().getPluginManager().registerEvents(new HorseListener(this), this);



    }

    @Override
    public void setScenarioState(Boolean aBoolean) {
        state = aBoolean;
    }

    @Override
    public boolean getScenarioState() {
        return state;
    }

    @Override
    public String getScenarioName() {
        return scenarioName;
    }

    @Override
    public String getScenarioDescription() {
        return scenarioDescription;
    }

}
