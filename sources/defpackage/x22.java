package defpackage;

import defpackage.ymb;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class x22 implements KSerializer<Character> {
    public static final x22 a = new x22();
    public static final anb b = new anb("kotlin.Char", ymb.c.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        return Character.valueOf(decoder.y());
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        encoder.u(((Character) obj).charValue());
    }
}
