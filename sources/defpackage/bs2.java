package defpackage;

import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bs2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ bs2(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                function1.invoke(str);
                break;
            case 1:
                vnd vndVar = (vnd) obj;
                vndVar.getClass();
                function1.invoke(vndVar);
                break;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(str2);
                break;
            case 3:
                mt9 mt9Var = (mt9) obj;
                mt9Var.getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-edit-military-experience", "save", null, null, 12));
                function1.invoke(mt9Var);
                break;
            default:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(str3);
                break;
        }
        return j6g.a;
    }
}
