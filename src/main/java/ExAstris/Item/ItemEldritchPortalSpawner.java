package ExAstris.Item;


import ExAstris.Data.ItemData;
import ExAstris.Data.ModData;
import thaumcraft.common.lib.world.ThaumcraftWorldGenerator;
import thaumcraft.common.lib.world.WorldGenEldritchRing;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.World;
import thaumcraft.common.lib.world.dim.MazeThread;

public class ItemEldritchPortalSpawner extends Item {

	private WorldGenEldritchRing gen;

	public ItemEldritchPortalSpawner()
	{
		super();
		setCreativeTab(ExAstris.ExAstris.ExAstrisTab);
		this.setMaxStackSize(1);
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return ModData.ID + "." + ItemData.ELDRITCH_PORTAL_SPAWNER_UNLOCALIZED_NAME;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack item)
	{
		return ModData.ID + "." + ItemData.ELDRITCH_PORTAL_SPAWNER_UNLOCALIZED_NAME;
	}
	
	@Override
	public void registerIcons(IIconRegister register)
	{
		this.itemIcon = register.registerIcon(ModData.TEXTURE_LOCATION + ":ItemPortalSpawner");
	}

	@Override
	public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
	{
		if (!world.isRemote)
		{
			gen = new WorldGenEldritchRing();
			
			gen.chunkX = x;
			gen.chunkZ = z;
			int w = 11 + world.rand.nextInt(6) * 2;
			int h = 11 + world.rand.nextInt(6) * 2;
			gen.width = w;
			gen.height = h;
			
			if (gen.generate(world, world.rand, x, y, z))
			{
				ThaumcraftWorldGenerator.createRandomNodeAt(world, x, y+2, z, world.rand, false, true, false);
				Thread t = new Thread(new MazeThread(x, z, w, h, world.rand.nextLong()));
				t.start();
				stack.stackSize--;
				if (stack.stackSize <= 0)
					stack = null;
				return true;
			}
		}

		return false;

	}

}
