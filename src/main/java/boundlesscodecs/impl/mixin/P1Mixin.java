package boundlesscodecs.impl.mixin;

import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.kinds.K1;
import boundlesscodecs.impl.extensions.ProductsExtensionImpl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.function.Function;

@Mixin(value = Products.P1.class, remap = false)
public class P1Mixin<F extends K1, T1> implements ProductsExtensionImpl.P1<F, T1> {


    @Override
    @Shadow
    public App<F, T1> t1() {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public <R> App<F, R> apply(Applicative<F, ?> instance, Function<T1, R> function) {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public <R> App<F, R> apply(Applicative<F, ?> instance, App<F, Function<T1, R>> function) {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public <T2> Products.P2<F, T1, T2> and(final App<F, T2> t2) {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public <T2, T3> Products.P3<F, T1, T2, T3> and(Products.P2<F, T2, T3> p) {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public <T2, T3, T4> Products.P4<F, T1, T2, T3, T4> and(Products.P3<F, T2, T3, T4> p) {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public <T2, T3, T4, T5> Products.P5<F, T1, T2, T3, T4, T5> and(Products.P4<F, T2, T3, T4, T5> p) {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public <T2, T3, T4, T5, T6> Products.P6<F, T1, T2, T3, T4, T5, T6> and(Products.P5<F, T2, T3, T4, T5, T6> p) {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public <T2, T3, T4, T5, T6, T7> Products.P7<F, T1, T2, T3, T4, T5, T6, T7> and(Products.P6<F, T2, T3, T4, T5, T6, T7> p) {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public <T2, T3, T4, T5, T6, T7, T8> Products.P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(Products.P7<F, T2, T3, T4, T5, T6, T7, T8> p) {
        throw new AssertionError("Implemented By Mixin");
    }

}
