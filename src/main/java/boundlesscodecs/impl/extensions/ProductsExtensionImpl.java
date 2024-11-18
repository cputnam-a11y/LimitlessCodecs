package boundlesscodecs.impl.extensions;

import boundlesscodecs.api.extensions.ProductsExtension;
import boundlesscodecs.impl.util.*;
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.kinds.K1;

import static boundlesscodecs.api.util.Conversions.t;

@SuppressWarnings("unused")
public interface ProductsExtensionImpl {
    interface P1<F extends K1, T1> extends ProductsExtension.P1<F, T1> {

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9> Products.P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final Products.P8<F, T2, T3, T4, T5, T6, T7, T8, T9> p) {
            return new Products.P9<>(this.t1(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10> Products.P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final Products.P9<F, T2, T3, T4, T5, T6, T7, T8, T9, T10> p) {
            var p9 = t(p);
            return new Products.P10<>(this.t1(), p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> Products.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final Products.P10<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> p) {
            var p10 = t(p);
            return new Products.P11<>(this.t1(), p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Products.P11<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> p) {
            var p11 = t(p);
            return new Products.P12<>(this.t1(), p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P12<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> p) {
            var p12 = t(p);
            return new Products.P13<>(this.t1(), p12.t1(), p12.t2(), p12.t3(), p12.t4(), p12.t5(), p12.t6(), p12.t7(), p12.t8(), p12.t9(), p12.t10(), p12.t11(), p12.t12());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P13<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> p) {
            var p13 = t(p);
            return new Products.P14<>(this.t1(), p13.t1(), p13.t2(), p13.t3(), p13.t4(), p13.t5(), p13.t6(), p13.t7(), p13.t8(), p13.t9(), p13.t10(), p13.t11(), p13.t12(), p13.t13());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P14<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> p) {
            var p14 = t(p);
            return new Products.P15<>(this.t1(), p14.t1(), p14.t2(), p14.t3(), p14.t4(), p14.t5(), p14.t6(), p14.t7(), p14.t8(), p14.t9(), p14.t10(), p14.t11(), p14.t12(), p14.t13(), p14.t14());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P15<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> p) {
            var p15 = t(p);
            return new Products.P16<>(this.t1(), p15.t1(), p15.t2(), p15.t3(), p15.t4(), p15.t5(), p15.t6(), p15.t7(), p15.t8(), p15.t9(), p15.t10(), p15.t11(), p15.t12(), p15.t13(), p15.t14(), p15.t15());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> ProductsExtension.P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P16<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> p) {
            var p16 = t(p);
            return new P17<>(this.t1(), p16.t1(), p16.t2(), p16.t3(), p16.t4(), p16.t5(), p16.t6(), p16.t7(), p16.t8(), p16.t9(), p16.t10(), p16.t11(), p16.t12(), p16.t13(), p16.t14(), p16.t15(), p16.t16());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> ProductsExtension.P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final ProductsExtension.P17<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> p) {
            return new P18<>(this.t1(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final ProductsExtension.P18<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> p) {
            return new P19<>(this.t1(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final ProductsExtension.P19<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> p) {
            return new P20<>(this.t1(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final ProductsExtension.P20<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p) {
            return new P21<>(this.t1(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final ProductsExtension.P21<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p) {
            return new P22<>(this.t1(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final ProductsExtension.P22<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p) {
            return new P23<>(this.t1(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final ProductsExtension.P23<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p) {
            return new P24<>(this.t1(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final ProductsExtension.P24<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p) {
            return new P25<>(this.t1(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final ProductsExtension.P25<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p) {
            return new P26<>(this.t1(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final ProductsExtension.P26<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p) {
            return new P27<>(this.t1(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final ProductsExtension.P27<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p) {
            return new P28<>(this.t1(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26(), p.t27());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final ProductsExtension.P28<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            return new P29<>(this.t1(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26(), p.t27(), p.t28());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final ProductsExtension.P29<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            return new P30<>(this.t1(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26(), p.t27(), p.t28(), p.t29());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final ProductsExtension.P30<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            return new P31<>(this.t1(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26(), p.t27(), p.t28(), p.t29(), p.t30());
        }

        @Override
        default <T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final ProductsExtension.P31<F, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            return new P32<>(this.t1(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26(), p.t27(), p.t28(), p.t29(), p.t30(), p.t31());
        }
    }

    interface P2<F extends K1, T1, T2> extends ProductsExtension.P2<F, T1, T2> {
        @Override
        default <T3, T4, T5, T6, T7, T8, T9> Products.P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final Products.P7<F, T3, T4, T5, T6, T7, T8, T9> p) {
            return new Products.P9<>(this.t1(), this.t2(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7());
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10> Products.P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final Products.P8<F, T3, T4, T5, T6, T7, T8, T9, T10> p) {
            return new Products.P10<>(this.t1(), this.t2(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8());
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11> Products.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final Products.P9<F, T3, T4, T5, T6, T7, T8, T9, T10, T11> p) {
            var p9 = t(p);
            return new Products.P11<>(this.t1(), this.t2(), p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9());
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Products.P10<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> p) {
            var p10 = t(p);
            return new Products.P12<>(this.t1(), this.t2(), p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10());
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P11<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> p) {
            var p11 = t(p);
            return new Products.P13<>(this.t1(), this.t2(), p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11());
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P12<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> p) {
            var p12 = t(p);
            return new Products.P14<>(t1(), t2(), p12.t1(), p12.t2(), p12.t3(), p12.t4(), p12.t5(), p12.t6(), p12.t7(), p12.t8(), p12.t9(), p12.t10(), p12.t11(), p12.t12());
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P13<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> p) {
            var p13 = t(p);
            return new Products.P15<>(t1(), t2(), p13.t1(), p13.t2(), p13.t3(), p13.t4(), p13.t5(), p13.t6(), p13.t7(), p13.t8(), p13.t9(), p13.t10(), p13.t11(), p13.t12(), p13.t13());
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P14<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> p) {
            var p14 = t(p);
            return new Products.P16<>(t1(), t2(), p14.t1(), p14.t2(), p14.t3(), p14.t4(), p14.t5(), p14.t6(), p14.t7(), p14.t8(), p14.t9(), p14.t10(), p14.t11(), p14.t12(), p14.t13(), p14.t14());
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> ProductsExtension.P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P15<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> p) {
            var p15 = t(p);
            return new P17<>(this.t1(), this.t2(), p15.t1(), p15.t2(), p15.t3(), p15.t4(), p15.t5(), p15.t6(), p15.t7(), p15.t8(), p15.t9(), p15.t10(), p15.t11(), p15.t12(), p15.t13(), p15.t14(), p15.t15());
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> ProductsExtension.P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P16<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> p) {
            var p16 = t(p);
            return new P18<>(this.t1(), this.t2(), p16.t1(), p16.t2(), p16.t3(), p16.t4(), p16.t5(), p16.t6(), p16.t7(), p16.t8(), p16.t9(), p16.t10(), p16.t11(), p16.t12(), p16.t13(), p16.t14(), p16.t15(), p16.t16());
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> ProductsExtension.P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final ProductsExtension.P17<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> p) {
            return new P19<>(this.t1(), this.t2(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17());
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final ProductsExtension.P18<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> p) {
            return new P20<>(this.t1(), this.t2(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18());
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final ProductsExtension.P19<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p) {
            return new P21<>(this.t1(), this.t2(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19());
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final ProductsExtension.P20<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p) {
            return new P22<>(this.t1(), this.t2(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20());
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final ProductsExtension.P21<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p) {
            return new P23<>(this.t1(), this.t2(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21());
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final ProductsExtension.P22<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p) {
            return new P24<>(this.t1(), this.t2(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22());
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final ProductsExtension.P23<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p) {
            return new P25<>(this.t1(), this.t2(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23());
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final ProductsExtension.P24<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p) {
            return new P26<>(this.t1(), this.t2(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24());
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final ProductsExtension.P25<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p) {
            return new P27<>(
                    this.t1(), this.t2(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25()
            );
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final ProductsExtension.P26<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p) {
            return new P28<>(
                    this.t1(), this.t2(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26()
            );
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final ProductsExtension.P27<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            return new P29<>(
                    this.t1(), this.t2(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26(), p.t27()
            );
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final ProductsExtension.P28<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            return new P30<>(
                    this.t1(), this.t2(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26(), p.t27(), p.t28()
            );
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final ProductsExtension.P29<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            return new P31<>(
                    this.t1(), this.t2(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26(), p.t27(), p.t28(), p.t29()
            );
        }

        @Override
        default <T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final ProductsExtension.P30<F, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            return new P32<>(
                    this.t1(), this.t2(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26(), p.t27(), p.t28(), p.t29(), p.t30()
            );
        }
    }

    interface P3<F extends K1, T1, T2, T3> extends ProductsExtension.P3<F, T1, T2, T3> {
        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final ProductsExtension.P23<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p) {
            return new P26<>(this.t1(), this.t2(), this.t3(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23());
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final ProductsExtension.P22<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p) {
            return new P25<>(this.t1(), this.t2(), this.t3(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22());
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final ProductsExtension.P21<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p) {
            return new P24<>(this.t1(), this.t2(), this.t3(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21());
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final ProductsExtension.P20<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p) {
            return new P23<>(this.t1(), this.t2(), this.t3(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20());
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final ProductsExtension.P19<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p) {
            return new P22<>(this.t1(), this.t2(), this.t3(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19());
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final ProductsExtension.P18<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p) {
            return new P21<>(this.t1(), this.t2(), this.t3(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18());
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final ProductsExtension.P17<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> p) {
            return new P20<>(this.t1(), this.t2(), this.t3(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17());
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> ProductsExtension.P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P16<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> p) {
            var p16 = t(p);
            return new P19<>(this.t1(), this.t2(), this.t3(), p16.t1(), p16.t2(), p16.t3(), p16.t4(), p16.t5(), p16.t6(), p16.t7(), p16.t8(), p16.t9(), p16.t10(), p16.t11(), p16.t12(), p16.t13(), p16.t14(), p16.t15(), p16.t16());
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> ProductsExtension.P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P15<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> p) {
            var p15 = t(p);
            return new P18<>(this.t1(), this.t2(), this.t3(), p15.t1(), p15.t2(), p15.t3(), p15.t4(), p15.t5(), p15.t6(), p15.t7(), p15.t8(), p15.t9(), p15.t10(), p15.t11(), p15.t12(), p15.t13(), p15.t14(), p15.t15());
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> ProductsExtension.P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P14<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> p) {
            var p14 = t(p);
            return new P17<>(this.t1(), this.t2(), this.t3(), p14.t1(), p14.t2(), p14.t3(), p14.t4(), p14.t5(), p14.t6(), p14.t7(), p14.t8(), p14.t9(), p14.t10(), p14.t11(), p14.t12(), p14.t13(), p14.t14());
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P13<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> p) {
            var p13 = t(p);
            return new Products.P16<>(this.t1(), this.t2(), this.t3(), p13.t1(), p13.t2(), p13.t3(), p13.t4(), p13.t5(), p13.t6(), p13.t7(), p13.t8(), p13.t9(), p13.t10(), p13.t11(), p13.t12(), p13.t13());
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P12<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> p) {
            var p12 = t(p);
            return new Products.P15<>(this.t1(), this.t2(), this.t3(), p12.t1(), p12.t2(), p12.t3(), p12.t4(), p12.t5(), p12.t6(), p12.t7(), p12.t8(), p12.t9(), p12.t10(), p12.t11(), p12.t12());
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P11<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> p) {
            var p11 = t(p);
            return new Products.P14<>(this.t1(), this.t2(), this.t3(), p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11());
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P10<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> p) {
            var p10 = t(p);
            return new Products.P13<>(this.t1(), this.t2(), this.t3(), p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10());
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Products.P9<F, T4, T5, T6, T7, T8, T9, T10, T11, T12> p) {
            var p9 = t(p);
            return new Products.P12<>(this.t1(), this.t2(), this.t3(), p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9());
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11> Products.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final Products.P8<F, T4, T5, T6, T7, T8, T9, T10, T11> p) {
            return new Products.P11<>(this.t1(), this.t2(), this.t3(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8());
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10> Products.P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final Products.P7<F, T4, T5, T6, T7, T8, T9, T10> p) {
            return new Products.P10<>(this.t1(), this.t2(), this.t3(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7());
        }

        @Override
        default <T4, T5, T6, T7, T8, T9> Products.P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final Products.P6<F, T4, T5, T6, T7, T8, T9> p) {
            return new Products.P9<>(this.t1(), this.t2(), this.t3(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6());
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final ProductsExtension.P29<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            return new P32<>(
                    this.t1(), this.t2(), this.t3(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26(), p.t27(), p.t28(), p.t29()
            );
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final ProductsExtension.P28<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            return new P31<>(
                    this.t1(), this.t2(), this.t3(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26(), p.t27(), p.t28()
            );
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final ProductsExtension.P27<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            return new P30<>(
                    this.t1(), this.t2(), this.t3(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26(), p.t27()
            );
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final ProductsExtension.P26<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            return new P29<>(
                    this.t1(), this.t2(), this.t3(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26()
            );
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final ProductsExtension.P25<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p) {
            return new P28<>(
                    this.t1(), this.t2(), this.t3(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25()
            );
        }

        @Override
        default <T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final ProductsExtension.P24<F, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p) {
            return new P27<>(
                    this.t1(), this.t2(), this.t3(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24()
            );
        }
    }

    interface P4<F extends K1, T1, T2, T3, T4> extends ProductsExtension.P4<F, T1, T2, T3, T4> {

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final ProductsExtension.P22<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p) {
            return new P26<>(this.t1(), this.t2(), this.t3(), this.t4(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22());
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final ProductsExtension.P21<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p) {
            return new P25<>(this.t1(), this.t2(), this.t3(), this.t4(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21());
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final ProductsExtension.P20<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p) {
            return new P24<>(this.t1(), this.t2(), this.t3(), this.t4(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20());
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final ProductsExtension.P19<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p) {
            return new P23<>(this.t1(), this.t2(), this.t3(), this.t4(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19());
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final ProductsExtension.P18<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p) {
            return new P22<>(this.t1(), this.t2(), this.t3(), this.t4(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18());
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final ProductsExtension.P17<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p) {
            return new P21<>(this.t1(), this.t2(), this.t3(), this.t4(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17());
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P16<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> p) {
            var p16 = t(p);
            return new P20<>(this.t1(), this.t2(), this.t3(), this.t4(), p16.t1(), p16.t2(), p16.t3(), p16.t4(), p16.t5(), p16.t6(), p16.t7(), p16.t8(), p16.t9(), p16.t10(), p16.t11(), p16.t12(), p16.t13(), p16.t14(), p16.t15(), p16.t16());
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> ProductsExtension.P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P15<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> p) {
            var p15 = t(p);
            return new P19<>(this.t1(), this.t2(), this.t3(), this.t4(), p15.t1(), p15.t2(), p15.t3(), p15.t4(), p15.t5(), p15.t6(), p15.t7(), p15.t8(), p15.t9(), p15.t10(), p15.t11(), p15.t12(), p15.t13(), p15.t14(), p15.t15());
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> ProductsExtension.P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P14<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> p) {
            var p14 = t(p);
            return new P18<>(this.t1(), this.t2(), this.t3(), this.t4(), p14.t1(), p14.t2(), p14.t3(), p14.t4(), p14.t5(), p14.t6(), p14.t7(), p14.t8(), p14.t9(), p14.t10(), p14.t11(), p14.t12(), p14.t13(), p14.t14());
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> ProductsExtension.P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P13<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> p) {
            var p13 = t(p);
            return new P17<>(this.t1(), this.t2(), this.t3(), this.t4(), p13.t1(), p13.t2(), p13.t3(), p13.t4(), p13.t5(), p13.t6(), p13.t7(), p13.t8(), p13.t9(), p13.t10(), p13.t11(), p13.t12(), p13.t13());
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P12<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> p) {
            var p12 = t(p);
            return new Products.P16<>(this.t1(), this.t2(), this.t3(), this.t4(), p12.t1(), p12.t2(), p12.t3(), p12.t4(), p12.t5(), p12.t6(), p12.t7(), p12.t8(), p12.t9(), p12.t10(), p12.t11(), p12.t12());
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P11<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> p) {
            var p11 = t(p);
            return new Products.P15<>(this.t1(), this.t2(), this.t3(), this.t4(), p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11());
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P10<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> p) {
            var p10 = t(p);
            return new Products.P14<>(this.t1(), this.t2(), this.t3(), this.t4(), p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10());
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P9<F, T5, T6, T7, T8, T9, T10, T11, T12, T13> p) {
            var p9 = t(p);
            return new Products.P13<>(this.t1(), this.t2(), this.t3(), this.t4(), p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9());
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Products.P8<F, T5, T6, T7, T8, T9, T10, T11, T12> p) {
            return new Products.P12<>(this.t1(), this.t2(), this.t3(), this.t4(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8());
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11> Products.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final Products.P7<F, T5, T6, T7, T8, T9, T10, T11> p) {
            return new Products.P11<>(this.t1(), this.t2(), this.t3(), this.t4(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7());
        }

        @Override
        default <T5, T6, T7, T8, T9, T10> Products.P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final Products.P6<F, T5, T6, T7, T8, T9, T10> p) {
            return new Products.P10<>(this.t1(), this.t2(), this.t3(), this.t4(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6());
        }

        @Override
        default <T5, T6, T7, T8, T9> Products.P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final Products.P5<F, T5, T6, T7, T8, T9> p) {
            return new Products.P9<>(this.t1(), this.t2(), this.t3(), this.t4(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5());
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final ProductsExtension.P28<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            return new P32<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26(), p.t27(), p.t28()
            );
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final ProductsExtension.P27<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            return new P31<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26(), p.t27()
            );
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final ProductsExtension.P26<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            return new P30<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26()
            );
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final ProductsExtension.P25<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            return new P29<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25()
            );
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final ProductsExtension.P24<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p) {
            return new P28<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24()
            );
        }

        @Override
        default <T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final ProductsExtension.P23<F, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p) {
            return new P27<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23()
            );
        }
    }

    interface P5<F extends K1, T1, T2, T3, T4, T5> extends ProductsExtension.P5<F, T1, T2, T3, T4, T5> {
        @Override
        default <T6, T7, T8, T9> Products.P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final Products.P4<F, T6, T7, T8, T9> p) {
            return new Products.P9<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), p.t1(), p.t2(), p.t3(), p.t4());
        }

        @Override
        default <T6, T7, T8, T9, T10> Products.P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final Products.P5<F, T6, T7, T8, T9, T10> p) {
            return new Products.P10<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5());
        }

        @Override
        default <T6, T7, T8, T9, T10, T11> Products.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final Products.P6<F, T6, T7, T8, T9, T10, T11> p) {
            return new Products.P11<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6());
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Products.P7<F, T6, T7, T8, T9, T10, T11, T12> p) {
            return new Products.P12<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7());
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P8<F, T6, T7, T8, T9, T10, T11, T12, T13> p) {
            return new Products.P13<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8());
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P9<F, T6, T7, T8, T9, T10, T11, T12, T13, T14> p) {
            var p9 = t(p);
            return new Products.P14<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9());
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P10<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> p) {
            var p10 = t(p);
            return new Products.P15<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10());
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P11<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> p) {
            var p11 = t(p);
            return new Products.P16<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11());
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> ProductsExtension.P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P12<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> p) {
            var p12 = t(p);
            return new P17<>(t1(), t2(), t3(), t4(), t5(), p12.t1(), p12.t2(), p12.t3(), p12.t4(), p12.t5(), p12.t6(), p12.t7(), p12.t8(), p12.t9(), p12.t10(), p12.t11(), p12.t12());
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> ProductsExtension.P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P13<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> p) {
            var p13 = t(p);
            return new P18<>(t1(), t2(), t3(), t4(), t5(), p13.t1(), p13.t2(), p13.t3(), p13.t4(), p13.t5(), p13.t6(), p13.t7(), p13.t8(), p13.t9(), p13.t10(), p13.t11(), p13.t12(), p13.t13());
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> ProductsExtension.P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P14<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> p) {
            var p14 = t(p);
            return new P19<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), p14.t1(), p14.t2(), p14.t3(), p14.t4(), p14.t5(), p14.t6(), p14.t7(), p14.t8(), p14.t9(), p14.t10(), p14.t11(), p14.t12(), p14.t13(), p14.t14());
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P15<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> p) {
            var p15 = t(p);
            return new P20<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), p15.t1(), p15.t2(), p15.t3(), p15.t4(), p15.t5(), p15.t6(), p15.t7(), p15.t8(), p15.t9(), p15.t10(), p15.t11(), p15.t12(), p15.t13(), p15.t14(), p15.t15());
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P16<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p) {
            var p16 = t(p);
            return new P21<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), p16.t1(), p16.t2(), p16.t3(), p16.t4(), p16.t5(), p16.t6(), p16.t7(), p16.t8(), p16.t9(), p16.t10(), p16.t11(), p16.t12(), p16.t13(), p16.t14(), p16.t15(), p16.t16());
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final ProductsExtension.P17<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p) {
            return new P22<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17());
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final ProductsExtension.P18<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p) {
            return new P23<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18());
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final ProductsExtension.P19<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p) {
            return new P24<>(t1(), t2(), t3(), t4(), t5(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19());
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final ProductsExtension.P20<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p) {
            return new P25<>(t1(), t2(), t3(), t4(), t5(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20());
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final ProductsExtension.P21<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p) {
            return new P26<>(t1(), t2(), t3(), t4(), t5(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21());
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final ProductsExtension.P27<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            return new P32<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26(), p.t27()
            );
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final ProductsExtension.P26<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            return new P31<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26()
            );
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final ProductsExtension.P25<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            return new P30<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25()
            );
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final ProductsExtension.P24<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            return new P29<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24()
            );
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final ProductsExtension.P23<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p) {
            return new P28<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23()
            );
        }

        @Override
        default <T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final ProductsExtension.P22<F, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p) {
            return new P27<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22()
            );
        }
    }

    interface P6<F extends K1, T1, T2, T3, T4, T5, T6> extends ProductsExtension.P6<F, T1, T2, T3, T4, T5, T6> {
        @Override
        default <T7, T8, T9> Products.P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final Products.P3<F, T7, T8, T9> p) {
            return new Products.P9<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p.t1(), p.t2(), p.t3());

        }

        @Override
        default <T7, T8, T9, T10> Products.P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final Products.P4<F, T7, T8, T9, T10> p) {
            return new Products.P10<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p.t1(), p.t2(), p.t3(), p.t4());

        }

        @Override
        default <T7, T8, T9, T10, T11> Products.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final Products.P5<F, T7, T8, T9, T10, T11> p) {
            return new Products.P11<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5());
        }

        @Override
        default <T7, T8, T9, T10, T11, T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Products.P6<F, T7, T8, T9, T10, T11, T12> p) {
            return new Products.P12<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6());
        }

        @Override
        default <T7, T8, T9, T10, T11, T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P7<F, T7, T8, T9, T10, T11, T12, T13> p) {
            return new Products.P13<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7());
        }

        @Override
        default <T7, T8, T9, T10, T11, T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P8<F, T7, T8, T9, T10, T11, T12, T13, T14> p) {
            return new Products.P14<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8());
        }

        @Override
        default <T7, T8, T9, T10, T11, T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P9<F, T7, T8, T9, T10, T11, T12, T13, T14, T15> p) {
            var p9 = t(p);
            return new Products.P15<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9());
        }

        @Override
        default <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P10<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> p) {
            var p10 = t(p);
            return new Products.P16<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10());
        }

        @Override
        default <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> ProductsExtension.P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P11<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> p) {
            var p11 = t(p);
            return new P17<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11());
        }

        @Override
        default <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> ProductsExtension.P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P12<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> p) {
            var p12 = t(p);
            return new P18<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p12.t1(), p12.t2(), p12.t3(), p12.t4(), p12.t5(), p12.t6(), p12.t7(), p12.t8(), p12.t9(), p12.t10(), p12.t11(), p12.t12());
        }

        @Override
        default <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> ProductsExtension.P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P13<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> p) {
            var p13 = t(p);
            return new P19<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p13.t1(), p13.t2(), p13.t3(), p13.t4(), p13.t5(), p13.t6(), p13.t7(), p13.t8(), p13.t9(), p13.t10(), p13.t11(), p13.t12(), p13.t13());
        }

        @Override
        default <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P14<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> p) {
            var p14 = t(p);
            return new P20<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p14.t1(), p14.t2(), p14.t3(), p14.t4(), p14.t5(), p14.t6(), p14.t7(), p14.t8(), p14.t9(), p14.t10(), p14.t11(), p14.t12(), p14.t13(), p14.t14());
        }

        @Override
        default <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P15<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p) {
            var p15 = t(p);
            return new P21<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p15.t1(), p15.t2(), p15.t3(), p15.t4(), p15.t5(), p15.t6(), p15.t7(), p15.t8(), p15.t9(), p15.t10(), p15.t11(), p15.t12(), p15.t13(), p15.t14(), p15.t15());
        }

        @Override
        default <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P16<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p) {
            var p16 = t(p);
            return new P22<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p16.t1(), p16.t2(), p16.t3(), p16.t4(), p16.t5(), p16.t6(), p16.t7(), p16.t8(), p16.t9(), p16.t10(), p16.t11(), p16.t12(), p16.t13(), p16.t14(), p16.t15(), p16.t16());
        }

        @Override
        default <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final ProductsExtension.P17<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p) {
            return new P23<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17());
        }

        @Override
        default <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final ProductsExtension.P18<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p) {
            return new P24<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18());
        }

        @Override
        default <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final ProductsExtension.P19<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p) {
            return new P25<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19());
        }

        @Override
        default <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final ProductsExtension.P20<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p) {
            return new P26<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20());
        }

        @Override
        default <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final ProductsExtension.P26<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            return new P32<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25(), p.t26()
            );
        }

        @Override
        default <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final ProductsExtension.P25<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            return new P31<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25()
            );
        }

        @Override
        default <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final ProductsExtension.P24<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            return new P30<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24()
            );
        }

        @Override
        default <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final ProductsExtension.P23<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            return new P29<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23()
            );
        }

        @Override
        default <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final ProductsExtension.P22<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p) {
            return new P28<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22()
            );
        }

        @Override
        default <T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final ProductsExtension.P21<F, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p) {
            return new P27<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21()
            );
        }
    }

    interface P7<F extends K1, T1, T2, T3, T4, T5, T6, T7> extends ProductsExtension.P7<F, T1, T2, T3, T4, T5, T6, T7> {
        @Override
        default <T8, T9> Products.P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final Products.P2<F, T8, T9> p) {
            return new Products.P9<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p.t1(), p.t2());
        }

        @Override
        default <T8, T9, T10> Products.P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final Products.P3<F, T8, T9, T10> p) {
            return new Products.P10<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p.t1(), p.t2(), p.t3());
        }

        @Override
        default <T8, T9, T10, T11> Products.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final Products.P4<F, T8, T9, T10, T11> p) {
            return new Products.P11<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p.t1(), p.t2(), p.t3(), p.t4());
        }

        @Override
        default <T8, T9, T10, T11, T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Products.P5<F, T8, T9, T10, T11, T12> p) {
            return new Products.P12<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5());
        }

        @Override
        default <T8, T9, T10, T11, T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P6<F, T8, T9, T10, T11, T12, T13> p) {
            return new Products.P13<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6());
        }

        @Override
        default <T8, T9, T10, T11, T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P7<F, T8, T9, T10, T11, T12, T13, T14> p) {
            return new Products.P14<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7());
        }

        @Override
        default <T8, T9, T10, T11, T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P8<F, T8, T9, T10, T11, T12, T13, T14, T15> p) {
            return new Products.P15<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8());
        }

        @Override
        default <T8, T9, T10, T11, T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P9<F, T8, T9, T10, T11, T12, T13, T14, T15, T16> p) {
            var p9 = t(p);
            return new Products.P16<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9());
        }

        @Override
        default <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> ProductsExtension.P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P10<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> p) {
            var p10 = t(p);
            return new P17<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10());
        }

        @Override
        default <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> ProductsExtension.P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P11<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> p) {
            var p11 = t(p);
            return new P18<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11());
        }

        @Override
        default <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> ProductsExtension.P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P12<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> p) {
            var p12 = t(p);
            return new P19<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p12.t1(), p12.t2(), p12.t3(), p12.t4(), p12.t5(), p12.t6(), p12.t7(), p12.t8(), p12.t9(), p12.t10(), p12.t11(), p12.t12());
        }

        @Override
        default <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P13<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> p) {
            var p13 = t(p);
            return new P20<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p13.t1(), p13.t2(), p13.t3(), p13.t4(), p13.t5(), p13.t6(), p13.t7(), p13.t8(), p13.t9(), p13.t10(), p13.t11(), p13.t12(), p13.t13());
        }

        @Override
        default <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P14<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p) {
            var p14 = t(p);
            return new P21<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p14.t1(), p14.t2(), p14.t3(), p14.t4(), p14.t5(), p14.t6(), p14.t7(), p14.t8(), p14.t9(), p14.t10(), p14.t11(), p14.t12(), p14.t13(), p14.t14());
        }

        @Override
        default <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P15<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p) {
            var p15 = t(p);
            return new P22<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p15.t1(), p15.t2(), p15.t3(), p15.t4(), p15.t5(), p15.t6(), p15.t7(), p15.t8(), p15.t9(), p15.t10(), p15.t11(), p15.t12(), p15.t13(), p15.t14(), p15.t15());
        }

        @Override
        default <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P16<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p) {
            var p16 = t(p);
            return new P23<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p16.t1(), p16.t2(), p16.t3(), p16.t4(), p16.t5(), p16.t6(), p16.t7(), p16.t8(), p16.t9(), p16.t10(), p16.t11(), p16.t12(), p16.t13(), p16.t14(), p16.t15(), p16.t16());
        }

        @Override
        default <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final ProductsExtension.P17<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p) {
            return new P24<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17());
        }

        @Override
        default <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final ProductsExtension.P18<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p) {
            return new P25<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18());
        }

        @Override
        default <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final ProductsExtension.P19<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p) {
            return new P26<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19());
        }

        @Override
        default <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final ProductsExtension.P20<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p) {
            return new P27<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20()
            );
        }

        @Override
        default <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final ProductsExtension.P21<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p) {
            return new P28<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21()
            );
        }

        @Override
        default <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final ProductsExtension.P22<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            return new P29<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22()
            );
        }

        @Override
        default <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final ProductsExtension.P23<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            return new P30<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23()
            );
        }

        @Override
        default <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final ProductsExtension.P24<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            return new P31<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24()
            );
        }

        @Override
        default <T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final ProductsExtension.P25<F, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            return new P32<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24(), p.t25()
            );
        }
    }

    interface P8<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8> extends ProductsExtension.P8<F, T1, T2, T3, T4, T5, T6, T7, T8> {
        @Override
        default <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final ProductsExtension.P18<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p) {
            return new P26<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18());
        }

        @Override
        default <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final ProductsExtension.P17<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p) {
            return new P25<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17());
        }

        @Override
        default <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P16<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p) {
            var p16 = t(p);
            return new P24<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p16.t1(), p16.t2(), p16.t3(), p16.t4(), p16.t5(), p16.t6(), p16.t7(), p16.t8(), p16.t9(), p16.t10(), p16.t11(), p16.t12(), p16.t13(), p16.t14(), p16.t15(), p16.t16());
        }

        @Override
        default <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P15<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p) {
            var p15 = t(p);
            return new P23<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p15.t1(), p15.t2(), p15.t3(), p15.t4(), p15.t5(), p15.t6(), p15.t7(), p15.t8(), p15.t9(), p15.t10(), p15.t11(), p15.t12(), p15.t13(), p15.t14(), p15.t15());
        }

        @Override
        default <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P14<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p) {
            var p14 = t(p);
            return new P22<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p14.t1(), p14.t2(), p14.t3(), p14.t4(), p14.t5(), p14.t6(), p14.t7(), p14.t8(), p14.t9(), p14.t10(), p14.t11(), p14.t12(), p14.t13(), p14.t14());
        }

        @Override
        default <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P13<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p) {
            var p13 = t(p);
            return new P21<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p13.t1(), p13.t2(), p13.t3(), p13.t4(), p13.t5(), p13.t6(), p13.t7(), p13.t8(), p13.t9(), p13.t10(), p13.t11(), p13.t12(), p13.t13());
        }

        @Override
        default <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P12<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> p) {
            var p12 = t(p);
            return new P20<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p12.t1(), p12.t2(), p12.t3(), p12.t4(), p12.t5(), p12.t6(), p12.t7(), p12.t8(), p12.t9(), p12.t10(), p12.t11(), p12.t12());
        }

        @Override
        default <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> ProductsExtension.P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P11<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> p) {
            var p11 = t(p);
            return new P19<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11());
        }

        @Override
        default <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> ProductsExtension.P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P10<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> p) {
            var p10 = t(p);
            return new P18<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10());
        }

        @Override
        default <T9, T10, T11, T12, T13, T14, T15, T16, T17> ProductsExtension.P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P9<F, T9, T10, T11, T12, T13, T14, T15, T16, T17> p) {
            var p9 = t(p);
            return new P17<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9());
        }

        @Override
        default <T9, T10, T11, T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P8<F, T9, T10, T11, T12, T13, T14, T15, T16> p) {
            return new Products.P16<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8());
        }

        @Override
        default <T9, T10, T11, T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P7<F, T9, T10, T11, T12, T13, T14, T15> p) {
            return new Products.P15<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7());
        }

        @Override
        default <T9, T10, T11, T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P6<F, T9, T10, T11, T12, T13, T14> p) {
            return new Products.P14<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6());
        }

        @Override
        default <T9, T10, T11, T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P5<F, T9, T10, T11, T12, T13> p) {
            return new Products.P13<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5());
        }

        @Override
        default <T9, T10, T11, T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Products.P4<F, T9, T10, T11, T12> p) {
            return new Products.P12<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p.t1(), p.t2(), p.t3(), p.t4());
        }

        @Override
        default <T9, T10, T11> Products.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final Products.P3<F, T9, T10, T11> p) {
            return new Products.P11<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p.t1(), p.t2(), p.t3());
        }

        @Override
        default <T9, T10> Products.P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final Products.P2<F, T9, T10> p) {
            return new Products.P10<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p.t1(), p.t2());
        }

        @Override
        default <T9> Products.P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> and(final App<F, T9> p) {
            return new Products.P9<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p);
        }

        @Override
        default <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final ProductsExtension.P24<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            return new P32<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23(), p.t24()
            );
        }

        @Override
        default <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final ProductsExtension.P23<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            return new P31<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23()
            );
        }

        @Override
        default <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final ProductsExtension.P22<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            return new P30<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22()
            );
        }

        @Override
        default <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final ProductsExtension.P21<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            return new P29<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21()
            );
        }

        @Override
        default <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final ProductsExtension.P20<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p) {
            return new P28<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20()
            );
        }

        @Override
        default <T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final ProductsExtension.P19<F, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p) {
            return new P27<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19()
            );
        }
    }

    interface P9<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9> extends ProductsExtension.P9<F, T1, T2, T3, T4, T5, T6, T7, T8, T9> {
        @Override
        default <T10> Products.P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> and(final App<F, T10> p) {
            return new Products.P10<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p);
        }

        @Override
        default <T10, T11> Products.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final Products.P2<F, T10, T11> p) {
            return new Products.P11<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p.t1(), p.t2());
        }

        @Override
        default <T10, T11, T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Products.P3<F, T10, T11, T12> p) {
            return new Products.P12<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p.t1(), p.t2(), p.t3());
        }

        @Override
        default <T10, T11, T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P4<F, T10, T11, T12, T13> p) {
            return new Products.P13<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p.t1(), p.t2(), p.t3(), p.t4());
        }

        @Override
        default <T10, T11, T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P5<F, T10, T11, T12, T13, T14> p) {
            return new Products.P14<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5());
        }

        @Override
        default <T10, T11, T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P6<F, T10, T11, T12, T13, T14, T15> p) {
            return new Products.P15<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6());
        }

        @Override
        default <T10, T11, T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P7<F, T10, T11, T12, T13, T14, T15, T16> p) {
            return new Products.P16<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7());
        }

        @Override
        default <T10, T11, T12, T13, T14, T15, T16, T17> ProductsExtension.P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P8<F, T10, T11, T12, T13, T14, T15, T16, T17> p) {
            return new P17<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8());
        }

        @Override
        default <T10, T11, T12, T13, T14, T15, T16, T17, T18> ProductsExtension.P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P9<F, T10, T11, T12, T13, T14, T15, T16, T17, T18> p) {
            var p9 = t(p);
            return new P18<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9());
        }

        @Override
        default <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> ProductsExtension.P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P10<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> p) {
            var p10 = t(p);
            return new P19<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10());
        }

        @Override
        default <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P11<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> p) {
            var p11 = t(p);
            return new P20<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11());
        }

        @Override
        default <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P12<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p) {
            var p12 = t(p);
            return new P21<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p12.t1(), p12.t2(), p12.t3(), p12.t4(), p12.t5(), p12.t6(), p12.t7(), p12.t8(), p12.t9(), p12.t10(), p12.t11(), p12.t12());
        }

        @Override
        default <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P13<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p) {
            var p13 = t(p);
            return new P22<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p13.t1(), p13.t2(), p13.t3(), p13.t4(), p13.t5(), p13.t6(), p13.t7(), p13.t8(), p13.t9(), p13.t10(), p13.t11(), p13.t12(), p13.t13());
        }

        @Override
        default <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P14<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p) {
            var p14 = t(p);
            return new P23<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p14.t1(), p14.t2(), p14.t3(), p14.t4(), p14.t5(), p14.t6(), p14.t7(), p14.t8(), p14.t9(), p14.t10(), p14.t11(), p14.t12(), p14.t13(), p14.t14());
        }

        @Override
        default <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P15<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p) {
            var p15 = t(p);
            return new P24<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p15.t1(), p15.t2(), p15.t3(), p15.t4(), p15.t5(), p15.t6(), p15.t7(), p15.t8(), p15.t9(), p15.t10(), p15.t11(), p15.t12(), p15.t13(), p15.t14(), p15.t15());
        }

        @Override
        default <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P16<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p) {
            var p16 = t(p);
            return new P25<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p16.t1(), p16.t2(), p16.t3(), p16.t4(), p16.t5(), p16.t6(), p16.t7(), p16.t8(), p16.t9(), p16.t10(), p16.t11(), p16.t12(), p16.t13(), p16.t14(), p16.t15(), p16.t16());
        }

        @Override
        default <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final ProductsExtension.P17<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p) {
            return new P26<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17());
        }

        @Override
        default <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final ProductsExtension.P18<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p) {
            return new P27<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18()
            );
        }

        @Override
        default <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final ProductsExtension.P19<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p) {
            return new P28<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19()
            );
        }

        @Override
        default <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final ProductsExtension.P20<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            return new P29<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20()
            );
        }

        @Override
        default <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final ProductsExtension.P21<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            return new P30<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21()
            );
        }

        @Override
        default <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final ProductsExtension.P22<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            return new P31<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22()
            );
        }

        @Override
        default <T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final ProductsExtension.P23<F, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            return new P32<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22(), p.t23()
            );
        }
    }

    interface P10<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> extends ProductsExtension.P10<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> {
        @Override
        default <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P16<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p) {
            var p16 = t(p);
            return new P26<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p16.t1(), p16.t2(), p16.t3(), p16.t4(), p16.t5(), p16.t6(), p16.t7(), p16.t8(), p16.t9(), p16.t10(), p16.t11(), p16.t12(), p16.t13(), p16.t14(), p16.t15(), p16.t16());
        }

        @Override
        default <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P15<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p) {
            var p15 = t(p);
            return new P25<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p15.t1(), p15.t2(), p15.t3(), p15.t4(), p15.t5(), p15.t6(), p15.t7(), p15.t8(), p15.t9(), p15.t10(), p15.t11(), p15.t12(), p15.t13(), p15.t14(), p15.t15());
        }

        @Override
        default <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P14<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p) {
            var p14 = t(p);
            return new P24<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p14.t1(), p14.t2(), p14.t3(), p14.t4(), p14.t5(), p14.t6(), p14.t7(), p14.t8(), p14.t9(), p14.t10(), p14.t11(), p14.t12(), p14.t13(), p14.t14());
        }

        @Override
        default <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P13<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p) {
            var p13 = t(p);
            return new P23<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p13.t1(), p13.t2(), p13.t3(), p13.t4(), p13.t5(), p13.t6(), p13.t7(), p13.t8(), p13.t9(), p13.t10(), p13.t11(), p13.t12(), p13.t13());
        }

        @Override
        default <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P12<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p) {
            var p12 = t(p);
            return new P22<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p12.t1(), p12.t2(), p12.t3(), p12.t4(), p12.t5(), p12.t6(), p12.t7(), p12.t8(), p12.t9(), p12.t10(), p12.t11(), p12.t12());
        }

        @Override
        default <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P11<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p) {
            var p11 = t(p);
            return new P21<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11());
        }

        @Override
        default <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P10<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> p) {
            var p10 = t(p);
            return new P20<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10());
        }

        @Override
        default <T11, T12, T13, T14, T15, T16, T17, T18, T19> ProductsExtension.P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P9<F, T11, T12, T13, T14, T15, T16, T17, T18, T19> p) {
            var p9 = t(p);
            return new P19<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9());
        }

        @Override
        default <T11, T12, T13, T14, T15, T16, T17, T18> ProductsExtension.P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P8<F, T11, T12, T13, T14, T15, T16, T17, T18> p) {
            return new P18<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8());
        }

        @Override
        default <T11, T12, T13, T14, T15, T16, T17> ProductsExtension.P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P7<F, T11, T12, T13, T14, T15, T16, T17> p) {
            return new P17<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7());
        }

        @Override
        default <T11, T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P6<F, T11, T12, T13, T14, T15, T16> p) {
            return new Products.P16<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6());
        }

        @Override
        default <T11, T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P5<F, T11, T12, T13, T14, T15> p) {
            return new Products.P15<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5());
        }

        @Override
        default <T11, T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P4<F, T11, T12, T13, T14> p) {
            return new Products.P14<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p.t1(), p.t2(), p.t3(), p.t4());
        }

        @Override
        default <T11, T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P3<F, T11, T12, T13> p) {
            return new Products.P13<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p.t1(), p.t2(), p.t3());
        }

        @Override
        default <T11, T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final Products.P2<F, T11, T12> p) {
            return new Products.P12<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p.t1(), p.t2());
        }

        @Override
        default <T11> Products.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> and(final App<F, T11> p) {
            return new Products.P11<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p);
        }

        @Override
        default <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final ProductsExtension.P22<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            return new P32<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21(), p.t22()
            );
        }

        @Override
        default <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final ProductsExtension.P21<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            return new P31<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21()
            );
        }

        @Override
        default <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final ProductsExtension.P20<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            return new P30<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20()
            );
        }

        @Override
        default <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final ProductsExtension.P19<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            return new P29<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19()
            );
        }

        @Override
        default <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final ProductsExtension.P18<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p) {
            return new P28<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18()
            );
        }

        @Override
        default <T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final ProductsExtension.P17<F, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p) {
            return new P27<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17()
            );
        }
    }

    interface P11<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> extends ProductsExtension.P11<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> {
        @Override
        default <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P15<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p) {
            var p15 = t(p);
            return new P26<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p15.t1(), p15.t2(), p15.t3(), p15.t4(), p15.t5(), p15.t6(), p15.t7(), p15.t8(), p15.t9(), p15.t10(), p15.t11(), p15.t12(), p15.t13(), p15.t14(), p15.t15());
        }

        @Override
        default <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P14<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p) {
            var p14 = t(p);
            return new P25<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p14.t1(), p14.t2(), p14.t3(), p14.t4(), p14.t5(), p14.t6(), p14.t7(), p14.t8(), p14.t9(), p14.t10(), p14.t11(), p14.t12(), p14.t13(), p14.t14());
        }

        @Override
        default <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P13<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p) {
            var p13 = t(p);
            return new P24<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p13.t1(), p13.t2(), p13.t3(), p13.t4(), p13.t5(), p13.t6(), p13.t7(), p13.t8(), p13.t9(), p13.t10(), p13.t11(), p13.t12(), p13.t13());
        }

        @Override
        default <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P12<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p) {
            var p12 = t(p);
            return new P23<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p12.t1(), p12.t2(), p12.t3(), p12.t4(), p12.t5(), p12.t6(), p12.t7(), p12.t8(), p12.t9(), p12.t10(), p12.t11(), p12.t12());
        }

        @Override
        default <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P11<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p) {
            var p11 = t(p);
            return new P22<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11());
        }

        @Override
        default <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P10<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> p) {
            var p10 = t(p);
            return new P21<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10());
        }

        @Override
        default <T12, T13, T14, T15, T16, T17, T18, T19, T20> ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P9<F, T12, T13, T14, T15, T16, T17, T18, T19, T20> p) {
            var p9 = t(p);
            return new P20<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9());
        }

        @Override
        default <T12, T13, T14, T15, T16, T17, T18, T19> ProductsExtension.P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P8<F, T12, T13, T14, T15, T16, T17, T18, T19> p) {
            return new P19<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8());
        }

        @Override
        default <T12, T13, T14, T15, T16, T17, T18> ProductsExtension.P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P7<F, T12, T13, T14, T15, T16, T17, T18> p) {
            return new P18<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7());
        }

        @Override
        default <T12, T13, T14, T15, T16, T17> ProductsExtension.P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P6<F, T12, T13, T14, T15, T16, T17> p) {
            return new P17<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6());
        }

        @Override
        default <T12, T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P5<F, T12, T13, T14, T15, T16> p) {
            return new Products.P16<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5());
        }

        @Override
        default <T12, T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P4<F, T12, T13, T14, T15> p) {
            return new Products.P15<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p.t1(), p.t2(), p.t3(), p.t4());
        }

        @Override
        default <T12, T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P3<F, T12, T13, T14> p) {
            return new Products.P14<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p.t1(), p.t2(), p.t3());
        }

        @Override
        default <T12, T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final Products.P2<F, T12, T13> p) {
            return new Products.P13<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p.t1(), p.t2());
        }

        @Override
        default <T12> Products.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> and(final App<F, T12> p) {
            return new Products.P12<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p);
        }

        @Override
        default <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final ProductsExtension.P21<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            return new P32<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20(), p.t21()
            );
        }

        @Override
        default <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final ProductsExtension.P20<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            return new P31<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20()
            );
        }

        @Override
        default <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final ProductsExtension.P19<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            return new P30<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19()
            );
        }

        @Override
        default <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final ProductsExtension.P18<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            return new P29<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18()
            );
        }

        @Override
        default <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final ProductsExtension.P17<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p) {
            return new P28<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17()
            );
        }

        @Override
        default <T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P16<F, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p) {
            var p16 = t(p);
            return new P27<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), p16.t1(), p16.t2(), p16.t3(), p16.t4(), p16.t5(), p16.t6(), p16.t7(), p16.t8(), p16.t9(), p16.t10(), p16.t11(), p16.t12(), p16.t13(), p16.t14(), p16.t15(), p16.t16()
            );
        }
    }

    interface P12<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> extends ProductsExtension.P12<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> {
        @Override
        default <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P14<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p) {
            var p14 = t(p);
            return new P26<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), p14.t1(), p14.t2(), p14.t3(), p14.t4(), p14.t5(), p14.t6(), p14.t7(), p14.t8(), p14.t9(), p14.t10(), p14.t11(), p14.t12(), p14.t13(), p14.t14());
        }

        @Override
        default <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P13<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p) {
            var p13 = t(p);
            return new P25<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), p13.t1(), p13.t2(), p13.t3(), p13.t4(), p13.t5(), p13.t6(), p13.t7(), p13.t8(), p13.t9(), p13.t10(), p13.t11(), p13.t12(), p13.t13());
        }

        @Override
        default <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P12<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p) {
            var p12 = t(p);
            return new P24<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), p12.t1(), p12.t2(), p12.t3(), p12.t4(), p12.t5(), p12.t6(), p12.t7(), p12.t8(), p12.t9(), p12.t10(), p12.t11(), p12.t12());
        }

        @Override
        default <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P11<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p) {
            var p11 = t(p);
            return new P23<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11());
        }

        @Override
        default <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P10<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> p) {
            var p10 = t(p);
            return new P22<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10());
        }

        @Override
        default <T13, T14, T15, T16, T17, T18, T19, T20, T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P9<F, T13, T14, T15, T16, T17, T18, T19, T20, T21> p) {
            var p9 = t(p);
            return new P21<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9());
        }

        @Override
        default <T13, T14, T15, T16, T17, T18, T19, T20> ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P8<F, T13, T14, T15, T16, T17, T18, T19, T20> p) {
            return new P20<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8());
        }

        @Override
        default <T13, T14, T15, T16, T17, T18, T19> ProductsExtension.P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P7<F, T13, T14, T15, T16, T17, T18, T19> p) {
            return new P19<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7());
        }

        @Override
        default <T13, T14, T15, T16, T17, T18> ProductsExtension.P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P6<F, T13, T14, T15, T16, T17, T18> p) {
            return new P18<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6());
        }

        @Override
        default <T13, T14, T15, T16, T17> ProductsExtension.P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P5<F, T13, T14, T15, T16, T17> p) {
            return new P17<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5());
        }

        @Override
        default <T13, T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P4<F, T13, T14, T15, T16> p) {
            return new Products.P16<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), p.t1(), p.t2(), p.t3(), p.t4());
        }

        @Override
        default <T13, T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P3<F, T13, T14, T15> p) {
            return new Products.P15<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), p.t1(), p.t2(), p.t3());
        }

        @Override
        default <T13, T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final Products.P2<F, T13, T14> p) {
            return new Products.P14<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), p.t1(), p.t2());
        }

        @Override
        default <T13> Products.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> and(final App<F, T13> p) {
            return new Products.P13<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), p);
        }

        @Override
        default <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final ProductsExtension.P20<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            return new P32<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19(), p.t20()
            );
        }

        @Override
        default <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final ProductsExtension.P19<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            return new P31<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19()
            );
        }

        @Override
        default <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final ProductsExtension.P18<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            return new P30<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18()
            );
        }

        @Override
        default <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final ProductsExtension.P17<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            return new P29<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17()
            );
        }

        @Override
        default <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final Products.P16<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p) {
            var p16 = t(p);
            return new P28<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), p16.t1(), p16.t2(), p16.t3(), p16.t4(), p16.t5(), p16.t6(), p16.t7(), p16.t8(), p16.t9(), p16.t10(), p16.t11(), p16.t12(), p16.t13(), p16.t14(), p16.t15(), p16.t16()
            );
        }

        @Override
        default <T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P15<F, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p) {
            var p15 = t(p);
            return new P27<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), p15.t1(), p15.t2(), p15.t3(), p15.t4(), p15.t5(), p15.t6(), p15.t7(), p15.t8(), p15.t9(), p15.t10(), p15.t11(), p15.t12(), p15.t13(), p15.t14(), p15.t15()
            );
        }
    }

    interface P13<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> extends ProductsExtension.P13<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> {
        @Override
        default <T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P13<F, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p) {
            var p13 = t(p);
            return new P26<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), p13.t1(), p13.t2(), p13.t3(), p13.t4(), p13.t5(), p13.t6(), p13.t7(), p13.t8(), p13.t9(), p13.t10(), p13.t11(), p13.t12(), p13.t13());
        }

        @Override
        default <T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P12<F, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p) {
            var p12 = t(p);
            return new P25<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), p12.t1(), p12.t2(), p12.t3(), p12.t4(), p12.t5(), p12.t6(), p12.t7(), p12.t8(), p12.t9(), p12.t10(), p12.t11(), p12.t12());
        }

        @Override
        default <T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P11<F, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p) {
            var p11 = t(p);
            return new P24<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11());
        }

        @Override
        default <T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P10<F, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> p) {
            var p10 = t(p);
            return new P23<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10());
        }

        @Override
        default <T14, T15, T16, T17, T18, T19, T20, T21, T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P9<F, T14, T15, T16, T17, T18, T19, T20, T21, T22> p) {
            var p9 = t(p);
            return new P22<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9());
        }

        @Override
        default <T14, T15, T16, T17, T18, T19, T20, T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P8<F, T14, T15, T16, T17, T18, T19, T20, T21> p) {
            return new P21<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8());
        }

        @Override
        default <T14, T15, T16, T17, T18, T19, T20> ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P7<F, T14, T15, T16, T17, T18, T19, T20> p) {
            return new P20<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7());
        }

        @Override
        default <T14, T15, T16, T17, T18, T19> ProductsExtension.P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P6<F, T14, T15, T16, T17, T18, T19> p) {
            return new P19<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6());
        }

        @Override
        default <T14, T15, T16, T17, T18> ProductsExtension.P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P5<F, T14, T15, T16, T17, T18> p) {
            return new P18<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5());
        }

        @Override
        default <T14, T15, T16, T17> ProductsExtension.P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P4<F, T14, T15, T16, T17> p) {
            return new P17<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), p.t1(), p.t2(), p.t3(), p.t4());
        }

        @Override
        default <T14, T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P3<F, T14, T15, T16> p) {
            return new Products.P16<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), p.t1(), p.t2(), p.t3());
        }

        @Override
        default <T14, T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final Products.P2<F, T14, T15> p) {
            return new Products.P15<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), p.t1(), p.t2());
        }

        @Override
        default <T14> Products.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> and(final App<F, T14> p) {
            return new Products.P14<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), p);
        }

        @Override
        default <T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final ProductsExtension.P19<F, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            return new P32<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18(), p.t19()
            );
        }

        @Override
        default <T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final ProductsExtension.P18<F, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            return new P31<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18()
            );
        }

        @Override
        default <T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final ProductsExtension.P17<F, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            return new P30<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17()
            );
        }

        @Override
        default <T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final Products.P16<F, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            var p16 = t(p);
            return new P29<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), p16.t1(), p16.t2(), p16.t3(), p16.t4(), p16.t5(), p16.t6(), p16.t7(), p16.t8(), p16.t9(), p16.t10(), p16.t11(), p16.t12(), p16.t13(), p16.t14(), p16.t15(), p16.t16()
            );
        }

        @Override
        default <T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final Products.P15<F, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p) {
            var p15 = t(p);
            return new P28<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), p15.t1(), p15.t2(), p15.t3(), p15.t4(), p15.t5(), p15.t6(), p15.t7(), p15.t8(), p15.t9(), p15.t10(), p15.t11(), p15.t12(), p15.t13(), p15.t14(), p15.t15()
            );
        }

        @Override
        default <T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P14<F, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p) {
            var p14 = t(p);
            return new P27<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), p14.t1(), p14.t2(), p14.t3(), p14.t4(), p14.t5(), p14.t6(), p14.t7(), p14.t8(), p14.t9(), p14.t10(), p14.t11(), p14.t12(), p14.t13(), p14.t14()
            );
        }
    }

    interface P14<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> extends ProductsExtension.P14<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> {
        @Override
        default <T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P12<F, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p) {
            var p12 = t(p);
            return new P26<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), p12.t1(), p12.t2(), p12.t3(), p12.t4(), p12.t5(), p12.t6(), p12.t7(), p12.t8(), p12.t9(), p12.t10(), p12.t11(), p12.t12());
        }

        @Override
        default <T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P11<F, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p) {
            var p11 = t(p);
            return new P25<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11());
        }

        @Override
        default <T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P10<F, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> p) {
            var p10 = t(p);
            return new P24<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10());
        }

        @Override
        default <T15, T16, T17, T18, T19, T20, T21, T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P9<F, T15, T16, T17, T18, T19, T20, T21, T22, T23> p) {
            var p9 = t(p);
            return new P23<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9());
        }

        @Override
        default <T15, T16, T17, T18, T19, T20, T21, T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P8<F, T15, T16, T17, T18, T19, T20, T21, T22> p) {
            return new P22<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8());
        }

        @Override
        default <T15, T16, T17, T18, T19, T20, T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P7<F, T15, T16, T17, T18, T19, T20, T21> p) {
            return new P21<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7());
        }

        @Override
        default <T15, T16, T17, T18, T19, T20> ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P6<F, T15, T16, T17, T18, T19, T20> p) {
            return new P20<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6());
        }

        @Override
        default <T15, T16, T17, T18, T19> ProductsExtension.P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P5<F, T15, T16, T17, T18, T19> p) {
            return new P19<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5());
        }

        @Override
        default <T15, T16, T17, T18> ProductsExtension.P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P4<F, T15, T16, T17, T18> p) {
            return new P18<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), p.t1(), p.t2(), p.t3(), p.t4());
        }

        @Override
        default <T15, T16, T17> ProductsExtension.P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P3<F, T15, T16, T17> p) {
            return new P17<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), p.t1(), p.t2(), p.t3());
        }

        @Override
        default <T15, T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final Products.P2<F, T15, T16> p) {
            return new Products.P16<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), p.t1(), p.t2());
        }

        @Override
        default <T15> Products.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> and(final App<F, T15> p) {
            return new Products.P15<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), p);
        }

        @Override
        default <T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final ProductsExtension.P18<F, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            return new P32<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17(), p.t18()
            );
        }

        @Override
        default <T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final ProductsExtension.P17<F, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            return new P31<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17()
            );
        }

        @Override
        default <T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final Products.P16<F, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            var p16 = t(p);
            return new P30<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), p16.t1(), p16.t2(), p16.t3(), p16.t4(), p16.t5(), p16.t6(), p16.t7(), p16.t8(), p16.t9(), p16.t10(), p16.t11(), p16.t12(), p16.t13(), p16.t14(), p16.t15(), p16.t16()
            );
        }

        @Override
        default <T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final Products.P15<F, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            var p15 = t(p);
            return new P29<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), p15.t1(), p15.t2(), p15.t3(), p15.t4(), p15.t5(), p15.t6(), p15.t7(), p15.t8(), p15.t9(), p15.t10(), p15.t11(), p15.t12(), p15.t13(), p15.t14(), p15.t15()
            );
        }

        @Override
        default <T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final Products.P14<F, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p) {
            var p14 = t(p);
            return new P28<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), p14.t1(), p14.t2(), p14.t3(), p14.t4(), p14.t5(), p14.t6(), p14.t7(), p14.t8(), p14.t9(), p14.t10(), p14.t11(), p14.t12(), p14.t13(), p14.t14()
            );
        }

        @Override
        default <T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P13<F, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p) {
            var p13 = t(p);
            return new P27<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), p13.t1(), p13.t2(), p13.t3(), p13.t4(), p13.t5(), p13.t6(), p13.t7(), p13.t8(), p13.t9(), p13.t10(), p13.t11(), p13.t12(), p13.t13()
            );
        }
    }

    interface P15<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> extends ProductsExtension.P15<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> {
        @Override
        default <T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P11<F, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p) {
            var p11 = t(p);
            return new P26<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11());
        }

        @Override
        default <T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P10<F, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> p) {
            var p10 = t(p);
            return new P25<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10());
        }

        @Override
        default <T16, T17, T18, T19, T20, T21, T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P9<F, T16, T17, T18, T19, T20, T21, T22, T23, T24> p) {
            var p9 = t(p);
            return new P24<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9());
        }

        @Override
        default <T16, T17, T18, T19, T20, T21, T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P8<F, T16, T17, T18, T19, T20, T21, T22, T23> p) {
            return new P23<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8());
        }

        @Override
        default <T16, T17, T18, T19, T20, T21, T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P7<F, T16, T17, T18, T19, T20, T21, T22> p) {
            return new P22<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7());
        }

        @Override
        default <T16, T17, T18, T19, T20, T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P6<F, T16, T17, T18, T19, T20, T21> p) {
            return new P21<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6());
        }

        @Override
        default <T16, T17, T18, T19, T20> ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P5<F, T16, T17, T18, T19, T20> p) {
            return new P20<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5());
        }

        @Override
        default <T16, T17, T18, T19> ProductsExtension.P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P4<F, T16, T17, T18, T19> p) {
            return new P19<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), p.t1(), p.t2(), p.t3(), p.t4());
        }

        @Override
        default <T16, T17, T18> ProductsExtension.P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P3<F, T16, T17, T18> p) {
            return new P18<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), p.t1(), p.t2(), p.t3());
        }

        @Override
        default <T16, T17> ProductsExtension.P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final Products.P2<F, T16, T17> p) {
            return new P17<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), p.t1(), p.t2());
        }

        @Override
        default <T16> Products.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> and(final App<F, T16> p) {
            return new Products.P16<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), p);
        }

        @Override
        default <T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final ProductsExtension.P17<F, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            return new P32<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8(), p.t9(), p.t10(), p.t11(), p.t12(), p.t13(), p.t14(), p.t15(), p.t16(), p.t17()
            );
        }

        @Override
        default <T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final Products.P16<F, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            var p16 = t(p);
            return new P31<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), p16.t1(), p16.t2(), p16.t3(), p16.t4(), p16.t5(), p16.t6(), p16.t7(), p16.t8(), p16.t9(), p16.t10(), p16.t11(), p16.t12(), p16.t13(), p16.t14(), p16.t15(), p16.t16()
            );
        }

        @Override
        default <T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final Products.P15<F, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            var p15 = t(p);
            return new P30<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), p15.t1(), p15.t2(), p15.t3(), p15.t4(), p15.t5(), p15.t6(), p15.t7(), p15.t8(), p15.t9(), p15.t10(), p15.t11(), p15.t12(), p15.t13(), p15.t14(), p15.t15()
            );
        }

        @Override
        default <T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final Products.P14<F, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            var p14 = t(p);
            return new P29<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), p14.t1(), p14.t2(), p14.t3(), p14.t4(), p14.t5(), p14.t6(), p14.t7(), p14.t8(), p14.t9(), p14.t10(), p14.t11(), p14.t12(), p14.t13(), p14.t14()
            );
        }

        @Override
        default <T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final Products.P13<F, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p) {
            var p13 = t(p);
            return new P28<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), p13.t1(), p13.t2(), p13.t3(), p13.t4(), p13.t5(), p13.t6(), p13.t7(), p13.t8(), p13.t9(), p13.t10(), p13.t11(), p13.t12(), p13.t13()
            );
        }

        @Override
        default <T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P12<F, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p) {
            var p12 = t(p);
            return new P27<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), p12.t1(), p12.t2(), p12.t3(), p12.t4(), p12.t5(), p12.t6(), p12.t7(), p12.t8(), p12.t9(), p12.t10(), p12.t11(), p12.t12()
            );
        }
    }

    interface P16<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> extends ProductsExtension.P16<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> {
        @Override
        default <T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(final Products.P10<F, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> p) {
            var p10 = t(p);
            return new P26<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), this.t16(), p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10());
        }

        @Override
        default <T17, T18, T19, T20, T21, T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(final Products.P9<F, T17, T18, T19, T20, T21, T22, T23, T24, T25> p) {
            var p9 = t(p);
            return new P25<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), this.t16(), p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9());
        }

        @Override
        default <T17, T18, T19, T20, T21, T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(final Products.P8<F, T17, T18, T19, T20, T21, T22, T23, T24> p) {
            return new P24<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), this.t16(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8());
        }

        @Override
        default <T17, T18, T19, T20, T21, T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(final Products.P7<F, T17, T18, T19, T20, T21, T22, T23> p) {
            return new P23<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), this.t16(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7());
        }

        @Override
        default <T17, T18, T19, T20, T21, T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(final Products.P6<F, T17, T18, T19, T20, T21, T22> p) {
            return new P22<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), this.t16(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6());
        }

        @Override
        default <T17, T18, T19, T20, T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P5<F, T17, T18, T19, T20, T21> p) {
            return new P21<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), this.t16(), p.t1(), p.t2(), p.t3(), p.t4(), p.t5());
        }

        @Override
        default <T17, T18, T19, T20> ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P4<F, T17, T18, T19, T20> p) {
            return new P20<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), this.t16(), p.t1(), p.t2(), p.t3(), p.t4());
        }

        @Override
        default <T17, T18, T19> ProductsExtension.P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P3<F, T17, T18, T19> p) {
            return new P19<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), this.t16(), p.t1(), p.t2(), p.t3());
        }

        @Override
        default <T17, T18> ProductsExtension.P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P2<F, T17, T18> p) {
            return new P18<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), this.t16(), p.t1(), p.t2());
        }

        @Override
        default <T17> ProductsExtension.P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> and(final App<F, T17> p) {
            return new P17<>(this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), this.t16(), p);
        }

        @Override
        default <T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(final Products.P16<F, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            var p16 = t(p);
            return new P32<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), this.t16(), p16.t1(), p16.t2(), p16.t3(), p16.t4(), p16.t5(), p16.t6(), p16.t7(), p16.t8(), p16.t9(), p16.t10(), p16.t11(), p16.t12(), p16.t13(), p16.t14(), p16.t15(), p16.t16()
            );
        }

        @Override
        default <T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(final Products.P15<F, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            var p15 = t(p);
            return new P31<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), this.t16(), p15.t1(), p15.t2(), p15.t3(), p15.t4(), p15.t5(), p15.t6(), p15.t7(), p15.t8(), p15.t9(), p15.t10(), p15.t11(), p15.t12(), p15.t13(), p15.t14(), p15.t15()
            );
        }

        @Override
        default <T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(final Products.P14<F, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            var p14 = t(p);
            return new P30<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), this.t16(), p14.t1(), p14.t2(), p14.t3(), p14.t4(), p14.t5(), p14.t6(), p14.t7(), p14.t8(), p14.t9(), p14.t10(), p14.t11(), p14.t12(), p14.t13(), p14.t14()
            );
        }

        @Override
        default <T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(final Products.P13<F, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            var p13 = t(p);
            return new P29<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), this.t16(), p13.t1(), p13.t2(), p13.t3(), p13.t4(), p13.t5(), p13.t6(), p13.t7(), p13.t8(), p13.t9(), p13.t10(), p13.t11(), p13.t12(), p13.t13()
            );
        }

        @Override
        default <T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(final Products.P12<F, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p) {
            var p12 = t(p);
            return new P28<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), this.t16(), p12.t1(), p12.t2(), p12.t3(), p12.t4(), p12.t5(), p12.t6(), p12.t7(), p12.t8(), p12.t9(), p12.t10(), p12.t11(), p12.t12()
            );
        }

        @Override
        default <T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(final Products.P11<F, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p) {
            var p11 = t(p);
            return new P27<>(
                    this.t1(), this.t2(), this.t3(), this.t4(), this.t5(), this.t6(), this.t7(), this.t8(), this.t9(), this.t10(), this.t11(), this.t12(), this.t13(), this.t14(), this.t15(), this.t16(), p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11()
            );
        }
    }

    record P17<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>(App<F, T1> t1, App<F, T2> t2, App<F, T3> t3, App<F, T4> t4, App<F, T5> t5, App<F, T6> t6, App<F, T7> t7, App<F, T8> t8, App<F, T9> t9, App<F, T10> t10, App<F, T11> t11, App<F, T12> t12, App<F, T13> t13, App<F, T14> t14, App<F, T15> t15, App<F, T16> t16, App<F, T17> t17) implements ProductsExtension.P17<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> {
        public <T18> ProductsExtension.P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(final Products.P1<F, T18> p) {
            return new P18<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, p.t1());
        }

        @Override
        public <T18> ProductsExtension.P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> and(App<F, T18> p) {
            return new P18<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, p);
        }

        public <T18, T19> ProductsExtension.P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P2<F, T18, T19> p) {
            return new P19<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, p.t1(), p.t2());
        }

        public <T19, T20, T21> ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T19, T20, T21> and(final Products.P3<F, T19, T20, T21> p) {
            return new P20<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, p.t1(), p.t2(), p.t3());
        }

        public <T18, T19, T20, T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P4<F, T18, T19, T20, T21> p) {
            return new P21<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, p.t1(), p.t2(), p.t3(), p.t4());
        }

        @Override
        public <T18, T19, T20, T21, T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(Products.P5<F, T18, T19, T20, T21, T22> p) {
            return new P22<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, p.t1(), p.t2(), p.t3(), p.t4(), p.t5());
        }

        @Override
        public <T18, T19, T20, T21, T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(Products.P6<F, T18, T19, T20, T21, T22, T23> p) {
            return new P23<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6());
        }

        @Override
        public <T18, T19, T20, T21, T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(Products.P7<F, T18, T19, T20, T21, T22, T23, T24> p) {
            return new P24<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7());
        }

        @Override
        public <T18, T19, T20, T21, T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(Products.P8<F, T18, T19, T20, T21, T22, T23, T24, T25> p) {
            return new P25<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8());
        }

        @Override
        public <T18, T19, T20, T21, T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(Products.P9<F, T18, T19, T20, T21, T22, T23, T24, T25, T26> p) {
            var p9 = t(p);
            return new P26<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9());
        }

        @Override
        public <T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(Products.P10<F, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> p) {
            var p10 = t(p);
            return new P27<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10()
            );
        }

        @Override
        public <T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(Products.P11<F, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p) {
            var p11 = t(p);
            return new P28<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11()
            );
        }

        @Override
        public <T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(Products.P12<F, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            var p12 = t(p);
            return new P29<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, p12.t1(), p12.t2(), p12.t3(), p12.t4(), p12.t5(), p12.t6(), p12.t7(), p12.t8(), p12.t9(), p12.t10(), p12.t11(), p12.t12()
            );
        }

        @Override
        public <T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(Products.P13<F, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            var p13 = t(p);
            return new P30<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, p13.t1(), p13.t2(), p13.t3(), p13.t4(), p13.t5(), p13.t6(), p13.t7(), p13.t8(), p13.t9(), p13.t10(), p13.t11(), p13.t12(), p13.t13()
            );
        }

        @Override
        public <T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(Products.P14<F, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            var p14 = t(p);
            return new P31<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, p14.t1(), p14.t2(), p14.t3(), p14.t4(), p14.t5(), p14.t6(), p14.t7(), p14.t8(), p14.t9(), p14.t10(), p14.t11(), p14.t12(), p14.t13(), p14.t14()
            );
        }

        @Override
        public <T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(Products.P15<F, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            var p15 = t(p);
            return new P32<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, p15.t1(), p15.t2(), p15.t3(), p15.t4(), p15.t5(), p15.t6(), p15.t7(), p15.t8(), p15.t9(), p15.t10(), p15.t11(), p15.t12(), p15.t13(), p15.t14(), p15.t15()
            );
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R>> function) {
            return t(instance).ap17(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17);
        }

    }

    record P18<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>(App<F, T1> t1, App<F, T2> t2, App<F, T3> t3, App<F, T4> t4, App<F, T5> t5, App<F, T6> t6, App<F, T7> t7, App<F, T8> t8, App<F, T9> t9, App<F, T10> t10, App<F, T11> t11, App<F, T12> t12, App<F, T13> t13, App<F, T14> t14, App<F, T15> t15, App<F, T16> t16, App<F, T17> t17, App<F, T18> t18) implements ProductsExtension.P18<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> {

        public <T19> ProductsExtension.P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(final Products.P1<F, T19> p) {
            return new P19<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, p.t1());
        }

        @Override
        public <T19> ProductsExtension.P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> and(App<F, T19> p) {
            return new P19<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, p);
        }

        public <T19, T20> ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P2<F, T19, T20> p) {
            return new P20<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, p.t1(), p.t2());
        }

        public <T19, T20, T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P3<F, T19, T20, T21> p) {
            return new P21<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, p.t1(), p.t2(), p.t3());
        }

        @Override
        public <T19, T20, T21, T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(Products.P4<F, T19, T20, T21, T22> p) {
            return new P22<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, p.t1(), p.t2(), p.t3(), p.t4());
        }

        @Override
        public <T19, T20, T21, T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(Products.P5<F, T19, T20, T21, T22, T23> p) {
            return new P23<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, p.t1(), p.t2(), p.t3(), p.t4(), p.t5());
        }

        @Override
        public <T19, T20, T21, T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(Products.P6<F, T19, T20, T21, T22, T23, T24> p) {
            return new P24<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6());
        }

        @Override
        public <T19, T20, T21, T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(Products.P7<F, T19, T20, T21, T22, T23, T24, T25> p) {
            return new P25<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7());
        }

        @Override
        public <T19, T20, T21, T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(Products.P8<F, T19, T20, T21, T22, T23, T24, T25, T26> p) {
            return new P26<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8());
        }

        @Override
        public <T19, T20, T21, T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(Products.P9<F, T19, T20, T21, T22, T23, T24, T25, T26, T27> p) {
            var p9 = t(p);
            return new P27<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9()
            );
        }

        @Override
        public <T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(Products.P10<F, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> p) {
            var p10 = t(p);
            return new P28<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10()
            );
        }

        @Override
        public <T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(Products.P11<F, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            var p11 = t(p);
            return new P29<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11()
            );
        }

        @Override
        public <T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(Products.P12<F, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            var p12 = t(p);
            return new P30<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, p12.t1(), p12.t2(), p12.t3(), p12.t4(), p12.t5(), p12.t6(), p12.t7(), p12.t8(), p12.t9(), p12.t10(), p12.t11(), p12.t12()
            );
        }

        @Override
        public <T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(Products.P13<F, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            var p13 = t(p);
            return new P31<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, p13.t1(), p13.t2(), p13.t3(), p13.t4(), p13.t5(), p13.t6(), p13.t7(), p13.t8(), p13.t9(), p13.t10(), p13.t11(), p13.t12(), p13.t13()
            );
        }

        @Override
        public <T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(Products.P14<F, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            var p14 = t(p);
            return new P32<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, p14.t1(), p14.t2(), p14.t3(), p14.t4(), p14.t5(), p14.t6(), p14.t7(), p14.t8(), p14.t9(), p14.t10(), p14.t11(), p14.t12(), p14.t13(), p14.t14()
            );
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R>> function) {
            return t(instance).ap18(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18);
        }
    }

    record P19<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>(App<F, T1> t1, App<F, T2> t2, App<F, T3> t3, App<F, T4> t4, App<F, T5> t5, App<F, T6> t6, App<F, T7> t7, App<F, T8> t8, App<F, T9> t9, App<F, T10> t10, App<F, T11> t11, App<F, T12> t12, App<F, T13> t13, App<F, T14> t14, App<F, T15> t15, App<F, T16> t16, App<F, T17> t17, App<F, T18> t18, App<F, T19> t19) implements ProductsExtension.P19<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> {

        public <T20> ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(final Products.P1<F, T20> p) {
            return new P20<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, p.t1());
        }

        @Override
        public <T20> ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> and(App<F, T20> p) {
            return new P20<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, p);
        }

        public <T20, T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P2<F, T20, T21> p) {
            return new P21<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, p.t1(), p.t2());
        }

        @Override
        public <T20, T21, T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(Products.P3<F, T20, T21, T22> p) {
            return new P22<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, p.t1(), p.t2(), p.t3());
        }

        @Override
        public <T20, T21, T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(Products.P4<F, T20, T21, T22, T23> p) {
            return new P23<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, p.t1(), p.t2(), p.t3(), p.t4());
        }

        @Override
        public <T20, T21, T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(Products.P5<F, T20, T21, T22, T23, T24> p) {
            return new P24<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, p.t1(), p.t2(), p.t3(), p.t4(), p.t5());
        }

        @Override
        public <T20, T21, T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(Products.P6<F, T20, T21, T22, T23, T24, T25> p) {
            return new P25<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6());
        }

        @Override
        public <T20, T21, T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(Products.P7<F, T20, T21, T22, T23, T24, T25, T26> p) {
            return new P26<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7());
        }

        @Override
        public <T20, T21, T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(Products.P8<F, T20, T21, T22, T23, T24, T25, T26, T27> p) {
            return new P27<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8()
            );
        }

        @Override
        public <T20, T21, T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(Products.P9<F, T20, T21, T22, T23, T24, T25, T26, T27, T28> p) {
            var p9 = t(p);
            return new P28<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9()
            );
        }

        @Override
        public <T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(Products.P10<F, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            var p10 = t(p);
            return new P29<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10()
            );
        }

        @Override
        public <T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(Products.P11<F, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            var p11 = t(p);
            return new P30<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11()
            );
        }

        @Override
        public <T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(Products.P12<F, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            var p12 = t(p);
            return new P31<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, p12.t1(), p12.t2(), p12.t3(), p12.t4(), p12.t5(), p12.t6(), p12.t7(), p12.t8(), p12.t9(), p12.t10(), p12.t11(), p12.t12()
            );
        }

        @Override
        public <T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(Products.P13<F, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            var p13 = t(p);
            return new P32<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, p13.t1(), p13.t2(), p13.t3(), p13.t4(), p13.t5(), p13.t6(), p13.t7(), p13.t8(), p13.t9(), p13.t10(), p13.t11(), p13.t12(), p13.t13()
            );
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R>> function) {
            return t(instance).ap19(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
        }
    }

    record P20<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>(App<F, T1> t1, App<F, T2> t2, App<F, T3> t3, App<F, T4> t4, App<F, T5> t5, App<F, T6> t6, App<F, T7> t7, App<F, T8> t8, App<F, T9> t9, App<F, T10> t10, App<F, T11> t11, App<F, T12> t12, App<F, T13> t13, App<F, T14> t14, App<F, T15> t15, App<F, T16> t16, App<F, T17> t17, App<F, T18> t18, App<F, T19> t19, App<F, T20> t20) implements ProductsExtension.P20<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> {

        public <T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(final Products.P1<F, T21> p) {
            return new P21<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, p.t1());
        }

        @Override
        public <T21> ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> and(App<F, T21> p) {
            return new P21<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, p);
        }

        @Override
        public <T21, T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(Products.P2<F, T21, T22> p) {
            return new P22<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, p.t1(), p.t2());
        }

        @Override
        public <T21, T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(Products.P3<F, T21, T22, T23> p) {
            return new P23<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, p.t1(), p.t2(), p.t3());
        }

        @Override
        public <T21, T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(Products.P4<F, T21, T22, T23, T24> p) {
            return new P24<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, p.t1(), p.t2(), p.t3(), p.t4());
        }

        @Override
        public <T21, T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(Products.P5<F, T21, T22, T23, T24, T25> p) {
            return new P25<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, p.t1(), p.t2(), p.t3(), p.t4(), p.t5());
        }

        @Override
        public <T21, T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(Products.P6<F, T21, T22, T23, T24, T25, T26> p) {
            return new P26<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6());
        }

        @Override
        public <T21, T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(Products.P7<F, T21, T22, T23, T24, T25, T26, T27> p) {
            return new P27<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20,
                    p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7()
            );
        }

        @Override
        public <T21, T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(Products.P8<F, T21, T22, T23, T24, T25, T26, T27, T28> p) {
            return new P28<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20,
                    p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8()
            );
        }

        @Override
        public <T21, T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(Products.P9<F, T21, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            var p9 = t(p);
            return new P29<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20,
                    p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9()
            );
        }

        @Override
        public <T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(Products.P10<F, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            var p10 = t(p);
            return new P30<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20,
                    p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10()
            );
        }

        @Override
        public <T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(Products.P11<F, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            var p11 = t(p);
            return new P31<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20,
                    p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11()
            );
        }

        @Override
        public <T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(Products.P12<F, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            var p12 = t(p);
            return new P32<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20,
                    p12.t1(), p12.t2(), p12.t3(), p12.t4(), p12.t5(), p12.t6(), p12.t7(), p12.t8(), p12.t9(), p12.t10(), p12.t11(), p12.t12()
            );
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R>> function) {
            return t(instance).ap20(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20);
        }
    }

    record P21<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>(App<F, T1> t1, App<F, T2> t2, App<F, T3> t3, App<F, T4> t4, App<F, T5> t5, App<F, T6> t6, App<F, T7> t7, App<F, T8> t8, App<F, T9> t9, App<F, T10> t10, App<F, T11> t11, App<F, T12> t12, App<F, T13> t13, App<F, T14> t14, App<F, T15> t15, App<F, T16> t16, App<F, T17> t17, App<F, T18> t18, App<F, T19> t19, App<F, T20> t20, App<F, T21> t21) implements ProductsExtension.P21<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> {

        @Override
        public <T22> ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> and(App<F, T22> p) {
            return new P22<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, p);
        }

        @Override
        public <T22, T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(Products.P2<F, T22, T23> p) {
            return new P23<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, p.t1(), p.t2());
        }

        @Override
        public <T22, T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(Products.P3<F, T22, T23, T24> p) {
            return new P24<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, p.t1(), p.t2(), p.t3());
        }

        @Override
        public <T22, T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(Products.P4<F, T22, T23, T24, T25> p) {
            return new P25<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, p.t1(), p.t2(), p.t3(), p.t4());
        }

        @Override
        public <T22, T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(Products.P5<F, T22, T23, T24, T25, T26> p) {
            return new P26<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, p.t1(), p.t2(), p.t3(), p.t4(), p.t5());
        }

        @Override
        public <T22, T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(Products.P6<F, T22, T23, T24, T25, T26, T27> p) {
            return new P27<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6());
        }

        @Override
        public <T22, T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(Products.P7<F, T22, T23, T24, T25, T26, T27, T28> p) {
            return new P28<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7()
            );
        }

        @Override
        public <T22, T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(Products.P8<F, T22, T23, T24, T25, T26, T27, T28, T29> p) {
            return new P29<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8()
            );
        }

        @Override
        public <T22, T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(Products.P9<F, T22, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            var p9 = t(p);
            return new P30<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9()
            );
        }

        @Override
        public <T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(Products.P10<F, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            var p10 = t(p);
            return new P31<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, p10.t1(), p10.t2(), p10.t3(), p10.t4(), p10.t5(), p10.t6(), p10.t7(), p10.t8(), p10.t9(), p10.t10()
            );
        }

        @Override
        public <T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(Products.P11<F, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            var p11 = t(p);
            return new P32<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, p11.t1(), p11.t2(), p11.t3(), p11.t4(), p11.t5(), p11.t6(), p11.t7(), p11.t8(), p11.t9(), p11.t10(), p11.t11()
            );
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R>> function) {
            return t(instance).ap21(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21);
        }
    }

    record P22<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>(App<F, T1> t1, App<F, T2> t2, App<F, T3> t3, App<F, T4> t4, App<F, T5> t5, App<F, T6> t6, App<F, T7> t7, App<F, T8> t8, App<F, T9> t9, App<F, T10> t10, App<F, T11> t11, App<F, T12> t12, App<F, T13> t13, App<F, T14> t14, App<F, T15> t15, App<F, T16> t16, App<F, T17> t17, App<F, T18> t18, App<F, T19> t19, App<F, T20> t20, App<F, T21> t21, App<F, T22> t22) implements ProductsExtension.P22<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> {

        @Override
        public <T23> ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> and(App<F, T23> p) {
            return new P23<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, p);
        }

        @Override
        public <T23, T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(Products.P2<F, T23, T24> p) {
            return new P24<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, p.t1(), p.t2());
        }

        @Override
        public <T23, T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(Products.P3<F, T23, T24, T25> p) {
            return new P25<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, p.t1(), p.t2(), p.t3());
        }

        @Override
        public <T23, T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(Products.P4<F, T23, T24, T25, T26> p) {
            return new P26<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, p.t1(), p.t2(), p.t3(), p.t4());
        }

        @Override
        public <T23, T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(Products.P5<F, T23, T24, T25, T26, T27> p) {
            return new P27<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, p.t1(), p.t2(), p.t3(), p.t4(), p.t5()
            );
        }

        @Override
        public <T23, T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(Products.P6<F, T23, T24, T25, T26, T27, T28> p) {
            return new P28<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6()
            );
        }

        @Override
        public <T23, T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(Products.P7<F, T23, T24, T25, T26, T27, T28, T29> p) {
            return new P29<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7()
            );
        }

        @Override
        public <T23, T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(Products.P8<F, T23, T24, T25, T26, T27, T28, T29, T30> p) {
            return new P30<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8()
            );
        }

        @Override
        public <T23, T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(Products.P9<F, T23, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            var p9 = t(p);
            return new P31<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9()
            );
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R>> function) {
            return t(instance).ap22(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22);
        }
    }

    record P23<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23>(App<F, T1> t1, App<F, T2> t2, App<F, T3> t3, App<F, T4> t4, App<F, T5> t5, App<F, T6> t6, App<F, T7> t7, App<F, T8> t8, App<F, T9> t9, App<F, T10> t10, App<F, T11> t11, App<F, T12> t12, App<F, T13> t13, App<F, T14> t14, App<F, T15> t15, App<F, T16> t16, App<F, T17> t17, App<F, T18> t18, App<F, T19> t19, App<F, T20> t20, App<F, T21> t21, App<F, T22> t22, App<F, T23> t23) implements ProductsExtension.P23<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> {

        @Override
        public <T24> ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> and(App<F, T24> p) {
            return new P24<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, p);
        }

        @Override
        public <T24, T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(Products.P2<F, T24, T25> p) {
            return new P25<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, p.t1(), p.t2());
        }

        @Override
        public <T24, T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(Products.P4<F, T24, T25, T26, T27> p) {
            return new P27<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, p.t1(), p.t2(), p.t3(), p.t4()
            );
        }

        @Override
        public <T24, T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(Products.P5<F, T24, T25, T26, T27, T28> p) {
            return new P28<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, p.t1(), p.t2(), p.t3(), p.t4(), p.t5()
            );
        }

        @Override
        public <T24, T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(Products.P6<F, T24, T25, T26, T27, T28, T29> p) {
            return new P29<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6()
            );
        }

        @Override
        public <T24, T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(Products.P7<F, T24, T25, T26, T27, T28, T29, T30> p) {
            return new P30<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7()
            );
        }

        @Override
        public <T24, T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(Products.P8<F, T24, T25, T26, T27, T28, T29, T30, T31> p) {
            return new P31<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8()
            );
        }

        @Override
        public <T24, T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(Products.P9<F, T24, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            var p9 = t(p);
            return new P32<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, p9.t1(), p9.t2(), p9.t3(), p9.t4(), p9.t5(), p9.t6(), p9.t7(), p9.t8(), p9.t9()
            );
        }

        @Override
        public <T24, T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(Products.P3<F, T24, T25, T26> p) {
            return new P26<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, p.t1(), p.t2(), p.t3());
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function23<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function23<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, R>> function) {
            return t(instance).ap23(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23);
        }
    }

    record P24<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24>(App<F, T1> t1, App<F, T2> t2, App<F, T3> t3, App<F, T4> t4, App<F, T5> t5, App<F, T6> t6, App<F, T7> t7, App<F, T8> t8, App<F, T9> t9, App<F, T10> t10, App<F, T11> t11, App<F, T12> t12, App<F, T13> t13, App<F, T14> t14, App<F, T15> t15, App<F, T16> t16, App<F, T17> t17, App<F, T18> t18, App<F, T19> t19, App<F, T20> t20, App<F, T21> t21, App<F, T22> t22, App<F, T23> t23, App<F, T24> t24) implements ProductsExtension.P24<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> {

        @Override
        public <T25> ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> and(App<F, T25> p) {
            return new P25<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, p);
        }

        @Override
        public <T25, T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(Products.P2<F, T25, T26> p) {
            return new P26<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, p.t1(), p.t2());
        }

        @Override
        public <T25, T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(Products.P3<F, T25, T26, T27> p) {
            return new P27<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, p.t1(), p.t2(), p.t3()
            );
        }

        @Override
        public <T25, T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(Products.P4<F, T25, T26, T27, T28> p) {
            return new P28<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, p.t1(), p.t2(), p.t3(), p.t4()
            );
        }

        @Override
        public <T25, T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(Products.P5<F, T25, T26, T27, T28, T29> p) {
            return new P29<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, p.t1(), p.t2(), p.t3(), p.t4(), p.t5()
            );
        }

        @Override
        public <T25, T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(Products.P6<F, T25, T26, T27, T28, T29, T30> p) {
            return new P30<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6()
            );
        }

        @Override
        public <T25, T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(Products.P7<F, T25, T26, T27, T28, T29, T30, T31> p) {
            return new P31<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7()
            );
        }

        @Override
        public <T25, T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(Products.P8<F, T25, T26, T27, T28, T29, T30, T31, T32> p) {
            return new P32<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7(), p.t8()
            );
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, R>> function) {
            return t(instance).ap24(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24);
        }
    }

    record P25<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25>(App<F, T1> t1, App<F, T2> t2, App<F, T3> t3, App<F, T4> t4, App<F, T5> t5, App<F, T6> t6, App<F, T7> t7, App<F, T8> t8, App<F, T9> t9, App<F, T10> t10, App<F, T11> t11, App<F, T12> t12, App<F, T13> t13, App<F, T14> t14, App<F, T15> t15, App<F, T16> t16, App<F, T17> t17, App<F, T18> t18, App<F, T19> t19, App<F, T20> t20, App<F, T21> t21, App<F, T22> t22, App<F, T23> t23, App<F, T24> t24, App<F, T25> t25) implements ProductsExtension.P25<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> {

        @Override
        public <T26> ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> and(App<F, T26> p) {
            return new P26<>(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, p);
        }

        @Override
        public <T26, T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(Products.P2<F, T26, T27> p) {
            return new P27<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, p.t1(), p.t2()
            );
        }

        @Override
        public <T26, T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(Products.P3<F, T26, T27, T28> p) {
            return new P28<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, p.t1(), p.t2(), p.t3()
            );
        }

        @Override
        public <T26, T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(Products.P4<F, T26, T27, T28, T29> p) {
            return new P29<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, p.t1(), p.t2(), p.t3(), p.t4()
            );
        }

        @Override
        public <T26, T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(Products.P5<F, T26, T27, T28, T29, T30> p) {
            return new P30<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, p.t1(), p.t2(), p.t3(), p.t4(), p.t5()
            );
        }

        @Override
        public <T26, T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(Products.P6<F, T26, T27, T28, T29, T30, T31> p) {
            return new P31<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6()
            );
        }

        @Override
        public <T26, T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(Products.P7<F, T26, T27, T28, T29, T30, T31, T32> p) {
            return new P32<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6(), p.t7()
            );
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function25<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function25<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, R>> function) {
            return t(instance).ap25(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25);
        }
    }

    record P26<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26>(App<F, T1> t1, App<F, T2> t2, App<F, T3> t3, App<F, T4> t4, App<F, T5> t5, App<F, T6> t6, App<F, T7> t7, App<F, T8> t8, App<F, T9> t9, App<F, T10> t10, App<F, T11> t11, App<F, T12> t12, App<F, T13> t13, App<F, T14> t14, App<F, T15> t15, App<F, T16> t16, App<F, T17> t17, App<F, T18> t18, App<F, T19> t19, App<F, T20> t20, App<F, T21> t21, App<F, T22> t22, App<F, T23> t23, App<F, T24> t24, App<F, T25> t25, App<F, T26> t26) implements ProductsExtension.P26<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> {

        @Override
        public <T27> ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> and(App<F, T27> p) {
            return new P27<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, p
            );
        }

        @Override
        public <T27, T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(Products.P2<F, T27, T28> p) {
            return new P28<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, p.t1(), p.t2()
            );
        }

        @Override
        public <T27, T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(Products.P3<F, T27, T28, T29> p) {
            return new P29<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, p.t1(), p.t2(), p.t3()
            );
        }

        @Override
        public <T27, T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(Products.P4<F, T27, T28, T29, T30> p) {
            return new P30<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, p.t1(), p.t2(), p.t3(), p.t4()
            );
        }

        @Override
        public <T27, T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(Products.P5<F, T27, T28, T29, T30, T31> p) {
            return new P31<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, p.t1(), p.t2(), p.t3(), p.t4(), p.t5()
            );
        }

        @Override
        public <T27, T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(Products.P6<F, T27, T28, T29, T30, T31, T32> p) {
            return new P32<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, p.t1(), p.t2(), p.t3(), p.t4(), p.t5(), p.t6()
            );
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function26<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function26<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, R>> function) {
            return t(instance).ap26(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26);
        }
    }

    record P27<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27>(App<F, T1> t1, App<F, T2> t2, App<F, T3> t3, App<F, T4> t4, App<F, T5> t5, App<F, T6> t6, App<F, T7> t7, App<F, T8> t8, App<F, T9> t9, App<F, T10> t10, App<F, T11> t11, App<F, T12> t12, App<F, T13> t13, App<F, T14> t14, App<F, T15> t15, App<F, T16> t16, App<F, T17> t17, App<F, T18> t18, App<F, T19> t19, App<F, T20> t20, App<F, T21> t21, App<F, T22> t22, App<F, T23> t23, App<F, T24> t24, App<F, T25> t25, App<F, T26> t26, App<F, T27> t27) implements ProductsExtension.P27<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> {

        @Override
        public <T28> ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> and(App<F, T28> p) {
            return new P28<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, p
            );
        }

        @Override
        public <T28, T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(Products.P2<F, T28, T29> p) {
            return new P29<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, p.t1(), p.t2()
            );
        }

        @Override
        public <T28, T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(Products.P3<F, T28, T29, T30> p) {
            return new P30<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, p.t1(), p.t2(), p.t3()
            );
        }

        @Override
        public <T28, T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(Products.P4<F, T28, T29, T30, T31> p) {
            return new P31<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, p.t1(), p.t2(), p.t3(), p.t4()
            );
        }

        @Override
        public <T28, T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(Products.P5<F, T28, T29, T30, T31, T32> p) {
            return new P32<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, p.t1(), p.t2(), p.t3(), p.t4(), p.t5()
            );
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function27<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function27<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, R>> function) {
            return t(instance).ap27(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27);
        }
    }

    record P28<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28>(App<F, T1> t1, App<F, T2> t2, App<F, T3> t3, App<F, T4> t4, App<F, T5> t5, App<F, T6> t6, App<F, T7> t7, App<F, T8> t8, App<F, T9> t9, App<F, T10> t10, App<F, T11> t11, App<F, T12> t12, App<F, T13> t13, App<F, T14> t14, App<F, T15> t15, App<F, T16> t16, App<F, T17> t17, App<F, T18> t18, App<F, T19> t19, App<F, T20> t20, App<F, T21> t21, App<F, T22> t22, App<F, T23> t23, App<F, T24> t24, App<F, T25> t25, App<F, T26> t26, App<F, T27> t27, App<F, T28> t28) implements ProductsExtension.P28<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> {

        @Override
        public <T29> ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> and(App<F, T29> p) {
            return new P29<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, p
            );
        }

        @Override
        public <T29, T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(Products.P2<F, T29, T30> p) {
            return new P30<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, p.t1(), p.t2()
            );
        }

        @Override
        public <T29, T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(Products.P3<F, T29, T30, T31> p) {
            return new P31<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, p.t1(), p.t2(), p.t3()
            );
        }

        @Override
        public <T29, T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(Products.P4<F, T29, T30, T31, T32> p) {
            return new P32<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, p.t1(), p.t2(), p.t3(), p.t4()
            );
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function28<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function28<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, R>> function) {
            return t(instance).ap28(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28);
        }
    }

    record P29<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29>(App<F, T1> t1, App<F, T2> t2, App<F, T3> t3, App<F, T4> t4, App<F, T5> t5, App<F, T6> t6, App<F, T7> t7, App<F, T8> t8, App<F, T9> t9, App<F, T10> t10, App<F, T11> t11, App<F, T12> t12, App<F, T13> t13, App<F, T14> t14, App<F, T15> t15, App<F, T16> t16, App<F, T17> t17, App<F, T18> t18, App<F, T19> t19, App<F, T20> t20, App<F, T21> t21, App<F, T22> t22, App<F, T23> t23, App<F, T24> t24, App<F, T25> t25, App<F, T26> t26, App<F, T27> t27, App<F, T28> t28, App<F, T29> t29) implements ProductsExtension.P29<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> {
        @Override
        public <T30> ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> and(App<F, T30> p) {
            return new P30<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29, p
            );
        }

        @Override
        public <T30, T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(Products.P2<F, T30, T31> p) {
            return new P31<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29, p.t1(), p.t2()
            );
        }

        @Override
        public <T30, T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(Products.P3<F, T30, T31, T32> p) {
            return new P32<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29, p.t1(), p.t2(), p.t3()
            );
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function29<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function29<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, R>> function) {
            return t(instance).ap29(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29);
        }
    }

    record P30<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30>(App<F, T1> t1, App<F, T2> t2, App<F, T3> t3, App<F, T4> t4, App<F, T5> t5, App<F, T6> t6, App<F, T7> t7, App<F, T8> t8, App<F, T9> t9, App<F, T10> t10, App<F, T11> t11, App<F, T12> t12, App<F, T13> t13, App<F, T14> t14, App<F, T15> t15, App<F, T16> t16, App<F, T17> t17, App<F, T18> t18, App<F, T19> t19, App<F, T20> t20, App<F, T21> t21, App<F, T22> t22, App<F, T23> t23, App<F, T24> t24, App<F, T25> t25, App<F, T26> t26, App<F, T27> t27, App<F, T28> t28, App<F, T29> t29, App<F, T30> t30) implements ProductsExtension.P30<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> {
        @Override
        public <T31> ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> and(App<F, T31> p) {
            return new P31<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29, t30, p
            );
        }

        @Override
        public <T31, T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(Products.P2<F, T31, T32> p) {
            return new P32<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29, t30, p.t1(), p.t2()
            );
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function30<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function30<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, R>> function) {
            return t(instance).ap30(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29, t30);
        }
    }

    record P31<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31>(App<F, T1> t1, App<F, T2> t2, App<F, T3> t3, App<F, T4> t4, App<F, T5> t5, App<F, T6> t6, App<F, T7> t7, App<F, T8> t8, App<F, T9> t9, App<F, T10> t10, App<F, T11> t11, App<F, T12> t12, App<F, T13> t13, App<F, T14> t14, App<F, T15> t15, App<F, T16> t16, App<F, T17> t17, App<F, T18> t18, App<F, T19> t19, App<F, T20> t20, App<F, T21> t21, App<F, T22> t22, App<F, T23> t23, App<F, T24> t24, App<F, T25> t25, App<F, T26> t26, App<F, T27> t27, App<F, T28> t28, App<F, T29> t29, App<F, T30> t30, App<F, T31> t31) implements ProductsExtension.P31<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> {

        @Override
        public <T32> ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> and(App<F, T32> p) {
            return new P32<>(
                    t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29, t30, t31, p
            );
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, R>> function) {
            return t(instance).ap31(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29, t30, t31);
        }

    }

    record P32<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32>(App<F, T1> t1, App<F, T2> t2, App<F, T3> t3, App<F, T4> t4, App<F, T5> t5, App<F, T6> t6, App<F, T7> t7, App<F, T8> t8, App<F, T9> t9, App<F, T10> t10, App<F, T11> t11, App<F, T12> t12, App<F, T13> t13, App<F, T14> t14, App<F, T15> t15, App<F, T16> t16, App<F, T17> t17, App<F, T18> t18, App<F, T19> t19, App<F, T20> t20, App<F, T21> t21, App<F, T22> t22, App<F, T23> t23, App<F, T24> t24, App<F, T25> t25, App<F, T26> t26, App<F, T27> t27, App<F, T28> t28, App<F, T29> t29, App<F, T30> t30, App<F, T31> t31, App<F, T32> t32) implements ProductsExtension.P32<F, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> {

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function32<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function32<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, R>> function) {
            return t(instance).ap32(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29, t30, t31, t32);
        }
    }
}
