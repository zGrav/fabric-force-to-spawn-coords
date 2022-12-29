package zgrav.fabricforcetospawncoords.mixins;

import net.minecraft.server.network.ServerPlayerEntity;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayerEntity.class)
public class TeleportOnLoginMixin {
    @Inject(method = "onSpawn", at = @At("TAIL"))
    private void teleportOnLogin(CallbackInfo ci) {
        ServerPlayerEntity player = (ServerPlayerEntity) (Object) this;
        player.teleport(6,64,34);
    }
}
