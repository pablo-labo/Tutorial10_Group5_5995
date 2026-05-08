package defpackage;

import defpackage.wl7;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend")
public final class kn1 extends c1f implements Function2<e13, lu2<? super ex7>, Object> {
    final /* synthetic */ gu5<qtc> $boundsProvider;
    final /* synthetic */ sl8 $childCoordinates;
    final /* synthetic */ gu5<qtc> $parentRect;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ln1 this$0;

    @uh3(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", f = "BringIntoViewResponder.kt", l = {183}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ gu5<qtc> $boundsProvider;
        final /* synthetic */ sl8 $childCoordinates;
        int label;
        final /* synthetic */ ln1 this$0;

        /* JADX INFO: renamed from: kn1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0296a extends qv5 implements gu5<qtc> {
            final /* synthetic */ gu5<qtc> $boundsProvider;
            final /* synthetic */ sl8 $childCoordinates;
            final /* synthetic */ ln1 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0296a(ln1 ln1Var, sl8 sl8Var, gu5<qtc> gu5Var) {
                super(0, wl7.a.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.this$0 = ln1Var;
                this.$childCoordinates = sl8Var;
                this.$boundsProvider = gu5Var;
            }

            @Override // defpackage.gu5
            public final qtc invoke() {
                return ln1.c2(this.this$0, this.$childCoordinates, this.$boundsProvider);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ln1 ln1Var, sl8 sl8Var, gu5<qtc> gu5Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = ln1Var;
            this.$childCoordinates = sl8Var;
            this.$boundsProvider = gu5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.this$0, this.$childCoordinates, this.$boundsProvider, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 215
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kn1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", f = "BringIntoViewResponder.kt", l = {191}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ gu5<qtc> $parentRect;
        int label;
        final /* synthetic */ ln1 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ln1 ln1Var, gu5<qtc> gu5Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.this$0 = ln1Var;
            this.$parentRect = gu5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.this$0, this.$parentRect, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                ln1 ln1Var = this.this$0;
                gu5<qtc> gu5Var = this.$parentRect;
                this.label = 1;
                Object objA = cn1.a(ln1Var, gu5Var, this);
                g13 g13Var = g13.a;
                if (objA == g13Var) {
                    return g13Var;
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn1(ln1 ln1Var, sl8 sl8Var, gu5<qtc> gu5Var, gu5<qtc> gu5Var2, lu2<? super kn1> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ln1Var;
        this.$childCoordinates = sl8Var;
        this.$boundsProvider = gu5Var;
        this.$parentRect = gu5Var2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        kn1 kn1Var = new kn1(this.this$0, this.$childCoordinates, this.$boundsProvider, this.$parentRect, lu2Var);
        kn1Var.L$0 = obj;
        return kn1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super ex7> lu2Var) {
        return ((kn1) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        e13 e13Var = (e13) this.L$0;
        u63.Y(e13Var, null, null, new a(this.this$0, this.$childCoordinates, this.$boundsProvider, null), 3);
        return u63.Y(e13Var, null, null, new b(this.this$0, this.$parentRect, null), 3);
    }
}
