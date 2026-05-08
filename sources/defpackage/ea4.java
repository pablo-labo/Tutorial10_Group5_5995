package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ea4 implements PointerInputEventHandler {
    public final /* synthetic */ ja4 a;

    @uh3(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", l = {543}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Function2<yeb, ooa, j6g> $onDrag;
        final /* synthetic */ gu5<j6g> $onDragCancel;
        final /* synthetic */ Function1<yeb, j6g> $onDragEnd;
        final /* synthetic */ wu5<yeb, yeb, ooa, j6g> $onDragStart;
        final /* synthetic */ gu5<Boolean> $shouldAwaitTouchSlop;
        final /* synthetic */ efb $this_SuspendingPointerInputModifierNode;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ja4 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(efb efbVar, ja4 ja4Var, wu5<? super yeb, ? super yeb, ? super ooa, j6g> wu5Var, Function1<? super yeb, j6g> function1, gu5<j6g> gu5Var, gu5<Boolean> gu5Var2, Function2<? super yeb, ? super ooa, j6g> function2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$this_SuspendingPointerInputModifierNode = efbVar;
            this.this$0 = ja4Var;
            this.$onDragStart = wu5Var;
            this.$onDragEnd = function1;
            this.$onDragCancel = gu5Var;
            this.$shouldAwaitTouchSlop = gu5Var2;
            this.$onDrag = function2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$this_SuspendingPointerInputModifierNode, this.this$0, this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$shouldAwaitTouchSlop, this.$onDrag, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                int r0 = r12.label
                r1 = 1
                if (r0 == 0) goto L1a
                if (r0 != r1) goto L13
                java.lang.Object r0 = r12.L$0
                r1 = r0
                e13 r1 = (defpackage.e13) r1
                defpackage.r7d.b(r13)     // Catch: java.util.concurrent.CancellationException -> L10
                goto L65
            L10:
                r0 = move-exception
            L11:
                r13 = r0
                goto L54
            L13:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r12)
                r12 = 0
                return r12
            L1a:
                defpackage.r7d.b(r13)
                java.lang.Object r13 = r12.L$0
                e13 r13 = (defpackage.e13) r13
                efb r0 = r12.$this_SuspendingPointerInputModifierNode     // Catch: java.util.concurrent.CancellationException -> L52
                ja4 r2 = r12.this$0     // Catch: java.util.concurrent.CancellationException -> L52
                dwa r6 = r2.f0     // Catch: java.util.concurrent.CancellationException -> L52
                wu5<yeb, yeb, ooa, j6g> r7 = r12.$onDragStart     // Catch: java.util.concurrent.CancellationException -> L52
                kotlin.jvm.functions.Function1<yeb, j6g> r10 = r12.$onDragEnd     // Catch: java.util.concurrent.CancellationException -> L52
                gu5<j6g> r9 = r12.$onDragCancel     // Catch: java.util.concurrent.CancellationException -> L52
                gu5<java.lang.Boolean> r4 = r12.$shouldAwaitTouchSlop     // Catch: java.util.concurrent.CancellationException -> L52
                kotlin.jvm.functions.Function2<yeb, ooa, j6g> r8 = r12.$onDrag     // Catch: java.util.concurrent.CancellationException -> L52
                r12.L$0 = r13     // Catch: java.util.concurrent.CancellationException -> L52
                r12.label = r1     // Catch: java.util.concurrent.CancellationException -> L52
                float r1 = defpackage.da4.a     // Catch: java.util.concurrent.CancellationException -> L52
                kuc r5 = new kuc     // Catch: java.util.concurrent.CancellationException -> L52
                r5.<init>()     // Catch: java.util.concurrent.CancellationException -> L52
                ba4 r3 = new ba4     // Catch: java.util.concurrent.CancellationException -> L52
                r11 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L52
                java.lang.Object r0 = defpackage.ap5.c(r0, r3, r12)     // Catch: java.util.concurrent.CancellationException -> L52
                g13 r1 = defpackage.g13.a
                if (r0 != r1) goto L4b
                goto L4d
            L4b:
                j6g r0 = defpackage.j6g.a     // Catch: java.util.concurrent.CancellationException -> L52
            L4d:
                if (r0 != r1) goto L65
                return r1
            L50:
                r1 = r13
                goto L11
            L52:
                r0 = move-exception
                goto L50
            L54:
                ja4 r12 = r12.this$0
                go1 r12 = r12.j0
                if (r12 == 0) goto L5f
                v94$a r0 = v94.a.a
                r12.f(r0)
            L5f:
                boolean r12 = defpackage.f13.e(r1)
                if (r12 == 0) goto L68
            L65:
                j6g r12 = defpackage.j6g.a
                return r12
            L68:
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: ea4.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ea4(ja4 ja4Var) {
        this.a = ja4Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
        ymg ymgVar = new ymg();
        kuc kucVar = new kuc();
        ja4 ja4Var = this.a;
        kucVar.element = us3.e(ja4Var).v(0L);
        int i = 1;
        Object objD = f13.d(new a(efbVar, ja4Var, new ab3(i, ja4Var, ymgVar), new a03(i, ymgVar, efbVar, ja4Var), new cq0(ja4Var, 3), new o91(ja4Var, 4), new va(i, ja4Var, kucVar, ymgVar), null), lu2Var);
        return objD == g13.a ? objD : j6g.a;
    }
}
