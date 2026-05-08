package defpackage;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class wu8<V> {
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public final int a;
    public final long b;
    public final V c;
    public final int d;
    public final kj9 e;
    public final d9e f;

    static {
        String str = vjg.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
        l = Integer.toString(5, 36);
    }

    public wu8(int i2, long j2, kj9 kj9Var, d9e d9eVar, V v, int i3) {
        this.a = i2;
        this.b = j2;
        this.e = kj9Var;
        this.f = d9eVar;
        this.c = v;
        this.d = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.wu8<?> a(android.os.Bundle r10) {
        /*
            java.lang.String r0 = defpackage.wu8.g
            r1 = 0
            int r3 = r10.getInt(r0, r1)
            java.lang.String r0 = defpackage.wu8.h
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r10.getLong(r0, r4)
            java.lang.String r0 = defpackage.wu8.i
            android.os.Bundle r0 = r10.getBundle(r0)
            r2 = 0
            if (r0 != 0) goto L1c
            r6 = r2
            goto L21
        L1c:
            kj9 r0 = defpackage.kj9.a(r0)
            r6 = r0
        L21:
            java.lang.String r0 = defpackage.wu8.l
            android.os.Bundle r0 = r10.getBundle(r0)
            if (r0 == 0) goto L2f
            d9e r0 = defpackage.d9e.a(r0)
        L2d:
            r7 = r0
            goto L38
        L2f:
            if (r3 == 0) goto L37
            d9e r0 = new d9e
            r0.<init>(r3)
            goto L2d
        L37:
            r7 = r2
        L38:
            java.lang.String r0 = defpackage.wu8.k
            int r9 = r10.getInt(r0)
            r0 = 1
            if (r9 == r0) goto L80
            java.lang.String r0 = defpackage.wu8.j
            r8 = 2
            if (r9 == r8) goto L82
            r8 = 3
            if (r9 == r8) goto L51
            r10 = 4
            if (r9 != r10) goto L4d
            goto L80
        L4d:
            defpackage.bg.h()
            return r2
        L51:
            android.os.IBinder r10 = r10.getBinder(r0)
            if (r10 != 0) goto L58
            goto L80
        L58:
            e47 r10 = defpackage.bq1.a(r10)
            e47$b r0 = defpackage.e47.b
            e47$a r0 = new e47$a
            r0.<init>()
        L63:
            int r2 = r10.size()
            if (r1 >= r2) goto L7c
            java.lang.Object r2 = r10.get(r1)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r2.getClass()
            ij9 r2 = defpackage.ij9.a(r2)
            r0.c(r2)
            int r1 = r1 + 1
            goto L63
        L7c:
            qyc r2 = r0.f()
        L80:
            r8 = r2
            goto L8e
        L82:
            android.os.Bundle r10 = r10.getBundle(r0)
            if (r10 != 0) goto L89
            goto L80
        L89:
            ij9 r2 = defpackage.ij9.a(r10)
            goto L80
        L8e:
            wu8 r2 = new wu8
            r2.<init>(r3, r4, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu8.a(android.os.Bundle):wu8");
    }

    @SuppressLint({"WrongConstant"})
    public static <V> wu8<V> b(int i2) {
        d9e d9eVar = new d9e("no error message provided", i2, Bundle.EMPTY);
        return new wu8<>(d9eVar.a, SystemClock.elapsedRealtime(), null, d9eVar, null, 4);
    }

    public static void c(ij9 ij9Var) {
        if (TextUtils.isEmpty(ij9Var.a)) {
            l5.q("mediaId must not be empty");
            return;
        }
        oj9 oj9Var = ij9Var.d;
        ka2.k("mediaMetadata must specify isBrowsable", oj9Var.q != null);
        ka2.k("mediaMetadata must specify isPlayable", oj9Var.r != null);
    }
}
