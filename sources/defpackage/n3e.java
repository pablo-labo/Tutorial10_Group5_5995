package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class n3e implements PointerInputEventHandler {
    public final /* synthetic */ b0a a;
    public final /* synthetic */ udf b;

    @uh3(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", l = {107, 113, 115}, m = "invokeSuspend")
    public static final class a extends n7d implements Function2<l61, lu2<? super j6g>, Object> {
        final /* synthetic */ r72 $clicksCounter;
        final /* synthetic */ b0a $mouseSelectionObserver;
        final /* synthetic */ udf $textDragObserver;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b0a b0aVar, r72 r72Var, udf udfVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$mouseSelectionObserver = b0aVar;
            this.$clicksCounter = r72Var;
            this.$textDragObserver = udfVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$mouseSelectionObserver, this.$clicksCounter, this.$textDragObserver, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l61 l61Var, lu2<? super j6g> lu2Var) {
            return ((a) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
        
            if (defpackage.q3e.b(r0, r2, r4, r10, r9) == r5) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        
            if (defpackage.q3e.c(r0, r3, r10, r9) == r5) goto L32;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                int r0 = r9.label
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                g13 r5 = defpackage.g13.a
                if (r0 == 0) goto L23
                if (r0 == r4) goto L1b
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                goto L17
            L11:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r9)
                return r1
            L17:
                defpackage.r7d.b(r10)
                goto L82
            L1b:
                java.lang.Object r0 = r9.L$0
                l61 r0 = (defpackage.l61) r0
                defpackage.r7d.b(r10)
                goto L36
            L23:
                defpackage.r7d.b(r10)
                java.lang.Object r10 = r9.L$0
                r0 = r10
                l61 r0 = (defpackage.l61) r0
                r9.L$0 = r0
                r9.label = r4
                java.lang.Object r10 = defpackage.q3e.a(r0, r9)
                if (r10 != r5) goto L36
                goto L81
            L36:
                neb r10 = (defpackage.neb) r10
                boolean r4 = defpackage.q3e.d(r10)
                if (r4 == 0) goto L6f
                int r4 = r10.d
                r4 = r4 & 33
                if (r4 == 0) goto L6f
                java.util.List<yeb> r4 = r10.a
                r6 = r4
                java.util.Collection r6 = (java.util.Collection) r6
                int r6 = r6.size()
                r7 = 0
            L4e:
                if (r7 >= r6) goto L60
                java.lang.Object r8 = r4.get(r7)
                yeb r8 = (defpackage.yeb) r8
                boolean r8 = r8.b()
                if (r8 == 0) goto L5d
                goto L6f
            L5d:
                int r7 = r7 + 1
                goto L4e
            L60:
                b0a r2 = r9.$mouseSelectionObserver
                r72 r4 = r9.$clicksCounter
                r9.L$0 = r1
                r9.label = r3
                java.lang.Object r9 = defpackage.q3e.b(r0, r2, r4, r10, r9)
                if (r9 != r5) goto L82
                goto L81
            L6f:
                boolean r3 = defpackage.q3e.d(r10)
                if (r3 != 0) goto L82
                udf r3 = r9.$textDragObserver
                r9.L$0 = r1
                r9.label = r2
                java.lang.Object r9 = defpackage.q3e.c(r0, r3, r10, r9)
                if (r9 != r5) goto L82
            L81:
                return r5
            L82:
                j6g r9 = defpackage.j6g.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: n3e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public n3e(b0a b0aVar, udf udfVar) {
        this.a = b0aVar;
        this.b = udfVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
        Object objC = ap5.c(efbVar, new a(this.a, new r72(efbVar.getViewConfiguration()), this.b, null), lu2Var);
        return objC == g13.a ? objC : j6g.a;
    }
}
