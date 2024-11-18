package boundlesscodecs.impl.mixin;

import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.kinds.K1;
import boundlesscodecs.impl.extensions.kinds.ApplicativeExtensionImpl;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Applicative.class)
public interface ApplicativeMixin<F extends K1, Mu extends Applicative.Mu> extends ApplicativeExtensionImpl<F, Mu> {
}
