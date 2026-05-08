package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class xd7 implements sw5<Object> {
    public final /* synthetic */ KSerializer<Object> a;

    public xd7(KSerializer<Object> kSerializer) {
        this.a = kSerializer;
    }

    @Override // defpackage.sw5
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{this.a};
    }

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.r7e, defpackage.i04
    public final SerialDescriptor getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        throw new IllegalStateException("unsupported");
    }
}
