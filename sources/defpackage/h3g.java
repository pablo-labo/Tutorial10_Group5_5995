package defpackage;

import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.backend.tasks.NewJobsCountResponse;
import com.indeed.android.uiplugin.api.UIPRecentSearchCountException;
import defpackage.wg0;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.uiplugin.api.UIPRecentSearchCountImpl$getRecentSearchNewCount$2", f = "UIPRecentSearchCountImpl.kt", l = {}, m = "invokeSuspend")
public final class h3g extends c1f implements Function2<e13, lu2<? super j3g>, Object> {
    final /* synthetic */ String $location;
    final /* synthetic */ String $query;
    int label;
    final /* synthetic */ i3g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3g(i3g i3gVar, String str, String str2, lu2<? super h3g> lu2Var) {
        super(2, lu2Var);
        this.this$0 = i3gVar;
        this.$query = str;
        this.$location = str2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new h3g(this.this$0, this.$query, this.$location, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j3g> lu2Var) {
        return ((h3g) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws UIPRecentSearchCountException {
        j3g j3gVar;
        ApiError apiError;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        p87 p87Var = (p87) this.this$0.a.getValue();
        epa epaVar = epa.a;
        OkHttpClient okHttpClientB = epa.b();
        bu8 bu8Var = bu8.a;
        bu8Var.getClass();
        wg0<NewJobsCountResponse> wg0VarT = new z45(p87Var, okHttpClientB, (String) bu8.l0.a(bu8.b[21], bu8Var)).T(d93.e(), this.$query, this.$location, System.currentTimeMillis() / 1000, new t5(this.this$0, 8));
        if (wg0VarT instanceof wg0.b) {
            NewJobsCountResponse newJobsCountResponse = (NewJobsCountResponse) ((wg0.b) wg0VarT).a;
            NewJobsCountResponse.Data data = newJobsCountResponse.b;
            j3gVar = new j3g(data.a, data.b, newJobsCountResponse.a);
        } else {
            j3gVar = null;
        }
        if (wg0VarT instanceof wg0.a) {
            p81 p81Var = ((wg0.a) wg0VarT).a;
            p81Var.getClass();
            apiError = (ApiError) p81Var;
        } else {
            apiError = null;
        }
        if (j3gVar != null) {
            return j3gVar;
        }
        if (apiError == null) {
            throw new UIPRecentSearchCountException("unknown_error", "No data returned from API", null);
        }
        throw new UIPRecentSearchCountException("search_error", apiError.description(), apiError.getCause());
    }
}
