package defpackage;

import android.content.Context;
import android.net.Uri;
import defpackage.sp7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v41 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v41(bd0 bd0Var, Function2 function2, Function1 function1) {
        this.a = 1;
        this.c = bd0Var;
        this.d = function2;
        this.b = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj4;
                g4a g4aVar = (g4a) obj3;
                String str = (String) obj;
                str.getClass();
                ((g4a) obj2).setValue(Boolean.valueOf(v1c.h(str)));
                String str2 = ((jhf) g4aVar.getValue()).a.b;
                g4aVar.setValue(jhf.b((jhf) g4aVar.getValue(), str));
                if (!str.equals(str2)) {
                    function1.invoke(str);
                }
                break;
            case 1:
                Function2 function2 = (Function2) obj3;
                Function1 function12 = (Function1) obj4;
                String str3 = (String) obj;
                hvb hvbVar = hvb.f;
                if (str3 != null) {
                    ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab", "edit-certification", null, null, 12));
                    function2.invoke(hvbVar, str3);
                } else {
                    ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab", "add-certification", null, null, 12));
                    function12.invoke(hvbVar);
                }
                break;
            default:
                y1e y1eVar = (y1e) obj4;
                Context context = (Context) obj2;
                iba ibaVar = (iba) obj3;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    y1eVar.getClass();
                    context.getClass();
                    u63.Y(ee3.p(y1eVar), null, null, new e2e(context, uri, y1eVar, null), 3);
                    ibaVar.r();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ v41(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
