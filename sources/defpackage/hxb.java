package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hxb implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hxb(int i, gu5 gu5Var, e eVar, String str) {
        this.d = eVar;
        this.e = str;
        this.b = gu5Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        gu5 gu5Var = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                qxb.d(gu5Var, (gu5) obj4, (svb) obj3, (b) obj, ka2.L(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iL = ka2.L(i2 | 1);
                q9f.d(iL, gu5Var, (b) obj, (e) obj4, (String) obj3);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ hxb(gu5 gu5Var, gu5 gu5Var2, svb svbVar, int i) {
        this.b = gu5Var;
        this.d = gu5Var2;
        this.e = svbVar;
        this.c = i;
    }
}
