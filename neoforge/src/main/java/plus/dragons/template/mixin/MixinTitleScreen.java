package plus.dragons.template.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.TitleScreen;

import plus.dragons.template.TemplateVersion;

@Mixin(TitleScreen.class)
public class MixinTitleScreen {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		TemplateVersion.LOGGER.info("This line is printed by an example mod mixin from NeoForge!");
		TemplateVersion.LOGGER.info("MC Version: {}", Minecraft.getInstance().getVersionType());
	}
}
