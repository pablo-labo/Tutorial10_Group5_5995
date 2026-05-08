package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vx4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ vx4(String str, int i) {
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
                s5e s5eVar = (s5e) obj;
                o5e.f(s5eVar, str);
                o5e.i(s5eVar, 5);
                break;
            case 2:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                o5e.i(s5eVar2, 0);
                o5e.f(s5eVar2, str);
                break;
            default:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("hostScreen", str);
                break;
        }
        return j6g.a;
    }
}
