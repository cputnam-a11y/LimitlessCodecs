package boundlesscodecs.impl.mixin;

import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(targets = "com.mojang.serialization.RecordCodecBuilder$Instance$1", remap = false)
public interface RecordCodecBuilderInstanceLift1Accessor {
    @Accessor
    RecordCodecBuilder<?, ?> getA();

    @Accessor
    RecordCodecBuilder<?, ?> getB();
}
