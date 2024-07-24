package plus.dragons.template;

import net.minecraft.resources.ResourceLocation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import plus.dragons.template.platform.Services;

public class TemplateVersion {
	public static final String ID = "template";
	public static final String NAME = "Template";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	public static String version() {
		return Services.PLATFORM.getModVersion(ID);
	}

	public static ResourceLocation location(String path) {
		return ResourceLocation.fromNamespaceAndPath(ID, path);
	}
}
