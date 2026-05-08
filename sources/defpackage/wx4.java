package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wx4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ wx4(String str, int i) {
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
                s5eVar.getClass();
                o5e.i(s5eVar, 0);
                o5e.f(s5eVar, str);
                break;
            default:
                hr7 hr7Var = (hr7) obj;
                hr7Var.getClass();
                hr7Var.a("attachmentType", str);
                break;
        }
        return j6g.a;
    }
}
