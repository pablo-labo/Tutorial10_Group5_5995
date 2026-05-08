package kotlinx.serialization.encoding;

import defpackage.i04;
import defpackage.ul2;
import defpackage.v1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lkotlinx/serialization/encoding/Decoder;", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Decoder {
    default <T> T B(i04<? extends T> i04Var) {
        i04Var.getClass();
        return i04Var.deserialize(this);
    }

    String C();

    boolean F();

    byte H();

    v1 a();

    ul2 b(SerialDescriptor serialDescriptor);

    int e(SerialDescriptor serialDescriptor);

    int k();

    long n();

    Decoder s(SerialDescriptor serialDescriptor);

    short t();

    float u();

    double w();

    boolean x();

    char y();
}
