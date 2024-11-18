package boundlesscodecs.impl.duck;

import com.mojang.serialization.codecs.RecordCodecBuilder;

import java.util.function.Function;

public interface RecordCodecBuilderAccessorImpl {
    boolean limitlessCodecs$isImplemented();
    void limitlessCodecs$setImplemented(boolean value);
    Function<?, ?> limitlessCodecs$getGetter();
    RecordCodecBuilder<?, ?> limitlessCodecs$getUnbox();
    Function<?, ?> limitlessCodecs$getFunc();
    void limitlessCodecs$setGetter(Function<?, ?> getter);
    void limitlessCodecs$setUnbox(RecordCodecBuilder<?, ?> unbox);
    void limitlessCodecs$setFunc(Function<?, ?> func);
}
