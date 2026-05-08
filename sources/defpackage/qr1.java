package defpackage;

import defpackage.ymb;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class qr1 implements KSerializer<Byte> {
    public static final qr1 a = new qr1();
    public static final anb b = new anb("kotlin.Byte", ymb.b.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        return Byte.valueOf(decoder.H());
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        encoder.e(((Number) obj).byteValue());
    }
}
