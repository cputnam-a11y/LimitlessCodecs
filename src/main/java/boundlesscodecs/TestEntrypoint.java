package boundlesscodecs;

import boundlesscodecs.impl.duck.RecordCodecBuilderAccessorImpl;
import boundlesscodecs.impl.mixin.*;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestEntrypoint implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("BoundlessCodecs");
    @SuppressWarnings({"DataFlowIssue", "ReferenceToMixin"})
    @Override
    public void onInitialize() {
        LOGGER.info("Hello from BoundlessCodecs!");
        MapCodec<TestRecord> MAP_CODEC = ((MapCodec.MapCodecCodec<TestRecord>)TestRecord.CODEC).codec();
        var builder = ((RecordCodecBuilderMapCodecAccessor) MAP_CODEC).getBuilder();
        switch ((Object)builder) {
            case RecordCodecBuilderAccessorImpl impl when impl.limitlessCodecs$isImplemented() -> {

            }
            case RecordCodecBuilderInstanceLift1Accessor impl -> {
                var a = impl.getA();
                var b = impl.getB();
                LOGGER.info("RecordCodecBuilderInstanceLift1Accessor: a={}, b={}", a, b);
            }
            case RecordCodecBuilderInstanceAp2Accessor impl -> {
                var func = impl.getFunction();
                var a = impl.getFA();
                var b = impl.getFB();
                LOGGER.info("RecordCodecBuilderInstanceAp2Accessor: a={}, b={}", a, b);
            }
            case RecordCodecBuilderInstanceAp3Accessor impl -> {
                var f1 = impl.getF1();
                var f2 = impl.getF2();
                var f3 = impl.getF3();
                var func = impl.getFunction();
                LOGGER.info("RecordCodecBuilderInstanceAp3Accessor: f1={}, f2={}, f3={}", f1, f2, f3);
            }
            case RecordCodecBuilderInstanceAp4Accessor impl -> {
                var f1 = impl.getF1();
                var f2 = impl.getF2();
                var f3 = impl.getF3();
                var f4 = impl.getF4();
                var func = impl.getFunction();
                LOGGER.info("RecordCodecBuilderInstanceAp4Accessor: f1={}, f2={}, f3={}, f4={}, f5={}, f6={}", f1, f2, f3, f4);
            }
            default -> {
                LOGGER.info("RecordCodecBuilder: {}", builder);
            }
        }
        LOGGER.info("RecordCodecBuilder: {}", builder);
        LOGGER.info("Goodbye from BoundlessCodecs!");
    }
    record TestRecord(String name, int age) {
        public static final Codec<TestRecord> CODEC =
                RecordCodecBuilder.create(
                        instance -> instance.group(
                                Codec.STRING.fieldOf("name").forGetter(TestRecord::name),
                                Codec.INT.fieldOf("age").forGetter(TestRecord::age)
                        ).apply(instance, TestRecord::new)
                );
    }
}
