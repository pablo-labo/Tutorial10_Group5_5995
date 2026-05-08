package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qz4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ qz4(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("myjobsPageTk", str);
                break;
            case 1:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.f(s5eVar, str);
                break;
            case 2:
                hr7 hr7Var = (hr7) obj;
                hr7Var.getClass();
                hr7Var.a("fromScreenName", str);
                break;
            default:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                o5e.f(s5eVar2, str);
                p5e.a(s5eVar2);
                break;
        }
        return j6g.a;
    }
}
