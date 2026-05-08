package defpackage;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import defpackage.d0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.eventlog.AaidIdProvider$retrieveAdvertisingId$2", f = "AaidIdProvider.kt", l = {}, m = "invokeSuspend")
public final class f0 extends c1f implements Function2<e13, lu2<? super d0.a>, Object> {
    int label;

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new f0(2, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super d0.a> lu2Var) {
        return ((f0) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo((Context) d0.d.getValue());
            if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                String id = advertisingIdInfo.getId();
                id.getClass();
                return new d0.a.c(id);
            }
            String id2 = advertisingIdInfo.getId();
            id2.getClass();
            return new d0.a.b(id2);
        } catch (Exception e) {
            return new d0.a.C0203a(e);
        }
    }
}
