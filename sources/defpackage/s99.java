package defpackage;

import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s99 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ s99(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                wj8 wj8Var = (wj8) obj;
                wj8Var.getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-edit-language", "save", null, null, 12));
                function1.invoke(wj8Var);
                break;
            default:
                ((Boolean) obj).booleanValue();
                function1.invoke(tzc.c);
                break;
        }
        return j6g.a;
    }
}
