package ru.laym.Overlays.f3overlay;

import org.lwjgl.opengl.Display;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.laym.f3overlay.F3;

@Mod(modid = "f3", name = "F3Overlay", version = "1.0", acceptedMinecraftVersions = "[1.8.9]")
public class OverlaysMain
{
    
    @Mod.EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
        Display.setTitle("Project 1.8.9"); //Название проекта и сервера
    }
    
    @Mod.EventHandler
    public void init(final FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new F3());
    }

}