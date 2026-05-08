package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.services.PreferencesService", f = "PreferencesService.kt", l = {807, 817}, m = "updateMaxCommuteTime")
public final class zkb extends pu2 {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ xkb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zkb(xkb xkbVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = xkbVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.z(0, null, this);
    }
}
