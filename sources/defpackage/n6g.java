package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class n6g implements KSerializer<j6g> {
    public static final n6g b = new n6g();
    public final /* synthetic */ rna<j6g> a = new rna<>(j6g.a, "kotlin.Unit");

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        this.a.deserialize(decoder);
        return j6g.a;
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        j6g j6gVar = (j6g) obj;
        j6gVar.getClass();
        this.a.serialize(encoder, j6gVar);
    }
}
