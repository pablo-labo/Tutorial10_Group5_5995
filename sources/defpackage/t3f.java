package defpackage;

import androidx.compose.runtime.b;
import defpackage.gq1;
import defpackage.tq6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t3f implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ Object W;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Enum Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ gu5 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;

    public /* synthetic */ t3f(String str, gq1.c cVar, gq1.d dVar, gu5 gu5Var, Boolean bool, tq6.c cVar2, tq6.c cVar3, boolean z, boolean z2, int i) {
        this.d = str;
        this.V = cVar;
        this.W = dVar;
        this.c = gu5Var;
        this.X = bool;
        this.Y = cVar2;
        this.Z = cVar3;
        this.b = z;
        this.e = z2;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.f;
        Object obj3 = this.Z;
        Enum r4 = this.Y;
        Object obj4 = this.X;
        Object obj5 = this.W;
        Object obj6 = this.V;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(i2 | 1);
                u3f.b(this.d, (gq1.c) obj6, (gq1.d) obj5, this.c, (Boolean) obj4, (tq6.c) r4, (tq6.c) obj3, this.b, this.e, (b) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = ka2.L(i2 | 1);
                jfg.a(this.b, this.c, (Function1) obj6, this.d, (Function1) obj5, (gu5) obj4, this.e, (b5g) r4, (gu5) obj3, (b) obj, iL2);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ t3f(boolean z, gu5 gu5Var, Function1 function1, String str, Function1 function12, gu5 gu5Var2, boolean z2, b5g b5gVar, gu5 gu5Var3, int i) {
        this.b = z;
        this.c = gu5Var;
        this.V = function1;
        this.d = str;
        this.W = function12;
        this.X = gu5Var2;
        this.e = z2;
        this.Y = b5gVar;
        this.Z = gu5Var3;
        this.f = i;
    }
}
