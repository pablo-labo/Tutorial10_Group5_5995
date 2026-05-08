package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q90 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q90(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                y90.a((toa) obj5, (c20) obj4, (ah2) obj3, (b) obj, ka2.L(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                av6.a((String) obj5, (e) obj4, (bv6) obj3, (b) obj, ka2.L(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                uy8.a((List) obj5, (e) obj4, (ah2) obj3, (b) obj, ka2.L(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                hp9.e((List) obj5, (Function1) obj4, (Function1) obj3, (b) obj, ka2.L(i2 | 1));
                break;
        }
        return j6g.a;
    }
}
