package defpackage;

import androidx.compose.runtime.b;
import defpackage.zg6;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ni3 implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ni3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.V = obj5;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                List list = (List) this.c;
                Function1 function1 = (Function1) this.d;
                Function1 function12 = (Function1) this.e;
                ljg ljgVar = (ljg) this.f;
                ((Integer) obj2).getClass();
                oi3.b(ka2.L(this.b | 1), (gu5) this.V, ljgVar, (b) obj, list, function1, function12);
                break;
            default:
                ((Integer) obj2).getClass();
                o4f.a((tg2) this.c, (zg6.c) this.d, (String) this.e, (zg6.d) this.f, (String) this.V, (b) obj, ka2.L(this.b | 1));
                break;
        }
        return j6g.a;
    }
}
