package kotlinx.serialization.encoding;

import defpackage.r7e;
import defpackage.v1;
import defpackage.vl2;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lkotlinx/serialization/encoding/Encoder;", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Encoder {
    void A(int i);

    default vl2 B(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return b(serialDescriptor);
    }

    void E(String str);

    v1 a();

    vl2 b(SerialDescriptor serialDescriptor);

    void d(double d);

    void e(byte b);

    void h(SerialDescriptor serialDescriptor, int i);

    Encoder i(SerialDescriptor serialDescriptor);

    void j(long j);

    void n();

    void o(short s);

    void p(boolean z);

    void s(float f);

    /* JADX WARN: Multi-variable type inference failed */
    default <T> void t(r7e<? super T> r7eVar, T t) {
        r7eVar.getClass();
        r7eVar.serialize(this, t);
    }

    void u(char c);

    default void v() {
    }
}
