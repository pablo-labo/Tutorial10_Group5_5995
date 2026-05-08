package defpackage;

import defpackage.bmf;
import defpackage.ymb;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class pg5 implements KSerializer<og5> {
    public static final pg5 a = new pg5();
    public static final anb b = i7e.a("FixedOffsetTimeZone", ymb.i.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) throws Exception {
        bmf.a aVar = bmf.Companion;
        String strC = decoder.C();
        aVar.getClass();
        bmf bmfVarA = bmf.a.a(strC);
        if (bmfVarA instanceof og5) {
            return (og5) bmfVarA;
        }
        throw new SerializationException("Timezone identifier '" + bmfVarA + "' does not correspond to a fixed-offset timezone");
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        og5 og5Var = (og5) obj;
        og5Var.getClass();
        String id = og5Var.a.getId();
        id.getClass();
        encoder.E(id);
    }
}
