package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.uiplugin.fragment.modals.CustomBottomSheetScreenKt$CustomBottomSheetScreen$2$1", f = "CustomBottomSheetScreen.kt", l = {69}, m = "invokeSuspend")
public final class aa3 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $onHideFinished;
    final /* synthetic */ e13 $scope;
    final /* synthetic */ hee $sheetState;
    final /* synthetic */ mde<j6g> $startCloseEvent;
    int label;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ e13 a;
        public final /* synthetic */ hee b;
        public final /* synthetic */ gu5<j6g> c;

        public a(e13 e13Var, gu5 gu5Var, hee heeVar) {
            this.a = e13Var;
            this.b = heeVar;
            this.c = gu5Var;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            u63.Y(this.a, null, null, new z93(this.b, null), 3).d0(new vx0(this.c, 3));
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa3(mde<j6g> mdeVar, e13 e13Var, hee heeVar, gu5<j6g> gu5Var, lu2<? super aa3> lu2Var) {
        super(2, lu2Var);
        this.$startCloseEvent = mdeVar;
        this.$scope = e13Var;
        this.$sheetState = heeVar;
        this.$onHideFinished = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new aa3(this.$startCloseEvent, this.$scope, this.$sheetState, this.$onHideFinished, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        ((aa3) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        return g13.a;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            mde<j6g> mdeVar = this.$startCloseEvent;
            a aVar = new a(this.$scope, this.$onHideFinished, this.$sheetState);
            this.label = 1;
            Object objE = mdeVar.e(aVar, this);
            g13 g13Var = g13.a;
            if (objE == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        r40.e();
        return null;
    }
}
