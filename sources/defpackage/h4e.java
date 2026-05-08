package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class h4e implements PointerInputEventHandler {
    public final /* synthetic */ j4e a;
    public final /* synthetic */ qq b;

    @uh3(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1", f = "SelectionManager.kt", l = {979, 985}, m = "invokeSuspend")
    public static final class a extends n7d implements Function2<l61, lu2<? super j6g>, Object> {
        final /* synthetic */ gu5<j6g> $block;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ j4e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j4e j4eVar, gu5<j6g> gu5Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = j4eVar;
            this.$block = gu5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.this$0, this.$block, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l61 l61Var, lu2<? super j6g> lu2Var) {
            return ((a) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r6 == r4) goto L15;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                int r0 = r5.label
                r1 = 0
                r2 = 2
                r3 = 1
                g13 r4 = defpackage.g13.a
                if (r0 == 0) goto L1f
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                defpackage.r7d.b(r6)
                goto L45
            L11:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r5)
                return r1
            L17:
                java.lang.Object r0 = r5.L$0
                l61 r0 = (defpackage.l61) r0
                defpackage.r7d.b(r6)
                goto L36
            L1f:
                defpackage.r7d.b(r6)
                java.lang.Object r6 = r5.L$0
                r0 = r6
                l61 r0 = (defpackage.l61) r0
                r5.L$0 = r0
                r5.label = r3
                i8f$a r6 = defpackage.i8f.a
                peb r6 = defpackage.peb.b
                java.lang.Object r6 = defpackage.i8f.d(r0, r6, r5)
                if (r6 != r4) goto L36
                goto L44
            L36:
                yeb r6 = (defpackage.yeb) r6
                r5.L$0 = r1
                r5.label = r2
                peb r1 = defpackage.peb.a
                java.lang.Object r6 = defpackage.da4.a(r0, r6, r1, r5)
                if (r6 != r4) goto L45
            L44:
                return r4
            L45:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5b
                j4e r6 = r5.this$0
                jf6 r6 = r6.f()
                if (r6 == 0) goto L56
                goto L5b
            L56:
                gu5<j6g> r5 = r5.$block
                r5.invoke()
            L5b:
                j6g r5 = defpackage.j6g.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: h4e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public h4e(j4e j4eVar, qq qqVar) {
        this.a = j4eVar;
        this.b = qqVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
        Object objC = ap5.c(efbVar, new a(this.a, this.b, null), lu2Var);
        return objC == g13.a ? objC : j6g.a;
    }
}
