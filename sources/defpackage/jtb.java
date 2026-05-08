package defpackage;

import defpackage.hva;
import defpackage.lag;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfilePreferencesViewModel$removePreferredMinimumPay$1", f = "ProfilePreferencesViewModel.kt", l = {322}, m = "invokeSuspend")
public final class jtb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ aub this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtb(aub aubVar, lu2<? super jtb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = aubVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new jtb(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((jtb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objB;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            xkb xkbVar = this.this$0.b;
            hva.c cVar = new hva.c(new d68(f68.c, "USD", 0.0d));
            String str = this.this$0.l().o;
            if (str == null) {
                str = "";
            }
            ueg uegVar = new ueg(str, null, null, null, cVar, null, 65406);
            this.label = 1;
            objB = xkbVar.B(uegVar, this);
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
            objB = obj;
        }
        lag.b bVar = (lag.b) objB;
        if (bVar != null) {
            aub aubVar = this.this$0;
            vsb vsbVarL = aubVar.l();
            Double d = bVar.d;
            aubVar.v(vsb.a(vsbVarL, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new zt9(bVar.b, Boolean.FALSE, d, bVar.c), null, null, null, null, null, 2064383));
        }
        return j6g.a;
    }
}
