package mc.bowwars.net.bowwars;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;

public final class BowWars extends JavaPlugin {

    Logger log = Logger.getLogger("Minecraft");

    @Override
    public void onEnable() {
        //Обработчики
        Bukkit.getPluginManager().registerEvents(new Handler(), this);
        log.info("[BWP] Bow Wars Plugin enabled!");
    }

    @Override
    public void onDisable() {
        log.info("[BWP] Bow Wars Plugin disabled!");
    }
}
