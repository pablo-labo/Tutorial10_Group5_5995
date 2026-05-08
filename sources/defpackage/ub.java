package defpackage;

import defpackage.cv8;
import defpackage.sp7;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ub implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ub(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-accounting-license", "save", null, null, 12));
                ((Function1) obj4).invoke(new av8((String) null, (String) ((g4a) obj3).getValue(), (List) null, (cv8.d) null, new cv8.b(null, null, null, null, null, null, null, null, (String) ((g4a) obj2).getValue()), k38.c, (ig3) ((g4a) obj).getValue(), 141));
                break;
            default:
                hne hneVar = (hne) obj4;
                gu5 gu5Var = (gu5) obj3;
                ra9 ra9Var = (ra9) obj2;
                String str = (String) obj;
                if (hneVar != null) {
                    hneVar.c();
                }
                gu5Var.invoke();
                ra9Var.a(str);
                break;
        }
        return j6g.a;
    }
}
