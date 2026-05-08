package defpackage;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class k55 extends OutputStream {
    public final ObjectOutput a;

    public k55(ObjectOutput objectOutput) {
        this.a = objectOutput;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.a.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }
}
