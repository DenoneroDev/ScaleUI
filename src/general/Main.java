package general;

import cn.nukkit.Server;
import cn.nukkit.command.CommandMap;
import cn.nukkit.plugin.Plugin;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginManager;
import functions.DenoAPI;

public class Main extends PluginBase
{
	public static Main plugin;
	
	public void onEnable()
	{
		plugin = this;
		new DenoAPI().onEnableLog(getFullName());
		registerCommand();
		registerEvents();
	}
	public void registerCommand()
	{
		CommandMap command =  Server.getInstance().getCommandMap();
		command.register("", new commands.Scale());
	}
	public void registerEvents()
	{
		PluginManager event =  Server.getInstance().getPluginManager();
		event.registerEvents(new events.FormRespondedEvent(), (Plugin) plugin);
	}
}
