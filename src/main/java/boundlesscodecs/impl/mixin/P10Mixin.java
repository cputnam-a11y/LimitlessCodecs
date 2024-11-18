package boundlesscodecs.impl.mixin;

import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.util.Function10;
import boundlesscodecs.impl.extensions.ProductsExtensionImpl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value = Products.P10.class, remap = false)
public abstract class P10Mixin<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> implements ProductsExtensionImpl.P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> {


    @Override
    @Accessor("t1")
    public abstract App<F, T1> t1();

    @Override
    @Accessor("t2")
    public abstract App<F, T2> t2();

    @Override
    @Accessor("t3")
    public abstract App<F, T3> t3();

    @Override
    @Accessor("t4")
    public abstract App<F, T4> t4();

    @Override
    @Accessor("t5")
    public abstract App<F, T5> t5();

    @Override
    @Accessor("t6")
    public abstract App<F, T6> t6();

    @Override
    @Accessor("t7")
    public abstract App<F, T7> t7();

    @Override
    @Accessor("t8")
    public abstract App<F, T8> t8();

    @Override
    @Accessor("t9")
    public abstract App<F, T9> t9();

    @Override
    @Accessor("t10")
    public abstract App<F, T10> t10();

    @Override
    @Shadow
    public <R> App<F, R> apply(Applicative<F, ?> instance, Function10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> function) {
        throw new AssertionError("Implemented By Mixin");
    }

    @Override
    @Shadow
    public <R> App<F, R> apply(Applicative<F, ?> instance, App<F, Function10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R>> function) {
        throw new AssertionError("Implemented By Mixin");
    }
}
