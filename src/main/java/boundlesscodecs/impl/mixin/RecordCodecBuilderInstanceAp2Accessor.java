package boundlesscodecs.impl.mixin;

import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.function.BiFunction;

@Mixin(targets = "com.mojang.serialization.codecs.RecordCodecBuilder$Instance$3", remap = false)
public interface RecordCodecBuilderInstanceAp2Accessor {
    @Accessor("val$function")
    RecordCodecBuilder<?, BiFunction<?, ?, ?>> getFunction();
    @Accessor("val$fa")
    RecordCodecBuilder<?, ?> getFA();
    @Accessor("val$fb")
    RecordCodecBuilder<?, ?> getFB();
}
