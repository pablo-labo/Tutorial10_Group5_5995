package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class nj3 implements ngb<ByteBuffer> {
    public static final /* synthetic */ int a = 0;

    public class a extends ThreadLocal<ByteBuffer> {
        @Override // java.lang.ThreadLocal
        public final ByteBuffer initialValue() {
            int i = nj3.a;
            return ByteBuffer.allocate(16384);
        }
    }

    static {
        new a();
    }
}
