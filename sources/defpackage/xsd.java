package defpackage;

import androidx.compose.foundation.gestures.a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xsd {
    public nsd a;
    public nxa b;
    public nh5 c;
    public dwa d;
    public boolean e;
    public tea f;
    public final jsd g;
    public final nv h;
    public boolean i;
    public int j = 1;
    public xrd k = a.b;
    public final usd l = new usd(this);
    public final tv m = new tv(this, 21);

    public xsd(nsd nsdVar, nxa nxaVar, nh5 nh5Var, dwa dwaVar, boolean z, tea teaVar, jsd jsdVar, nv nvVar) {
        this.a = nsdVar;
        this.b = nxaVar;
        this.c = nh5Var;
        this.d = dwaVar;
        this.e = z;
        this.f = teaVar;
        this.g = jsdVar;
        this.h = nvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r11, defpackage.pu2 r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.ssd
            if (r0 == 0) goto L13
            r0 = r13
            ssd r0 = (defpackage.ssd) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ssd r0 = new ssd
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L36
            if (r1 != r3) goto L2f
            java.lang.Object r11 = r0.L$0
            kuc r11 = (defpackage.kuc) r11
            defpackage.r7d.b(r13)     // Catch: java.lang.Throwable -> L2b
            r5 = r10
            goto L5a
        L2b:
            r0 = move-exception
            r11 = r0
            r5 = r10
            goto L6a
        L2f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r10)
            r10 = 0
            return r10
        L36:
            defpackage.r7d.b(r13)
            kuc r6 = new kuc
            r6.<init>()
            r6.element = r11
            r10.i = r3
            n4a r13 = defpackage.n4a.a     // Catch: java.lang.Throwable -> L67
            tsd r4 = new tsd     // Catch: java.lang.Throwable -> L67
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L64
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L64
            r0.label = r3     // Catch: java.lang.Throwable -> L64
            java.lang.Object r10 = r5.f(r13, r4, r0)     // Catch: java.lang.Throwable -> L64
            g13 r11 = defpackage.g13.a
            if (r10 != r11) goto L59
            return r11
        L59:
            r11 = r6
        L5a:
            r5.i = r2
            long r10 = r11.element
            vmg r12 = new vmg
            r12.<init>(r10)
            return r12
        L64:
            r0 = move-exception
        L65:
            r11 = r0
            goto L6a
        L67:
            r0 = move-exception
            r5 = r10
            goto L65
        L6a:
            r5.i = r2
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xsd.a(long, pu2):java.lang.Object");
    }

    public final Object b(long j, boolean z, c1f c1fVar) {
        if (z) {
            nh5 nh5Var = this.c;
            tr trVar = a.a;
            if (nh5Var instanceof ln3) {
                return j6g.a;
            }
        }
        long jA = vmg.a(0.0f, 0.0f, this.d == dwa.b ? 1 : 2, j);
        vsd vsdVar = new vsd(this, null);
        nxa nxaVar = this.b;
        g13 g13Var = g13.a;
        if (nxaVar != null && (this.a.d() || this.a.c())) {
            Object objA = nxaVar.a(jA, vsdVar, c1fVar);
            return objA == g13Var ? objA : j6g.a;
        }
        vsd vsdVar2 = new vsd(vsdVar.this$0, c1fVar);
        vsdVar2.J$0 = jA;
        j6g j6gVar = j6g.a;
        Object objInvokeSuspend = vsdVar2.invokeSuspend(j6gVar);
        return objInvokeSuspend == g13Var ? objInvokeSuspend : j6gVar;
    }

    public final long c(xrd xrdVar, long j, int i) {
        xea xeaVar = this.f.a;
        xea xeaVar2 = null;
        xea xeaVar3 = (xeaVar == null || !xeaVar.c0) ? null : (xea) pg8.t(xeaVar);
        long jE0 = xeaVar3 != null ? xeaVar3.e0(i, j) : 0L;
        long jE = ooa.e(j, jE0);
        long jE2 = e(h(xrdVar.e(g(e(ooa.a(jE, this.d == dwa.b ? 1 : 2, 0.0f))))));
        jsd jsdVar = this.g;
        if (jsdVar.c0) {
            us3.g(jsdVar).q();
        }
        long jE3 = ooa.e(jE, jE2);
        xea xeaVar4 = this.f.a;
        if (xeaVar4 != null && xeaVar4.c0) {
            xeaVar2 = (xea) pg8.t(xeaVar4);
        }
        xea xeaVar5 = xeaVar2;
        return ooa.f(ooa.f(jE0, jE2), xeaVar5 != null ? xeaVar5.Z0(jE2, i, jE3) : 0L);
    }

    public final float d(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long e(long j) {
        return this.e ? ooa.g(j, -1.0f) : j;
    }

    public final Object f(n4a n4aVar, Function2 function2, pu2 pu2Var) {
        Object objA = this.a.a(n4aVar, new wsd(null, this, function2), pu2Var);
        return objA == g13.a ? objA : j6g.a;
    }

    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.d == dwa.b ? j >> 32 : j & 4294967295L));
    }

    public final long h(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == dwa.b) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }
}
