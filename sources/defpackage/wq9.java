package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wq9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ wq9(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                hr7 hr7Var = (hr7) obj;
                hr7Var.getClass();
                hr7Var.a("attachmentType", str);
                break;
            case 1:
                y3b y3bVar = (y3b) obj;
                y3bVar.getClass();
                y3bVar.b("supported", str);
                break;
            case 2:
                hr7 hr7Var2 = (hr7) obj;
                hr7Var2.getClass();
                hr7Var2.a("autoMergeVariant", str);
                break;
            default:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.f(s5eVar, str);
                break;
        }
        return j6g.a;
    }
}
