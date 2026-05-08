package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.tare.uiplugin.NavMenuImpl$2", f = "NavMenuImpl.kt", l = {77}, m = "invokeSuspend")
public final class sba extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ yba this$0;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ yba a;

        public a(yba ybaVar) {
            this.a = ybaVar;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            ArrayList arrayList = lz2.a;
            Log.d("NavMenuImpl", "navMenuItemsFlow.collect", null);
            yba.f(this.a, (List) obj);
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sba(yba ybaVar, lu2<? super sba> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ybaVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new sba(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((sba) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            vi5<List<xe6>> vi5VarC = this.this$0.g().c();
            a aVar = new a(this.this$0);
            this.label = 1;
            Object objE = vi5VarC.e(aVar, this);
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
        return j6g.a;
    }
}
