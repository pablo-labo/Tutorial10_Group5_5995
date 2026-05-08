package defpackage;

import defpackage.e12;
import defpackage.sp7;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z02 implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z02(bd0 bd0Var, Function2 function2, Function1 function1) {
        this.d = bd0Var;
        this.b = function2;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.c;
        Function2 function2 = this.b;
        switch (i) {
            case 0:
                i12 i12Var = (i12) this.d;
                ls8 ls8Var = (ls8) obj;
                ls8Var.getClass();
                List<n97> list = i12Var.f;
                ls8Var.c(list.size(), null, new e12.a(list), new ah2(2039820996, new e12.b(list, i12Var, function1, function2), true));
                break;
            default:
                String str = (String) obj;
                hvb hvbVar = hvb.e;
                if (str != null) {
                    ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab", "edit-award", null, null, 12));
                    function2.invoke(hvbVar, str);
                } else {
                    ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab", "add-award", null, null, 12));
                    function1.invoke(hvbVar);
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ z02(i12 i12Var, Function1 function1, Function2 function2) {
        this.d = i12Var;
        this.c = function1;
        this.b = function2;
    }
}
