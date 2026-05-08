package defpackage;

import defpackage.ymb;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class y84 implements KSerializer<Double> {
    public static final y84 a = new y84();
    public static final anb b = new anb("kotlin.Double", ymb.d.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        return Double.valueOf(decoder.w());
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        encoder.d(((Number) obj).doubleValue());
    }
}
