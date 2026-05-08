package defpackage;

import com.indeed.android.myjobs.data.model.APIError;
import defpackage.hf3;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.data.repository.BaseRemoteDataSource$getResult$3", f = "BaseRemoteDataSource.kt", l = {40}, m = "invokeSuspend")
public final class sa1 extends c1f implements wu5<wi5<? super hf3<Object>>, Throwable, lu2<? super j6g>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        wi5 wi5Var = (wi5) this.L$0;
        Throwable th = (Throwable) this.L$1;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown Error";
            }
            ArrayList arrayList = lz2.a;
            lz2.b("NativeMyJobsBaseDataSource", "Exception:".concat(message), false, new Exception("Exception: ".concat(message)));
            hf3.a aVar = new hf3.a(new APIError(-1, "Exception: ".concat(message)));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            Object objA = wi5Var.a(aVar, this);
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

    @Override // defpackage.wu5
    public final Object q(wi5<? super hf3<Object>> wi5Var, Throwable th, lu2<? super j6g> lu2Var) {
        sa1 sa1Var = new sa1(3, lu2Var);
        sa1Var.L$0 = wi5Var;
        sa1Var.L$1 = th;
        return sa1Var.invokeSuspend(j6g.a);
    }
}
