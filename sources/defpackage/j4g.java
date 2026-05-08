package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class j4g implements KSerializer<f4g> {
    public static final j4g a = new j4g();
    public static final wd7 b = pi3.b("kotlin.UInt", rh7.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        return new f4g(decoder.s(b).k());
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        encoder.i(b).A(((f4g) obj).a);
    }
}
