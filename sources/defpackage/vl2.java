package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public interface vl2 {
    void C(SerialDescriptor serialDescriptor, int i, double d);

    void D(SerialDescriptor serialDescriptor, int i, long j);

    void c(SerialDescriptor serialDescriptor);

    void f(wmb wmbVar, int i, byte b);

    void g(wmb wmbVar, int i, short s);

    <T> void k(SerialDescriptor serialDescriptor, int i, r7e<? super T> r7eVar, T t);

    Encoder l(wmb wmbVar, int i);

    default boolean m(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return true;
    }

    void q(SerialDescriptor serialDescriptor, int i, float f);

    void r(int i, int i2, SerialDescriptor serialDescriptor);

    void w(SerialDescriptor serialDescriptor, int i, boolean z);

    void x(SerialDescriptor serialDescriptor, int i, String str);

    <T> void y(SerialDescriptor serialDescriptor, int i, r7e<? super T> r7eVar, T t);

    void z(wmb wmbVar, int i, char c);
}
