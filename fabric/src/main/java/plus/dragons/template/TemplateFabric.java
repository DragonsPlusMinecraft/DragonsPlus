package plus.dragons.template;

import net.fabricmc.api.ModInitializer;

public class TemplateFabric implements ModInitializer {
	@Override
	public void onInitialize() {
		new Template();
		TemplateVersion.LOGGER.info(TemplateVersion.NAME + " initialized on Fabric!");
	}
}
