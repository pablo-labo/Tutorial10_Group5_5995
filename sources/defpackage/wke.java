package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", l = {166}, m = "invokeSuspend")
public final class wke extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ g6 $accessibilityManager;
    final /* synthetic */ qke $currentSnackbarData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wke(qke qkeVar, g6 g6Var, lu2<? super wke> lu2Var) {
        super(2, lu2Var);
        this.$currentSnackbarData = qkeVar;
        this.$accessibilityManager = g6Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new wke(this.$currentSnackbarData, this.$accessibilityManager, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((wke) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        long jA;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            qke qkeVar = this.$currentSnackbarData;
            if (qkeVar != null) {
                rke duration = qkeVar.getDuration();
                boolean z = this.$currentSnackbarData.a() != null;
                g6 g6Var = this.$accessibilityManager;
                int iOrdinal = duration.ordinal();
                if (iOrdinal == 0) {
                    jA = 4000;
                } else if (iOrdinal == 1) {
                    jA = 10000;
                } else {
                    if (iOrdinal != 2) {
                        l.g();
                        return null;
                    }
                    jA = Long.MAX_VALUE;
                }
                if (g6Var != null) {
                    jA = g6Var.a(jA, z);
                }
                this.label = 1;
                Object objB = ls3.b(jA, this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            }
            return j6g.a;
        }
        if (i != 1) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.$currentSnackbarData.dismiss();
        return j6g.a;
    }
}
