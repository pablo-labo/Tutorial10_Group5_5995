package defpackage;

import defpackage.o7d;

/* JADX INFO: loaded from: classes3.dex */
public final class r7d {
    public static final o7d.a a(Throwable th) {
        th.getClass();
        return new o7d.a(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof o7d.a) {
            throw ((o7d.a) obj).exception;
        }
    }
}
