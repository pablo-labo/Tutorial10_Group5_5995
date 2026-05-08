package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fu9 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fu9(Integer num, String str, String str2, String str3, int i) {
        this.d = num;
        this.b = str;
        this.c = str2;
        this.e = str3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(1);
                hu9.a(this.b, this.c, (gu5) obj4, (e) obj3, (b) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = ka2.L(1);
                jyg.a((Integer) obj4, this.b, this.c, (String) obj3, (b) obj, iL2);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ fu9(String str, String str2, gu5 gu5Var, e eVar, int i) {
        this.b = str;
        this.c = str2;
        this.d = gu5Var;
        this.e = eVar;
    }
}
