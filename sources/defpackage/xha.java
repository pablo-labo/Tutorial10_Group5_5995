package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xha implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ e b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ gu5 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xha(int i, boolean z, gu5 gu5Var, gu5 gu5Var2, e eVar, int i2) {
        this.e = i;
        this.c = z;
        this.d = gu5Var;
        this.f = gu5Var2;
        this.b = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(24577);
                yha.a(this.e, this.c, this.d, (gu5) this.f, this.b, (b) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = ka2.L(1);
                b4g.l(this.b, this.c, (String) this.f, this.d, (b) obj, iL2, this.e);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ xha(e eVar, boolean z, String str, gu5 gu5Var, int i, int i2) {
        this.b = eVar;
        this.c = z;
        this.f = str;
        this.d = gu5Var;
        this.e = i2;
    }
}
