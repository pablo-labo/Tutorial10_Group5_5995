package defpackage;

import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.common.api.a;
import com.indeed.android.jobsearch.backend.tasks.NewJobsCountResponse;
import defpackage.wg0;
import java.io.IOException;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.searchoverlay.network.NetworkNewJobsCountRepository$getNewJobsCount$2", f = "NewJobsCountRepository.kt", l = {}, m = "invokeSuspend")
public final class lga extends c1f implements Function2<e13, lu2<? super Integer>, Object> {
    final /* synthetic */ lsc $recentSearch;
    int label;
    final /* synthetic */ mga this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lga(mga mgaVar, lsc lscVar, lu2<? super lga> lu2Var) {
        super(2, lu2Var);
        this.this$0 = mgaVar;
        this.$recentSearch = lscVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new lga(this.this$0, this.$recentSearch, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super Integer> lu2Var) {
        return ((lga) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        mga mgaVar = this.this$0;
        lsc lscVar = this.$recentSearch;
        try {
            z45 z45Var = mgaVar.d;
            String strE = d93.e();
            lsc lscVar2 = this.$recentSearch;
            jud judVar = lscVar2.b;
            wg0<NewJobsCountResponse> wg0VarT = z45Var.T(strE, judVar.a, judVar.b, lscVar2.c, new vz2(this.this$0, 4));
            i = wg0VarT instanceof wg0.b ? ((NewJobsCountResponse) ((wg0.b) wg0VarT).a).b.b : 0;
            if (wg0VarT instanceof wg0.a) {
                p81 p81Var = ((wg0.a) wg0VarT).a;
                p81Var.getClass();
                ((gz4) mgaVar.c.getValue()).a("new_jobs_count_error", new qs0(9, (ApiError) p81Var, lscVar));
            }
        } catch (IOException e) {
            ((gz4) mgaVar.c.getValue()).a("new_jobs_count_error", new qs0(9, new ApiError(new a.e(), null, null, e, 6, null), lscVar));
        } catch (SerializationException e2) {
            ((gz4) mgaVar.c.getValue()).a("new_jobs_count_error", new qs0(9, new ApiError(a.d.d, null, null, e2, 6, null), lscVar));
        }
        return new Integer(i);
    }
}
