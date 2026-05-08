package defpackage;

import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ke1 extends DecoderInputBuffer {
    public long X;
    public int Y;
    public int Z;

    @Override // androidx.media3.decoder.DecoderInputBuffer
    public final void n() {
        super.n();
        this.Y = 0;
    }

    public final boolean s(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        ka2.l(!decoderInputBuffer.h(1073741824));
        ka2.l(!decoderInputBuffer.h(268435456));
        ka2.l(!decoderInputBuffer.h(4));
        if (t()) {
            if (this.Y >= this.Z) {
                return false;
            }
            ByteBuffer byteBuffer2 = decoderInputBuffer.d;
            if (byteBuffer2 != null && (byteBuffer = this.d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.Y;
        this.Y = i + 1;
        if (i == 0) {
            this.f = decoderInputBuffer.f;
            if (decoderInputBuffer.h(1)) {
                this.a = 1;
            }
        }
        ByteBuffer byteBuffer3 = decoderInputBuffer.d;
        if (byteBuffer3 != null) {
            p(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.X = decoderInputBuffer.f;
        return true;
    }

    public final boolean t() {
        return this.Y > 0;
    }
}
