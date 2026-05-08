package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: loaded from: classes3.dex */
public interface ul2 {
    short A(wmb wmbVar, int i);

    boolean E(SerialDescriptor serialDescriptor, int i);

    double G(SerialDescriptor serialDescriptor, int i);

    v1 a();

    void c(SerialDescriptor serialDescriptor);

    Decoder d(wmb wmbVar, int i);

    long f(SerialDescriptor serialDescriptor, int i);

    char g(wmb wmbVar, int i);

    <T> T h(SerialDescriptor serialDescriptor, int i, i04<? extends T> i04Var, T t);

    byte j(wmb wmbVar, int i);

    int m(SerialDescriptor serialDescriptor, int i);

    String o(SerialDescriptor serialDescriptor, int i);

    int p(SerialDescriptor serialDescriptor);

    float v(SerialDescriptor serialDescriptor, int i);

    <T> T z(SerialDescriptor serialDescriptor, int i, i04<? extends T> i04Var, T t);
}
