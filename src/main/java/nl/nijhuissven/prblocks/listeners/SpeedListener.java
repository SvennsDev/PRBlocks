package nl.nijhuissven.prblocks.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;

public class SpeedListener implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Block block = player.getLocation().getBlock().getRelative(0, -1, 0);

        if (block.getType() != Material.GOLD_BLOCK) return;

        if (player.hasPotionEffect(org.bukkit.potion.PotionEffectType.SPEED)) return;
        player.addPotionEffect(new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 200, 0));
        player.playSound(player.getLocation(), "block.beacon.power_select", 5, 1);
    }
}
