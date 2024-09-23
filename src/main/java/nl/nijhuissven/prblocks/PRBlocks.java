package nl.nijhuissven.prblocks;

import nl.nijhuissven.prblocks.listeners.BoostListener;
import nl.nijhuissven.prblocks.listeners.LaunchListener;
import nl.nijhuissven.prblocks.listeners.SpeedListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class PRBlocks extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new BoostListener(), this);
        Bukkit.getPluginManager().registerEvents(new SpeedListener(), this);
        Bukkit.getPluginManager().registerEvents(new LaunchListener(), this);
    }
}
