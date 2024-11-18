package boundlesscodecs.impl.mixin;

import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.util.Function6;
import boundlesscodecs.impl.extensions.ProductsExtensionImpl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value = Products.P6.class, remap = false)
public class P6Mixin<F extends K1, T1, T2, T3, T4, T5, T6> implements ProductsExtensionImpl.P6<F, T1, T2, T3, T4, T5, T6> {

    @Override
    @Shadow
    public App<F, T1> t1() {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public App<F, T2> t2() {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public App<F, T3> t3() {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public App<F, T4> t4() {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public App<F, T5> t5() {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public App<F, T6> t6() {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public <R> App<F, R> apply(Applicative<F, ?> instance, Function6<T1, T2, T3, T4, T5, T6, R> function) {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public <R> App<F, R> apply(Applicative<F, ?> instance, App<F, Function6<T1, T2, T3, T4, T5, T6, R>> function) {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public <T7> Products.P7<F, T1, T2, T3, T4, T5, T6, T7> and(App<F, T7> t7) {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public <T7, T8> Products.P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(Products.P2<F, T7, T8> p) {
        throw new AssertionError("Implemented By Mixin");
    }
}
