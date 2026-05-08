package defpackage;

import androidx.compose.runtime.b;
import defpackage.y74;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gkd implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gkd(Object obj, Object obj2, Function2 function2, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.b = function2;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Function2<? super b, ? super Integer, j6g> function2 = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((hkd) obj4).d(obj3, function2, (b) obj, ka2.L(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                g4f.b((y74.c) obj4, (y74.d) obj3, function2, (b) obj, ka2.L(i2 | 1));
                break;
        }
        return j6g.a;
    }
}
