package boundlesscodecs.impl.mixin;

import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.kinds.K1;
import boundlesscodecs.impl.extensions.ProductsExtensionImpl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.function.BiFunction;

@Mixin(value = Products.P2.class, remap = false)
public class P2Mixin<F extends K1, T1, T2> implements ProductsExtensionImpl.P2<F, T1, T2> {

    @Shadow
    public <R> App<F, R> apply(Applicative<F, ?> instance, BiFunction<T1, T2, R> function) {
        throw new AssertionError("Implemented By Mixin");
    }

    @Shadow
    public <R> App<F, R> apply(Applicative<F, ?> instance, App<F, BiFunction<T1, T2, R>> function) {
        throw new AssertionError("Implemented By Mixin");
    }

    @Shadow
    public App<F, T1> t1() {
        throw new AssertionError("Implemented By Mixin");
    }

    @Shadow
    public App<F, T2> t2() {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public <T3> Products.P3<F, T1, T2, T3> and(App<F, T3> t3) {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public <T3, T4> Products.P4<F, T1, T2, T3, T4> and(Products.P2<F, T3, T4> p) {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public <T3, T4, T5> Products.P5<F, T1, T2, T3, T4, T5> and(Products.P3<F, T3, T4, T5> p) {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public <T3, T4, T5, T6> Products.P6<F, T1, T2, T3, T4, T5, T6> and(Products.P4<F, T3, T4, T5, T6> p) {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public <T3, T4, T5, T6, T7> Products.P7<F, T1, T2, T3, T4, T5, T6, T7> and(Products.P5<F, T3, T4, T5, T6, T7> p) {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public <T3, T4, T5, T6, T7, T8> Products.P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(Products.P6<F, T3, T4, T5, T6, T7, T8> p) {
        throw new AssertionError("Implemented By Mixin");
    }
}
