package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", l = {112}, m = "updateConfigValue")
public final class kbe<T> extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ jbe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbe(jbe jbeVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = jbeVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, this);
    }
}
