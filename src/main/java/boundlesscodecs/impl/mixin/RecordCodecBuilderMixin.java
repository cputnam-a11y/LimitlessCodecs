package boundlesscodecs.impl.mixin;

import boundlesscodecs.impl.duck.RecordCodecBuilderAccessorImpl;
import com.mojang.serialization.MapDecoder;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Function;

@Mixin(value = RecordCodecBuilder.class, remap = false)
public class RecordCodecBuilderMixin implements RecordCodecBuilderAccessorImpl {
    @Unique
    private boolean isTrue;
    @Unique
    private Function<?, ?> getter;
    @Unique
    private RecordCodecBuilder<?, ?> unbox;
    @Unique
    private Function<?, ?> func;
    @SuppressWarnings("rawtypes")
    @Inject(method = "<init>", at = @At("TAIL"))
    private void init(Function getter, Function encoder, MapDecoder decoder, CallbackInfo ci) {
        this.isTrue = false;
        this.getter = null;
        this.unbox = null;
        this.func = null;
    }
    public boolean limitlessCodecs$isImplemented() {
        return isTrue;
    }

    @Override
    public void limitlessCodecs$setImplemented(boolean value) {
        isTrue = value;
    }

    @Override
    public Function<?, ?> limitlessCodecs$getGetter() {
        if (getter == null) {
            throw new IllegalStateException("RecordCodecBuilderAccessorImpl is not Implemented for this RecordCodecBuilder instance");
        }
        return getter;
    }

    @Override
    public RecordCodecBuilder<?, ?> limitlessCodecs$getUnbox() {
        if (unbox == null) {
            throw new IllegalStateException("RecordCodecBuilderAccessorImpl is not Implemented for this RecordCodecBuilder instance");
        }
        return unbox;
    }

    @Override
    public Function<?, ?> limitlessCodecs$getFunc() {
        if (func == null) {
            throw new IllegalStateException("RecordCodecBuilderAccessorImpl is not Implemented for this RecordCodecBuilder instance");
        }
        return func;
    }

    @Override
    public void limitlessCodecs$setGetter(Function<?, ?> getter) {
        this.getter = getter;
    }

    @Override
    public void limitlessCodecs$setUnbox(RecordCodecBuilder<?, ?> unbox) {
        this.unbox = unbox;
    }

    @Override
    public void limitlessCodecs$setFunc(Function<?, ?> func) {
        this.func = func;
    }
}
