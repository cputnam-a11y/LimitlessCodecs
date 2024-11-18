package boundlesscodecs.impl.mixin;

import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(targets = "com.mojang.serialization.codecs.RecordCodecBuilder$2", remap = false)
public interface RecordCodecBuilderMapCodecAccessor {
    @Accessor("val$builder")
    RecordCodecBuilder<?, ?> getBuilder();
}
