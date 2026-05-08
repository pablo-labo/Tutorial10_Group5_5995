package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class p3e implements PointerInputEventHandler {
    public final /* synthetic */ Function1<Boolean, j6g> a;

    @uh3(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", l = {94}, m = "invokeSuspend")
    public static final class a extends n7d implements Function2<l61, lu2<? super j6g>, Object> {
        final /* synthetic */ Function1<Boolean, j6g> $updateTouchMode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Boolean, j6g> function1, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$updateTouchMode = function1;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$updateTouchMode, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l61 l61Var, lu2<? super j6g> lu2Var) {
            ((a) create(l61Var, lu2Var)).invokeSuspend(j6g.a);
            return g13.a;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:12:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                int r0 = r3.label
                r1 = 1
                if (r0 == 0) goto L16
                if (r0 != r1) goto Lf
                java.lang.Object r0 = r3.L$0
                l61 r0 = (defpackage.l61) r0
                defpackage.r7d.b(r4)
                goto L2d
            Lf:
                java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r3)
                r3 = 0
                return r3
            L16:
                defpackage.r7d.b(r4)
                java.lang.Object r4 = r3.L$0
                l61 r4 = (defpackage.l61) r4
                r0 = r4
            L1e:
                r3.L$0 = r0
                r3.label = r1
                peb r4 = defpackage.peb.a
                java.lang.Object r4 = r0.B1(r4, r3)
                g13 r2 = defpackage.g13.a
                if (r4 != r2) goto L2d
                return r2
            L2d:
                neb r4 = (defpackage.neb) r4
                kotlin.jvm.functions.Function1<java.lang.Boolean, j6g> r2 = r3.$updateTouchMode
                boolean r4 = defpackage.q3e.d(r4)
                r4 = r4 ^ r1
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                r2.invoke(r4)
                goto L1e
            */
            throw new UnsupportedOperationException("Method not decompiled: p3e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p3e(Function1<? super Boolean, j6g> function1) {
        this.a = function1;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
        Object objW0 = efbVar.w0(new a(this.a, null), lu2Var);
        return objW0 == g13.a ? objW0 : j6g.a;
    }
}
