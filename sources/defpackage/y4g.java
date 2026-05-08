package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class y4g implements KSerializer<u4g> {
    public static final y4g a = new y4g();
    public static final wd7 b = pi3.b("kotlin.UShort", oee.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        return new u4g(decoder.s(b).t());
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        encoder.i(b).o(((u4g) obj).a);
    }
}
