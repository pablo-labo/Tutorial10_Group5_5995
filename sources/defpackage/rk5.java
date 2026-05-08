package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rk5 implements vi5<Object> {
    public final /* synthetic */ vi5[] a;
    public final /* synthetic */ xu5 b;

    @uh3(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
    public static final class a extends c1f implements wu5<wi5<Object>, Object[], lu2<? super j6g>, Object> {
        final /* synthetic */ xu5 $transform$inlined;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lu2 lu2Var, xu5 xu5Var) {
            super(3, lu2Var);
            this.$transform$inlined = xu5Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r0.a(r9, r8) == r4) goto L15;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                int r0 = r8.label
                r1 = 0
                r2 = 2
                r3 = 1
                g13 r4 = defpackage.g13.a
                if (r0 == 0) goto L1f
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                defpackage.r7d.b(r9)
                goto L4a
            L11:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r8)
                return r1
            L17:
                java.lang.Object r0 = r8.L$0
                wi5 r0 = (defpackage.wi5) r0
                defpackage.r7d.b(r9)
                goto L3f
            L1f:
                defpackage.r7d.b(r9)
                java.lang.Object r9 = r8.L$0
                r0 = r9
                wi5 r0 = (defpackage.wi5) r0
                java.lang.Object r9 = r8.L$1
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                xu5 r5 = r8.$transform$inlined
                r6 = 0
                r6 = r9[r6]
                r7 = r9[r3]
                r9 = r9[r2]
                r8.L$0 = r0
                r8.label = r3
                java.lang.Object r9 = r5.j(r6, r7, r9, r8)
                if (r9 != r4) goto L3f
                goto L49
            L3f:
                r8.L$0 = r1
                r8.label = r2
                java.lang.Object r8 = r0.a(r9, r8)
                if (r8 != r4) goto L4a
            L49:
                return r4
            L4a:
                j6g r8 = defpackage.j6g.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: rk5.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.wu5
        public final Object q(wi5<Object> wi5Var, Object[] objArr, lu2<? super j6g> lu2Var) {
            a aVar = new a(lu2Var, this.$transform$inlined);
            aVar.L$0 = wi5Var;
            aVar.L$1 = objArr;
            return aVar.invokeSuspend(j6g.a);
        }
    }

    public rk5(vi5[] vi5VarArr, xu5 xu5Var) {
        this.a = vi5VarArr;
        this.b = xu5Var;
    }

    @Override // defpackage.vi5
    public final Object e(wi5<? super Object> wi5Var, lu2 lu2Var) {
        Object objR = wg2.r(wi5Var, this.a, new a(null, this.b), lu2Var);
        return objR == g13.a ? objR : j6g.a;
    }
}
