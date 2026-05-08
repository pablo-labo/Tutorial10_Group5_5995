package defpackage;

import defpackage.ymb;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class mve implements KSerializer<String> {
    public static final mve a = new mve();
    public static final anb b = new anb("kotlin.String", ymb.i.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        return decoder.C();
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        String str = (String) obj;
        str.getClass();
        encoder.E(str);
    }
}
