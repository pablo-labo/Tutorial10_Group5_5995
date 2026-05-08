package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.bottomnav.hamburgermenu.HamburgerMenuViewModel$2", f = "HamburgerMenuViewModel.kt", l = {86}, m = "invokeSuspend")
public final class ef6 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ ff6 this$0;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ ff6 a;

        public a(ff6 ff6Var) {
            this.a = ff6Var;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            Object objH = ff6.h(this.a, (List) obj, lu2Var);
            return objH == g13.a ? objH : j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef6(ff6 ff6Var, lu2<? super ef6> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ff6Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ef6(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ef6) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return j6g.a;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        gse gseVar = ff6.g(this.this$0).c0;
        a aVar = new a(this.this$0);
        this.label = 1;
        gseVar.e(aVar, this);
        return g13.a;
    }
}
