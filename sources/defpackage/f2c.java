package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileViewModel$getProfileShareLink$1", f = "ProfileViewModel.kt", l = {184}, m = "invokeSuspend")
public final class f2c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ x1c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2c(x1c x1cVar, lu2<? super f2c> lu2Var) {
        super(2, lu2Var);
        this.this$0 = x1cVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new f2c(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((f2c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        String str;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            x1c x1cVar = this.this$0;
            zcd zcdVar = x1cVar.c;
            String str2 = x1cVar.m().b;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = this.this$0.m().c;
            String str4 = str3 != null ? str3 : "";
            this.L$0 = "https://profile.indeed.com/";
            this.label = 1;
            obj = zcdVar.F(str2, str4, this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
            str = "https://profile.indeed.com/";
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$0;
            r7d.b(obj);
        }
        String str5 = (String) obj;
        if (str5 == null) {
            ((gme) this.this$0.Y).setValue(b5g.c);
        } else {
            this.this$0.Z.k(new jz2<>(z3.m(zve.u0(str, '/'), "/p/", str5)));
        }
        return j6g.a;
    }
}
