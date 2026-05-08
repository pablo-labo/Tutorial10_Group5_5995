package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tf1 implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        return ByteBuffer.wrap((byte[]) uf1.a.get()).order(ByteOrder.LITTLE_ENDIAN);
    }
}
