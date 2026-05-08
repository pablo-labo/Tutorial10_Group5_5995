package defpackage;

import defpackage.xa1;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class wo2 implements qo2 {
    public final tfb a;
    public final tfb b;
    public final ThreadLocal<egb> c;
    public final AtomicBoolean d;
    public final long e;

    public wo2(xa1.a aVar, String str, int i) {
        str.getClass();
        this.c = new ThreadLocal<>();
        int i2 = 0;
        this.d = new AtomicBoolean(false);
        int i3 = wd4.d;
        this.e = pg8.T(30, be4.SECONDS);
        if (i <= 0) {
            l5.q("Maximum number of readers must be greater than 0");
            throw null;
        }
        this.a = new tfb(i, new qv(2, aVar, str));
        this.b = new tfb(1, new ro2(i2, aVar, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b7 A[Catch: all -> 0x01ce, TRY_LEAVE, TryCatch #8 {all -> 0x01ce, blocks: (B:90:0x01b1, B:92:0x01b7, B:94:0x01c0, B:95:0x01c5), top: B:138:0x01b1 }] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, egb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // defpackage.qo2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object F0(boolean r18, kotlin.jvm.functions.Function2 r19, defpackage.pu2 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wo2.F0(boolean, kotlin.jvm.functions.Function2, pu2):java.lang.Object");
    }

    public final void a(boolean z) {
        String str = z ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append("\n\nWriter pool:\n");
        this.b.c(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.a.c(sb);
        zkd.O(5, sb.toString());
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.d.compareAndSet(false, true)) {
            this.a.b();
            this.b.b();
        }
    }

    public wo2(xa1.a aVar) {
        this.c = new ThreadLocal<>();
        this.d = new AtomicBoolean(false);
        int i = wd4.d;
        this.e = pg8.T(30, be4.SECONDS);
        tfb tfbVar = new tfb(1, new ye(aVar, 4));
        this.a = tfbVar;
        this.b = tfbVar;
    }
}
