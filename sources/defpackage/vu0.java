package defpackage;

import androidx.compose.runtime.r;
import defpackage.hzf;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class vu0 implements ese<Object> {
    public boolean V = true;
    public final List<jn5> a;
    public final gzf b;
    public final yv0 c;
    public final Function1<hzf.b, j6g> d;
    public final o70 e;
    public final g4a f;

    public vu0(List list, Object obj, gzf gzfVar, yv0 yv0Var, Function1 function1, o70 o70Var) {
        this.a = list;
        this.b = gzfVar;
        this.c = yv0Var;
        this.d = function1;
        this.e = o70Var;
        this.f = r.f(obj);
    }

    @Override // defpackage.ese
    public final Object getValue() {
        return ((gme) this.f).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
    
        if (defpackage.hwf.f(r2) == r10) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0038, B:25:0x006a, B:27:0x0076, B:32:0x0098, B:35:0x00c5, B:20:0x0052, B:23:0x005e), top: B:44:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0038, B:25:0x006a, B:27:0x0076, B:32:0x0098, B:35:0x00c5, B:20:0x0052, B:23:0x005e), top: B:44:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5 A[Catch: all -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0038, B:25:0x006a, B:27:0x0076, B:32:0x0098, B:35:0x00c5, B:20:0x0052, B:23:0x005e), top: B:44:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0074 -> B:39:0x00d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d3 -> B:38:0x00d6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.pu2 r18) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu0.i(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(defpackage.jn5 r6, defpackage.pu2 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.tu0
            if (r0 == 0) goto L13
            r0 = r7
            tu0 r0 = (defpackage.tu0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            tu0 r0 = new tu0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2f
            java.lang.Object r5 = r0.L$0
            r6 = r5
            jn5 r6 = (defpackage.jn5) r6
            defpackage.r7d.b(r7)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            return r7
        L2b:
            r5 = move-exception
            goto L4d
        L2d:
            r5 = move-exception
            goto L76
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r3
        L35:
            defpackage.r7d.b(r7)
            uu0 r7 = new uu0     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r7.<init>(r5, r6, r3)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r0.L$0 = r6     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r0.label = r2     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            r1 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r5 = defpackage.ewa.P(r1, r7, r0)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L2d
            g13 r6 = defpackage.g13.a
            if (r5 != r6) goto L4c
            return r6
        L4c:
            return r5
        L4d:
            v03 r7 = r0.getContext()
            z03$a r1 = z03.a.a
            v03$a r7 = r7.h1(r1)
            z03 r7 = (defpackage.z03) r7
            if (r7 == 0) goto L80
            v03 r0 = r0.getContext()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Unable to load font "
            r2.<init>(r4)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.<init>(r6, r5)
            r7.N0(r0, r1)
            goto L80
        L76:
            v03 r6 = r0.getContext()
            boolean r6 = defpackage.u63.U(r6)
            if (r6 == 0) goto L81
        L80:
            return r3
        L81:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu0.n(jn5, pu2):java.lang.Object");
    }
}
