package plus.dragons.template;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(value = TemplateVersion.ID, dist = Dist.CLIENT)
public class TemplateNeoForgeClient extends TemplateClient {
	public TemplateNeoForgeClient(IEventBus eventBus) {
		TemplateVersion.LOGGER.info(TemplateVersion.NAME + " Client initialized on NeoForge!");
	}
}
