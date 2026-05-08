package defpackage;

import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class qp1 {
    public static final by8 a(KSerializer kSerializer, KSerializer kSerializer2) {
        kSerializer.getClass();
        kSerializer2.getClass();
        return new by8(kSerializer, kSerializer2);
    }

    public static final <T> KSerializer<T> b(KSerializer<T> kSerializer) {
        kSerializer.getClass();
        return kSerializer.getDescriptor().b() ? kSerializer : new tma(kSerializer);
    }
}
