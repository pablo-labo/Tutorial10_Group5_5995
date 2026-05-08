package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d12 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ d12(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.f(s5eVar, str);
                p5e.a(s5eVar);
                break;
            case 1:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                o5e.f(s5eVar2, str);
                break;
            case 2:
                hr7 hr7Var = (hr7) obj;
                hr7Var.getClass();
                hr7Var.a("fromScreenName", str);
                break;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                if (!zve.U(str2)) {
                    break;
                } else if (str2.length() >= str.length()) {
                    break;
                }
                break;
            case 4:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("hostScreen", str);
                break;
            default:
                s5e s5eVar3 = (s5e) obj;
                o5e.f(s5eVar3, str);
                o5e.i(s5eVar3, 5);
                break;
        }
        return j6g.a;
    }
}
