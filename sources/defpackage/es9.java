package defpackage;

import androidx.fragment.app.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.api.messaging.MessagingTasks$requestDownloadWithDownloadManager$1", f = "MessagingTasks.kt", l = {61}, m = "invokeSuspend")
public final class es9 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ g $activity;
    final /* synthetic */ String $fileName;
    final /* synthetic */ Function1<Integer, j6g> $onDownloadFileCallback;
    final /* synthetic */ String $url;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public es9(g gVar, String str, String str2, Function1<? super Integer, j6g> function1, lu2<? super es9> lu2Var) {
        super(2, lu2Var);
        this.$activity = gVar;
        this.$url = str;
        this.$fileName = str2;
        this.$onDownloadFileCallback = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new es9(this.$activity, this.$url, this.$fileName, this.$onDownloadFileCallback, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((es9) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            f1g f1gVar = (f1g) cr8.p(f1g.class);
            g gVar = this.$activity;
            String str = this.$url;
            String str2 = this.$fileName;
            q99 q99Var = new q99(this.$onDownloadFileCallback, 2);
            this.label = 1;
            Object objA = f1gVar.a(gVar, str, str2, q99Var, this);
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
}
