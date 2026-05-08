package defpackage;

import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gi3 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ gi3(Function1 function1, int i) {
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
            case 1:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab", "work-schedule-preference", null, null, 12));
                function1.invoke(pjb.c);
                break;
            default:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab", "add-skill", null, null, 12));
                function1.invoke(hvb.e0);
                break;
        }
        return j6g.a;
    }
}
