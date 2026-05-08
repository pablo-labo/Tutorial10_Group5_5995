package defpackage;

import android.content.res.Configuration;
import android.os.Message;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.eventlog.IndeedEventLogging$emitAvro$1", f = "IndeedEventLogging.kt", l = {137}, m = "invokeSuspend")
public final class u87 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Object $event;
    int label;
    final /* synthetic */ s87 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u87(s87 s87Var, Object obj, lu2<? super u87> lu2Var) {
        super(2, lu2Var);
        this.this$0 = s87Var;
        this.$event = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [cpe, java.lang.Object] */
    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new u87(this.this$0, this.$event, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((u87) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [cpe, java.lang.Object] */
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
        ?? r0 = this.$event;
        s87 s87Var2 = this.this$0;
        hz4Var.getClass();
        hu4.b(r0, new fu4(hz4Var));
        Configuration configuration = s87Var2.a.getResources().getConfiguration();
        configuration.getClass();
        hu4.b(r0, new gu4(hz4Var, configuration));
        r87 r87Var = (r87) this.this$0.c.getValue();
        Object obj2 = this.$event;
        r87Var.getClass();
        obj2.getClass();
        s64 s64Var = r87Var.b;
        Message messageObtainMessage = s64Var.obtainMessage(0, obj2);
        messageObtainMessage.getClass();
        s64Var.sendMessage(messageObtainMessage);
        return j6g.a;
    }
}
