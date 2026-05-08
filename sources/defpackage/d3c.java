package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class d3c extends FilterOutputStream {
    public long a;
    public final /* synthetic */ e3c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3c(e3c e3cVar, OutputStream outputStream) {
        super(outputStream);
        this.b = e3cVar;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        super.write(bArr, i, i2);
        long j = this.a + ((long) i2);
        this.a = j;
        e3c e3cVar = this.b;
        long jContentLength = e3cVar.contentLength();
        e3cVar.b.a(j, jContentLength, j == jContentLength);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        super.write(i);
        long j = this.a + 1;
        this.a = j;
        e3c e3cVar = this.b;
        long jContentLength = e3cVar.contentLength();
        e3cVar.b.a(j, jContentLength, j == jContentLength);
    }
}
