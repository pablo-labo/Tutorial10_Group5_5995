package defpackage;

import com.indeed.android.myjobs.data.model.HomepageLoggingResponse;
import com.indeed.android.myjobs.data.model.request.HomepageLoggingRequest;
import com.indeed.android.myjobs.data.remote.api.HomepageLoggingService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.data.repository.JobRemoteRepositoryImpl$fetchHomepagePageToken$2", f = "JobRemoteRepositoryImpl.kt", l = {125}, m = "invokeSuspend")
public final class dz7 extends c1f implements Function1<lu2<? super m6d<HomepageLoggingResponse>>, Object> {
    final /* synthetic */ String $ref;
    final /* synthetic */ String $refType;
    final /* synthetic */ String $refkw;
    int label;
    final /* synthetic */ oz7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz7(oz7 oz7Var, String str, String str2, String str3, lu2<? super dz7> lu2Var) {
        super(1, lu2Var);
        this.this$0 = oz7Var;
        this.$ref = str;
        this.$refkw = str2;
        this.$refType = str3;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new dz7(this.this$0, this.$ref, this.$refkw, this.$refType, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<HomepageLoggingResponse>> lu2Var) {
        return ((dz7) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return obj;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        HomepageLoggingService homepageLoggingService = this.this$0.o0;
        HomepageLoggingRequest homepageLoggingRequest = new HomepageLoggingRequest(this.$ref, this.$refkw, this.$refType);
        this.label = 1;
        Object objLogHomepage = homepageLoggingService.logHomepage(homepageLoggingRequest, this);
        g13 g13Var = g13.a;
        return objLogHomepage == g13Var ? g13Var : objLogHomepage;
    }
}
