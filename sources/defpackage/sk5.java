package defpackage;

import defpackage.y1e;

/* JADX INFO: loaded from: classes3.dex */
public final class sk5 implements vi5<Object> {
    public final /* synthetic */ vi5[] a;
    public final /* synthetic */ y1e.a.C0479a b;

    @uh3(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
    public static final class a extends c1f implements wu5<wi5<Object>, Object[], lu2<? super j6g>, Object> {
        final /* synthetic */ yu5 $transform$inlined;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lu2 lu2Var, yu5 yu5Var) {
            super(3, lu2Var);
            this.$transform$inlined = yu5Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            if (r0.a(r12, r10) == r4) goto L15;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                int r0 = r11.label
                r1 = 0
                r2 = 2
                r3 = 1
                g13 r4 = defpackage.g13.a
                if (r0 == 0) goto L20
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                defpackage.r7d.b(r12)
                goto L4f
            L11:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r11)
                return r1
            L17:
                java.lang.Object r0 = r11.L$0
                wi5 r0 = (defpackage.wi5) r0
                defpackage.r7d.b(r12)
                r10 = r11
                goto L44
            L20:
                defpackage.r7d.b(r12)
                java.lang.Object r12 = r11.L$0
                r0 = r12
                wi5 r0 = (defpackage.wi5) r0
                java.lang.Object r12 = r11.L$1
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                yu5 r5 = r11.$transform$inlined
                r6 = 0
                r6 = r12[r6]
                r7 = r12[r3]
                r8 = r12[r2]
                r9 = 3
                r9 = r12[r9]
                r11.L$0 = r0
                r11.label = r3
                r10 = r11
                java.lang.Object r12 = r5.t(r6, r7, r8, r9, r10)
                if (r12 != r4) goto L44
                goto L4e
            L44:
                r10.L$0 = r1
                r10.label = r2
                java.lang.Object r11 = r0.a(r12, r10)
                if (r11 != r4) goto L4f
            L4e:
                return r4
            L4f:
                j6g r11 = defpackage.j6g.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: sk5.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.wu5
        public final Object q(wi5<Object> wi5Var, Object[] objArr, lu2<? super j6g> lu2Var) {
            a aVar = new a(lu2Var, this.$transform$inlined);
            aVar.L$0 = wi5Var;
            aVar.L$1 = objArr;
            return aVar.invokeSuspend(j6g.a);
        }
    }

    public sk5(vi5[] vi5VarArr, y1e.a.C0479a c0479a) {
        this.a = vi5VarArr;
        this.b = c0479a;
    }

    @Override // defpackage.vi5
    public final Object e(wi5<? super Object> wi5Var, lu2 lu2Var) {
        Object objR = wg2.r(wi5Var, this.a, new a(null, this.b), lu2Var);
        return objR == g13.a ? objR : j6g.a;
    }
}
