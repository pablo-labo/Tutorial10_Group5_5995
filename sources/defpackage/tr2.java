package defpackage;

import android.content.Context;
import androidx.fragment.app.g;
import defpackage.os7;
import defpackage.sp7;
import defpackage.ur7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tr2 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tr2(g4a g4aVar, String str, Function1 function1) {
        this.a = 3;
        this.b = str;
        this.d = g4aVar;
        this.c = function1;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        String str;
        int i = this.a;
        String str2 = "";
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                gu5 gu5Var = (gu5) obj;
                g4a g4aVar = (g4a) obj2;
                if (((Boolean) ((gu5) obj3).invoke()).booleanValue()) {
                    g4aVar.setValue(Boolean.TRUE);
                } else {
                    gu5Var.invoke();
                }
                break;
            case 1:
                nn2.A((Context) obj3, (String) obj, "\n" + ((String) obj2), true);
                break;
            case 2:
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU = ((g) obj3).u();
                lr5VarU.getClass();
                os7.b bVar = new os7.b(null, new a0c((wu5) obj2, 1));
                wj8 wj8Var = (wj8) z92.Q0(((svb) obj).N);
                if (wj8Var != null && (str = wj8Var.b) != null) {
                    str2 = str;
                }
                vr7Var.b(lr5VarU, bVar, new ur7.c(str2));
                break;
            default:
                ((g4a) obj2).setValue(Boolean.FALSE);
                ((Function1) obj).invoke("");
                ((tp7) cr8.p(tp7.class)).b(new sp7.g((String) obj3, "delete", null, null, 12));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ tr2(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
