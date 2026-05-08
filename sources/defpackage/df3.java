package defpackage;

import androidx.media3.datasource.a;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class df3 extends InputStream {
    public final a a;
    public final gf3 b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public df3(gf3 gf3Var, a aVar) {
        this.a = aVar;
        this.b = gf3Var;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.a.b(this.b);
        this.d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.a.close();
        this.e = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ka2.q(!this.e);
        a();
        int i3 = this.a.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
