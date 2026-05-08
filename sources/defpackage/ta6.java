package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ta6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ ta6(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.c("launchedFromRegPromo", Boolean.valueOf(z));
                break;
            default:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.j(s5eVar, z);
                break;
        }
        return j6g.a;
    }
}
