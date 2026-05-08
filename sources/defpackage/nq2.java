package defpackage;

import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class nq2 implements rie, jm8 {
    public final nde b = wg2.d(1, 0, eo1.b, 2);

    @uh3(c = "coil3.compose.ConstraintsSizeResolver", f = "ConstraintsSizeResolver.kt", l = {38}, m = "size")
    public static final class a extends pu2 {
        int label;
        /* synthetic */ Object result;

        public a(pu2 pu2Var) {
            super(pu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return nq2.this.f(this);
        }
    }

    @uh3(c = "coil3.compose.ConstraintsSizeResolver$size$2", f = "ConstraintsSizeResolver.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<iq2, lu2<? super Boolean>, Object> {
        /* synthetic */ long J$0;
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            b bVar = new b(2, lu2Var);
            bVar.J$0 = ((iq2) obj).a;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iq2 iq2Var, lu2<? super Boolean> lu2Var) {
            long j = iq2Var.a;
            b bVar = new b(2, lu2Var);
            bVar.J$0 = j;
            return bVar.invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            long j = this.J$0;
            int i = (int) (3 & j);
            int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
            return Boolean.valueOf(!(((((int) (j >> 33)) & ((1 << (i2 + 13)) - 1)) - 1 == 0) | ((((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) - 1 == 0)));
        }
    }

    @Override // defpackage.jm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        this.b.b(new iq2(j));
        w wVarR = vf9Var.R(j);
        return qVar.Y0(wVarR.a, wVarR.b, bs4.a, new na0(wVarR, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.rie
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.lu2<? super defpackage.iie> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof nq2.a
            if (r0 == 0) goto L13
            r0 = r5
            nq2$a r0 = (nq2.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L1a
        L13:
            nq2$a r0 = new nq2$a
            pu2 r5 = (defpackage.pu2) r5
            r0.<init>(r5)
        L1a:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.r7d.b(r5)
            goto L44
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L2e:
            defpackage.r7d.b(r5)
            nq2$b r5 = new nq2$b
            r1 = 2
            r5.<init>(r1, r2)
            r0.label = r3
            nde r4 = r4.b
            java.lang.Object r5 = defpackage.wg2.C(r4, r5, r0)
            g13 r4 = defpackage.g13.a
            if (r5 != r4) goto L44
            return r4
        L44:
            iq2 r5 = (defpackage.iq2) r5
            long r4 = r5.a
            y03 r0 = defpackage.mkg.a
            iie r0 = new iie
            int r1 = defpackage.iq2.h(r4)
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r2) goto L5e
            defpackage.w44.a(r1)
            u44$a r3 = new u44$a
            r3.<init>(r1)
            goto L60
        L5e:
            u44$b r3 = u44.b.a
        L60:
            int r4 = defpackage.iq2.g(r4)
            if (r4 == r2) goto L6f
            defpackage.w44.a(r4)
            u44$a r5 = new u44$a
            r5.<init>(r4)
            goto L71
        L6f:
            u44$b r5 = u44.b.a
        L71:
            r0.<init>(r3, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq2.f(lu2):java.lang.Object");
    }
}
