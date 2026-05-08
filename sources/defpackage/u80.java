package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class u80 implements ucb, e13 {
    public final View a;
    public final rhf b;
    public final e13 c;
    public final AtomicReference d = new AtomicReference(null);

    public u80(View view, rhf rhfVar, e13 e13Var) {
        this.a = view;
        this.b = rhfVar;
        this.c = e13Var;
    }

    @Override // defpackage.tcb
    public final View b() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.tcb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.mu8 r5, defpackage.pu2 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.q80
            if (r0 == 0) goto L13
            r0 = r6
            q80 r0 = (defpackage.q80) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            q80 r0 = new q80
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return
        L27:
            defpackage.r7d.b(r6)
            goto L4b
        L2b:
            defpackage.r7d.b(r6)
            s80 r6 = new s80
            r6.<init>(r5, r4)
            t80 r5 = new t80
            r1 = 0
            r5.<init>(r4, r1)
            r0.label = r2
            u9e r2 = new u9e
            java.util.concurrent.atomic.AtomicReference r4 = r4.d
            r2.<init>(r6, r4, r5, r1)
            java.lang.Object r4 = defpackage.f13.d(r2, r0)
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L4b
            return
        L4b:
            defpackage.r40.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u80.c(mu8, pu2):void");
    }

    @Override // defpackage.e13
    public final v03 getCoroutineContext() {
        return this.c.getCoroutineContext();
    }
}
