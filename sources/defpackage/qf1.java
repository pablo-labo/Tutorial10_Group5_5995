package defpackage;

import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qf1 implements Flushable {
    public final void a(long j) {
        if (j > 0) {
            e(j);
        }
    }

    public abstract void b(int i, byte[] bArr, int i2);

    public void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - iPosition;
        if (byteBuffer.hasArray()) {
            b(byteBuffer.arrayOffset() + iPosition, byteBuffer.array(), iLimit);
        } else {
            byte[] bArr = new byte[iLimit];
            byteBuffer.duplicate().get(bArr, 0, iLimit);
            b(0, bArr, iLimit);
        }
    }

    public abstract void d(int i);

    public abstract void e(long j);

    public final void h(String str) {
        if (str.isEmpty()) {
            i();
            return;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        d(bytes.length);
        b(0, bytes, bytes.length);
    }

    public abstract void i();
}
