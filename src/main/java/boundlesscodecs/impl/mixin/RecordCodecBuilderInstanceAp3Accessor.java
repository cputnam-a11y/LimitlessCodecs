package boundlesscodecs.impl.mixin;

import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.function.BiFunction;

@Mixin(targets = "com.mojang.serialization.codecs.RecordCodecBuilder$Instance$5", remap = false)
public interface RecordCodecBuilderInstanceAp3Accessor {
    @Accessor("val$function")
    RecordCodecBuilder<?, BiFunction<?, ?, ?>> getFunction();
    @Accessor("val$f1")
    RecordCodecBuilder<?, ?> getF1();
    @Accessor("val$f2")
    RecordCodecBuilder<?, ?> getF2();
    @Accessor("val$f3")
    RecordCodecBuilder<?, ?> getF3();
}
