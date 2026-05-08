package defpackage;

import defpackage.ymb;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class p59 implements KSerializer<Long> {
    public static final p59 a = new p59();
    public static final anb b = new anb("kotlin.Long", ymb.g.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        return Long.valueOf(decoder.n());
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        encoder.j(((Number) obj).longValue());
    }
}
