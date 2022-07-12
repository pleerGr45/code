package mc.bowwars.net.bowwars;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityEvent;

public class Handler implements Listener {

    @EventHandler
    public void onDeath(EntityDeathEvent e) {
        Bukkit.getPlayer(e.getEntity().getUniqueId()).sendMessage("Вы погибли!");
    }

    @EventHandler
    public void withDestroyedTarget(EntityEvent e) {

    }
}
