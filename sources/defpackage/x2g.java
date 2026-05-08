package defpackage;

import com.indeed.android.myjobs.data.remote.api.AppstatusJobsService;

/* JADX INFO: loaded from: classes2.dex */
public final class x2g extends mj8 implements gu5<AppstatusJobsService> {
    final /* synthetic */ xh8 $this_inject;
    final /* synthetic */ a9c $qualifier = null;
    final /* synthetic */ gu5 $parameters = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2g(v2g v2gVar) {
        super(0);
        this.$this_inject = v2gVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.indeed.android.myjobs.data.remote.api.AppstatusJobsService, java.lang.Object] */
    @Override // defpackage.gu5
    public final AppstatusJobsService invoke() {
        xh8 xh8Var = this.$this_inject;
        a9c a9cVar = this.$qualifier;
        return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(AppstatusJobsService.class), a9cVar);
    }
}
