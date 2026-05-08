package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public interface r7e<T> {
    SerialDescriptor getDescriptor();

    void serialize(Encoder encoder, T t);
}
