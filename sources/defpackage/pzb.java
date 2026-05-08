package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pzb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ gu5 d;

    public /* synthetic */ pzb(String str, boolean z, gu5 gu5Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = z;
        this.d = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        gu5 gu5Var = this.d;
        boolean z = this.c;
        String str = this.b;
        b bVar = (b) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                q1c.c(ka2.L(49), gu5Var, bVar, str, z);
                break;
            default:
                x9f.a(ka2.L(391), gu5Var, bVar, str, z);
                break;
        }
        return j6g.a;
    }
}
