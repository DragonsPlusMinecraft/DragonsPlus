package plus.dragons.template;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(TemplateVersion.ID)
public class TemplateNeoForge extends Template {
	public TemplateNeoForge(IEventBus eventBus) {
		TemplateVersion.LOGGER.info(TemplateVersion.NAME + " initialized on NeoForge!");
	}
}
