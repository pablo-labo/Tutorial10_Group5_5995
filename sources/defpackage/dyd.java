package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", f = "Transition.kt", l = {600}, m = "invokeSuspend")
public final class dyd extends c1f implements Function1<lu2<? super j6g>, Object> {
    final /* synthetic */ jf5<Float> $animationSpec;
    final /* synthetic */ Object $targetState;
    final /* synthetic */ csf<Object> $transition;
    int label;
    final /* synthetic */ cyd<Object> this$0;

    @uh3(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", f = "Transition.kt", l = {2173, 613, 615, 669, 671}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ jf5<Float> $animationSpec;
        final /* synthetic */ Object $targetState;
        final /* synthetic */ csf<Object> $transition;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ cyd<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lu2 lu2Var, jf5 jf5Var, cyd cydVar, csf csfVar, Object obj) {
            super(2, lu2Var);
            this.this$0 = cydVar;
            this.$targetState = obj;
            this.$transition = csfVar;
            this.$animationSpec = jf5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            cyd<Object> cydVar = this.this$0;
            Object obj2 = this.$targetState;
            return new a(lu2Var, this.$animationSpec, cydVar, this.$transition, obj2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:83:0x01cd, code lost:
        
            if (defpackage.cyd.h(r1, r20) != r13) goto L85;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 479
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: dyd.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyd(lu2 lu2Var, jf5 jf5Var, cyd cydVar, csf csfVar, Object obj) {
        super(1, lu2Var);
        this.$transition = csfVar;
        this.this$0 = cydVar;
        this.$targetState = obj;
        this.$animationSpec = jf5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        csf<Object> csfVar = this.$transition;
        return new dyd(lu2Var, this.$animationSpec, this.this$0, csfVar, this.$targetState);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super j6g> lu2Var) {
        return ((dyd) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            cyd<Object> cydVar = this.this$0;
            Object obj2 = this.$targetState;
            a aVar = new a(null, this.$animationSpec, cydVar, this.$transition, obj2);
            this.label = 1;
            Object objD = f13.d(aVar, this);
            g13 g13Var = g13.a;
            if (objD == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        this.$transition.j();
        return j6g.a;
    }
}
