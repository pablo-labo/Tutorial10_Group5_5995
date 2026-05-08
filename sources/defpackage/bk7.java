package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bk7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ gu5 c;

    public /* synthetic */ bk7(String str, gu5 gu5Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        b bVar = (b) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ck7.a(ka2.L(1), this.c, bVar, this.b);
                break;
            default:
                s6d.a(ka2.L(1), this.c, bVar, this.b);
                break;
        }
        return j6g.a;
    }
}
