package plus.dragons.template;

import net.fabricmc.api.ClientModInitializer;

public class TemplateFabricClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		new TemplateClient();
		TemplateVersion.LOGGER.info(TemplateVersion.NAME + " Client initialized on Fabric!");
	}
}
