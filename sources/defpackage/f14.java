package defpackage;

import defpackage.hi8;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class f14 {
    public static final Set<hi8.a> b = pi3.k(hi8.a.CLASS);
    public static final Set<hi8.a> c = ut0.I0(new hi8.a[]{hi8.a.FILE_FACADE, hi8.a.MULTIFILE_CLASS_PART});
    public static final us9 d;
    public static final us9 e;
    public g04 a;

    static {
        new us9(new int[]{1, 1, 2}, false);
        d = new us9(new int[]{1, 1, 11}, false);
        e = new us9(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.p14 a(defpackage.lya r12, defpackage.oi8 r13) {
        /*
            r11 = this;
            java.lang.String r1 = "Could not read data from "
            r13.getClass()
            hi8 r0 = r13.a()
            java.lang.String[] r2 = r0.c
            if (r2 != 0) goto Lf
            java.lang.String[] r2 = r0.d
        Lf:
            r3 = 0
            if (r2 == 0) goto L1d
            hi8$a r0 = r0.a
            java.util.Set<hi8$a> r4 = defpackage.f14.c
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L1d
            goto L1e
        L1d:
            r2 = r3
        L1e:
            if (r2 != 0) goto L21
            goto L63
        L21:
            hi8 r0 = r13.a()
            java.lang.String[] r0 = r0.e
            if (r0 != 0) goto L2a
            goto L63
        L2a:
            kotlin.Pair r0 = defpackage.pd8.h(r2, r0)     // Catch: java.lang.Throwable -> L2f kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L31
            goto L61
        L2f:
            r0 = move-exception
            goto L40
        L31:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r13.d()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = r1.concat(r4)     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L2f
            throw r2     // Catch: java.lang.Throwable -> L2f
        L40:
            g04 r1 = r11.c()
            ka2 r1 = r1.c
            r1.getClass()
            hi8 r1 = r13.a()
            us9 r1 = r1.b
            g04 r2 = r11.c()
            ka2 r2 = r2.c
            r2.getClass()
            us9 r2 = defpackage.us9.g
            boolean r1 = r1.b(r2)
            if (r1 != 0) goto Laa
            r0 = r3
        L61:
            if (r0 != 0) goto L64
        L63:
            return r3
        L64:
            java.lang.Object r1 = r0.a()
            r5 = r1
            hd8 r5 = (defpackage.hd8) r5
            java.lang.Object r0 = r0.b()
            r4 = r0
            e5c r4 = (defpackage.e5c) r4
            jd8 r7 = new jd8
            r11.d(r13)
            r11.e(r13)
            b14 r0 = r11.b(r13)
            r7.<init>(r13, r4, r5, r0)
            p14 r2 = new p14
            hi8 r13 = r13.a()
            us9 r6 = r13.b
            g04 r8 = r11.c()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "scope for "
            r11.<init>(r13)
            r11.append(r7)
            java.lang.String r13 = " in "
            r11.append(r13)
            r11.append(r12)
            java.lang.String r9 = r11.toString()
            e14 r10 = defpackage.e14.a
            r3 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
        Laa:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f14.a(lya, oi8):p14");
    }

    public final b14 b(oi8 oi8Var) {
        c().c.getClass();
        int i = oi8Var.a().g;
        return ((i & 16) == 0 || (i & 32) != 0) ? b14.a : b14.b;
    }

    public final g04 c() {
        g04 g04Var = this.a;
        if (g04Var != null) {
            return g04Var;
        }
        wl7.g("components");
        throw null;
    }

    public final a77<us9> d(oi8 oi8Var) {
        c().c.getClass();
        us9 us9Var = oi8Var.a().b;
        c().c.getClass();
        us9 us9Var2 = us9.g;
        if (us9Var.b(us9Var2)) {
            return null;
        }
        us9 us9Var3 = oi8Var.a().b;
        c().c.getClass();
        c().c.getClass();
        boolean z = oi8Var.a().b.f;
        us9Var2.getClass();
        us9 us9Var4 = z ? us9Var2 : us9.h;
        int i = us9Var4.b;
        int i2 = us9Var2.b;
        return new a77<>(us9Var3, us9Var2, us9Var2, (i <= i2 && (i < i2 || us9Var4.c <= us9Var2.c)) ? us9Var2 : us9Var4, oi8Var.d(), oi8Var.j());
    }

    public final boolean e(oi8 oi8Var) {
        c().c.getClass();
        c().c.getClass();
        return (oi8Var.a().g & 2) != 0 && oi8Var.a().b.equals(d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.o52 f(defpackage.oi8 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "Could not read data from "
            hi8 r1 = r6.a()
            java.lang.String[] r2 = r1.c
            if (r2 != 0) goto Lc
            java.lang.String[] r2 = r1.d
        Lc:
            r3 = 0
            if (r2 == 0) goto L1a
            hi8$a r1 = r1.a
            java.util.Set<hi8$a> r4 = defpackage.f14.b
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L1a
            goto L1b
        L1a:
            r2 = r3
        L1b:
            if (r2 != 0) goto L1e
            goto L60
        L1e:
            hi8 r1 = r6.a()
            java.lang.String[] r1 = r1.e
            if (r1 != 0) goto L27
            goto L60
        L27:
            kotlin.Pair r0 = defpackage.pd8.f(r2, r1)     // Catch: java.lang.Throwable -> L2c kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L2e
            goto L5e
        L2c:
            r0 = move-exception
            goto L3d
        L2e:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = r6.d()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r0.concat(r4)     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L2c
            throw r2     // Catch: java.lang.Throwable -> L2c
        L3d:
            g04 r1 = r5.c()
            ka2 r1 = r1.c
            r1.getClass()
            hi8 r1 = r6.a()
            us9 r1 = r1.b
            g04 r2 = r5.c()
            ka2 r2 = r2.c
            r2.getClass()
            us9 r2 = defpackage.us9.g
            boolean r1 = r1.b(r2)
            if (r1 != 0) goto L88
            r0 = r3
        L5e:
            if (r0 != 0) goto L61
        L60:
            return r3
        L61:
            java.lang.Object r1 = r0.a()
            hd8 r1 = (defpackage.hd8) r1
            java.lang.Object r0 = r0.b()
            u4c r0 = (defpackage.u4c) r0
            pi8 r2 = new pi8
            r5.d(r6)
            r5.e(r6)
            b14 r5 = r5.b(r6)
            r2.<init>(r6, r5)
            o52 r5 = new o52
            hi8 r6 = r6.a()
            us9 r6 = r6.b
            r5.<init>(r1, r0, r6, r2)
            return r5
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f14.f(oi8):o52");
    }
}
