package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class oxh implements Runnable {
    public final sxh a;
    public final int b;
    public final Throwable c;
    public final byte[] d;
    public final String e;
    public final Map<String, List<String>> f;

    public oxh(String str, sxh sxhVar, int i, IOException iOException, byte[] bArr, Map map) {
        fib.i(sxhVar);
        this.a = sxhVar;
        this.b = i;
        this.c = iOException;
        this.d = bArr;
        this.e = str;
        this.f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.e, this.b, this.c, this.d, this.f);
    }
}
