package defpackage;

import defpackage.m7e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: loaded from: classes3.dex */
public final class ya8 implements KSerializer<JsonNull> {
    public static final ya8 a = new ya8();
    public static final f7e b = i7e.c("kotlinx.serialization.json.JsonNull", m7e.b.a, new SerialDescriptor[0]);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        ie7.g(decoder);
        if (decoder.F()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        return JsonNull.INSTANCE;
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        ((JsonNull) obj).getClass();
        ie7.f(encoder);
        encoder.n();
    }
}
