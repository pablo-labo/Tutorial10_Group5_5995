package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.tare.TarePluginManager$notifyUserDidLogout$1", f = "TarePluginManager.kt", l = {104}, m = "invokeSuspend")
public final class c9f extends c1f implements wu5<e13, jr7, lu2<? super j6g>, Object> {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        jr7 jr7Var = (jr7) this.L$0;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            this.L$0 = null;
            this.label = 1;
            Object objB = jr7Var.b(this);
            g13 g13Var = g13.a;
            if (objB == g13Var) {
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

    @Override // defpackage.wu5
    public final Object q(e13 e13Var, jr7 jr7Var, lu2<? super j6g> lu2Var) {
        c9f c9fVar = new c9f(3, lu2Var);
        c9fVar.L$0 = jr7Var;
        return c9fVar.invokeSuspend(j6g.a);
    }
}
