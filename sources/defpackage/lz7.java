package defpackage;

import com.indeed.android.myjobs.data.model.dto.LogEventData;
import com.indeed.android.myjobs.data.remote.api.LoggingApiService;
import kotlin.jvm.functions.Function1;
import okhttp3.RequestBody$Companion$toRequestBody$2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.data.repository.JobRemoteRepositoryImpl$sendLogEvent$2", f = "JobRemoteRepositoryImpl.kt", l = {92}, m = "invokeSuspend")
public final class lz7 extends c1f implements Function1<lu2<? super m6d<j6g>>, Object> {
    final /* synthetic */ LogEventData $data;
    int label;
    final /* synthetic */ oz7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz7(oz7 oz7Var, LogEventData logEventData, lu2<? super lz7> lu2Var) {
        super(1, lu2Var);
        this.this$0 = oz7Var;
        this.$data = logEventData;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new lz7(this.this$0, this.$data, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<j6g>> lu2Var) {
        return ((lz7) create(lu2Var)).invokeSuspend(j6g.a);
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
        LoggingApiService loggingApiService = this.this$0.m0;
        RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2A = pz7.a(this.$data.getTk());
        RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2A2 = pz7.a(this.$data.getLogType());
        RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2A3 = pz7.a(this.$data.getApplication());
        RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2A4 = pz7.a(this.$data.getModuleName());
        RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2A5 = pz7.a(this.$data.getTimestamp());
        RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2A6 = pz7.a(this.$data.getDataJson());
        this.label = 1;
        Object objLogEvent = loggingApiService.logEvent(requestBody$Companion$toRequestBody$2A, requestBody$Companion$toRequestBody$2A2, requestBody$Companion$toRequestBody$2A3, requestBody$Companion$toRequestBody$2A4, requestBody$Companion$toRequestBody$2A5, requestBody$Companion$toRequestBody$2A6, this);
        g13 g13Var = g13.a;
        return objLogEvent == g13Var ? g13Var : objLogEvent;
    }
}
