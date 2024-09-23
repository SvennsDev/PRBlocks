package nl.nijhuissven.prblocks.listeners;

import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class BoostListener implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Block block = player.getLocation().getBlock().getRelative(0, -1, 0);

        if (block.getType() != Material.EMERALD_BLOCK) return;

        Vector direction = player.getLocation().getDirection();
        Vector boost = direction.multiply(2);

        player.setVelocity(boost);
        player.playSound(player.getLocation(), "entity.wind_charge.wind_burst", 5, 1);
        player.getWorld().spawnParticle(Particle.CLOUD, player.getLocation(), 50, 0.1, 0.1, 0.1, 0.1);

    }
}
