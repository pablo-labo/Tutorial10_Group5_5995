package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e30 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @uh3(c = "androidx.compose.material.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {691}, m = "invokeSuspend")
    public static final class a<T> extends c1f implements xu5<z20, pa4<T>, T, lu2<? super j6g>, Object> {
        final /* synthetic */ d40<T> $this_animateTo;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d40<T> d40Var, float f, lu2<? super a> lu2Var) {
            super(4, lu2Var);
            this.$this_animateTo = d40Var;
            this.$velocity = f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                z20 z20Var = (z20) this.L$0;
                float f = ((pa4) this.L$1).f(this.L$2);
                if (!Float.isNaN(f)) {
                    iuc iucVar = new iuc();
                    float fG = Float.isNaN(((cme) this.$this_animateTo.j).g()) ? 0.0f : ((cme) this.$this_animateTo.j).g();
                    iucVar.element = fG;
                    float f2 = this.$velocity;
                    yd0<Float> yd0Var = this.$this_animateTo.c;
                    d30 d30Var = new d30(0, z20Var, iucVar);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    Object objA = x0f.a(fG, f, f2, yd0Var, d30Var, this);
                    g13 g13Var = g13.a;
                    if (objA == g13Var) {
                        return g13Var;
                    }
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }

        @Override // defpackage.xu5
        public final Object j(z20 z20Var, Object obj, Object obj2, lu2<? super j6g> lu2Var) {
            a aVar = new a(this.$this_animateTo, this.$velocity, lu2Var);
            aVar.L$0 = z20Var;
            aVar.L$1 = (pa4) obj;
            aVar.L$2 = obj2;
            return aVar.invokeSuspend(j6g.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.gu5 r4, kotlin.jvm.functions.Function2 r5, defpackage.pu2 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.f30
            if (r0 == 0) goto L13
            r0 = r6
            f30 r0 = (defpackage.f30) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            f30 r0 = new f30
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.r7d.b(r6)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L3f
            goto L3f
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L2c:
            defpackage.r7d.b(r6)
            g30 r6 = new g30     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L3f
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L3f
            r0.label = r3     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L3f
            java.lang.Object r4 = defpackage.f13.d(r6, r0)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L3f
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L3f
            return r5
        L3f:
            j6g r4 = defpackage.j6g.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e30.a(gu5, kotlin.jvm.functions.Function2, pu2):java.lang.Object");
    }

    public static final <T> Object b(d40<T> d40Var, T t, float f, lu2<? super j6g> lu2Var) {
        Object objB = d40Var.b(t, n4a.a, new a(d40Var, f, null), lu2Var);
        return objB == g13.a ? objB : j6g.a;
    }
}
