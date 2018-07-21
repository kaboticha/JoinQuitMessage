package example.plugin.exampleplugin;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.event.player.PlayerQuitEvent;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase implements Listener {
	@Override
	public void onEnable() {
		getLogger().info("起動しました。");
		this.getServer().getPluginManager().registerEvents(this, this);
		getLogger().info("Call onEnable");
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		String name = p.getName();
		this.getServer().broadcastMessage("§e参加  >>  §6" + name + "さん");
		e.setJoinMessage("");
		}
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent e){
		Player p = e.getPlayer();
		String name = p.getName();
		this.getServer().broadcastMessage("§6退出  >>  §e" + name + "さん");
		e.setQuitMessage("");
    }

}
