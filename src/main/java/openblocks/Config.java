package openblocks;

import java.util.Arrays;
import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import openblocks.OpenBlocks.Enchantments;
import openblocks.asm.EntityPlayerVisitor;
import openblocks.common.EntityEventHandler;
import openblocks.common.Stencil;
import openblocks.common.TrophyHandler;
import openblocks.common.block.*;
import openblocks.common.item.*;
import openblocks.common.item.ItemImaginationGlasses.ItemCrayonGlasses;
import openblocks.common.recipe.*;
import openblocks.enchantments.*;
import openmods.config.*;
import openmods.utils.ColorUtils;
import openmods.utils.ColorUtils.ColorMeta;

public class Config {

	@BlockEnabled(description = "The id of the ladder")
	public static boolean blockLadderEnabled = true;

	@BlockEnabled(description = "The id of the guide")
	public static boolean blockGuideEnabled = true;

	@BlockEnabled(description = "The id of the elevator block")
	public static boolean blockElevatorEnabled = true;

	@BlockEnabled(description = "The id of the heal block")
	public static boolean blockHealEnabled = true;

	@BlockEnabled(description = "The id of the target block")
	public static boolean blockTargetEnabled = true;

	@BlockEnabled(description = "The id of the grave block")
	public static boolean blockGraveEnabled = true;

	@BlockEnabled(description = "The id of the flag block")
	public static boolean blockFlagEnabled = true;

	@BlockEnabled(description = "The id of the tank block")
	public static boolean blockTankEnabled = true;

	@BlockEnabled(description = "The id of the trophy block")
	public static boolean blockTrophyEnabled = true;

	@BlockEnabled(description = "The id of the bear trap")
	public static boolean blockBearTrapEnabled = true;

	@BlockEnabled(description = "The id of the sprinkler block")
	public static boolean blockSprinklerEnabled = true;

	@BlockEnabled(description = "The id of the cannon block")
	public static boolean blockCannonEnabled = true;

	@BlockEnabled(description = "The id of the vacuum hopper block")
	public static boolean blockVacuumHopperEnabled = true;

	@BlockEnabled(description = "The id of the sponge block")
	public static boolean blockSpongeEnabled = true;

	@BlockEnabled(description = "The id of the big button block")
	public static boolean blockBigButtonEnabled = true;

	@BlockEnabled(description = "The id of the imaginary block")
	public static boolean blockImaginaryEnabled = true;

	@BlockEnabled(description = "The id of the xp bottler block")
	public static boolean blockXPBottlerEnabled = true;

	@BlockEnabled(description = "The id of the village highlighter block")
	public static boolean blockVillageHighlighterEnabled = true;

	@BlockEnabled(description = "The id of the path block")
	public static boolean blockPathEnabled = true;

	@BlockEnabled(description = "The id of the auto anvil")
	public static boolean blockAutoAnvilEnabled = true;

	@BlockEnabled(description = "The id of the auto enchantment table")
	public static boolean blockAutoEnchantmentTableEnabled = true;

	@BlockEnabled(description = "The id of the xp drain block")
	public static boolean blockXPDrainEnabled = true;

	@BlockEnabled(description = "The id of the block-breaker block")
	public static boolean blockBlockBreakerEnabled = true;

	@BlockEnabled(description = "The id of the block-placer block")
	public static boolean blockBlockPlacerEnabled = true;

	@BlockEnabled(description = "The id of the item-dropper block")
	public static boolean blockItemDropperEnabled = true;

	@BlockEnabled(description = "The id of the rope ladder block")
	public static boolean blockRopeLadderEnabled = true;

	@BlockEnabled(description = "The id of the donation station block")
	public static boolean blockDonationStationEnabled = true;

	@BlockEnabled(description = "The id of the clay stainer block")
	public static boolean blockPaintMixerEnabled = true;

	@BlockEnabled(description = "The id of the canvas block")
	public static boolean blockCanvasEnabled = true;

	@BlockEnabled(description = "The id of the paint tin")
	public static boolean blockPaintCanEnabled = true;

	@BlockEnabled(description = "The id of the glass canvas block")
	public static boolean blockCanvasGlassEnabled = true;

	@BlockEnabled(description = "The id of the map projector block")
	public static boolean blockProjectorEnabled = true;

	@BlockEnabled(description = "The id of the drawing table")
	public static boolean blockDrawingTableEnabled = true;

	@BlockEnabled(description = "The id of the golden egg block")
	public static boolean blockGoldenEggEnabled = true;

	@BlockEnabled(description = "The id of the fan block")
	public static boolean blockFanEnabled = true;

	@BlockEnabled(description = "The id of the radio block")
	public static boolean blockRadioEnabled = true;

	@BlockEnabled(description = "The id of the sky block")
	public static boolean blockSkyEnabled = true;

	@BlockEnabled(description = "The id of the xp shower")
	public static boolean blockXPShowerEnabled = true;

	// @BlockEnabled(description = "The id of the digital fuse")
	public static boolean blockDigitalFuseEnabled = false;

	@ItemEnabled(description = "The id of the hang glider")
	public static boolean itemHangGliderEnabled = true;

	@ItemEnabled(description = "The id of the luggage item")
	public static boolean itemLuggageEnabled = true;

	@ItemEnabled(description = "The id of the sonic glasses item")
	public static boolean itemSonicGlassesEnabled = true;

	@ItemEnabled(description = "The id of the imaginary pencil glasses item")
	public static boolean itemGlassesPencilEnabled = true;

	@ItemEnabled(description = "The id of the imaginary crayon glasses item")
	public static boolean itemGlassesCrayonEnabled = true;

	@ItemEnabled(description = "The id of the amazing technicolor glasses item")
	public static boolean itemGlassesTechnicolorEnabled = true;

	@ItemEnabled(description = "The id of the serious admin glasses item")
	public static boolean itemGlassesSeriousEnabled = true;

	@ItemEnabled(description = "The id of the crane controller item")
	public static boolean itemCraneControlEnabled = true;

	@ItemEnabled(description = "The id of the crane backpack item")
	public static boolean itemCraneEnabled = true;

	@ItemEnabled(description = "The id of slimalyzer item")
	public static boolean itemSlimalyzerEnabled = true;

	@ItemEnabled(description = "The id of the filled bucket")
	public static boolean itemFilledBucketEnabled = true;

	@ItemEnabled(description = "The id of the sleeping bag")
	public static boolean itemSleepingBagEnabled = true;

	@ItemEnabled(description = "The id of the paint brush")
	public static boolean itemPaintBrushEnabled = true;

	@ItemEnabled(description = "The id of the stencil")
	public static boolean itemStencilEnabled = true;

	@ItemEnabled(description = "The id of the Squeegee")
	public static boolean itemSqueegeeEnabled = true;

	@ItemEnabled(description = "The id of the height map item")
	public static boolean itemHeightMapEnabled = true;

	@ItemEnabled(description = "The id of the empty height map item")
	public static boolean itemEmptyMapEnabled = true;

	@ItemEnabled(description = "The id of the cartographer spawner item")
	public static boolean itemCartographerEnabled = true;

	@ItemEnabled(description = "The id of the tasty clay item!")
	public static boolean itemTastyClayEnabled = true;

	@ItemEnabled(description = "The id of the golden eye item")
	public static boolean itemGoldenEyeEnabled = true;

	@ItemEnabled(description = "The id of the cursor item")
	public static boolean itemCursorEnabled = true;

	@ItemEnabled(description = "The id of tuned crystal item")
	public static boolean itemTunedCrystalEnabled = true;

	@ItemEnabled(description = "The id of info book")
	public static boolean itemInfoBookEnabled = true;

	@ItemEnabled(description = "The id of wallpaper")
	public static boolean itemWallpaperEnabled = true;

	@ItemEnabled(description = "The id of the dev null item")
	public static boolean itemDevNullEnabled = true;

	@ItemEnabled(description = "The id of sponge on a stick")
	public static boolean itemSpongeOnAStickEnabled = true;

	@ItemEnabled(description = "The id of pedometer")
	public static boolean itemPedometerEnabled = true;

	@OnLineModifiable
	@ConfigProperty(category = "dropblock", name = "searchDistance", comment = "The range of the drop block")
	public static int elevatorTravelDistance = 20;

	@OnLineModifiable
	@ConfigProperty(category = "dropblock", name = "ignoreHalfBlocks", comment = "The elevator will ignore half blocks when counting the blocks it can pass through")
	public static boolean elevatorIgnoreHalfBlocks = false;

	@OnLineModifiable
	@ConfigProperty(category = "dropblock", name = "maxPassThrough", comment = "The maximum amount of blocks the elevator can pass through before the teleport fails. -1 disables this")
	public static int elevatorMaxBlockPassCount = 4;

	@OnLineModifiable
	@ConfigProperty(category = "dropblock", name = "specialBlockRules", comment = "Defines blocks that are handled specially by elevators. Entries are in form <modId>:<blockName>:<action> or id:<blockId>:<action>. Possible actions: abort (elevator can't pass block), increment (counts for elevatorMaxBlockPassCount limit) and ignore")
	public static String[] elevatorRules = new String[0];

	@OnLineModifiable
	@ConfigProperty(category = "dropblock", name = "elevatorDrainsXP", comment = "Does the elevator drain player XP when used?")
	public static boolean elevatorDrainsXP = true;

	@ConfigProperty(category = "tanks", name = "bucketsPerTank", comment = "The amount of buckets each tank can hold")
	public static int bucketsPerTank = 16;

	@OnLineModifiable
	@ConfigProperty(category = "tanks", name = "tankTicks", comment = "Should tanks try to balance liquid amounts with neighbours")
	public static boolean shouldTanksUpdate = true;

	@ConfigProperty(category = "hacks", name = "tryHookPlayerRenderer", comment = "Allow OpenBlocks to hook the player renderer to apply special effects")
	public static boolean tryHookPlayerRenderer = true;

	@OnLineModifiable
	@ConfigProperty(category = "trophy", name = "trophyDropChance", comment = "The chance (from 0 to 1) of a trophy drop. for example, 0.001 for 1/1000")
	public static double trophyDropChance = 0.001;

	@OnLineModifiable
	@ConfigProperty(category = "dropblock", name = "irregularBlocksArePassable", comment = "The elevator will try to pass through blocks that have custom collision boxes")
	public static boolean irregularBlocksArePassable = true;

	@OnLineModifiable
	@ConfigProperty(category = "tanks", name = "emitLight", comment = "Tanks will emit light when they contain a liquid that glows (eg. lava)")
	public static boolean tanksEmitLight = true;

	@OnLineModifiable
	@ConfigProperty(category = "sprinkler", name = "fertilizeChance", comment = "1/chance that crops will be fertilized without bonemeal")
	public static int sprinklerFertilizeChance = 500;

	@OnLineModifiable
	@ConfigProperty(category = "sprinkler", name = "bonemealFertilizeChance", comment = "1/chance that crops will be fertilized with bonemeal")
	public static int sprinklerBonemealFertizizeChance = 200;

	@OnLineModifiable
	@ConfigProperty(category = "sprinkler", name = "effectiveRange", comment = "The range in each cardinal direction that crops will be affected.")
	public static int sprinklerEffectiveRange = 4;

	@OnLineModifiable
	@ConfigProperty(category = "glasses", name = "opacity", comment = "0.0 - no visible change to world, 1.0 - world fully obscured")
	public static double sonicGlassesOpacity = 0.95;

	@OnLineModifiable
	@ConfigProperty(category = "glasses", name = "useTexture", comment = "Use texture for obscuring world")
	public static boolean sonicGlassesUseTexture = true;

	@OnLineModifiable
	@ConfigProperty(category = "imaginary", name = "fadingSpeed", comment = "Speed of imaginary blocks fading/appearing")
	public static float imaginaryFadingSpeed = 0.0075f;

	@ConfigProperty(category = "imaginary", name = "numberOfUses", comment = "Number of newly created crayon/pencil uses")
	public static float imaginaryItemUseCount = 10;

	@ConfigProperty(category = "crane", name = "doCraneCollisionCheck", comment = "Enable collision checking of crane arm")
	public static boolean doCraneCollisionCheck = false;

	@OnLineModifiable
	@ConfigProperty(category = "crane", name = "boringMode", comment = "Use shift to control crane direction (otherwise, toggle every time)")
	public static boolean craneShiftControl = true;

	@ConfigProperty(category = "crane", name = "turtleMagnetRange", comment = "Range of magnet CC peripheral")
	public static double turtleMagnetRange = 4;

	@ConfigProperty(category = "crane", name = "addTurtles", comment = "Enable magnet turtles")
	public static boolean enableCraneTurtles = true;

	@ConfigProperty(category = "crane", name = "showTurtles", comment = "Show magnet turtles in creative list")
	public static boolean showCraneTurtles = true;

	@ConfigProperty(category = "hacks", name = "enableExperimentalFeatures", comment = "Enable experimental features that may be buggy or broken entirely")
	public static boolean experimentalFeatures = false;

	@ConfigProperty(category = "tomfoolery", name = "weAreSeriousPeople", comment = "Are you serious too?")
	public static boolean soSerious = true;

	@OnLineModifiable
	@ConfigProperty(category = "tomfoolery", name = "doItWhileTyping", comment = "You know, THAT thing! That you shouldn't do in public!")
	public static boolean fartTypying = false;

	@OnLineModifiable
	@ConfigProperty(category = "tomfoolery", name = "flimFlamBlacklist", comment = "Blacklist for effects used by flim-flam enchantment")
	public static String[] flimFlamBlacklist = new String[0];

	@OnLineModifiable
	@ConfigProperty(category = "tomfoolery", name = "safeOnly", comment = "Allow only flimflams that don't cause death (or at least very rarely)")
	public static boolean safeFlimFlams = false;

	@OnLineModifiable
	@ConfigProperty(category = "debug", name = "goldenEyeDebug", comment = "Show structures found by golden eye")
	public static boolean eyeDebug = false;

	@OnLineModifiable
	@ConfigProperty(category = "debug", name = "enableChangelogBooks", comment = "Enable the changelog books")
	public static boolean enableChangelogBooks = true;

	@OnLineModifiable
	@ConfigProperty(category = "debug", name = "gravesDebug", comment = "Dump extra amount of data, every time grave is created")
	public static boolean debugGraves = false;

	@ConfigProperty(category = "features", name = "explosiveEnchantmentId", comment = "Id of explosive enchantment")
	public static int explosiveEnchantmentId = 211;

	@ConfigProperty(category = "features", name = "lastStandEnchantmentId", comment = "Id of last stand enchantment")
	public static int lastStandEnchantmentId = 212;

	@ConfigProperty(category = "features", name = "flimFlamEnchantmentId", comment = "Id of flim flam enchantment")
	public static int flimFlamEnchantmentId = 213;

	@ConfigProperty(category = "features", name = "explosiveEnchantGrief", comment = "Explosive enchant can break blocks at level 3")
	public static boolean explosiveEnchantGrief = true;

	@ConfigProperty(category = "cursor", name = "cursorMaxDamage", comment = "Amount of damage a cursor can take")
	public static int cursorMaxDamage = 128;

	@OnLineModifiable
	@ConfigProperty(category = "additional", name = "disableMobNames", comment = "List any mob names you want disabled on the server")
	public static String[] disableMobNames = new String[0];

	@OnLineModifiable
	@ConfigProperty(category = "additional", name = "dumpDeadPlayersInventories", comment = "Should player inventories be stored after death (can later be restored with command)")
	public static boolean dumpStiffsStuff = true;

	@OnLineModifiable
	@ConfigProperty(category = "radio", name = "radioStations", comment = "List any radio stations you want")
	public static String[] radioStations = new String[] {
			"http://idobiradio.idobi.com;idobi Radio (idobi.com);Blue",
			"http://192.184.9.79:8006;CINEMIX;Blue",
			"http://radiorivendell.de:80/;Radio Rivendell;Blue",
			"http://205.164.62.15:10052;1.fm Love Classics;Blue",
			"http://theradio.cc:8000/trcc-stream.mp3;TheRadioCC;Red",
			"http://streaming202.radionomy.com:80/abacusfm-vintage-jazz;Vintage Jazz;Red",
			"http://s1.stream-experts.net:8032/;Nature sounds;Red",
			"http://91.121.166.38:7016/;British Comedy;Red",
			"http://50.7.173.162:8010;Audiophile Baroque;Red"
	};

	@ConfigProperty(category = "radio", name = "replaceList", comment = "List of URLs that need to be updated (url, whitespace, replacement")
	public static String[] derpList = new String[] {
			"http://69.46.75.101:80 http://idobiradio.idobi.com"
	};

	@OnLineModifiable
	@ConfigProperty(category = "cartographer", name = "blockBlacklist", comment = "List of blocks that should be invisible to cartographer. Example: id:3,  OpenBlocks:openblocks_radio (case sensitive)")
	public static String[] mapBlacklist = new String[] {
			"Natura:Cloud"
	};

	@ConfigProperty(category = "radio", name = "enableChestLoot", comment = "Add tuned crystals as loot in chests")
	public static boolean radioChests = true;

	@ConfigProperty(category = "radio", name = "radioVillagerId", comment = "Tuned crystals merchant id (-1 to disable)")
	public static int radioVillagerId = 6156;

	@OnLineModifiable
	@ConfigProperty(category = "radio", name = "radioVillagerSellsRecords", comment = "Should tuned crystals sell records too")
	public static boolean radioVillagerRecords = true;

	@OnLineModifiable
	@ConfigProperty(category = "radio", name = "maxSources", comment = "Maximum number of sources playing at one time")
	public static int maxRadioSources = 3;

	@OnLineModifiable
	@ConfigProperty(category = "fan", name = "fanForce", comment = "Maximum force applied every tick to entities nearby (linear decay)")
	public static double fanForce = 0.05;

	@OnLineModifiable
	@ConfigProperty(category = "fan", name = "fanRange", comment = "Range of fan in blocks")
	public static double fanRange = 10;

	@OnLineModifiable
	@ConfigProperty(category = "fan", name = "isRedstoneActivated", comment = "Is fan force controlled by redstone current")
	public static boolean redstoneActivatedFan = true;

	@ConfigProperty(category = "sponge", name = "spongeStickUseCount", comment = "SpongeOnAStick use count")
	public static int spongeMaxDamage = 256;

	@OnLineModifiable
	@ConfigProperty(category = "sponge", name = "spongeRange", comment = "Sponge block range (distance from center)")
	public static int spongeRange = 3;

	@OnLineModifiable
	@ConfigProperty(category = "sponge", name = "spongeRange", comment = "Sponge block range (distance from center)")
	public static int spongeStickRange = 3;

	public static void registerBlocksAndItems() {

		MinecraftForge.EVENT_BUS.register(new EntityEventHandler());

		// There is no fail checking here because if the Generic item fails,
		// then I doubt anyone wants this to be silent.
		// Too many items would suffer from this. - NC
		OpenBlocks.Items.generic = new ItemOBGeneric();
		MetasGeneric.registerItems();
		OpenBlocks.Items.generic.initRecipes();

		OpenBlocks.Items.genericUnstackable = new ItemOBGenericUnstackable();
		MetasGenericUnstackable.registerItems();
		OpenBlocks.Items.genericUnstackable.initRecipes();

		if (itemFilledBucketEnabled) {
			OpenBlocks.Items.filledBucket = new ItemFilledBucket();
			MetasBucket.registerItems();
		}

		if (blockLadderEnabled) {
			OpenBlocks.Blocks.ladder = new BlockLadder();

		}
		if (blockGuideEnabled) {
			OpenBlocks.Blocks.guide = new BlockGuide();

		}
		if (blockElevatorEnabled) {
			OpenBlocks.Blocks.elevator = new BlockElevator();

		}
		if (blockHealEnabled) {
			OpenBlocks.Blocks.heal = new BlockHeal();
		}
		if (blockTargetEnabled) {
			OpenBlocks.Blocks.target = new BlockTarget();

		}
		if (blockGraveEnabled) {
			OpenBlocks.Blocks.grave = new BlockGrave();
		}
		if (blockFlagEnabled) {
			OpenBlocks.Blocks.flag = new BlockFlag();

		}
		if (blockTankEnabled) {
			OpenBlocks.Blocks.tank = new BlockTank();

		}
		if (blockTrophyEnabled) {
			OpenBlocks.Blocks.trophy = new BlockTrophy();
			MinecraftForge.EVENT_BUS.register(new TrophyHandler());
		}
		if (blockBearTrapEnabled) {
			OpenBlocks.Blocks.bearTrap = new BlockBearTrap();

		}

		if (blockSprinklerEnabled) {
			OpenBlocks.Blocks.sprinkler = new BlockSprinkler();

		}

		if (blockCannonEnabled) {
			OpenBlocks.Blocks.cannon = new BlockCannon();

		}

		if (blockVacuumHopperEnabled) {
			OpenBlocks.Blocks.vacuumHopper = new BlockVacuumHopper();

		}

		if (blockSpongeEnabled) {
			OpenBlocks.Blocks.sponge = new BlockSponge();

		}

		if (blockBigButtonEnabled) {
			OpenBlocks.Blocks.bigButton = new BlockBigButton();

		}

		if (blockImaginaryEnabled) {
			OpenBlocks.Blocks.imaginary = new BlockImaginary();
		}

		if (blockFanEnabled) {
			OpenBlocks.Blocks.fan = new BlockFan();

		}

		if (blockXPBottlerEnabled) {
			OpenBlocks.Blocks.xpBottler = new BlockXPBottler();

		}

		if (blockVillageHighlighterEnabled) {
			OpenBlocks.Blocks.villageHighlighter = new BlockVillageHighlighter();

		}

		if (blockPathEnabled) {
			OpenBlocks.Blocks.path = new BlockPath();

		}

		if (blockAutoAnvilEnabled) {
			OpenBlocks.Blocks.autoAnvil = new BlockAutoAnvil();

		}

		if (blockAutoEnchantmentTableEnabled) {
			OpenBlocks.Blocks.autoEnchantmentTable = new BlockAutoEnchantmentTable();

		}

		if (blockXPDrainEnabled) {
			OpenBlocks.Blocks.xpDrain = new BlockXPDrain();

		}
		if (blockBlockBreakerEnabled) {
			OpenBlocks.Blocks.blockBreaker = new BlockBlockBreaker();

		}

		if (blockBlockPlacerEnabled) {
			OpenBlocks.Blocks.blockPlacer = new BlockBlockPlacer();

		}

		if (blockItemDropperEnabled) {
			OpenBlocks.Blocks.itemDropper = new BlockItemDropper();

		}

		if (blockRopeLadderEnabled) {
			OpenBlocks.Blocks.ropeLadder = new BlockRopeLadder();

		}

		if (blockDonationStationEnabled) {
			OpenBlocks.Blocks.donationStation = new BlockDonationStation();
		}

		if (blockPaintMixerEnabled) {
			OpenBlocks.Blocks.paintMixer = new BlockPaintMixer();
		}

		if (blockCanvasEnabled) {
			OpenBlocks.Blocks.canvas = new BlockCanvas();

		}

		if (blockPaintCanEnabled) {
			OpenBlocks.Blocks.paintCan = new BlockPaintCan();
		}

		if (blockCanvasGlassEnabled) {
			OpenBlocks.Blocks.canvasGlass = new BlockCanvasGlass();
		}

		if (blockProjectorEnabled) {
			OpenBlocks.Blocks.projector = new BlockProjector();
		}

		if (blockGoldenEggEnabled) {
			OpenBlocks.Blocks.goldenEgg = new BlockGoldenEgg();

		}

		if (blockSkyEnabled) {
			OpenBlocks.Blocks.sky = new BlockSky();
		}

		if (blockDrawingTableEnabled) {
			OpenBlocks.Blocks.drawingTable = new BlockDrawingTable();
		}

    // TODO PORT RADIO
//		if (blockRadioEnabled) {
//			OpenBlocks.Blocks.radio = new BlockRadio();
//		}

		if (blockXPShowerEnabled) {
			OpenBlocks.Blocks.xpShower = new BlockXPShower();
		}

		if (blockDigitalFuseEnabled) {
			OpenBlocks.Blocks.digitalFuse = new BlockDigitalFuse();
		}

		if (itemHangGliderEnabled) {
			OpenBlocks.Items.hangGlider = new ItemHangGlider();

		}

		if (itemLuggageEnabled) {
			OpenBlocks.Items.luggage = new ItemLuggage();
		}

		if (itemSonicGlassesEnabled) {
			OpenBlocks.Items.sonicGlasses = new ItemSonicGlasses();
		}

		if (OpenBlocks.Blocks.imaginary != null) {
			if (itemGlassesPencilEnabled) {
				OpenBlocks.Items.pencilGlasses = new ItemImaginationGlasses(ItemImaginationGlasses.Type.PENCIL);
			}

			if (itemGlassesCrayonEnabled) {
				OpenBlocks.Items.crayonGlasses = new ItemCrayonGlasses();
			}

			if (itemGlassesTechnicolorEnabled) {
				OpenBlocks.Items.technicolorGlasses = new ItemImaginationGlasses(ItemImaginationGlasses.Type.TECHNICOLOR);
			}

			if (itemGlassesSeriousEnabled) {
				OpenBlocks.Items.seriousGlasses = new ItemImaginationGlasses(ItemImaginationGlasses.Type.BASTARD);
			}
		}

		if (itemCraneControlEnabled) {
			OpenBlocks.Items.craneControl = new ItemCraneControl();
		}

		if (itemCraneEnabled) {
			OpenBlocks.Items.craneBackpack = new ItemCraneBackpack();
		}

		if (itemSlimalyzerEnabled) {
			OpenBlocks.Items.slimalyzer = new ItemSlimalyzer();
		}

		if (itemSleepingBagEnabled && EntityPlayerVisitor.IsInBedHookSuccess) {
			OpenBlocks.Items.sleepingBag = new ItemSleepingBag();
		}

		if (itemPaintBrushEnabled) {
			OpenBlocks.Items.paintBrush = new ItemPaintBrush();
		}

		if (itemStencilEnabled) {
			OpenBlocks.Items.stencil = new ItemStencil();
		}

		if (itemSqueegeeEnabled) {
			OpenBlocks.Items.squeegee = new ItemSqueegee();
		}

		if (itemHeightMapEnabled) {
			OpenBlocks.Items.heightMap = new ItemHeightMap();
		}

		if (itemEmptyMapEnabled) {
			OpenBlocks.Items.emptyMap = new ItemEmptyMap();
		}

		if (itemCartographerEnabled) {
			OpenBlocks.Items.cartographer = new ItemCartographer();
		}

		if (itemGoldenEyeEnabled) {
			OpenBlocks.Items.goldenEye = new ItemGoldenEye();
		}

		if (itemTastyClayEnabled) {
			OpenBlocks.Items.tastyClay = new ItemTastyClay();
		}

		if (itemCursorEnabled) {
			OpenBlocks.Items.cursor = new ItemCursor();
		}

		if (itemTunedCrystalEnabled) {
//			OpenBlocks.Items.tunedCrystal = new ItemTunedCrystal();

//			for (RadioStation station : RadioManager.instance.getRadioStations()) {
//				WeightedRandomChestContent drop = new WeightedRandomChestContent(station.getStack().copy(), 1, 1, 2);
//				ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(drop);
//				ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(drop);
//			} TODO PORT RADIO
		}

		if (itemInfoBookEnabled) {
			OpenBlocks.Items.infoBook = new ItemInfoBook();
		}

		if (itemDevNullEnabled) {
			OpenBlocks.Items.devNull = new ItemDevNull();
			MinecraftForge.EVENT_BUS.register(OpenBlocks.Items.devNull);
		}

		if (itemWallpaperEnabled) {
			// OpenBlocks.Items.wallpaper = new ItemWallpaper();
		}

		if (itemSpongeOnAStickEnabled) {
			OpenBlocks.Items.spongeonastick = new ItemSpongeOnAStick();
		}

		if (itemPedometerEnabled) {
			OpenBlocks.Items.pedometer = new ItemPedometer();
		}

		final String modId = "openblocks";
		ConfigProcessing.registerItems(OpenBlocks.Items.class, modId);
		ConfigProcessing.registerBlocks(OpenBlocks.Blocks.class, modId);

    registerEnchantments();

    // We can only create itemstacks for blocks that are already registered!
    // We need to postpone recipe registration to this point because of this
    registerRecipes();
	}

  private static void registerEnchantments() {
    if (explosiveEnchantmentId > 0) {
      MinecraftForge.EVENT_BUS.register(new ExplosiveEnchantmentsHandler());
      Enchantments.explosive = new EnchantmentExplosive(explosiveEnchantmentId);
    }

    if (lastStandEnchantmentId > 0) {
      MinecraftForge.EVENT_BUS.register(new LastStandEnchantmentsHandler());
      Enchantments.lastStand = new EnchantmentLastStand(lastStandEnchantmentId);
    }

    if (flimFlamEnchantmentId > 0) {
      MinecraftForge.EVENT_BUS.register(new FlimFlamEnchantmentsHandler());
      Enchantments.flimFlam = new EnchantmentFlimFlam(flimFlamEnchantmentId);
    }
  }

  private static void registerRecipes() {

    @SuppressWarnings("unchecked")
    final List<IRecipe> recipeList = CraftingManager.getInstance().getRecipeList();

    if (blockLadderEnabled) {
      recipeList.add(new ShapelessOreRecipe(OpenBlocks.Blocks.ladder, Blocks.ladder, Blocks.trapdoor));
    }
    if (blockGuideEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.guide, "ggg", "gtg", "ggg", 'g', Blocks.glass, 't', Blocks.torch));
    }
    if (blockElevatorEnabled) {

      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.elevator, "www", "wew", "www", 'w', Blocks.wool, 'e', Items.ender_pearl));
    }
    if (blockTargetEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.target, "www", "www", "s s", 'w', Blocks.wool, 's', "stickWood"));
    }
    if (blockFlagEnabled) {
      recipeList.add(new ShapedOreRecipe(new ItemStack(OpenBlocks.Blocks.flag, 3), "scc", "sc ", "s  ", 'c', Blocks.carpet, 's', "stickWood"));
    }
    if (blockTankEnabled) {
      recipeList.add(new ShapedOreRecipe(new ItemStack(OpenBlocks.Blocks.tank, 2), "ogo", "ggg", "ogo", 'g', Blocks.glass_pane, 'o', Blocks.obsidian));
    }
    if (blockTrophyEnabled) {
      MinecraftForge.EVENT_BUS.register(new TrophyHandler());
    }
    if (blockBearTrapEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.bearTrap, "fif", "fif", "fif", 'f', Blocks.iron_bars, 'i', Items.iron_ingot));
    }
    if (blockSprinklerEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.sprinkler, "ifi", "iri", "ifi", 'i', Items.iron_ingot, 'r', Blocks.redstone_torch, 'f', Blocks.iron_bars));
    }
    if (blockCannonEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.cannon, " d ", " f ", "iri", 'd', Blocks.dispenser, 'f', Blocks.iron_bars, 'i', Items.iron_ingot, 'r', Blocks.redstone_block));
    }
    if (blockVacuumHopperEnabled) {
      recipeList.add(new ShapelessOreRecipe(OpenBlocks.Blocks.vacuumHopper, Blocks.hopper, Blocks.obsidian, Items.ender_pearl));
    }
    if (blockSpongeEnabled) {
      recipeList.add(new ShapelessOreRecipe(OpenBlocks.Blocks.sponge, Blocks.wool, Items.slime_ball));
    }
    if (blockBigButtonEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.bigButton, "bb", "bb", 'b', Blocks.stone_button));
    }
    if (blockImaginaryEnabled) {
      {
        ItemStack pencil = ItemImaginary.setupValues(null, new ItemStack(OpenBlocks.Blocks.imaginary, 1, ItemImaginary.DAMAGE_PENCIL));
        recipeList.add(new ShapelessOreRecipe(pencil, Items.coal, "stickWood", Items.ender_pearl, Items.slime_ball));
      }

      for (ColorMeta color : ColorUtils.getAllColors()) {
        ItemStack crayon = ItemImaginary.setupValues(color.rgb, new ItemStack(OpenBlocks.Blocks.imaginary, 1, ItemImaginary.DAMAGE_CRAYON));
        recipeList.add(new ShapelessOreRecipe(crayon, color.oreName, Items.paper, Items.ender_pearl, Items.slime_ball));
      }

      recipeList.add(new CrayonMixingRecipe());
    }

    if (blockFanEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.fan, "f", "i", "s", 'f', Blocks.iron_bars, 'i', Items.iron_ingot, 's', Blocks.stone_slab));
    }

    if (blockXPBottlerEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.xpBottler, "iii", "ibi", "iii", 'i', Items.iron_ingot, 'b', Items.glass_bottle));
    }

    if (blockVillageHighlighterEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.villageHighlighter, "www", "wew", "ccc", 'w', "plankWood", 'e', Items.emerald, 'c', Blocks.cobblestone));
    }

    if (blockPathEnabled) {
      recipeList.add(new ShapelessOreRecipe(new ItemStack(OpenBlocks.Blocks.path, 2), "stone", "cobblestone"));
    }

    if (blockAutoAnvilEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.autoAnvil, "iii", "iai", "rrr", 'i', Items.iron_ingot, 'a', Blocks.anvil, 'r', Items.redstone));
    }

    if (blockAutoEnchantmentTableEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.autoEnchantmentTable, "iii", "iei", "rrr", 'i', Items.iron_ingot, 'e', Blocks.enchanting_table, 'r', Items.redstone));
    }

    if (blockXPDrainEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.xpDrain, "iii", "iii", "iii", 'i', Blocks.iron_bars));
    }

    if (blockBlockBreakerEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.blockBreaker, "icc", "src", "icc", 'i', Items.iron_ingot, 'c', Blocks.cobblestone, 'r', Items.redstone, 's', Items.diamond_pickaxe));
    }

    if (blockBlockPlacerEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.blockPlacer, "icc", "src", "icc", 'i', Items.iron_ingot, 'c', Blocks.cobblestone, 'r', Items.redstone, 's', Blocks.piston));
    }

    if (blockItemDropperEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.itemDropper, "icc", "src", "icc", 'i', Items.iron_ingot, 'c', Blocks.cobblestone, 'r', Items.redstone, 's', Blocks.hopper));
    }

    if (blockRopeLadderEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.ropeLadder, "sts", "sts", "sts", 't', "stickWood", 's', Items.string));
    }

    if (blockDonationStationEnabled) {
      WeightedRandomChestContent drop = new WeightedRandomChestContent(new ItemStack(OpenBlocks.Blocks.donationStation), 1, 1, 2);
      ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(drop);
      ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(drop);
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.donationStation, "ppp", "pcp", "ppp", 'p', Items.porkchop, 'c', Blocks.chest));
    }

    if (blockPaintMixerEnabled) {

      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.paintMixer, "ooo", "i i", "iii", 'o', Blocks.obsidian, 'i', Items.iron_ingot));
    }

    if (blockCanvasEnabled) {

      recipeList.add(new ShapedOreRecipe(new ItemStack(OpenBlocks.Blocks.canvas, 9), "ppp", "pfp", "ppp", 'p', Items.paper, 'f', Blocks.fence));
    }

    if (blockProjectorEnabled) {

      final ItemStack lapis = new ItemStack(Items.dye, 1, ColorUtils.BLUE);
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.projector, "grl", "iri", "srs", 's', Blocks.stone_slab, 'r', Items.redstone, 'g', Items.glowstone_dust, 'i', Items.iron_ingot, 'l', lapis));
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.projector, "lrg", "iri", "srs", 's', Blocks.stone_slab, 'r', Items.redstone, 'g', Items.glowstone_dust, 'i', Items.iron_ingot, 'l', lapis));
    }

    if (blockGoldenEggEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.goldenEgg, "ggg", "geg", "ggg", 'g', Items.gold_ingot, 'e', Items.egg));
    }

    if (blockSkyEnabled) {

      final ItemStack normal6 = new ItemStack(OpenBlocks.Blocks.sky, 6, 0);
      final ItemStack normal = new ItemStack(OpenBlocks.Blocks.sky, 1, 1);
      final ItemStack inverted = new ItemStack(OpenBlocks.Blocks.sky, 1, 0);
      recipeList.add(new ShapedOreRecipe(normal6, "geg", "gsg", "geg", 'g', Blocks.glass, 'e', Items.ender_pearl, 's', Blocks.end_stone));
      recipeList.add(new ShapelessOreRecipe(inverted, normal, Blocks.redstone_torch));
      recipeList.add(new ShapelessOreRecipe(normal, inverted, Blocks.redstone_torch));
    }

    if (blockDrawingTableEnabled) {

      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.drawingTable, "sks", "pcp", "ppp", 'p', Blocks.planks, 'c', Blocks.crafting_table, 's', MetasGeneric.unpreparedStencil.newItemStack(), 'k', MetasGeneric.sketchingPencil.newItemStack()));
    }

    // TODO PORT RADIO
//		if (blockRadioEnabled) {
//
//			recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.radio, "pbp", "prp", "pgp", 'p', "plankWood", 'b', Blocks.iron_bars, 'r', Items.redstone, 'g', Items.gold_ingot));
//		}

    if (blockXPShowerEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Blocks.xpShower, "iii", "  o", 'i', Items.iron_ingot, 'o', Blocks.obsidian));
    }

    if (itemHangGliderEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Items.hangGlider, "wsw", 'w', MetasGeneric.gliderWing.newItemStack(), 's', "stickWood"));
    }

    if (itemLuggageEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Items.luggage, "sds", "scs", "sss", 's', "stickWood", 'd', Items.diamond, 'c', Blocks.chest));
    }

    if (itemSonicGlassesEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Items.sonicGlasses, "ihi", "oso", "   ", 's', "stickWood", 'h', Items.iron_helmet, 'o', Blocks.obsidian, 'i', Items.iron_ingot));
      ItemStack stack = new ItemStack(OpenBlocks.Items.sonicGlasses);
      WeightedRandomChestContent drop = new WeightedRandomChestContent(stack, 1, 1, 2);
      ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(drop);
    }

    if (OpenBlocks.Blocks.imaginary != null) {
      if (itemGlassesPencilEnabled) {

        ItemStack block = new ItemStack(OpenBlocks.Blocks.imaginary, 1, ItemImaginary.DAMAGE_PENCIL);
        ItemImaginary.setupValues(null, block);
        recipeList.add(new ShapelessOreRecipe(OpenBlocks.Items.pencilGlasses, block, Items.paper));
      }

      if (itemGlassesCrayonEnabled) {

        recipeList.add(new CrayonGlassesRecipe());
      }

      if (itemGlassesTechnicolorEnabled) {

        WeightedRandomChestContent drop = new WeightedRandomChestContent(new ItemStack(OpenBlocks.Items.technicolorGlasses), 1, 1, 2);
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(drop);
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(drop);
      }
    }

    if (itemCraneControlEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Items.craneControl, "ili", "grg", "iri", 'i', Items.iron_ingot, 'g', Items.gold_nugget, 'l', Items.glowstone_dust, 'r', Items.redstone));
    }

    if (itemCraneEnabled) {
      ItemStack line = MetasGeneric.line.newItemStack();
      ItemStack beam = MetasGeneric.beam.newItemStack();
      recipeList.add(new ShapelessOreRecipe(OpenBlocks.Items.craneBackpack, MetasGeneric.craneEngine.newItemStack(), MetasGeneric.craneMagnet.newItemStack(), beam, beam, line, line, line, Items.leather));
    }

    if (itemSlimalyzerEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Items.slimalyzer, "igi", "isi", "iri", 'i', Items.iron_ingot, 'g', Blocks.glass_pane, 's', Items.slime_ball, 'r', Items.redstone));
    }

    if (itemSleepingBagEnabled && EntityPlayerVisitor.IsInBedHookSuccess) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Items.sleepingBag, "cc ", "www", "ccw", 'c', Blocks.carpet, 'w', Blocks.wool));
    }

    if (itemPaintBrushEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Items.paintBrush, "w  ", " s ", "  s", 'w', Blocks.wool, 's', "stickWood"));
      int[] colors = new int[] { 0xFF0000, 0x00FF00, 0x0000FF };
      for (int color : colors) {
        ItemStack stack = ItemPaintBrush.createStackWithColor(color);
        WeightedRandomChestContent drop = new WeightedRandomChestContent(stack, 1, 1, 2);
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(drop);
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(drop);
        ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(drop);
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(drop);
      }
    }

    if (itemStencilEnabled) {
      for (Stencil stencil : Stencil.values()) {
        WeightedRandomChestContent drop = new WeightedRandomChestContent(new ItemStack(OpenBlocks.Items.stencil, 1, stencil.ordinal()), 1, 1, 2);
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(drop);
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(drop);
      }
    }

    if (itemSqueegeeEnabled) {
      if (OpenBlocks.Blocks.sponge != null) {
        recipeList.add(new ShapedOreRecipe(OpenBlocks.Items.squeegee, "sss", " w ", " w ", 's', OpenBlocks.Blocks.sponge, 'w', "stickWood"));
      } else {
        recipeList.add(new ShapedOreRecipe(OpenBlocks.Items.squeegee, "sss", " w ", " w ", 's', Items.slime_ball, 'w', "stickWood"));
      }
    }

    if (itemHeightMapEnabled) {
      if (itemEmptyMapEnabled) recipeList.add(new MapCloneRecipe());
    }

    if (itemEmptyMapEnabled) {
      recipeList.add(new MapResizeRecipe());

      ItemStack memory = MetasGeneric.mapMemory.newItemStack(2);
      ItemStack cpu = MetasGeneric.mapController.newItemStack(1);
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Items.emptyMap.createMap(0),
          " m ", "mcm", " m ", 'm', memory, 'c', cpu));
    }

    if (itemCartographerEnabled) {

      recipeList.add(new ShapelessOreRecipe(OpenBlocks.Items.cartographer, MetasGeneric.assistantBase.newItemStack(), Items.ender_eye));
    }

    if (itemGoldenEyeEnabled) {

      recipeList.add(new GoldenEyeRechargeRecipe());
      recipeList.add(new ShapedOreRecipe(new ItemStack(OpenBlocks.Items.goldenEye, 1, ItemGoldenEye.MAX_DAMAGE), "ggg", "geg", "ggg", 'g', Items.gold_nugget, 'e', Items.ender_eye));
    }

    if (itemTastyClayEnabled) {

      final ItemStack cocoa = new ItemStack(Items.dye, 1, ColorUtils.BROWN);
      recipeList.add(new ShapelessOreRecipe(new ItemStack(OpenBlocks.Items.tastyClay, 2), Items.clay_ball, Items.milk_bucket, cocoa));
    }

    if (itemCursorEnabled) {

      final ItemStack whiteWool = ColorUtils.createDyedWool(ColorUtils.WHITE);
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Items.cursor, "w  ", "www", "www", 'w', whiteWool));
    }

    if (itemTunedCrystalEnabled) {
//

//			for (RadioStation station : RadioManager.instance.getRadioStations()) {
//				WeightedRandomChestContent drop = new WeightedRandomChestContent(station.getStack().copy(), 1, 1, 2);
//				ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(drop);
//				ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(drop);
//			} TODO PORT RADIO
    }

    if (itemInfoBookEnabled) {
      recipeList.add(new ShapelessOreRecipe(new ItemStack(OpenBlocks.Items.infoBook), Items.clay_ball, Items.book));
    }

    if (itemDevNullEnabled) {

      MinecraftForge.EVENT_BUS.register(OpenBlocks.Items.devNull);
      recipeList.add(new ShapelessOreRecipe(new ItemStack(OpenBlocks.Items.devNull), Blocks.cobblestone, Items.apple));
    }

    if (itemSpongeOnAStickEnabled) {
      if (OpenBlocks.Blocks.sponge != null) {
        recipeList.add(new ShapedOreRecipe(OpenBlocks.Items.spongeonastick, " s ", " w ", " w ", 's', OpenBlocks.Blocks.sponge, 'w', "stickWood"));
      }
    }

    if (itemPedometerEnabled) {
      recipeList.add(new ShapedOreRecipe(OpenBlocks.Items.pedometer, "www", "rcr", "www", 'w', "plankWood", 'r', Items.redstone, 'c', Items.clock));
    }

    if (Enchantments.flimFlam != null) {
      for (int i = 0; i < 4; i++) {
        int emeraldCount = 1 << i;
        ItemStack result = Items.enchanted_book.getEnchantedItemStack(new EnchantmentData(Enchantments.flimFlam, i + 1));
        Object recipe[] = new Object[emeraldCount + 1];
        recipe[0] = Items.book;
        Arrays.fill(recipe, 1, recipe.length, Items.emerald);
        recipeList.add(new ShapelessOreRecipe(result, recipe));
      }
    }
  }

}
