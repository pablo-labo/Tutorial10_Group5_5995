package defpackage;

import defpackage.pua;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class l5h {
    public final ewg a;
    public final b b;

    public interface a {
        nxe a(ewg ewgVar, b bVar, e13 e13Var);
    }

    public interface b {
        void a(String str);

        void b(Exception exc);

        void c(String str, Map<String, ? extends Object> map);

        void d(String str, Map<String, ? extends Object> map);

        void e(Map<String, ? extends Object> map);
    }

    public l5h(ewg ewgVar, b bVar) {
        ewgVar.getClass();
        bVar.getClass();
        this.a = ewgVar;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0048 -> B:24:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object c(defpackage.l5h r4, defpackage.pu2 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.n5h
            if (r0 == 0) goto L13
            r0 = r5
            n5h r0 = (defpackage.n5h) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            n5h r0 = new n5h
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            java.lang.Object r4 = r0.L$1
            l5h r4 = (defpackage.l5h) r4
            java.lang.Object r1 = r0.L$0
            l5h r1 = (defpackage.l5h) r1
            defpackage.r7d.b(r5)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L5b
            goto L49
        L2d:
            r4 = move-exception
            goto L53
        L2f:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L36:
            defpackage.r7d.b(r5)
        L39:
            r0.L$0 = r4     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L5b
            r0.L$1 = r4     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L5b
            r0.label = r2     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L5b
            java.lang.Object r5 = r4.b(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L5b
            g13 r1 = defpackage.g13.a
            if (r5 != r1) goto L48
            return r1
        L48:
            r1 = r4
        L49:
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L5b
            r4.a(r5)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L5b
            r4 = r1
            goto L39
        L50:
            r5 = move-exception
            r1 = r4
            r4 = r5
        L53:
            l5h$b r5 = r1.b
            r5.b(r4)
            j6g r4 = defpackage.j6g.a
            return r4
        L5b:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l5h.c(l5h, pu2):java.lang.Object");
    }

    public abstract void a(Map<String, ? extends Object> map);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[Catch: Exception -> 0x0067, TRY_LEAVE, TryCatch #0 {Exception -> 0x0067, blocks: (B:20:0x004b, B:22:0x0064), top: B:28:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0042 -> B:19:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.pu2 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.m5h
            if (r0 == 0) goto L13
            r0 = r7
            m5h r0 = (defpackage.m5h) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            m5h r0 = new m5h
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            java.lang.Object r1 = r0.L$0
            l5h r1 = (defpackage.l5h) r1
            defpackage.r7d.b(r7)
            goto L43
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r2
        L30:
            defpackage.r7d.b(r7)
        L33:
            r0.L$0 = r6
            r0.label = r3
            ewg r7 = r6.a
            java.lang.Object r7 = r7.b(r0)
            g13 r1 = defpackage.g13.a
            if (r7 != r1) goto L42
            return r1
        L42:
            r1 = r6
        L43:
            java.lang.String r7 = (java.lang.String) r7
            r1.getClass()
            r7.getClass()
            ha$a r1 = defpackage.ha.g     // Catch: java.lang.Exception -> L67
            uo1 r4 = new uo1     // Catch: java.lang.Exception -> L67
            zn1 r5 = new zn1     // Catch: java.lang.Exception -> L67
            r5.<init>()     // Catch: java.lang.Exception -> L67
            r5.Q0(r7)     // Catch: java.lang.Exception -> L67
            r4.<init>(r5)     // Catch: java.lang.Exception -> L67
            lb3 r7 = defpackage.lb3.g     // Catch: java.lang.Exception -> L67
            java.lang.Object r7 = r1.a(r4, r7)     // Catch: java.lang.Exception -> L67
            boolean r1 = r7 instanceof java.util.Map     // Catch: java.lang.Exception -> L67
            if (r1 == 0) goto L67
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Exception -> L67
            goto L68
        L67:
            r7 = r2
        L68:
            if (r7 == 0) goto L33
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l5h.b(pu2):java.lang.Object");
    }

    public final void d(Map<String, ? extends Object> map, k5h k5hVar) {
        map.getClass();
        k5hVar.getClass();
        int iOrdinal = k5hVar.ordinal();
        ewg ewgVar = this.a;
        if (iOrdinal == 0) {
            zn1 zn1Var = new zn1();
            f.a(new so1(zn1Var), map);
            ewgVar.send(zn1Var.z1());
        } else {
            if (iOrdinal != 1) {
                l.g();
                return;
            }
            zn1 zn1Var2 = new zn1();
            f.a(new so1(zn1Var2), map);
            ewgVar.a(zn1Var2.J0(zn1Var2.b));
        }
    }

    public abstract <D extends pua.a> void e(rh0<D> rh0Var);

    public abstract <D extends pua.a> void f(rh0<D> rh0Var);
}
