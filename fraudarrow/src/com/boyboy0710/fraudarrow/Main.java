package com.boyboy0710.fraudarrow;

import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.DragonFireball;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.entity.ShulkerBullet;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.WitherSkull;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener{
	public void onEnable() {
		System.out.println("----------------------------------------------------");
		System.out.println("    fraudarrow 를러그인을 성공적으로 불러왔습니다");
		System.out.println("        플러그인 제작자ㅣ:boyboy0710");
		System.out.println("        config 파일로 값을 바꿀수 있습니다 ");
		System.out.println("----------------------------------------------------");
		
		
	}
	//서버가 꺼졌을때 플러그인이 정상적으로 비활성화 됬다는걸 알려주는 명령어
	@Override
	public void onDisable() {
		System.out.println("fraudarrow 플러그인이 비활성화 되었습니다");
	}
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
        if (e.getAction() == Action.RIGHT_CLICK_AIR
            || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
        		if (e.getItem().getType() == Material.ARROW) {
        			Player p = e.getPlayer();
        			Arrow arrow= p.launchProjectile(Arrow.class);
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10)); 
        			
        			DragonFireball DragonFireball= p.launchProjectile(DragonFireball.class);
        			DragonFireball.setVelocity(p.getLocation().getDirection().multiply(10));
        			DragonFireball.setVelocity(p.getLocation().getDirection().multiply(10));
        			
        			Fireball Fireball= p.launchProjectile(Fireball.class);
        			Fireball.setVelocity(p.getLocation().getDirection().multiply(10)); 
        			Fireball.setVelocity(p.getLocation().getDirection().multiply(10)); 
        			
        			ShulkerBullet ShulkerBullet= p.launchProjectile(ShulkerBullet.class);
        			ShulkerBullet.setVelocity(p.getLocation().getDirection().multiply(10));
        			ShulkerBullet.setVelocity(p.getLocation().getDirection().multiply(10));
        			
        			Snowball Snowball= p.launchProjectile(Snowball.class);  
        			Snowball.setVelocity(p.getLocation().getDirection().multiply(10));
        			Snowball.setVelocity(p.getLocation().getDirection().multiply(10));
        			
        			Firework Firework= p.launchProjectile(Firework.class);
        			Firework.setVelocity(p.getLocation().getDirection().multiply(10));
        			Firework.setVelocity(p.getLocation().getDirection().multiply(10));
        			
        			WitherSkull WitherSkull= p.launchProjectile(WitherSkull.class);
        			WitherSkull.setVelocity(p.getLocation().getDirection().multiply(10));
        			WitherSkull.setVelocity(p.getLocation().getDirection().multiply(10));
        			WitherSkull.setVelocity(p.getLocation().getDirection().multiply(10));
        			WitherSkull.setVelocity(p.getLocation().getDirection().multiply(10));
        			
        			org.bukkit.entity.Entity entity = p.getWorld().spawnEntity(p.getEyeLocation(), EntityType.PRIMED_TNT);
        			entity.setVelocity(p.getLocation().getDirection().multiply(10));
        			entity.setVelocity(p.getLocation().getDirection().multiply(10));
        		}
        	
        		if(e.getItem().getType() == Material.BOW) {
        			Player p = e.getPlayer();
        			Arrow arrow= p.launchProjectile(Arrow.class);
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        			arrow.setVelocity(p.getLocation().getDirection().multiply(10));
        		}
        }
	}
}
