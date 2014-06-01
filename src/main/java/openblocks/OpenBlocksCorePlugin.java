package openblocks;

import java.util.Map;
import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.SortingIndex;
import org.apache.logging.log4j.LogManager;

//must be higher than one in openmodslib
@SortingIndex(32)
public class OpenBlocksCorePlugin implements IFMLLoadingPlugin {

  public static org.apache.logging.log4j.Logger log = LogManager.getLogger("OpenBlocksCore");

  // TODO: Cannot set logger parent to FML without serious gymnastics

	@Override
	public String[] getASMTransformerClass() {
		return new String[] { "openblocks.asm.OpenBlocksClassTransformer" };
	}

	@Override
	public String getModContainerClass() {
		return null;
	}

	@Override
	public String getSetupClass() {
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {}

  @Override
  public String getAccessTransformerClass() {
    return null;
  }

  @Deprecated
	public String[] getLibraryRequestClass() {
		return null;
	}

}
