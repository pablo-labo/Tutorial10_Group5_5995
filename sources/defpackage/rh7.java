package defpackage;

import defpackage.ymb;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class rh7 implements KSerializer<Integer> {
    public static final rh7 a = new rh7();
    public static final anb b = new anb("kotlin.Int", ymb.f.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        return Integer.valueOf(decoder.k());
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        encoder.A(((Number) obj).intValue());
    }
}
