package defpackage;

import android.os.Handler;
import defpackage.glf;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class stc {
    public final rtc a;
    public final glf b;
    public final p3a<gu5<j6g>> c;
    public boolean d;
    public boolean e;
    public boolean f;
    public q9 g;
    public long h;
    public final ttc i;
    public final y3a j;

    public static final class a extends mj8 implements Function2<Long, Long, j6g> {
        final /* synthetic */ long $currentTime;
        final /* synthetic */ glf.a $entry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(glf.a aVar, long j) {
            super(2);
            this.$entry = aVar;
            this.$currentTime = j;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Long l, Long l2) {
            long jLongValue = l.longValue();
            long jLongValue2 = l2.longValue();
            glf glfVar = stc.this.b;
            glf.a aVar = this.$entry;
            long j = this.$currentTime;
            glfVar.getClass();
            glf.a(aVar, jLongValue, jLongValue2, j);
            return j6g.a;
        }
    }

    public stc() {
        rtc rtcVar = new rtc();
        rtcVar.a = new long[192];
        rtcVar.b = new long[192];
        this.a = rtcVar;
        this.b = new glf();
        this.c = new p3a<>((Object) null);
        this.h = -1L;
        this.i = new ttc(this);
        this.j = new y3a();
    }

    public static long g(pm8 pm8Var) {
        float[] fArrMo14getUnderlyingMatrixsQKQjiQ;
        int iC;
        ria riaVar = pm8Var.t0;
        tia tiaVar = riaVar.d;
        tia tiaVar2 = riaVar.c;
        long jY = 0;
        while (tiaVar2 != null && tiaVar2 != tiaVar) {
            qxa qxaVar = tiaVar2.A0;
            jY = ak2.y(jY, tiaVar2.r0);
            tiaVar2 = tiaVar2.i0;
            if (qxaVar != null && (iC = pi3.c((fArrMo14getUnderlyingMatrixsQKQjiQ = qxaVar.mo14getUnderlyingMatrixsQKQjiQ()))) != 3) {
                if ((iC & 2) == 0) {
                    return 9223372034707292159L;
                }
                jY = if9.b(jY, fArrMo14getUnderlyingMatrixsQKQjiQ);
            }
        }
        return ak2.E(jY);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(defpackage.pm8 r10) {
        /*
            ria r0 = r10.t0
            tia r0 = r0.d
            long r0 = r0.r0
            pm8 r2 = r10.K()
            if (r2 == 0) goto L45
            long r3 = r2.c
            r5 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            boolean r3 = defpackage.lh7.b(r3, r5)
            if (r3 == 0) goto L1c
            h(r2)
        L1c:
            long r3 = r2.c
            boolean r7 = defpackage.lh7.b(r3, r5)
            if (r7 == 0) goto L26
        L24:
            r0 = r5
            goto L45
        L26:
            boolean r7 = r2.f
            if (r7 == 0) goto L34
            long r7 = g(r2)
            r2.e = r7
            r9 = 0
            r2.f = r9
            goto L36
        L34:
            long r7 = r2.e
        L36:
            boolean r2 = defpackage.lh7.b(r7, r5)
            if (r2 == 0) goto L3d
            goto L24
        L3d:
            long r2 = defpackage.lh7.d(r3, r7)
            long r0 = defpackage.lh7.d(r2, r0)
        L45:
            r10.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stc.h(pm8):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c1, code lost:
    
        r6.a = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stc.a():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.pm8 r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stc.b(pm8, boolean):void");
    }

    public final void c(pm8 pm8Var) {
        j4a<pm8> j4aVarN = pm8Var.N();
        pm8[] pm8VarArr = j4aVarN.a;
        int i = j4aVarN.c;
        for (int i2 = 0; i2 < i; i2++) {
            pm8 pm8Var2 = pm8VarArr[i2];
            b(pm8Var2, false);
            c(pm8Var2);
        }
    }

    public final void d(pm8 pm8Var) {
        this.d = true;
        int i = pm8Var.b & 67108863;
        rtc rtcVar = this.a;
        long[] jArr = rtcVar.a;
        int i2 = rtcVar.c;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & 67108863) == i) {
                jArr[i4] = 2305843009213693952L | j;
                break;
            }
            i3 += 3;
        }
        q9 q9Var = this.g;
        boolean z = q9Var != null;
        long j2 = this.b.b;
        if (j2 >= 0 || !z) {
            if (this.h == j2 && z) {
                return;
            }
            if (q9Var != null) {
                Handler handler = r9.a;
                r9.a.removeCallbacks(q9Var);
            }
            Handler handler2 = r9.a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j2, 16 + jCurrentTimeMillis);
            this.h = jMax;
            q9 q9Var2 = new q9(this.i, 0);
            r9.a.postDelayed(q9Var2, jMax - jCurrentTimeMillis);
            this.g = q9Var2;
        }
    }

    public final void e(pm8 pm8Var) {
        long jG = g(pm8Var);
        if (lh7.b(jG, 9223372034707292159L)) {
            c(pm8Var);
            return;
        }
        pm8Var.e = jG;
        pm8Var.f = false;
        j4a<pm8> j4aVarN = pm8Var.N();
        pm8[] pm8VarArr = j4aVarN.a;
        int i = j4aVarN.c;
        for (int i2 = 0; i2 < i; i2++) {
            f(pm8VarArr[i2], false);
        }
        d(pm8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.pm8 r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stc.f(pm8, boolean):void");
    }

    public final void i(pm8 pm8Var) {
        int i = pm8Var.b & 67108863;
        rtc rtcVar = this.a;
        long[] jArr = rtcVar.a;
        int i2 = rtcVar.c;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                break;
            }
            int i4 = i3 + 2;
            if ((((int) jArr[i4]) & 67108863) == i) {
                jArr[i3] = -1;
                jArr[i3 + 1] = -1;
                jArr[i4] = 2305843009213693951L;
                break;
            }
            i3 += 3;
        }
        this.d = true;
        this.f = true;
    }
}
