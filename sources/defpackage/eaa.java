package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eaa implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ eaa(faa faaVar, String str, String str2, int i) {
        this.c = faaVar;
        this.d = str;
        this.e = str2;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((faa) obj5).b((String) obj4, (String) obj3, (b) obj, ka2.L(this.b | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iL = ka2.L(385);
                ((m6f) obj5).E((zrd) obj4, this.b, (ah2) obj3, (b) obj, iL);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ eaa(m6f m6fVar, zrd zrdVar, int i, ah2 ah2Var, int i2) {
        this.c = m6fVar;
        this.d = zrdVar;
        this.b = i;
        this.e = ah2Var;
    }
}
