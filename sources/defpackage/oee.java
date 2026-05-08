package defpackage;

import defpackage.ymb;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class oee implements KSerializer<Short> {
    public static final oee a = new oee();
    public static final anb b = new anb("kotlin.Short", ymb.h.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        return Short.valueOf(decoder.t());
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        encoder.o(((Number) obj).shortValue());
    }
}
