package defpackage;

import android.view.View;
import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dr implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vu5 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ dr(vu5 vu5Var, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = vu5Var;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        vu5 vu5Var = this.b;
        switch (i) {
            case 0:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-language", "save", null, null, 12));
                ((Function1) vu5Var).invoke(new wj8(33, (String) null, (String) ((g4a) obj4).getValue(), (String) ((g4a) obj3).getValue(), (String) ((g4a) obj2).getValue(), (String) ((g4a) obj).getValue()));
                break;
            default:
                fm5 fm5Var = (fm5) obj3;
                View view = (View) obj2;
                sm5 sm5Var = (sm5) obj;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("messagingReportSpam", "reportSpam", null, null, 12));
                ((gu5) vu5Var).invoke();
                if (((f3d) obj4).b == null) {
                    fm5Var.t(true);
                    view.post(new sm3(sm5Var, 4));
                }
                break;
        }
        return j6g.a;
    }
}
