package events;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerFormRespondedEvent;
import cn.nukkit.form.window.FormWindowCustom;

public class FormRespondedEvent implements Listener
{
    @EventHandler
    public void on(PlayerFormRespondedEvent event) 
    {
    	if(event.wasClosed()) return;
    	
    	if(event.getFormID() == 1835)
    	{
        	Player player = event.getPlayer();
        	player.setScale(Float.valueOf((String) ((FormWindowCustom) event.getWindow()).getResponse().getResponse(0)) / 10);
    	}
    }
}