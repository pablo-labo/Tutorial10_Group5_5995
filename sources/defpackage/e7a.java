package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$11$5$1", f = "MyJobsScreen.kt", l = {606}, m = "invokeSuspend")
public final class e7a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ hw9 $celebrationSheetState;
    final /* synthetic */ boolean $showCelebrationSheet;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7a(boolean z, hw9 hw9Var, lu2<? super e7a> lu2Var) {
        super(2, lu2Var);
        this.$showCelebrationSheet = z;
        this.$celebrationSheetState = hw9Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new e7a(this.$showCelebrationSheet, this.$celebrationSheetState, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((e7a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            if (this.$showCelebrationSheet) {
                hw9 hw9Var = this.$celebrationSheetState;
                this.label = 1;
                Object objD = hw9Var.d(this);
                g13 g13Var = g13.a;
                if (objD == g13Var) {
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
}
