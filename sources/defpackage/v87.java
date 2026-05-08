package defpackage;

import android.content.res.Configuration;
import android.os.Message;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.eventlog.IndeedEventLogging$emitRNJsonObject$1", f = "IndeedEventLogging.kt", l = {148}, m = "invokeSuspend")
public final class v87 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ JsonObject $event;
    final /* synthetic */ aq7 $metadata;
    int label;
    final /* synthetic */ s87 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v87(s87 s87Var, JsonObject jsonObject, aq7 aq7Var, lu2<? super v87> lu2Var) {
        super(2, lu2Var);
        this.this$0 = s87Var;
        this.$event = jsonObject;
        this.$metadata = aq7Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new v87(this.this$0, this.$event, this.$metadata, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((v87) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            s87 s87Var = this.this$0;
            this.label = 1;
            obj = s87Var.a(this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        hz4 hz4Var = (hz4) obj;
        JsonObject jsonObject = this.$event;
        aq7 aq7Var = this.$metadata;
        hz4Var.getClass();
        JsonObject jsonObjectA = hu4.a(jsonObject, new fu4(hz4Var), aq7Var);
        s87 s87Var2 = this.this$0;
        aq7 aq7Var2 = this.$metadata;
        Configuration configuration = s87Var2.a.getResources().getConfiguration();
        configuration.getClass();
        JsonObject jsonObjectA2 = hu4.a(jsonObjectA, new gu4(hz4Var, configuration), aq7Var2);
        r87 r87Var = (r87) this.this$0.c.getValue();
        r87Var.getClass();
        s64 s64Var = r87Var.b;
        Message messageObtainMessage = s64Var.obtainMessage(0, jsonObjectA2);
        messageObtainMessage.getClass();
        s64Var.sendMessage(messageObtainMessage);
        return j6g.a;
    }
}
