package plus.dragons.template.platform;

import com.google.auto.service.AutoService;

import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.FabricLoader;

@AutoService(Platform.class)
public class FabricPlatform implements Platform {
	@Override
	public String getPlatformName() {
		return "Fabric";
	}

	@Override
	public boolean isModLoaded(String modId) {
		return FabricLoader.getInstance().isModLoaded(modId);
	}

	@Override
	public String getModVersion(String modId) {
		return FabricLoader.getInstance().getModContainer(modId)
			.map(container -> container.getMetadata().getVersion().getFriendlyString())
			.orElse("0");
	}

	@Override
	public boolean isDevelopmentEnvironment() {
		return FabricLoader.getInstance().isDevelopmentEnvironment();
	}

	@Override
	public boolean isClientDistribution() {
		return FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT;
	}
}
