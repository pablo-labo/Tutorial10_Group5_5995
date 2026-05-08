package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.launch.LaunchViewModel$loadProctor$1$1", f = "LaunchViewModel.kt", l = {102}, m = "invokeSuspend")
public final class fl8 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ gl8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl8(gl8 gl8Var, lu2<? super fl8> lu2Var) {
        super(2, lu2Var);
        this.this$0 = gl8Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new fl8(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((fl8) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            gl8 gl8Var = this.this$0;
            this.label = 1;
            nig nigVar = (nig) gl8Var.e.getValue();
            String string = d93.f().toString();
            string.getClass();
            kea keaVar = kea.JOBSEEKER_MOBILE_APP;
            Object objA = nigVar.a(string, new lea(0), new bj2(7, (byte) 0), new zw(15), new lz(14), this);
            g13 g13Var = g13.a;
            if (objA != g13Var) {
                objA = j6g.a;
            }
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
