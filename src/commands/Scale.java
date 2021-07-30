package commands;

import java.util.ArrayList;
import java.util.List;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.form.element.ElementStepSlider;
import cn.nukkit.form.window.FormWindowCustom;

public class Scale extends Command
{
	public Scale()
	{
		super("scale", "Ändere deine Größe");
	}
	public boolean execute(CommandSender sender, String string, String[] args)
	{
		Player player = (Player) sender;
		int playerScale = (int) (player.getScale() * 10);
		FormWindowCustom form = new FormWindowCustom("Ändere deine Größe");
		List<String> scales = new ArrayList<String>();
		if(player.hasPermission("hagbrain.permissions.scale"))
		{
			int i = 0;
			scales.add("4");
			scales.add("5");
			scales.add("6");
			scales.add("7");
			scales.add("8");
			scales.add("9");
			scales.add("10");
			scales.add("11");
			scales.add("12");
			scales.add("13");
			scales.add("14");
			
			for(String s : scales)
			{
			    if(Integer.valueOf(s).equals(playerScale))
			        {
			            form.addElement(new ElementStepSlider("\nScale", scales, i));
			        }
			        i++;
			}
		}
		else
		{
			int i = 0;
			scales.add("6");
			scales.add("7");
			scales.add("8");
			scales.add("9");
			scales.add("10");
			scales.add("11");
			scales.add("12");
			for(String s : scales)
			{
			    if(Integer.valueOf(s).equals(playerScale))
			        {
			            form.addElement(new ElementStepSlider("\nScale", scales, i));
			        }
			        i++;
			}
		}
		player.showFormWindow(form, 1835);
		return false;
	}
}
