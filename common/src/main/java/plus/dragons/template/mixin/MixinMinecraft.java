package plus.dragons.template.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.Minecraft;

import plus.dragons.template.TemplateVersion;

@Mixin(Minecraft.class)
public class MixinMinecraft {
	@Inject(at = @At("TAIL"), method = "<init>")
	private void init(CallbackInfo info) {
		TemplateVersion.LOGGER.info("This line is printed by an example mod common mixin!");
		TemplateVersion.LOGGER.info("MC Version: {}", Minecraft.getInstance().getVersionType());
	}
}
