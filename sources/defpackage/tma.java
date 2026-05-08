package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class tma<T> implements KSerializer<T> {
    public final KSerializer<T> a;
    public final e7e b;

    public tma(KSerializer<T> kSerializer) {
        kSerializer.getClass();
        this.a = kSerializer;
        this.b = new e7e(kSerializer.getDescriptor());
    }

    @Override // defpackage.i04
    public final T deserialize(Decoder decoder) {
        if (decoder.F()) {
            return (T) decoder.B(this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && tma.class == obj.getClass() && wl7.b(this.a, ((tma) obj).a);
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, T t) {
        if (t == null) {
            encoder.n();
        } else {
            encoder.v();
            encoder.t(this.a, t);
        }
    }
}
