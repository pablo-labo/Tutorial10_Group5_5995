package defpackage;

import defpackage.ymb;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class ei5 implements KSerializer<Float> {
    public static final ei5 a = new ei5();
    public static final anb b = new anb("kotlin.Float", ymb.e.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        return Float.valueOf(decoder.u());
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        encoder.s(((Number) obj).floatValue());
    }
}
