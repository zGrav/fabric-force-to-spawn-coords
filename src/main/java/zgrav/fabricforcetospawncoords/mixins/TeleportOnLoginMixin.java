package zgrav.fabricforcetospawncoords.mixins;

import net.minecraft.network.ClientConnection;
import net.minecraft.server.PlayerManager;
import net.minecraft.server.network.ServerPlayerEntity;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerManager.class)
public class TeleportOnLoginMixin {
    @Inject(method = "onPlayerConnect", at = @At("TAIL"))
    private void teleportOnLogin(ClientConnection connection, ServerPlayerEntity player, CallbackInfo ci) {
        player.teleport(6,64,34);
    }
}