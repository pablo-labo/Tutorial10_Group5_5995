package defpackage;

import defpackage.bmf;
import defpackage.ymb;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class cmf implements KSerializer<bmf> {
    public static final cmf a = new cmf();
    public static final anb b = i7e.a("TimeZone", ymb.i.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        bmf.a aVar = bmf.Companion;
        String strC = decoder.C();
        aVar.getClass();
        return bmf.a.a(strC);
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        bmf bmfVar = (bmf) obj;
        bmfVar.getClass();
        String id = bmfVar.a.getId();
        id.getClass();
        encoder.E(id);
    }
}
