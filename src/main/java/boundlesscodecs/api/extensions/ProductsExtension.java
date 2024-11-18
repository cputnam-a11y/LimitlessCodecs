package boundlesscodecs.api.extensions;

import boundlesscodecs.impl.util.*;
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.util.*;

import java.util.function.BiFunction;
import java.util.function.Function;

@SuppressWarnings("unused")
public interface ProductsExtension {
    interface P1<F extends K1, T1> {

        <T2> Products.P2<F, T1, T2> and(final App<F, T2> t2);

        <T2, T3> Products.P3<F, T1, T2, T3> and(final Products.P2<F, T2, T3> p);

        <T2, T3, T4> Products.P4<F, T1, T2, T3, T4> and(final Products.P3<F, T2, T3, T4> p);

        <T2, T3, T4, T5> Products.P5<F, T1, T2, T3, T4, T5> and(final Products.P4<F, T2, T3, T4, T5> p);

        <T2, T3, T4, T5, T6> Products.P6<F, T1, T2, T3, T4, T5, T6> and(final Products.P5<F, T2, T3, T4, T5, T6> p);

        <T2, T3, T4, T5, T6, T7> Products.P7<F, T1, T2, T3, T4, T5, T6, T7> and(final Products.P6<F, T2, T3, T4, T5, T6, T7> p);

        <T2, T3, T4, T5, T6, T7, T8> Products.P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final Products.P7<F, T2, T3, T4, T5, T6, T7, T8> p);

        <T2, T3, T4, T5, T6, T7, T8, T9> Products.P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final Products.P8<F, T2, T3, T4, T5, T6, T7, T8, T9> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10> Products.P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final Products.P9<F, T2, T3, T4, T5, T6, T7, T8, T9, T10> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> Products.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final Products.P10<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Products.P11<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P12<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P13<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P14<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P15<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P16<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final P17<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final P18<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final P19<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final P20<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final P21<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final P22<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final P23<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final P24<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final P25<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final P26<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final P27<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final P28<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final P29<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final P30<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final P31<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function<T1, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function<T1, R>> function);

    }

    interface P2<F extends K1, T1, T2> {
        <T3> Products.P3<F, T1, T2, T3> and(final App<F, T3> t3);

        <T3, T4> Products.P4<F, T1, T2, T3, T4> and(final Products.P2<F, T3, T4> p);

        <T3, T4, T5> Products.P5<F, T1, T2, T3, T4, T5> and(final Products.P3<F, T3, T4, T5> p);

        <T3, T4, T5, T6> Products.P6<F, T1, T2, T3, T4, T5, T6> and(final Products.P4<F, T3, T4, T5, T6> p);

        <T3, T4, T5, T6, T7> Products.P7<F, T1, T2, T3, T4, T5, T6, T7> and(final Products.P5<F, T3, T4, T5, T6, T7> p);

        <T3, T4, T5, T6, T7, T8> Products.P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final Products.P6<F, T3, T4, T5, T6, T7, T8> p);

        <T3, T4, T5, T6, T7, T8, T9> Products.P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final Products.P7<F, T3, T4, T5, T6, T7, T8, T9> p);

        <T3, T4, T5, T6, T7, T8, T9, T10> Products.P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final Products.P8<F, T3, T4, T5, T6, T7, T8, T9, T10> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11> Products.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final Products.P9<F, T3, T4, T5, T6, T7, T8, T9, T10, T11> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Products.P10<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P11<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P12<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P13<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P14<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P15<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P16<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final P17<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final P18<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final P19<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final P20<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final P21<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final P22<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final P23<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final P24<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final P25<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final P26<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final P27<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final P28<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final P29<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final P30<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);


        App<F, T1> t1();

        App<F, T2> t2();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final BiFunction<T1, T2, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, BiFunction<T1, T2, R>> function);
    }

    interface P3<F extends K1, T1, T2, T3> {
        <T4> Products.P4<F, T1, T2, T3, T4> and(final App<F, T4> t4);

        <T4, T5> Products.P5<F, T1, T2, T3, T4, T5> and(final Products.P2<F, T4, T5> p);

        <T4, T5, T6> Products.P6<F, T1, T2, T3, T4, T5, T6> and(final Products.P3<F, T4, T5, T6> p);

        <T4, T5, T6, T7> Products.P7<F, T1, T2, T3, T4, T5, T6, T7> and(final Products.P4<F, T4, T5, T6, T7> p);

        <T4, T5, T6, T7, T8> Products.P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final Products.P5<F, T4, T5, T6, T7, T8> p);

        <T4, T5, T6, T7, T8, T9> Products.P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final Products.P6<F, T4, T5, T6, T7, T8, T9> p);

        <T4, T5, T6, T7, T8, T9, T10> Products.P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final Products.P7<F, T4, T5, T6, T7, T8, T9, T10> p);

        <T4, T5, T6, T7, T8, T9, T10, T11> Products.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final Products.P8<F, T4, T5, T6, T7, T8, T9, T10, T11> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Products.P9<F, T4, T5, T6, T7, T8, T9, T10, T11, T12> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P10<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P11<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P12<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P13<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P14<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P15<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P16<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final P17<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final P18<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final P19<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final P20<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final P21<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final P22<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final P23<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final P24<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final P25<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final P26<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final P27<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final P28<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final P29<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);


        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function3<T1, T2, T3, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function3<T1, T2, T3, R>> function);
    }

    interface P4<F extends K1, T1, T2, T3, T4> {
        <T5> Products.P5<F, T1, T2, T3, T4, T5> and(final App<F, T5> t5);

        <T5, T6> Products.P6<F, T1, T2, T3, T4, T5, T6> and(final Products.P2<F, T5, T6> p);

        <T5, T6, T7> Products.P7<F, T1, T2, T3, T4, T5, T6, T7> and(final Products.P3<F, T5, T6, T7> p);

        <T5, T6, T7, T8> Products.P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final Products.P4<F, T5, T6, T7, T8> p);

        <T5, T6, T7, T8, T9> Products.P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final Products.P5<F, T5, T6, T7, T8, T9> p);

        <T5, T6, T7, T8, T9, T10> Products.P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final Products.P6<F, T5, T6, T7, T8, T9, T10> p);

        <T5, T6, T7, T8, T9, T10, T11> Products.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final Products.P7<F, T5, T6, T7, T8, T9, T10, T11> p);

        <T5, T6, T7, T8, T9, T10, T11, T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Products.P8<F, T5, T6, T7, T8, T9, T10, T11, T12> p);

        <T5, T6, T7, T8, T9, T10, T11, T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P9<F, T5, T6, T7, T8, T9, T10, T11, T12, T13> p);

        <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P10<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> p);

        <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P11<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> p);

        <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P12<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> p);

        <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P13<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> p);

        <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P14<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> p);

        <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P15<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> p);

        <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P16<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> p);

        <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final P17<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p);

        <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final P18<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p);

        <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final P19<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p);

        <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final P20<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p);

        <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final P21<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p);

        <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final P22<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p);

        <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final P23<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p);

        <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final P24<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p);

        <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final P25<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final P26<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final P27<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final P28<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function4<T1, T2, T3, T4, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function4<T1, T2, T3, T4, R>> function);
    }

    interface P5<F extends K1, T1, T2, T3, T4, T5> {

        <T6> Products.P6<F, T1, T2, T3, T4, T5, T6> and(final App<F, T6> t6);

        <T6, T7> Products.P7<F, T1, T2, T3, T4, T5, T6, T7> and(final Products.P2<F, T6, T7> p);

        <T6, T7, T8> Products.P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final Products.P3<F, T6, T7, T8> p);

        <T6, T7, T8, T9> Products.P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final Products.P4<F, T6, T7, T8, T9> p);

        <T6, T7, T8, T9, T10> Products.P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final Products.P5<F, T6, T7, T8, T9, T10> p);

        <T6, T7, T8, T9, T10, T11> Products.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final Products.P6<F, T6, T7, T8, T9, T10, T11> p);

        <T6, T7, T8, T9, T10, T11, T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Products.P7<F, T6, T7, T8, T9, T10, T11, T12> p);

        <T6, T7, T8, T9, T10, T11, T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P8<F, T6, T7, T8, T9, T10, T11, T12, T13> p);

        <T6, T7, T8, T9, T10, T11, T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P9<F, T6, T7, T8, T9, T10, T11, T12, T13, T14> p);

        <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P10<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> p);

        <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P11<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> p);

        <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P12<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> p);

        <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P13<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> p);

        <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P14<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> p);

        <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P15<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> p);

        <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P16<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p);

        <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final P17<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p);

        <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final P18<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p);

        <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final P19<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p);

        <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final P20<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p);

        <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final P21<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p);

        <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final P22<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p);

        <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final P23<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p);

        <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final P24<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final P25<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final P26<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final P27<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function5<T1, T2, T3, T4, T5, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function5<T1, T2, T3, T4, T5, R>> function);
    }

    interface P6<F extends K1, T1, T2, T3, T4, T5, T6> {

        <T7> Products.P7<F, T1, T2, T3, T4, T5, T6, T7> and(final App<F, T7> t7);

        <T7, T8> Products.P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final Products.P2<F, T7, T8> p);

        <T7, T8, T9> Products.P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final Products.P3<F, T7, T8, T9> p);

        <T7, T8, T9, T10> Products.P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final Products.P4<F, T7, T8, T9, T10> p);

        <T7, T8, T9, T10, T11> Products.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final Products.P5<F, T7, T8, T9, T10, T11> p);

        <T7, T8, T9, T10, T11, T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Products.P6<F, T7, T8, T9, T10, T11, T12> p);

        <T7, T8, T9, T10, T11, T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P7<F, T7, T8, T9, T10, T11, T12, T13> p);

        <T7, T8, T9, T10, T11, T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P8<F, T7, T8, T9, T10, T11, T12, T13, T14> p);

        <T7, T8, T9, T10, T11, T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P9<F, T7, T8, T9, T10, T11, T12, T13, T14, T15> p);

        <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P10<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> p);

        <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P11<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> p);

        <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P12<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> p);

        <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P13<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> p);

        <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P14<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> p);

        <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P15<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p);

        <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P16<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p);

        <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final P17<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p);

        <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final P18<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p);

        <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final P19<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p);

        <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final P20<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p);

        <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final P21<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p);

        <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final P22<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p);

        <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final P23<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final P24<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final P25<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final P26<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function6<T1, T2, T3, T4, T5, T6, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function6<T1, T2, T3, T4, T5, T6, R>> function);
    }

    interface P7<F extends K1, T1, T2, T3, T4, T5, T6, T7> {

        <T8> Products.P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final App<F, T8> t8);

        <T8, T9> Products.P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final Products.P2<F, T8, T9> p);

        <T8, T9, T10> Products.P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final Products.P3<F, T8, T9, T10> p);

        <T8, T9, T10, T11> Products.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final Products.P4<F, T8, T9, T10, T11> p);

        <T8, T9, T10, T11, T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Products.P5<F, T8, T9, T10, T11, T12> p);

        <T8, T9, T10, T11, T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P6<F, T8, T9, T10, T11, T12, T13> p);

        <T8, T9, T10, T11, T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P7<F, T8, T9, T10, T11, T12, T13, T14> p);

        <T8, T9, T10, T11, T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P8<F, T8, T9, T10, T11, T12, T13, T14, T15> p);

        <T8, T9, T10, T11, T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P9<F, T8, T9, T10, T11, T12, T13, T14, T15, T16> p);

        <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P10<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> p);

        <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P11<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> p);

        <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P12<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> p);

        <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P13<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> p);

        <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P14<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p);

        <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P15<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p);

        <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P16<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p);

        <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final P17<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p);

        <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final P18<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p);

        <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final P19<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p);

        <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final P20<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p);

        <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final P21<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p);

        <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final P22<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final P23<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final P24<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final P25<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function7<T1, T2, T3, T4, T5, T6, T7, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function7<T1, T2, T3, T4, T5, T6, T7, R>> function);
    }

    interface P8<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8> {
        <T9> Products.P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final App<F, T9> p);

        <T9, T10> Products.P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final Products.P2<F, T9, T10> p);

        <T9, T10, T11> Products.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final Products.P3<F, T9, T10, T11> p);

        <T9, T10, T11, T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Products.P4<F, T9, T10, T11, T12> p);

        <T9, T10, T11, T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P5<F, T9, T10, T11, T12, T13> p);

        <T9, T10, T11, T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P6<F, T9, T10, T11, T12, T13, T14> p);

        <T9, T10, T11, T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P7<F, T9, T10, T11, T12, T13, T14, T15> p);

        <T9, T10, T11, T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P8<F, T9, T10, T11, T12, T13, T14, T15, T16> p);

        <T9, T10, T11, T12, T13, T14, T15, T16, T17> P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P9<F, T9, T10, T11, T12, T13, T14, T15, T16, T17> p);

        <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P10<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> p);

        <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P11<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> p);

        <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P12<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> p);

        <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P13<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p);

        <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P14<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p);

        <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P15<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p);

        <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P16<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p);

        <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final P17<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p);

        <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final P18<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p);

        <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final P19<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p);

        <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final P20<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p);

        <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final P21<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final P22<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final P23<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final P24<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>> function);

    }

    interface P9<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9> {
        <T10> Products.P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final App<F, T10> p);

        <T10, T11> Products.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final Products.P2<F, T10, T11> p);

        <T10, T11, T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Products.P3<F, T10, T11, T12> p);

        <T10, T11, T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P4<F, T10, T11, T12, T13> p);

        <T10, T11, T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P5<F, T10, T11, T12, T13, T14> p);

        <T10, T11, T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P6<F, T10, T11, T12, T13, T14, T15> p);

        <T10, T11, T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P7<F, T10, T11, T12, T13, T14, T15, T16> p);

        <T10, T11, T12, T13, T14, T15, T16, T17> P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P8<F, T10, T11, T12, T13, T14, T15, T16, T17> p);

        <T10, T11, T12, T13, T14, T15, T16, T17, T18> P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P9<F, T10, T11, T12, T13, T14, T15, T16, T17, T18> p);

        <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P10<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> p);

        <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P11<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> p);

        <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P12<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p);

        <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P13<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p);

        <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P14<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p);

        <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P15<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p);

        <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P16<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p);

        <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final P17<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p);

        <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final P18<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p);

        <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final P19<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p);

        <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final P20<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final P21<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final P22<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final P23<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>> function);
    }

    interface P10<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> {

        <T11> Products.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final App<F, T11> p);

        <T11, T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Products.P2<F, T11, T12> p);

        <T11, T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P3<F, T11, T12, T13> p);

        <T11, T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P4<F, T11, T12, T13, T14> p);

        <T11, T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P5<F, T11, T12, T13, T14, T15> p);

        <T11, T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P6<F, T11, T12, T13, T14, T15, T16> p);

        <T11, T12, T13, T14, T15, T16, T17> P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P7<F, T11, T12, T13, T14, T15, T16, T17> p);

        <T11, T12, T13, T14, T15, T16, T17, T18> P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P8<F, T11, T12, T13, T14, T15, T16, T17, T18> p);

        <T11, T12, T13, T14, T15, T16, T17, T18, T19> P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P9<F, T11, T12, T13, T14, T15, T16, T17, T18, T19> p);

        <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P10<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> p);

        <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P11<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p);

        <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P12<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p);

        <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P13<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p);

        <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P14<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p);

        <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P15<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p);

        <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P16<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p);

        <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final P17<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p);

        <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final P18<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p);

        <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final P19<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final P20<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final P21<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final P22<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R>> function);
    }

    interface P11<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> {

        <T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final App<F, T12> p);

        <T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P2<F, T12, T13> p);

        <T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P3<F, T12, T13, T14> p);

        <T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P4<F, T12, T13, T14, T15> p);

        <T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P5<F, T12, T13, T14, T15, T16> p);

        <T12, T13, T14, T15, T16, T17> P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P6<F, T12, T13, T14, T15, T16, T17> p);

        <T12, T13, T14, T15, T16, T17, T18> P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P7<F, T12, T13, T14, T15, T16, T17, T18> p);

        <T12, T13, T14, T15, T16, T17, T18, T19> P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P8<F, T12, T13, T14, T15, T16, T17, T18, T19> p);

        <T12, T13, T14, T15, T16, T17, T18, T19, T20> P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P9<F, T12, T13, T14, T15, T16, T17, T18, T19, T20> p);

        <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P10<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p);

        <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P11<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p);

        <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P12<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p);

        <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P13<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p);

        <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P14<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p);

        <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P15<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p);

        <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P16<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p);

        <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final P17<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p);

        <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final P18<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final P19<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final P20<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final P21<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R>> function);
    }

    interface P12<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> {

        <T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final App<F, T13> p);

        <T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P2<F, T13, T14> p);

        <T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P3<F, T13, T14, T15> p);

        <T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P4<F, T13, T14, T15, T16> p);

        <T13, T14, T15, T16, T17> P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P5<F, T13, T14, T15, T16, T17> p);

        <T13, T14, T15, T16, T17, T18> P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P6<F, T13, T14, T15, T16, T17, T18> p);

        <T13, T14, T15, T16, T17, T18, T19> P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P7<F, T13, T14, T15, T16, T17, T18, T19> p);

        <T13, T14, T15, T16, T17, T18, T19, T20> P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P8<F, T13, T14, T15, T16, T17, T18, T19, T20> p);

        <T13, T14, T15, T16, T17, T18, T19, T20, T21> P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P9<F, T13, T14, T15, T16, T17, T18, T19, T20, T21> p);

        <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P10<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p);

        <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P11<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p);

        <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P12<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p);

        <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P13<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p);

        <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P14<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p);

        <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P15<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p);

        <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final Products.P16<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p);

        <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final P17<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final P18<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final P19<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final P20<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R>> function);
    }

    interface P13<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> {

        <T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final App<F, T14> p);

        <T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P2<F, T14, T15> p);

        <T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P3<F, T14, T15, T16> p);

        <T14, T15, T16, T17> P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P4<F, T14, T15, T16, T17> p);

        <T14, T15, T16, T17, T18> P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P5<F, T14, T15, T16, T17, T18> p);

        <T14, T15, T16, T17, T18, T19> P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P6<F, T14, T15, T16, T17, T18, T19> p);

        <T14, T15, T16, T17, T18, T19, T20> P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P7<F, T14, T15, T16, T17, T18, T19, T20> p);

        <T14, T15, T16, T17, T18, T19, T20, T21> P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P8<F, T14, T15, T16, T17, T18, T19, T20, T21> p);

        <T14, T15, T16, T17, T18, T19, T20, T21, T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P9<F, T14, T15, T16, T17, T18, T19, T20, T21, T22> p);

        <T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P10<F, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p);

        <T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P11<F, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p);

        <T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P12<F, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p);

        <T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P13<F, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p);

        <T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P14<F, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p);

        <T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final Products.P15<F, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p);

        <T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final Products.P16<F, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final P17<F, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final P18<F, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final P19<F, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        App<F, T13> t13();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R>> function);
    }

    interface P14<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> {

        <T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final App<F, T15> p);

        <T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P2<F, T15, T16> p);

        <T15, T16, T17> P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P3<F, T15, T16, T17> p);

        <T15, T16, T17, T18> P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P4<F, T15, T16, T17, T18> p);

        <T15, T16, T17, T18, T19> P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P5<F, T15, T16, T17, T18, T19> p);

        <T15, T16, T17, T18, T19, T20> P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P6<F, T15, T16, T17, T18, T19, T20> p);

        <T15, T16, T17, T18, T19, T20, T21> P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P7<F, T15, T16, T17, T18, T19, T20, T21> p);

        <T15, T16, T17, T18, T19, T20, T21, T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P8<F, T15, T16, T17, T18, T19, T20, T21, T22> p);

        <T15, T16, T17, T18, T19, T20, T21, T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P9<F, T15, T16, T17, T18, T19, T20, T21, T22, T23> p);

        <T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P10<F, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p);

        <T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P11<F, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p);

        <T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P12<F, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p);

        <T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P13<F, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p);

        <T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final Products.P14<F, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p);

        <T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final Products.P15<F, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final Products.P16<F, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final P17<F, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final P18<F, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        App<F, T13> t13();

        App<F, T14> t14();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R>> function);
    }

    interface P15<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> {

        <T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final App<F, T16> p);

        <T16, T17> P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P2<F, T16, T17> p);

        <T16, T17, T18> P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P3<F, T16, T17, T18> p);

        <T16, T17, T18, T19> P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P4<F, T16, T17, T18, T19> p);

        <T16, T17, T18, T19, T20> P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P5<F, T16, T17, T18, T19, T20> p);

        <T16, T17, T18, T19, T20, T21> P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P6<F, T16, T17, T18, T19, T20, T21> p);

        <T16, T17, T18, T19, T20, T21, T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P7<F, T16, T17, T18, T19, T20, T21, T22> p);

        <T16, T17, T18, T19, T20, T21, T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P8<F, T16, T17, T18, T19, T20, T21, T22, T23> p);

        <T16, T17, T18, T19, T20, T21, T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P9<F, T16, T17, T18, T19, T20, T21, T22, T23, T24> p);

        <T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P10<F, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p);

        <T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P11<F, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p);

        <T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P12<F, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p);

        <T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final Products.P13<F, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p);

        <T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final Products.P14<F, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final Products.P15<F, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final Products.P16<F, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final P17<F, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        App<F, T13> t13();

        App<F, T14> t14();

        App<F, T15> t15();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R>> function);
    }

    interface P16<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> {

        <T17> P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final App<F, T17> p);

        <T17, T18> P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P2<F, T17, T18> p);

        <T17, T18, T19> P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P3<F, T17, T18, T19> p);

        <T17, T18, T19, T20> P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P4<F, T17, T18, T19, T20> p);

        <T17, T18, T19, T20, T21> P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P5<F, T17, T18, T19, T20, T21> p);

        <T17, T18, T19, T20, T21, T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P6<F, T17, T18, T19, T20, T21, T22> p);

        <T17, T18, T19, T20, T21, T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P7<F, T17, T18, T19, T20, T21, T22, T23> p);

        <T17, T18, T19, T20, T21, T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P8<F, T17, T18, T19, T20, T21, T22, T23, T24> p);

        <T17, T18, T19, T20, T21, T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P9<F, T17, T18, T19, T20, T21, T22, T23, T24, T25> p);

        <T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P10<F, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p);

        <T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P11<F, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p);

        <T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final Products.P12<F, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p);

        <T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final Products.P13<F, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final Products.P14<F, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final Products.P15<F, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final Products.P16<F, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        App<F, T13> t13();

        App<F, T14> t14();

        App<F, T15> t15();

        App<F, T16> t16();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R>> function);
    }

    interface P17<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> {

        <T18> P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final App<F, T18> p);

        <T18, T19> P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P2<F, T18, T19> p);

        <T18, T19, T20> P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P3<F, T18, T19, T20> p);

        <T18, T19, T20, T21> P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P4<F, T18, T19, T20, T21> p);

        <T18, T19, T20, T21, T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P5<F, T18, T19, T20, T21, T22> p);

        <T18, T19, T20, T21, T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P6<F, T18, T19, T20, T21, T22, T23> p);

        <T18, T19, T20, T21, T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P7<F, T18, T19, T20, T21, T22, T23, T24> p);

        <T18, T19, T20, T21, T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P8<F, T18, T19, T20, T21, T22, T23, T24, T25> p);

        <T18, T19, T20, T21, T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P9<F, T18, T19, T20, T21, T22, T23, T24, T25, T26> p);

        <T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P10<F, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p);

        <T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final Products.P11<F, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p);

        <T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final Products.P12<F, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final Products.P13<F, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final Products.P14<F, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final Products.P15<F, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        App<F, T13> t13();

        App<F, T14> t14();

        App<F, T15> t15();

        App<F, T16> t16();

        App<F, T17> t17();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R>> function);
    }

    interface P18<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> {

        <T19> P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final App<F, T19> p);

        <T19, T20> P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P2<F, T19, T20> p);

        <T19, T20, T21> P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P3<F, T19, T20, T21> p);

        <T19, T20, T21, T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P4<F, T19, T20, T21, T22> p);

        <T19, T20, T21, T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P5<F, T19, T20, T21, T22, T23> p);

        <T19, T20, T21, T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P6<F, T19, T20, T21, T22, T23, T24> p);

        <T19, T20, T21, T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P7<F, T19, T20, T21, T22, T23, T24, T25> p);

        <T19, T20, T21, T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P8<F, T19, T20, T21, T22, T23, T24, T25, T26> p);

        <T19, T20, T21, T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P9<F, T19, T20, T21, T22, T23, T24, T25, T26, T27> p);

        <T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final Products.P10<F, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p);

        <T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final Products.P11<F, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final Products.P12<F, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final Products.P13<F, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final Products.P14<F, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        App<F, T13> t13();

        App<F, T14> t14();

        App<F, T15> t15();

        App<F, T16> t16();

        App<F, T17> t17();

        App<F, T18> t18();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R>> function);
    }

    interface P19<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> {

        <T20> P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final App<F, T20> p);

        <T20, T21> P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P2<F, T20, T21> p);

        <T20, T21, T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P3<F, T20, T21, T22> p);

        <T20, T21, T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P4<F, T20, T21, T22, T23> p);

        <T20, T21, T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P5<F, T20, T21, T22, T23, T24> p);

        <T20, T21, T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P6<F, T20, T21, T22, T23, T24, T25> p);

        <T20, T21, T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P7<F, T20, T21, T22, T23, T24, T25, T26> p);

        <T20, T21, T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P8<F, T20, T21, T22, T23, T24, T25, T26, T27> p);

        <T20, T21, T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final Products.P9<F, T20, T21, T22, T23, T24, T25, T26, T27, T28> p);

        <T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final Products.P10<F, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final Products.P11<F, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final Products.P12<F, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final Products.P13<F, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        App<F, T13> t13();

        App<F, T14> t14();

        App<F, T15> t15();

        App<F, T16> t16();

        App<F, T17> t17();

        App<F, T18> t18();

        App<F, T19> t19();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R>> function);
    }

    interface P20<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> {
        <T21> P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final App<F, T21> p);

        <T21, T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P2<F, T21, T22> p);

        <T21, T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P3<F, T21, T22, T23> p);

        <T21, T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P4<F, T21, T22, T23, T24> p);

        <T21, T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P5<F, T21, T22, T23, T24, T25> p);

        <T21, T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P6<F, T21, T22, T23, T24, T25, T26> p);

        <T21, T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P7<F, T21, T22, T23, T24, T25, T26, T27> p);

        <T21, T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final Products.P8<F, T21, T22, T23, T24, T25, T26, T27, T28> p);

        <T21, T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final Products.P9<F, T21, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final Products.P10<F, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final Products.P11<F, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final Products.P12<F, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        App<F, T13> t13();

        App<F, T14> t14();

        App<F, T15> t15();

        App<F, T16> t16();

        App<F, T17> t17();

        App<F, T18> t18();

        App<F, T19> t19();

        App<F, T20> t20();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R>> function);
    }

    interface P21<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> {

        <T22> P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final App<F, T22> p);

        <T22, T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P2<F, T22, T23> p);

        <T22, T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P3<F, T22, T23, T24> p);

        <T22, T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P4<F, T22, T23, T24, T25> p);

        <T22, T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P5<F, T22, T23, T24, T25, T26> p);

        <T22, T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P6<F, T22, T23, T24, T25, T26, T27> p);

        <T22, T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final Products.P7<F, T22, T23, T24, T25, T26, T27, T28> p);

        <T22, T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final Products.P8<F, T22, T23, T24, T25, T26, T27, T28, T29> p);

        <T22, T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final Products.P9<F, T22, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final Products.P10<F, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final Products.P11<F, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        App<F, T13> t13();

        App<F, T14> t14();

        App<F, T15> t15();

        App<F, T16> t16();

        App<F, T17> t17();

        App<F, T18> t18();

        App<F, T19> t19();

        App<F, T20> t20();

        App<F, T21> t21();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R>> function);
    }

    interface P22<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> {

        <T23> P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final App<F, T23> p);

        <T23, T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P2<F, T23, T24> p);

        <T23, T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P3<F, T23, T24, T25> p);

        <T23, T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P4<F, T23, T24, T25, T26> p);

        <T23, T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P5<F, T23, T24, T25, T26, T27> p);

        <T23, T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final Products.P6<F, T23, T24, T25, T26, T27, T28> p);

        <T23, T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final Products.P7<F, T23, T24, T25, T26, T27, T28, T29> p);

        <T23, T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final Products.P8<F, T23, T24, T25, T26, T27, T28, T29, T30> p);

        <T23, T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final Products.P9<F, T23, T24, T25, T26, T27, T28, T29, T30, T31> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        App<F, T13> t13();

        App<F, T14> t14();

        App<F, T15> t15();

        App<F, T16> t16();

        App<F, T17> t17();

        App<F, T18> t18();

        App<F, T19> t19();

        App<F, T20> t20();

        App<F, T21> t21();

        App<F, T22> t22();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R>> function);
    }

    interface P23<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> {

        <T24> P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final App<F, T24> p);

        <T24, T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P2<F, T24, T25> p);

        <T24, T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P3<F, T24, T25, T26> p);

        <T24, T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P4<F, T24, T25, T26, T27> p);

        <T24, T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final Products.P5<F, T24, T25, T26, T27, T28> p);

        <T24, T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final Products.P6<F, T24, T25, T26, T27, T28, T29> p);

        <T24, T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final Products.P7<F, T24, T25, T26, T27, T28, T29, T30> p);

        <T24, T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final Products.P8<F, T24, T25, T26, T27, T28, T29, T30, T31> p);

        <T24, T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final Products.P9<F, T24, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        App<F, T13> t13();

        App<F, T14> t14();

        App<F, T15> t15();

        App<F, T16> t16();

        App<F, T17> t17();

        App<F, T18> t18();

        App<F, T19> t19();

        App<F, T20> t20();

        App<F, T21> t21();

        App<F, T22> t22();

        App<F, T23> t23();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function23<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function23<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, R>> function);
    }

    interface P24<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> {

        <T25> P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final App<F, T25> p);

        <T25, T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P2<F, T25, T26> p);

        <T25, T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P3<F, T25, T26, T27> p);

        <T25, T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final Products.P4<F, T25, T26, T27, T28> p);

        <T25, T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final Products.P5<F, T25, T26, T27, T28, T29> p);

        <T25, T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final Products.P6<F, T25, T26, T27, T28, T29, T30> p);

        <T25, T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final Products.P7<F, T25, T26, T27, T28, T29, T30, T31> p);

        <T25, T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final Products.P8<F, T25, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        App<F, T13> t13();

        App<F, T14> t14();

        App<F, T15> t15();

        App<F, T16> t16();

        App<F, T17> t17();

        App<F, T18> t18();

        App<F, T19> t19();

        App<F, T20> t20();

        App<F, T21> t21();

        App<F, T22> t22();

        App<F, T23> t23();

        App<F, T24> t24();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, R>> function);

    }

    interface P25<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> {

        <T26> P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final App<F, T26> p);

        <T26, T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P2<F, T26, T27> p);

        <T26, T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final Products.P3<F, T26, T27, T28> p);

        <T26, T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final Products.P4<F, T26, T27, T28, T29> p);

        <T26, T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final Products.P5<F, T26, T27, T28, T29, T30> p);

        <T26, T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final Products.P6<F, T26, T27, T28, T29, T30, T31> p);

        <T26, T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final Products.P7<F, T26, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        App<F, T13> t13();

        App<F, T14> t14();

        App<F, T15> t15();

        App<F, T16> t16();

        App<F, T17> t17();

        App<F, T18> t18();

        App<F, T19> t19();

        App<F, T20> t20();

        App<F, T21> t21();

        App<F, T22> t22();

        App<F, T23> t23();

        App<F, T24> t24();

        App<F, T25> t25();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function25<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function25<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, R>> function);
    }

    interface P26<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> {

        <T27> P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final App<F, T27> p);

        <T27, T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final Products.P2<F, T27, T28> p);

        <T27, T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final Products.P3<F, T27, T28, T29> p);

        <T27, T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final Products.P4<F, T27, T28, T29, T30> p);

        <T27, T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final Products.P5<F, T27, T28, T29, T30, T31> p);

        <T27, T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final Products.P6<F, T27, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        App<F, T13> t13();

        App<F, T14> t14();

        App<F, T15> t15();

        App<F, T16> t16();

        App<F, T17> t17();

        App<F, T18> t18();

        App<F, T19> t19();

        App<F, T20> t20();

        App<F, T21> t21();

        App<F, T22> t22();

        App<F, T23> t23();

        App<F, T24> t24();

        App<F, T25> t25();

        App<F, T26> t26();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function26<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function26<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, R>> function);
    }

    interface P27<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> {
        <T28> P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final App<F, T28> p);

        <T28, T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final Products.P2<F, T28, T29> p);

        <T28, T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final Products.P3<F, T28, T29, T30> p);

        <T28, T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final Products.P4<F, T28, T29, T30, T31> p);

        <T28, T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final Products.P5<F, T28, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        App<F, T13> t13();

        App<F, T14> t14();

        App<F, T15> t15();

        App<F, T16> t16();

        App<F, T17> t17();

        App<F, T18> t18();

        App<F, T19> t19();

        App<F, T20> t20();

        App<F, T21> t21();

        App<F, T22> t22();

        App<F, T23> t23();

        App<F, T24> t24();

        App<F, T25> t25();

        App<F, T26> t26();

        App<F, T27> t27();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function27<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function27<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, R>> function);
    }

    interface P28<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> {
        <T29> P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final App<F, T29> p);

        <T29, T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final Products.P2<F, T29, T30> p);

        <T29, T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final Products.P3<F, T29, T30, T31> p);

        <T29, T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final Products.P4<F, T29, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        App<F, T13> t13();

        App<F, T14> t14();

        App<F, T15> t15();

        App<F, T16> t16();

        App<F, T17> t17();

        App<F, T18> t18();

        App<F, T19> t19();

        App<F, T20> t20();

        App<F, T21> t21();

        App<F, T22> t22();

        App<F, T23> t23();

        App<F, T24> t24();

        App<F, T25> t25();

        App<F, T26> t26();

        App<F, T27> t27();

        App<F, T28> t28();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function28<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function28<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, R>> function);
    }

    interface P29<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> {
        <T30> P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final App<F, T30> p);

        <T30, T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final Products.P2<F, T30, T31> p);

        <T30, T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final Products.P3<F, T30, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        App<F, T13> t13();

        App<F, T14> t14();

        App<F, T15> t15();

        App<F, T16> t16();

        App<F, T17> t17();

        App<F, T18> t18();

        App<F, T19> t19();

        App<F, T20> t20();

        App<F, T21> t21();

        App<F, T22> t22();

        App<F, T23> t23();

        App<F, T24> t24();

        App<F, T25> t25();

        App<F, T26> t26();

        App<F, T27> t27();

        App<F, T28> t28();

        App<F, T29> t29();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function29<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function29<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, R>> function);
    }

    interface P30<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> {
        <T31> P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final App<F, T31> p);

        <T31, T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final Products.P2<F, T31, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        App<F, T13> t13();

        App<F, T14> t14();

        App<F, T15> t15();

        App<F, T16> t16();

        App<F, T17> t17();

        App<F, T18> t18();

        App<F, T19> t19();

        App<F, T20> t20();

        App<F, T21> t21();

        App<F, T22> t22();

        App<F, T23> t23();

        App<F, T24> t24();

        App<F, T25> t25();

        App<F, T26> t26();

        App<F, T27> t27();

        App<F, T28> t28();

        App<F, T29> t29();

        App<F, T30> t30();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function30<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function30<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, R>> function);
    }

    interface P31<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> {
        <T32> P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final App<F, T32> p);

        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        App<F, T13> t13();

        App<F, T14> t14();

        App<F, T15> t15();

        App<F, T16> t16();

        App<F, T17> t17();

        App<F, T18> t18();

        App<F, T19> t19();

        App<F, T20> t20();

        App<F, T21> t21();

        App<F, T22> t22();

        App<F, T23> t23();

        App<F, T24> t24();

        App<F, T25> t25();

        App<F, T26> t26();

        App<F, T27> t27();

        App<F, T28> t28();

        App<F, T29> t29();

        App<F, T30> t30();

        App<F, T31> t31();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, R>> function);
    }

    interface P32<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> {
        App<F, T1> t1();

        App<F, T2> t2();

        App<F, T3> t3();

        App<F, T4> t4();

        App<F, T5> t5();

        App<F, T6> t6();

        App<F, T7> t7();

        App<F, T8> t8();

        App<F, T9> t9();

        App<F, T10> t10();

        App<F, T11> t11();

        App<F, T12> t12();

        App<F, T13> t13();

        App<F, T14> t14();

        App<F, T15> t15();

        App<F, T16> t16();

        App<F, T17> t17();

        App<F, T18> t18();

        App<F, T19> t19();

        App<F, T20> t20();

        App<F, T21> t21();

        App<F, T22> t22();

        App<F, T23> t23();

        App<F, T24> t24();

        App<F, T25> t25();

        App<F, T26> t26();

        App<F, T27> t27();

        App<F, T28> t28();

        App<F, T29> t29();

        App<F, T30> t30();

        App<F, T31> t31();

        App<F, T32> t32();

        <R> App<F, R> apply(final Applicative<F, ?> instance, final Function32<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, R> function);

        <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function32<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, R>> function);
    }
}
