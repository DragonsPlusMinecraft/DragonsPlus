package plus.dragons.template.platform;

import com.google.auto.service.AutoService;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;

@AutoService(Platform.class)
public class NeoForgePlatform implements Platform {
	@Override
	public String getPlatformName() {
		return "NeoForge";
	}

	@Override
	public boolean isModLoaded(String modId) {
		return ModList.get().isLoaded(modId);
	}

	@Override
	public String getModVersion(String modId) {
		return ModList.get().getModFileById(modId).versionString();
	}

	@Override
	public boolean isDevelopmentEnvironment() {
		return !FMLLoader.isProduction();
	}

	@Override
	public boolean isClientDistribution() {
		return FMLLoader.getDist().isClient();
	}
}
