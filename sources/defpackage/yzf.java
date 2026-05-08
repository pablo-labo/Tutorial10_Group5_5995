package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class yzf implements KSerializer<uzf> {
    public static final yzf a = new yzf();
    public static final wd7 b = pi3.b("kotlin.UByte", qr1.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        return new uzf(decoder.s(b).H());
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        encoder.i(b).e(((uzf) obj).a);
    }
}
