package okhttp3.internal.ws;

import defpackage.mc7;
import defpackage.uqc;
import defpackage.zn1;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MessageInflater implements Closeable {
    public final boolean a;
    public final zn1 b;
    public final Inflater c;
    public final mc7 d;

    public MessageInflater(boolean z) {
        this.a = z;
        zn1 zn1Var = new zn1();
        this.b = zn1Var;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new mc7(new uqc(zn1Var), inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }
}
