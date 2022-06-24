package ru.laym.f3overlay;

import net.minecraft.client.*;
import java.util.*;
import net.minecraftforge.client.event.*;
import net.minecraft.util.*;
import net.minecraft.client.gui.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class F3
{
    private Minecraft mc;
    public HashMap skins;
    
    public F3() {
        this.mc = Minecraft.getMinecraft();
    }
    
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void debug(final RenderGameOverlayEvent.Text event) {
        final int k = event.resolution.getScaledWidth();
        final int l = event.resolution.getScaledHeight();
        final FontRenderer fontrenderer = this.mc.fontRendererObj;
        if (fontrenderer != null && this.mc.gameSettings.showDebugInfo) {
            int offset = 0;
            offset += 10;
            final String[] debug = this.mc.debug.split(",");
            debug[0] = debug[0];
            fontrenderer.drawStringWithShadow("§6Project by Admin", 3.0f, (float)(-6 + offset), 16777215); // Можно указать свой проект и его создателя
            fontrenderer.drawStringWithShadow("§a\u041e\u0442\u043a\u043b\u0430\u0434\u043e\u0447\u043d\u0430\u044f \u0438\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044f: §a", 2.0f, (float)(8 + offset), 16777215);
            offset += 20;
            fontrenderer.drawStringWithShadow(debug[0], 2.0f, (float)(8 + offset), 16777215);
            offset += 20;
            fontrenderer.drawStringWithShadow("§6\u0412\u0430\u0448\u0438 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b", 2.0f, (float)(2 + offset), 16777215);
            offset += 10;
            final int x = MathHelper.floor_double(this.mc.thePlayer.posX);
            final int y = MathHelper.floor_double(this.mc.thePlayer.posY);
            final int z = MathHelper.floor_double(this.mc.thePlayer.posZ);
            final long max = Runtime.getRuntime().maxMemory();
            final long total = Runtime.getRuntime().totalMemory();
            final long free = Runtime.getRuntime().freeMemory();
            final long used = total - free;
            fontrenderer.drawStringWithShadow("§ex: " + x, 2.0f, (float)(2 + offset), 16777215);
            offset += 10;
            fontrenderer.drawStringWithShadow("§ey: " + y, 2.0f, (float)(2 + offset), 16777215);
            offset += 10;
            fontrenderer.drawStringWithShadow("§ez: " + z, 2.0f, (float)(2 + offset), 16777215);
            offset += 20;
            final String name = Minecraft.getMinecraft().thePlayer.getName();
            fontrenderer.drawStringWithShadow("§6\u0412\u0430\u0448 \u043d\u0438\u043a: §e" + name, 2.0f, (float)(2 + offset), 16777215);
            offset += 10;
            final int j3 = MathHelper.floor_double(this.mc.thePlayer.posX);
            final int k2 = MathHelper.floor_double(this.mc.thePlayer.posY);
            final int l2 = MathHelper.floor_double(this.mc.thePlayer.posZ);
            final long maxMem = Runtime.getRuntime().maxMemory();
            final long totalMem = Runtime.getRuntime().totalMemory();
            final long freeMem = Runtime.getRuntime().freeMemory();
            final long usedMem = totalMem - freeMem;
            offset = 0;
            String s = "§e\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u0442\u0441\u044f \u041e\u0417\u0423: " + usedMem * 100L / maxMem + "§e% §f(§6" + usedMem / 1024L / 1024L + "§e\u041c\u0411§f)§e";
            s = "§e\u0412\u044b\u0434\u0435\u043b\u0435\u043d\u043e \u041e\u0417\u0423: " + totalMem * 100L / maxMem + "§e% §f(§6" + totalMem / 1024L / 1024L + "§e\u041c\u0411§f)";
            fontrenderer.drawStringWithShadow("§d\u041f\u043e\u0442\u0440\u0435\u0431\u043b\u0435\u043d\u0438\u0435 \u041e\u0417\u0423", (float)(k - fontrenderer.getStringWidth("\u041f\u043e\u0442\u0440\u0435\u0431\u043b\u0435\u043d\u0438\u0435 \u041e\u0417\u0423") - 14), (float)(5 + offset), 16777215);
            offset += 10;
            fontrenderer.drawStringWithShadow("§a\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u0442\u0441\u044f \u0438\u0433\u0440\u043e\u0439: " + usedMem * 100L / maxMem + "% §f(§6" + usedMem / 1024L / 1024L + "§6MB§f)§e", (float)(k - fontrenderer.getStringWidth("§e\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u0442\u0441\u044f \u0438\u0433\u0440\u043e\u0439 " + usedMem * 100L / maxMem + "% §f(§6" + usedMem / 1024L / 1024L + "§e\u041c\u0411§f)§e") - 16), (float)(7 + offset), 16777215);
            offset += 10;
            fontrenderer.drawStringWithShadow("§6\u0412\u0441\u0435\u0433\u043e \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u043e \u0434\u043b\u044f JVM: §6" + totalMem / 1024L / 1024L + "§6MB", (float)(k - fontrenderer.getStringWidth("§e\u0412\u0441\u0435\u0433\u043e \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u043e \u041e\u0417\u0423 " + totalMem * 100L / maxMem + "§e% §f(§6" + totalMem / 1024L / 1024L + "§e\u041c\u0411§f)") - 4), (float)(9 + offset), 16777215);
            offset += 10;
            offset = 12;
            event.setCanceled(true);
        }
    }
}
