package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class p4g implements KSerializer<l4g> {
    public static final p4g a = new p4g();
    public static final wd7 b = pi3.b("kotlin.ULong", p59.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        return new l4g(decoder.s(b).n());
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        encoder.i(b).j(((l4g) obj).a);
    }
}
