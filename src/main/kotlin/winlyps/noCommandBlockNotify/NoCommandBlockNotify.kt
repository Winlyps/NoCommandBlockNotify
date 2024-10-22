package winlyps.noCommandBlockNotify

import org.bukkit.plugin.java.JavaPlugin

class NoCommandBlockNotify : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("commandBlockOutput", "false")
        }
        logger.info("NoCommandBlockNotify plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("NoCommandBlockNotify plugin has been disabled.")
    }
}