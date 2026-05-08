package defpackage;

import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class asb implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ asb(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab", "commute-time-preference", null, null, 12));
                function1.invoke(pjb.X);
                break;
            case 1:
                function1.invoke(null);
                break;
            default:
                function1.invoke("MaybeNextTime");
                break;
        }
        return j6g.a;
    }
}
