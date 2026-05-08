package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ux4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ ux4(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("subTabName", str);
                break;
            case 2:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                if (str != null && str.length() != 0) {
                    o5e.a(s5eVar, str);
                }
                break;
            case 3:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                o5e.f(s5eVar2, str);
                break;
            case 4:
                hr7 hr7Var = (hr7) obj;
                hr7Var.getClass();
                hr7Var.a("fromScreenName", str);
                break;
            case 5:
                s5e s5eVar3 = (s5e) obj;
                s5eVar3.getClass();
                o5e.f(s5eVar3, str);
                break;
            case 6:
                s5e s5eVar4 = (s5e) obj;
                s5eVar4.getClass();
                o5e.f(s5eVar4, str);
                break;
            default:
                lx5.b bVar2 = (lx5.b) obj;
                bVar2.getClass();
                bVar2.a("hostScreen", str);
                break;
        }
        return j6g.a;
    }
}
