package arrrrik.restitems;


import arrrrik.restitems.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.logging.Logger;

@Mod(modid = RestItems.MODID, name = RestItems.MODNAME, version = RestItems.MODVERSION, dependencies = "required-after:Forge@[12.18.1.2064,)", useMetadata = true)
public class RestItems {

    public static final String MODID = "restitems";
    public static final String MODNAME = "Restaurant Items";
    public static final String MODVERSION = "0.0.1";
    
    @SidedProxy(clientSide = CLIENT, serverSide = SERVER)
    public static CommonProxy proxy;
    
    @Mod.Instance
    public static RestItems instance;
    
    public static Logger logger;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }    

}    
