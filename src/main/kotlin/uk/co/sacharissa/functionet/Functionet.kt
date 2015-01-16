package uk.co.sacharissa.functionet

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import uk.co.sacharissa.functionet.blocks.block
import net.minecraft.block.material.Material
import uk.co.sacharissa.functionet.blocks.named
import uk.co.sacharissa.functionet.blocks.withHardness
import uk.co.sacharissa.functionet.blocks.appearingIn
import net.minecraft.creativetab.CreativeTabs
import uk.co.sacharissa.functionet.blocks.register

val modId = "functionet";
val modName = "Functionet"
val modVersion = "1.0"

val driveBay = block(Material.iron) {
  named("functionet.blocks.driveBay")
  withHardness(2.2F)
  appearingIn(CreativeTabs.tabBlock)
}

Mod(modid = modId, name = modName, version = modVersion) class Functionet {
  EventHandler fun preInit(e: FMLPreInitializationEvent) {
    driveBay.register()
  }
}

