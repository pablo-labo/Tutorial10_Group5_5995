package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: loaded from: classes3.dex */
public interface i04<T> {
    T deserialize(Decoder decoder);

    SerialDescriptor getDescriptor();
}
