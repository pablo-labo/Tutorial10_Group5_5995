package defpackage;

import defpackage.w7g;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kx2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ kx2(String str, int i) {
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
                return j6g.a;
            default:
                ((m74) obj).getClass();
                return new w7g.c(str);
        }
    }
}
