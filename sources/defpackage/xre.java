package defpackage;

import kotlin.jvm.functions.Function2;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes3.dex */
public final class xre implements yde {
    public final long a;
    public final long b;

    @uh3(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {174, 176, 178, 179, 181}, m = "invokeSuspend")
    public static final class a extends c1f implements wu5<wi5<? super wde>, Integer, lu2<? super j6g>, Object> {
        /* synthetic */ int I$0;
        private /* synthetic */ Object L$0;
        int label;

        public a(lu2<? super a> lu2Var) {
            super(3, lu2Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        
            if (r0.a(defpackage.wde.a, r10) == r7) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
        
            if (r0.a(defpackage.wde.c, r10) != r7) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0085 A[PHI: r0
  0x0085: PHI (r0v5 wi5) = (r0v3 wi5), (r0v4 wi5), (r0v11 wi5) binds: [B:25:0x0067, B:30:0x0082, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                int r0 = r10.label
                r1 = 0
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                g13 r7 = defpackage.g13.a
                if (r0 == 0) goto L39
                if (r0 == r6) goto L35
                if (r0 == r5) goto L2d
                if (r0 == r4) goto L25
                if (r0 == r3) goto L1d
                if (r0 != r2) goto L17
                goto L35
            L17:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r10)
                return r1
            L1d:
                java.lang.Object r0 = r10.L$0
                wi5 r0 = (defpackage.wi5) r0
                defpackage.r7d.b(r11)
                goto L85
            L25:
                java.lang.Object r0 = r10.L$0
                wi5 r0 = (defpackage.wi5) r0
                defpackage.r7d.b(r11)
                goto L76
            L2d:
                java.lang.Object r0 = r10.L$0
                wi5 r0 = (defpackage.wi5) r0
                defpackage.r7d.b(r11)
                goto L5f
            L35:
                defpackage.r7d.b(r11)
                goto L92
            L39:
                defpackage.r7d.b(r11)
                java.lang.Object r11 = r10.L$0
                r0 = r11
                wi5 r0 = (defpackage.wi5) r0
                int r11 = r10.I$0
                if (r11 <= 0) goto L50
                r10.label = r6
                wde r11 = defpackage.wde.a
                java.lang.Object r10 = r0.a(r11, r10)
                if (r10 != r7) goto L92
                goto L91
            L50:
                xre r11 = defpackage.xre.this
                long r8 = r11.a
                r10.L$0 = r0
                r10.label = r5
                java.lang.Object r11 = defpackage.ls3.b(r8, r10)
                if (r11 != r7) goto L5f
                goto L91
            L5f:
                xre r11 = defpackage.xre.this
                long r5 = r11.b
                r8 = 0
                int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r11 <= 0) goto L85
                r10.L$0 = r0
                r10.label = r4
                wde r11 = defpackage.wde.b
                java.lang.Object r11 = r0.a(r11, r10)
                if (r11 != r7) goto L76
                goto L91
            L76:
                xre r11 = defpackage.xre.this
                long r4 = r11.b
                r10.L$0 = r0
                r10.label = r3
                java.lang.Object r11 = defpackage.ls3.b(r4, r10)
                if (r11 != r7) goto L85
                goto L91
            L85:
                r10.L$0 = r1
                r10.label = r2
                wde r11 = defpackage.wde.c
                java.lang.Object r10 = r0.a(r11, r10)
                if (r10 != r7) goto L92
            L91:
                return r7
            L92:
                j6g r10 = defpackage.j6g.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: xre.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.wu5
        public final Object q(wi5<? super wde> wi5Var, Integer num, lu2<? super j6g> lu2Var) {
            int iIntValue = num.intValue();
            a aVar = xre.this.new a(lu2Var);
            aVar.L$0 = wi5Var;
            aVar.I$0 = iIntValue;
            return aVar.invokeSuspend(j6g.a);
        }
    }

    @uh3(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<wde, lu2<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            b bVar = new b(2, lu2Var);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(wde wdeVar, lu2<? super Boolean> lu2Var) {
            return ((b) create(wdeVar, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r7d.b(obj);
                return Boolean.valueOf(((wde) this.L$0) != wde.a);
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    public xre(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j < 0) {
            h5.k(u40.c(j, "stopTimeout(", " ms) cannot be negative"));
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        h5.k(u40.c(j2, "replayExpiration(", " ms) cannot be negative"));
        throw null;
    }

    @Override // defpackage.yde
    public final vi5<wde> a(fse<Integer> fseVar) {
        return wg2.v(new uj5(wg2.c0(fseVar, new a(null)), new b(2, null)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xre)) {
            return false;
        }
        xre xreVar = (xre) obj;
        return this.a == xreVar.a && this.b == xreVar.b;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        iy8 iy8Var = new iy8(2);
        long j = this.a;
        if (j > 0) {
            iy8Var.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.b;
        if (j2 < Long.MAX_VALUE) {
            iy8Var.add("replayExpiration=" + j2 + "ms");
        }
        return w40.f(new StringBuilder("SharingStarted.WhileSubscribed("), z92.W0(iy8Var.l(), null, null, null, null, 63), ')');
    }
}
