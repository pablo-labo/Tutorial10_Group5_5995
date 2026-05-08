package defpackage;

import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes3.dex */
public final class yc8 extends p95 {
    public final RandomAccessFile d;

    public yc8(RandomAccessFile randomAccessFile) {
        this.d = randomAccessFile;
    }

    @Override // defpackage.p95
    public final synchronized void a() {
        this.d.close();
    }

    @Override // defpackage.p95
    public final synchronized int h(long j, byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.d.seek(j);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i4 = this.d.read(bArr, i, i2 - i3);
            if (i4 != -1) {
                i3 += i4;
            } else if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // defpackage.p95
    public final synchronized long p() {
        return this.d.length();
    }
}
