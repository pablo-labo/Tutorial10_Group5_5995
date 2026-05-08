package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n32 implements Function2 {
    public final /* synthetic */ vu5 V;
    public final /* synthetic */ Object W;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ n32(gu5 gu5Var, e eVar, hee heeVar, String str, boolean z, mzg mzgVar, ah2 ah2Var, int i, int i2) {
        this.V = gu5Var;
        this.b = eVar;
        this.W = heeVar;
        this.c = str;
        this.d = z;
        this.X = mzgVar;
        this.Y = ah2Var;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        Object obj5 = this.W;
        vu5 vu5Var = this.V;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(i2 | 1);
                o32.b(this.d, (Function2) vu5Var, this.c, (String) obj5, this.b, (au6) obj4, (d3a) obj3, (b) obj, iL, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = ka2.L(i2 | 1);
                nx6.a((gu5) vu5Var, this.b, (hee) obj5, this.c, this.d, (mzg) obj4, (ah2) obj3, (b) obj, iL2, this.f);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ n32(boolean z, Function2 function2, String str, String str2, e eVar, au6 au6Var, d3a d3aVar, int i, int i2) {
        this.d = z;
        this.V = function2;
        this.c = str;
        this.W = str2;
        this.b = eVar;
        this.X = au6Var;
        this.Y = d3aVar;
        this.e = i;
        this.f = i2;
    }
}
