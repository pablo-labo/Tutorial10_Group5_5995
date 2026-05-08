package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class g54 extends qf1 {
    public OutputStream a;
    public final byte[] b = new byte[12];

    public g54(OutputStream outputStream) {
        this.a = outputStream;
    }

    @Override // defpackage.qf1
    public final void b(int i, byte[] bArr, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }

    @Override // defpackage.qf1
    public final void d(int i) throws IOException {
        int i2 = (i << 1) ^ (i >> 31);
        if ((i2 & (-128)) == 0) {
            this.a.write(i2);
            return;
        }
        if ((i2 & (-16384)) == 0) {
            this.a.write(i2 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            this.a.write(i2 >>> 7);
        } else {
            byte[] bArr = this.b;
            this.a.write(bArr, 0, of1.d(i, bArr, 0));
        }
    }

    @Override // defpackage.qf1
    public final void e(long j) throws IOException {
        long j2 = (j << 1) ^ (j >> 63);
        if (((-2147483648L) & j2) != 0) {
            byte[] bArr = this.b;
            this.a.write(bArr, 0, of1.e(j, bArr, 0));
            return;
        }
        int i = (int) j2;
        while (true) {
            int i2 = i & (-128);
            OutputStream outputStream = this.a;
            if (i2 == 0) {
                outputStream.write((byte) i);
                return;
            } else {
                outputStream.write((byte) ((i | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) & 255));
                i >>>= 7;
            }
        }
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    @Override // defpackage.qf1
    public final void i() throws IOException {
        this.a.write(0);
    }

    public final void j(boolean z) throws IOException {
        this.a.write(z ? 1 : 0);
    }

    public final void k(double d) throws IOException {
        byte[] bArr = this.b;
        of1.b(d, bArr, 0);
        this.a.write(bArr, 0, 8);
    }

    public final void l(float f) throws IOException {
        byte[] bArr = this.b;
        of1.c(f, bArr, 0);
        this.a.write(bArr, 0, 4);
    }
}
