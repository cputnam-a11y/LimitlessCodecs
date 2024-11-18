package boundlesscodecs.impl.mixin;

import boundlesscodecs.impl.duck.RecordCodecBuilderAccessorImpl;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.function.Function;

@Mixin(value = RecordCodecBuilder.Instance.class, remap = false)
public class RecordCodecBuilderInstanceMapMixin {
    @SuppressWarnings("DataFlowIssue")
    @ModifyExpressionValue(method = "map", at = @At(value = "NEW", target = "(Ljava/util/function/Function;Ljava/util/function/Function;Lcom/mojang/serialization/MapDecoder;)Lcom/mojang/serialization/codecs/RecordCodecBuilder;"))
    private RecordCodecBuilder<?, ?> limitlessCodecs$wrapMap(RecordCodecBuilder<?, ?> original, @Local(index = 3) RecordCodecBuilder<?, ?> unbox, @Local(index = 4) Function<?, ?> getter, @Local(index = 1, argsOnly = true) Function<?, ?> func) {
        ((RecordCodecBuilderAccessorImpl) (Object) original).limitlessCodecs$setUnbox(unbox);
        ((RecordCodecBuilderAccessorImpl) (Object) original).limitlessCodecs$setGetter(getter);
        ((RecordCodecBuilderAccessorImpl) (Object) original).limitlessCodecs$setFunc(func);
        ((RecordCodecBuilderAccessorImpl) (Object) original).limitlessCodecs$setImplemented(true);
        return original;
    }
}
