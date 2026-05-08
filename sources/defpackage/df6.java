package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;
import org.koin.core.error.NoBeanDefFoundException;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.bottomnav.hamburgermenu.HamburgerMenuViewModel$1", f = "HamburgerMenuViewModel.kt", l = {81}, m = "invokeSuspend")
public final class df6 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ ff6 this$0;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ ff6 a;

        public a(ff6 ff6Var) {
            this.a = ff6Var;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) throws NoBeanDefFoundException {
            Object objI = ff6.i(this.a, (List) obj, lu2Var);
            return objI == g13.a ? objI : j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df6(ff6 ff6Var, lu2<? super df6> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ff6Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new df6(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((df6) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
        gse gseVar = ff6.g(this.this$0).b0;
        a aVar = new a(this.this$0);
        this.label = 1;
        gseVar.e(aVar, this);
        return g13.a;
    }
}
