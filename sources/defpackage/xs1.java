package defpackage;

import defpackage.o7d;

/* JADX INFO: loaded from: classes3.dex */
public final class xs1 {
    public static final /* synthetic */ int a = 0;

    static {
        Object aVar;
        try {
            aVar = Class.forName("java.lang.ClassValue");
        } catch (Throwable th) {
            aVar = new o7d.a(th);
        }
        if (!(aVar instanceof o7d.a)) {
            aVar = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (aVar instanceof o7d.a) {
            aVar = obj;
        }
    }
}
