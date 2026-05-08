package defpackage;

import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d74 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ d74(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(null);
                break;
            default:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab", "minimum-pay-preference", null, null, 12));
                function1.invoke(pjb.d);
                break;
        }
        return j6g.a;
    }
}
