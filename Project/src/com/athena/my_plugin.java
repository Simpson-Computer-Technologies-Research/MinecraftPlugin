package com.athena;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import com.athena.commands.Heal;

public class my_plugin extends JavaPlugin {
    private static my_plugin instance;

    @Override
    public void onEnable() {
        instance = this;
        System.out.println(" + _Plugin Launched");
        getCommand("heal").setExecutor(new Heal());
    }

    @Override
    public void onDisable() {
        System.out.println(" + _Plugin Terminated");
    }

    public static my_plugin getInstance() {
        return instance;
    }
}
