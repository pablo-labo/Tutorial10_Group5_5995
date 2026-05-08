package defpackage;

import java.nio.ByteBuffer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kp9 implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        nad nadVar = new nad();
        ByteBuffer byteBuffer = nad.d;
        nadVar.a = byteBuffer;
        nadVar.b = byteBuffer;
        nadVar.c = 0;
        return nadVar;
    }
}
