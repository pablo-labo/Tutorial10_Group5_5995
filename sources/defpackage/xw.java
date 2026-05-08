package defpackage;

import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xw implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xw(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                f51 f51Var = (f51) obj3;
                List<String> list = (List) obj2;
                String str = (String) obj;
                str.getClass();
                if (c0h.F()) {
                    f51Var.l(str, list);
                } else {
                    f51Var.u(str, list);
                }
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                ((g4a) obj2).setValue(str2);
                qm4.b(in4.b, "");
                ((iba) obj3).p("EDIT_SKILL_EDIT_HOME");
                break;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                ((f51) obj3).y(str3, ((Locale) ((g4a) obj2).getValue()).getCountry());
                break;
            default:
                g4a g4aVar = (g4a) obj2;
                sl8 sl8Var = (sl8) obj;
                sl8Var.getClass();
                g4aVar.setValue(new j94(Math.max(((iy3) obj3).k1((int) (sl8Var.a() & 4294967295L)), ((j94) g4aVar.getValue()).a)));
                break;
        }
        return j6g.a;
    }
}
