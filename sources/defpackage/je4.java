package defpackage;

import androidx.compose.runtime.b;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class je4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ je4(tg2 tg2Var, Map map, int i, int i2) {
        this.a = 0;
        this.c = tg2Var;
        this.d = map;
        this.b = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                le4.b((tg2) this.c, (Map) this.d, (b) obj, ka2.L(1), this.b);
                break;
            case 1:
                ((Integer) obj2).intValue();
                jl6.b((gu5) this.c, (gu5) this.d, (b) obj, ka2.L(this.b | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                q6c.a((Function1) this.c, (svb) this.d, (b) obj, ka2.L(this.b | 1));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ je4(int i, int i2, vu5 vu5Var, Object obj) {
        this.a = i2;
        this.c = vu5Var;
        this.d = obj;
        this.b = i;
    }
}
