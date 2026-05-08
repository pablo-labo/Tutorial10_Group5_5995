package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hm3 extends u81 {
    public final void finalize() throws Throwable {
        if (((km3) this).e) {
            return;
        }
        s55.p("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            ((km3) this).close();
        } finally {
            super.finalize();
        }
    }
}
