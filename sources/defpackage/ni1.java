package defpackage;

import defpackage.ymb;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class ni1 implements KSerializer<Boolean> {
    public static final ni1 a = new ni1();
    public static final anb b = new anb("kotlin.Boolean", ymb.a.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        return Boolean.valueOf(decoder.x());
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        encoder.p(((Boolean) obj).booleanValue());
    }
}
