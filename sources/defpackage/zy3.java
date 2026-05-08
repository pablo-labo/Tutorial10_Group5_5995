package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zy3 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zy3(az3 az3Var, qh7 qh7Var, o3a o3aVar, int i) {
        this.c = az3Var;
        this.d = qh7Var;
        this.e = o3aVar;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.e;
        int i2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                qh7 qh7Var = (qh7) obj3;
                o3a o3aVar = (o3a) obj2;
                if (obj == ((az3) obj4)) {
                    r6.g("A derived state calculation cannot read itself");
                    return null;
                }
                if (obj instanceof pse) {
                    int i3 = qh7Var.a - i2;
                    int iD = o3aVar.d(obj);
                    o3aVar.h(Math.min(i3, iD >= 0 ? o3aVar.c[iD] : Integer.MAX_VALUE), obj);
                }
                return j6g.a;
            default:
                y3b y3bVar = (y3b) obj;
                y3bVar.getClass();
                y3bVar.b("which", ((nxg) obj4).a());
                y3bVar.a(1L, "is_for_main_frame");
                y3bVar.b("url", (String) obj3);
                y3bVar.a(i2, "error_code");
                y3bVar.b("error_description", (String) obj2);
                return j6g.a;
        }
    }

    public /* synthetic */ zy3(nxg nxgVar, String str, int i, String str2) {
        this.c = nxgVar;
        this.d = str;
        this.b = i;
        this.e = str2;
    }
}
