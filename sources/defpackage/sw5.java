package defpackage;

import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public interface sw5<T> extends KSerializer<T> {
    KSerializer<?>[] childSerializers();

    default KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
