package defpackage;

import defpackage.m7e;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class iu2<T> implements KSerializer<T> {
    public final yd8<T> a;
    public final List<KSerializer<?>> b;
    public final pt2 c;

    public iu2(yd8 yd8Var, KSerializer[] kSerializerArr) {
        p09 p09Var = p09.a;
        yd8Var.getClass();
        this.a = yd8Var;
        List<KSerializer<?>> listAsList = Arrays.asList(kSerializerArr);
        listAsList.getClass();
        this.b = listAsList;
        this.c = new pt2(i7e.b("kotlinx.serialization.ContextualSerializer", m7e.a.a, new SerialDescriptor[0], new tr(this)), yd8Var);
    }

    @Override // defpackage.i04
    public final T deserialize(Decoder decoder) {
        KSerializer kSerializerX = decoder.a().X(this.a, this.b);
        if (kSerializerX == null) {
            kSerializerX = p09.a;
        }
        return (T) decoder.B(kSerializerX);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return this.c;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, T t) {
        t.getClass();
        KSerializer kSerializerX = encoder.a().X(this.a, this.b);
        if (kSerializerX == null) {
            kSerializerX = p09.a;
        }
        encoder.t(kSerializerX, t);
    }
}
