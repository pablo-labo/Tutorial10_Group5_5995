package defpackage;

import com.indeed.android.jobsearch.backend.api.notifications.NotificationsRetrofitApiResolver;
import com.indeed.android.jobsearch.backend.tasks.NewNotificationsResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.backend.tasks.NotificationsTasks$getNewNotificationsCount$2", f = "NotificationsTasks.kt", l = {13}, m = "invokeSuspend")
public final class zla extends c1f implements Function1<lu2<? super m6d<NewNotificationsResponse>>, Object> {
    int label;
    final /* synthetic */ ama this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zla(ama amaVar, lu2<? super zla> lu2Var) {
        super(1, lu2Var);
        this.this$0 = amaVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new zla(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super m6d<NewNotificationsResponse>> lu2Var) {
        return ((zla) create(lu2Var)).invokeSuspend(j6g.a);
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
        NotificationsRetrofitApiResolver notificationsRetrofitApiResolverC = this.this$0.c();
        String strA = d93.a();
        this.label = 1;
        Object newNotificationsCount = notificationsRetrofitApiResolverC.getNewNotificationsCount("indeed-jobsearch-android", strA, this);
        g13 g13Var = g13.a;
        return newNotificationsCount == g13Var ? g13Var : newNotificationsCount;
    }
}
