package boundlesscodecs.api.extensions;

import com.mojang.datafixers.util.*;
import net.minecraft.network.codec.PacketCodec;

import java.util.function.BiFunction;
import java.util.function.Function;

@SuppressWarnings("unused")
public interface PacketCodecExtension {
    // one
    static <B, C, T1> PacketCodec<B, C> tuple(final PacketCodec<? super B, T1> codec, final Function<C, T1> from, final Function<T1, C> to) {
        return PacketCodec.tuple(codec, from, to);
    }

    // two
    static <B, C, T1, T2> PacketCodec<B, C> tuple(final PacketCodec<? super B, T1> codec1, final Function<C, T1> from1, final PacketCodec<? super B, T2> codec2, final Function<C, T2> from2, final BiFunction<T1, T2, C> to) {
        return PacketCodec.tuple(codec1, from1, codec2, from2, to);
    }

    // three
    static <B, C, T1, T2, T3> PacketCodec<B, C> tuple(final PacketCodec<? super B, T1> codec1, final Function<C, T1> from1, final PacketCodec<? super B, T2> codec2, final Function<C, T2> from2, final PacketCodec<? super B, T3> codec3, final Function<C, T3> from3, final Function3<T1, T2, T3, C> to) {
        return PacketCodec.tuple(codec1, from1, codec2, from2, codec3, from3, to);
    }

    // four
    static <B, C, T1, T2, T3, T4> PacketCodec<B, C> tuple(final PacketCodec<? super B, T1> codec1, final Function<C, T1> from1, final PacketCodec<? super B, T2> codec2, final Function<C, T2> from2, final PacketCodec<? super B, T3> codec3, final Function<C, T3> from3, final PacketCodec<? super B, T4> codec4, final Function<C, T4> from4, final Function4<T1, T2, T3, T4, C> to) {
        return PacketCodec.tuple(codec1, from1, codec2, from2, codec3, from3, codec4, from4, to);
    }

    // five
    static <B, C, T1, T2, T3, T4, T5> PacketCodec<B, C> tuple(final PacketCodec<? super B, T1> codec1, final Function<C, T1> from1, final PacketCodec<? super B, T2> codec2, final Function<C, T2> from2, final PacketCodec<? super B, T3> codec3, final Function<C, T3> from3, final PacketCodec<? super B, T4> codec4, final Function<C, T4> from4, final PacketCodec<? super B, T5> codec5, final Function<C, T5> from5, final Function5<T1, T2, T3, T4, T5, C> to) {
        return PacketCodec.tuple(codec1, from1, codec2, from2, codec3, from3, codec4, from4, codec5, from5, to);
    }

    // six
    static <B, C, T1, T2, T3, T4, T5, T6> PacketCodec<B, C> tuple(final PacketCodec<? super B, T1> codec1, final Function<C, T1> from1, final PacketCodec<? super B, T2> codec2, final Function<C, T2> from2, final PacketCodec<? super B, T3> codec3, final Function<C, T3> from3, final PacketCodec<? super B, T4> codec4, final Function<C, T4> from4, final PacketCodec<? super B, T5> codec5, final Function<C, T5> from5, final PacketCodec<? super B, T6> codec6, final Function<C, T6> from6, final Function6<T1, T2, T3, T4, T5, T6, C> to) {
        return PacketCodec.tuple(codec1, from1, codec2, from2, codec3, from3, codec4, from4, codec5, from5, codec6, from6, to);
    }

    // seven
    static <B, C, T1, T2, T3, T4, T5, T6, T7> PacketCodec<B, C> tuple(final PacketCodec<? super B, T1> codec1, final Function<C, T1> from1, final PacketCodec<? super B, T2> codec2, final Function<C, T2> from2, final PacketCodec<? super B, T3> codec3, final Function<C, T3> from3, final PacketCodec<? super B, T4> codec4, final Function<C, T4> from4, final PacketCodec<? super B, T5> codec5, final Function<C, T5> from5, final PacketCodec<? super B, T6> codec6, final Function<C, T6> from6, final PacketCodec<? super B, T7> codec7, final Function<C, T7> from7, final Function7<T1, T2, T3, T4, T5, T6, T7, C> to) {
        return new PacketCodec<>() {
            public C decode(B object) {
                T1 object2 = codec1.decode(object);
                T2 object3 = codec2.decode(object);
                T3 object4 = codec3.decode(object);
                T4 object5 = codec4.decode(object);
                T5 object6 = codec5.decode(object);
                T6 object7 = codec6.decode(object);
                T7 object8 = codec7.decode(object);
                return to.apply(object2, object3, object4, object5, object6, object7, object8);
            }

            public void encode(B object, C object2) {
                codec1.encode(object, from1.apply(object2));
                codec2.encode(object, from2.apply(object2));
                codec3.encode(object, from3.apply(object2));
                codec4.encode(object, from4.apply(object2));
                codec5.encode(object, from5.apply(object2));
                codec6.encode(object, from6.apply(object2));
                codec7.encode(object, from7.apply(object2));
            }
        };
    }

    // eight
    static <B, C, T1, T2, T3, T4, T5, T6, T7, T8> PacketCodec<B, C> tuple(final PacketCodec<? super B, T1> codec1, final Function<C, T1> from1, final PacketCodec<? super B, T2> codec2, final Function<C, T2> from2, final PacketCodec<? super B, T3> codec3, final Function<C, T3> from3, final PacketCodec<? super B, T4> codec4, final Function<C, T4> from4, final PacketCodec<? super B, T5> codec5, final Function<C, T5> from5, final PacketCodec<? super B, T6> codec6, final Function<C, T6> from6, final PacketCodec<? super B, T7> codec7, final Function<C, T7> from7, final PacketCodec<? super B, T8> codec8, final Function<C, T8> from8, final Function8<T1, T2, T3, T4, T5, T6, T7, T8, C> to) {
        return new PacketCodec<>() {
            @Override
            public C decode(B buf) {
                T1 object = codec1.decode(buf);
                T2 object2 = codec2.decode(buf);
                T3 object3 = codec3.decode(buf);
                T4 object4 = codec4.decode(buf);
                T5 object5 = codec5.decode(buf);
                T6 object6 = codec6.decode(buf);
                T7 object7 = codec7.decode(buf);
                T8 object8 = codec8.decode(buf);
                return to.apply(object, object2, object3, object4, object5, object6, object7, object8);
            }

            @Override
            public void encode(B buf, C value) {
                codec1.encode(buf, from1.apply(value));
                codec2.encode(buf, from2.apply(value));
                codec3.encode(buf, from3.apply(value));
                codec4.encode(buf, from4.apply(value));
                codec5.encode(buf, from5.apply(value));
                codec6.encode(buf, from6.apply(value));
                codec7.encode(buf, from7.apply(value));
                codec8.encode(buf, from8.apply(value));
            }
        };
    }

    // nine
    static <B, C, T1, T2, T3, T4, T5, T6, T7, T8, T9> PacketCodec<B, C> tuple(final PacketCodec<? super B, T1> codec1, final Function<C, T1> from1, final PacketCodec<? super B, T2> codec2, final Function<C, T2> from2, final PacketCodec<? super B, T3> codec3, final Function<C, T3> from3, final PacketCodec<? super B, T4> codec4, final Function<C, T4> from4, final PacketCodec<? super B, T5> codec5, final Function<C, T5> from5, final PacketCodec<? super B, T6> codec6, final Function<C, T6> from6, final PacketCodec<? super B, T7> codec7, final Function<C, T7> from7, final PacketCodec<? super B, T8> codec8, final Function<C, T8> from8, final PacketCodec<? super B, T9> codec9, final Function<C, T9> from9, final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, C> to) {
        return new PacketCodec<>() {
            @Override
            public C decode(B buf) {
                T1 object = codec1.decode(buf);
                T2 object2 = codec2.decode(buf);
                T3 object3 = codec3.decode(buf);
                T4 object4 = codec4.decode(buf);
                T5 object5 = codec5.decode(buf);
                T6 object6 = codec6.decode(buf);
                T7 object7 = codec7.decode(buf);
                T8 object8 = codec8.decode(buf);
                T9 object9 = codec9.decode(buf);
                return to.apply(object, object2, object3, object4, object5, object6, object7, object8, object9);
            }

            @Override
            public void encode(B buf, C value) {
                codec1.encode(buf, from1.apply(value));
                codec2.encode(buf, from2.apply(value));
                codec3.encode(buf, from3.apply(value));
                codec4.encode(buf, from4.apply(value));
                codec5.encode(buf, from5.apply(value));
                codec6.encode(buf, from6.apply(value));
                codec7.encode(buf, from7.apply(value));
                codec8.encode(buf, from8.apply(value));
                codec9.encode(buf, from9.apply(value));
            }
        };
    }

    // ten
    static <B, C, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> PacketCodec<B, C> tuple(final PacketCodec<? super B, T1> codec1, final Function<C, T1> from1, final PacketCodec<? super B, T2> codec2, final Function<C, T2> from2, final PacketCodec<? super B, T3> codec3, final Function<C, T3> from3, final PacketCodec<? super B, T4> codec4, final Function<C, T4> from4, final PacketCodec<? super B, T5> codec5, final Function<C, T5> from5, final PacketCodec<? super B, T6> codec6, final Function<C, T6> from6, final PacketCodec<? super B, T7> codec7, final Function<C, T7> from7, final PacketCodec<? super B, T8> codec8, final Function<C, T8> from8, final PacketCodec<? super B, T9> codec9, final Function<C, T9> from9, final PacketCodec<? super B, T10> codec10, final Function<C, T10> from10, final Function10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, C> to) {
        return new PacketCodec<>() {
            @Override
            public C decode(B buf) {
                T1 object = codec1.decode(buf);
                T2 object2 = codec2.decode(buf);
                T3 object3 = codec3.decode(buf);
                T4 object4 = codec4.decode(buf);
                T5 object5 = codec5.decode(buf);
                T6 object6 = codec6.decode(buf);
                T7 object7 = codec7.decode(buf);
                T8 object8 = codec8.decode(buf);
                T9 object9 = codec9.decode(buf);
                T10 object10 = codec10.decode(buf);
                return to.apply(object, object2, object3, object4, object5, object6, object7, object8, object9, object10);
            }

            @Override
            public void encode(B buf, C value) {
                codec1.encode(buf, from1.apply(value));
                codec2.encode(buf, from2.apply(value));
                codec3.encode(buf, from3.apply(value));
                codec4.encode(buf, from4.apply(value));
                codec5.encode(buf, from5.apply(value));
                codec6.encode(buf, from6.apply(value));
                codec7.encode(buf, from7.apply(value));
                codec8.encode(buf, from8.apply(value));
                codec9.encode(buf, from9.apply(value));
                codec10.encode(buf, from10.apply(value));
            }
        };
    }

    // eleven
    static <B, C, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> PacketCodec<B, C> tuple(final PacketCodec<? super B, T1> codec1, final Function<C, T1> from1, final PacketCodec<? super B, T2> codec2, final Function<C, T2> from2, final PacketCodec<? super B, T3> codec3, final Function<C, T3> from3, final PacketCodec<? super B, T4> codec4, final Function<C, T4> from4, final PacketCodec<? super B, T5> codec5, final Function<C, T5> from5, final PacketCodec<? super B, T6> codec6, final Function<C, T6> from6, final PacketCodec<? super B, T7> codec7, final Function<C, T7> from7, final PacketCodec<? super B, T8> codec8, final Function<C, T8> from8, final PacketCodec<? super B, T9> codec9, final Function<C, T9> from9, final PacketCodec<? super B, T10> codec10, final Function<C, T10> from10, final PacketCodec<? super B, T11> codec11, final Function<C, T11> from11, final Function11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, C> to) {
        return new PacketCodec<>() {
            @Override
            public C decode(B buf) {
                T1 object = codec1.decode(buf);
                T2 object2 = codec2.decode(buf);
                T3 object3 = codec3.decode(buf);
                T4 object4 = codec4.decode(buf);
                T5 object5 = codec5.decode(buf);
                T6 object6 = codec6.decode(buf);
                T7 object7 = codec7.decode(buf);
                T8 object8 = codec8.decode(buf);
                T9 object9 = codec9.decode(buf);
                T10 object10 = codec10.decode(buf);
                T11 object11 = codec11.decode(buf);
                return to.apply(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11);
            }

            @Override
            public void encode(B buf, C value) {
                codec1.encode(buf, from1.apply(value));
                codec2.encode(buf, from2.apply(value));
                codec3.encode(buf, from3.apply(value));
                codec4.encode(buf, from4.apply(value));
                codec5.encode(buf, from5.apply(value));
                codec6.encode(buf, from6.apply(value));
                codec7.encode(buf, from7.apply(value));
                codec8.encode(buf, from8.apply(value));
                codec9.encode(buf, from9.apply(value));
                codec10.encode(buf, from10.apply(value));
                codec11.encode(buf, from11.apply(value));
            }
        };
    }

    // twelve
    static <B, C, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> PacketCodec<B, C> tuple(final PacketCodec<? super B, T1> codec1, final Function<C, T1> from1, final PacketCodec<? super B, T2> codec2, final Function<C, T2> from2, final PacketCodec<? super B, T3> codec3, final Function<C, T3> from3, final PacketCodec<? super B, T4> codec4, final Function<C, T4> from4, final PacketCodec<? super B, T5> codec5, final Function<C, T5> from5, final PacketCodec<? super B, T6> codec6, final Function<C, T6> from6, final PacketCodec<? super B, T7> codec7, final Function<C, T7> from7, final PacketCodec<? super B, T8> codec8, final Function<C, T8> from8, final PacketCodec<? super B, T9> codec9, final Function<C, T9> from9, final PacketCodec<? super B, T10> codec10, final Function<C, T10> from10, final PacketCodec<? super B, T11> codec11, final Function<C, T11> from11, final PacketCodec<? super B, T12> codec12, final Function<C, T12> from12, final Function12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, C> to) {
        return new PacketCodec<>() {
            @Override
            public C decode(B buf) {
                T1 object = codec1.decode(buf);
                T2 object2 = codec2.decode(buf);
                T3 object3 = codec3.decode(buf);
                T4 object4 = codec4.decode(buf);
                T5 object5 = codec5.decode(buf);
                T6 object6 = codec6.decode(buf);
                T7 object7 = codec7.decode(buf);
                T8 object8 = codec8.decode(buf);
                T9 object9 = codec9.decode(buf);
                T10 object10 = codec10.decode(buf);
                T11 object11 = codec11.decode(buf);
                T12 object12 = codec12.decode(buf);
                return to.apply(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12);
            }

            @Override
            public void encode(B buf, C value) {
                codec1.encode(buf, from1.apply(value));
                codec2.encode(buf, from2.apply(value));
                codec3.encode(buf, from3.apply(value));
                codec4.encode(buf, from4.apply(value));
                codec5.encode(buf, from5.apply(value));
                codec6.encode(buf, from6.apply(value));
                codec7.encode(buf, from7.apply(value));
                codec8.encode(buf, from8.apply(value));
                codec9.encode(buf, from9.apply(value));
                codec10.encode(buf, from10.apply(value));
                codec11.encode(buf, from11.apply(value));
                codec12.encode(buf, from12.apply(value));
            }
        };
    }

    // thirteen
    static <B, C, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> PacketCodec<B, C> tuple(final PacketCodec<? super B, T1> codec1, final Function<C, T1> from1, final PacketCodec<? super B, T2> codec2, final Function<C, T2> from2, final PacketCodec<? super B, T3> codec3, final Function<C, T3> from3, final PacketCodec<? super B, T4> codec4, final Function<C, T4> from4, final PacketCodec<? super B, T5> codec5, final Function<C, T5> from5, final PacketCodec<? super B, T6> codec6, final Function<C, T6> from6, final PacketCodec<? super B, T7> codec7, final Function<C, T7> from7, final PacketCodec<? super B, T8> codec8, final Function<C, T8> from8, final PacketCodec<? super B, T9> codec9, final Function<C, T9> from9, final PacketCodec<? super B, T10> codec10, final Function<C, T10> from10, final PacketCodec<? super B, T11> codec11, final Function<C, T11> from11, final PacketCodec<? super B, T12> codec12, final Function<C, T12> from12, final PacketCodec<? super B, T13> codec13, final Function<C, T13> from13, final Function13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, C> to) {
        return new PacketCodec<>() {
            @Override
            public C decode(B buf) {
                T1 object = codec1.decode(buf);
                T2 object2 = codec2.decode(buf);
                T3 object3 = codec3.decode(buf);
                T4 object4 = codec4.decode(buf);
                T5 object5 = codec5.decode(buf);
                T6 object6 = codec6.decode(buf);
                T7 object7 = codec7.decode(buf);
                T8 object8 = codec8.decode(buf);
                T9 object9 = codec9.decode(buf);
                T10 object10 = codec10.decode(buf);
                T11 object11 = codec11.decode(buf);
                T12 object12 = codec12.decode(buf);
                T13 object13 = codec13.decode(buf);
                return to.apply(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13);
            }

            @Override
            public void encode(B buf, C value) {
                codec1.encode(buf, from1.apply(value));
                codec2.encode(buf, from2.apply(value));
                codec3.encode(buf, from3.apply(value));
                codec4.encode(buf, from4.apply(value));
                codec5.encode(buf, from5.apply(value));
                codec6.encode(buf, from6.apply(value));
                codec7.encode(buf, from7.apply(value));
                codec8.encode(buf, from8.apply(value));
                codec9.encode(buf, from9.apply(value));
                codec10.encode(buf, from10.apply(value));
                codec11.encode(buf, from11.apply(value));
                codec12.encode(buf, from12.apply(value));
                codec13.encode(buf, from13.apply(value));
            }
        };
    }

    // fourteen
    static <B, C, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> PacketCodec<B, C> tuple(final PacketCodec<? super B, T1> codec1, final Function<C, T1> from1, final PacketCodec<? super B, T2> codec2, final Function<C, T2> from2, final PacketCodec<? super B, T3> codec3, final Function<C, T3> from3, final PacketCodec<? super B, T4> codec4, final Function<C, T4> from4, final PacketCodec<? super B, T5> codec5, final Function<C, T5> from5, final PacketCodec<? super B, T6> codec6, final Function<C, T6> from6, final PacketCodec<? super B, T7> codec7, final Function<C, T7> from7, final PacketCodec<? super B, T8> codec8, final Function<C, T8> from8, final PacketCodec<? super B, T9> codec9, final Function<C, T9> from9, final PacketCodec<? super B, T10> codec10, final Function<C, T10> from10, final PacketCodec<? super B, T11> codec11, final Function<C, T11> from11, final PacketCodec<? super B, T12> codec12, final Function<C, T12> from12, final PacketCodec<? super B, T13> codec13, final Function<C, T13> from13, final PacketCodec<? super B, T14> codec14, final Function<C, T14> from14, final Function14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, C> to) {
        return new PacketCodec<>() {
            @Override
            public C decode(B buf) {
                T1 object = codec1.decode(buf);
                T2 object2 = codec2.decode(buf);
                T3 object3 = codec3.decode(buf);
                T4 object4 = codec4.decode(buf);
                T5 object5 = codec5.decode(buf);
                T6 object6 = codec6.decode(buf);
                T7 object7 = codec7.decode(buf);
                T8 object8 = codec8.decode(buf);
                T9 object9 = codec9.decode(buf);
                T10 object10 = codec10.decode(buf);
                T11 object11 = codec11.decode(buf);
                T12 object12 = codec12.decode(buf);
                T13 object13 = codec13.decode(buf);
                T14 object14 = codec14.decode(buf);
                return to.apply(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14);
            }

            @Override
            public void encode(B buf, C value) {
                codec1.encode(buf, from1.apply(value));
                codec2.encode(buf, from2.apply(value));
                codec3.encode(buf, from3.apply(value));
                codec4.encode(buf, from4.apply(value));
                codec5.encode(buf, from5.apply(value));
                codec6.encode(buf, from6.apply(value));
                codec7.encode(buf, from7.apply(value));
                codec8.encode(buf, from8.apply(value));
                codec9.encode(buf, from9.apply(value));
                codec10.encode(buf, from10.apply(value));
                codec11.encode(buf, from11.apply(value));
                codec12.encode(buf, from12.apply(value));
                codec13.encode(buf, from13.apply(value));
                codec14.encode(buf, from14.apply(value));
            }
        };
    }

    // fifteen
    static <B, C, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> PacketCodec<B, C> tuple(final PacketCodec<? super B, T1> codec1, final Function<C, T1> from1, final PacketCodec<? super B, T2> codec2, final Function<C, T2> from2, final PacketCodec<? super B, T3> codec3, final Function<C, T3> from3, final PacketCodec<? super B, T4> codec4, final Function<C, T4> from4, final PacketCodec<? super B, T5> codec5, final Function<C, T5> from5, final PacketCodec<? super B, T6> codec6, final Function<C, T6> from6, final PacketCodec<? super B, T7> codec7, final Function<C, T7> from7, final PacketCodec<? super B, T8> codec8, final Function<C, T8> from8, final PacketCodec<? super B, T9> codec9, final Function<C, T9> from9, final PacketCodec<? super B, T10> codec10, final Function<C, T10> from10, final PacketCodec<? super B, T11> codec11, final Function<C, T11> from11, final PacketCodec<? super B, T12> codec12, final Function<C, T12> from12, final PacketCodec<? super B, T13> codec13, final Function<C, T13> from13, final PacketCodec<? super B, T14> codec14, final Function<C, T14> from14, final PacketCodec<? super B, T15> codec15, final Function<C, T15> from15, final Function15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, C> to) {
        return new PacketCodec<>() {
            @Override
            public C decode(B buf) {
                T1 object = codec1.decode(buf);
                T2 object2 = codec2.decode(buf);
                T3 object3 = codec3.decode(buf);
                T4 object4 = codec4.decode(buf);
                T5 object5 = codec5.decode(buf);
                T6 object6 = codec6.decode(buf);
                T7 object7 = codec7.decode(buf);
                T8 object8 = codec8.decode(buf);
                T9 object9 = codec9.decode(buf);
                T10 object10 = codec10.decode(buf);
                T11 object11 = codec11.decode(buf);
                T12 object12 = codec12.decode(buf);
                T13 object13 = codec13.decode(buf);
                T14 object14 = codec14.decode(buf);
                T15 object15 = codec15.decode(buf);
                return to.apply(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15);
            }

            @Override
            public void encode(B buf, C value) {
                codec1.encode(buf, from1.apply(value));
                codec2.encode(buf, from2.apply(value));
                codec3.encode(buf, from3.apply(value));
                codec4.encode(buf, from4.apply(value));
                codec5.encode(buf, from5.apply(value));
                codec6.encode(buf, from6.apply(value));
                codec7.encode(buf, from7.apply(value));
                codec8.encode(buf, from8.apply(value));
                codec9.encode(buf, from9.apply(value));
                codec10.encode(buf, from10.apply(value));
                codec11.encode(buf, from11.apply(value));
                codec12.encode(buf, from12.apply(value));
                codec13.encode(buf, from13.apply(value));
                codec14.encode(buf, from14.apply(value));
                codec15.encode(buf, from15.apply(value));
            }
        };
    }

    // sixteen
    static <B, C, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> PacketCodec<B, C> tuple(final PacketCodec<? super B, T1> codec1, final Function<C, T1> from1, final PacketCodec<? super B, T2> codec2, final Function<C, T2> from2, final PacketCodec<? super B, T3> codec3, final Function<C, T3> from3, final PacketCodec<? super B, T4> codec4, final Function<C, T4> from4, final PacketCodec<? super B, T5> codec5, final Function<C, T5> from5, final PacketCodec<? super B, T6> codec6, final Function<C, T6> from6, final PacketCodec<? super B, T7> codec7, final Function<C, T7> from7, final PacketCodec<? super B, T8> codec8, final Function<C, T8> from8, final PacketCodec<? super B, T9> codec9, final Function<C, T9> from9, final PacketCodec<? super B, T10> codec10, final Function<C, T10> from10, final PacketCodec<? super B, T11> codec11, final Function<C, T11> from11, final PacketCodec<? super B, T12> codec12, final Function<C, T12> from12, final PacketCodec<? super B, T13> codec13, final Function<C, T13> from13, final PacketCodec<? super B, T14> codec14, final Function<C, T14> from14, final PacketCodec<? super B, T15> codec15, final Function<C, T15> from15, final PacketCodec<? super B, T16> codec16, final Function<C, T16> from16, final Function16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, C> to) {
        return new PacketCodec<>() {
            @Override
            public C decode(B buf) {
                T1 object = codec1.decode(buf);
                T2 object2 = codec2.decode(buf);
                T3 object3 = codec3.decode(buf);
                T4 object4 = codec4.decode(buf);
                T5 object5 = codec5.decode(buf);
                T6 object6 = codec6.decode(buf);
                T7 object7 = codec7.decode(buf);
                T8 object8 = codec8.decode(buf);
                T9 object9 = codec9.decode(buf);
                T10 object10 = codec10.decode(buf);
                T11 object11 = codec11.decode(buf);
                T12 object12 = codec12.decode(buf);
                T13 object13 = codec13.decode(buf);
                T14 object14 = codec14.decode(buf);
                T15 object15 = codec15.decode(buf);
                T16 object16 = codec16.decode(buf);
                return to.apply(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16);
            }

            @Override
            public void encode(B buf, C value) {
                codec1.encode(buf, from1.apply(value));
                codec2.encode(buf, from2.apply(value));
                codec3.encode(buf, from3.apply(value));
                codec4.encode(buf, from4.apply(value));
                codec5.encode(buf, from5.apply(value));
                codec6.encode(buf, from6.apply(value));
                codec7.encode(buf, from7.apply(value));
                codec8.encode(buf, from8.apply(value));
                codec9.encode(buf, from9.apply(value));
                codec10.encode(buf, from10.apply(value));
                codec11.encode(buf, from11.apply(value));
                codec12.encode(buf, from12.apply(value));
                codec13.encode(buf, from13.apply(value));
                codec14.encode(buf, from14.apply(value));
                codec15.encode(buf, from15.apply(value));
                codec16.encode(buf, from16.apply(value));
            }
        };
    }
}
