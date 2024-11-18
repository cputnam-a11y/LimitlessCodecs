package boundlesscodecs.impl.mixin;

import com.mojang.serialization.codecs.RecordCodecBuilder;
import boundlesscodecs.impl.extensions.RecordCodecBuilderExtensionImpl;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(RecordCodecBuilder.Instance.class)
public abstract class InstanceMixin<O> implements RecordCodecBuilderExtensionImpl.Instance<O> {
}
