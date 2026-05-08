package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s54 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ s54(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.b;
        s5e s5eVar = (s5e) obj;
        switch (i) {
            case 0:
                s5eVar.getClass();
                o5e.h(s5eVar, str);
                break;
            default:
                s5eVar.getClass();
                o5e.f(s5eVar, str);
                break;
        }
        return j6g.a;
    }
}
