package okhttp3.internal.ws;

import defpackage.hs3;
import defpackage.tqc;
import defpackage.zn1;
import java.io.Closeable;
import java.util.zip.Deflater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MessageDeflater implements Closeable {
    public final boolean a;
    public final zn1 b;
    public final Deflater c;
    public final hs3 d;

    public MessageDeflater(boolean z) {
        this.a = z;
        zn1 zn1Var = new zn1();
        this.b = zn1Var;
        Deflater deflater = new Deflater(-1, true);
        this.c = deflater;
        this.d = new hs3(new tqc(zn1Var), deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.d.close();
    }
}
