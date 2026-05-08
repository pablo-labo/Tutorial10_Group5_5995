package androidx.media3.decoder;

import androidx.media3.common.a;
import defpackage.ao1;
import defpackage.b83;
import defpackage.jj9;
import defpackage.w40;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes.dex */
public class DecoderInputBuffer extends ao1 {
    public ByteBuffer V;
    public final int W;
    public a b;
    public final b83 c = new b83();
    public ByteBuffer d;
    public boolean e;
    public long f;

    public static final class InsufficientCapacityException extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public InsufficientCapacityException(int i, int i2) {
            super(w40.e("Buffer too small (", i, " < ", i2, ")"));
            this.currentCapacity = i;
            this.requiredCapacity = i2;
        }
    }

    static {
        jj9.a("media3.decoder");
    }

    public DecoderInputBuffer(int i) {
        this.W = i;
    }

    public void n() {
        this.a = 0;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.V;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.e = false;
    }

    public final ByteBuffer o(int i) {
        int i2 = this.W;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.d;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    @EnsuresNonNull({"data"})
    public final void p(int i) {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            this.d = o(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferO = o(i2);
        byteBufferO.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferO.put(byteBuffer);
        }
        this.d = byteBufferO;
    }

    public final void r() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.V;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
