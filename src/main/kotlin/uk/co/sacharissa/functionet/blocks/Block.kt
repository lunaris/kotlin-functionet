package uk.co.sacharissa.functionet.blocks

import net.minecraft.block.material.Material
import net.minecraft.block.Block
import net.minecraft.creativetab.CreativeTabs
import cpw.mods.fml.common.registry.GameRegistry

private class FunctionetBlock(material: Material) : Block(material) {

}

fun block(material: Material, initialise: Block.() -> Unit): Block {
  val newBlock = FunctionetBlock(material)
  newBlock.initialise()
  return newBlock
}

fun Block.named(name: String) {
  setBlockName(name)
}

fun Block.withHardness(hardness: Float) {
  setHardness(hardness)
}

fun Block.appearingIn(tab: CreativeTabs) {
  setCreativeTab(tab)
}

fun Block.register() {
  GameRegistry.registerBlock(this, getUnlocalizedName())
}

