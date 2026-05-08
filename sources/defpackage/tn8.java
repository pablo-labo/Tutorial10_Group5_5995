package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tn8 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ c d;

    public /* synthetic */ tn8(c cVar, int i, Object obj, int i2, int i3) {
        this.a = i3;
        this.d = cVar;
        this.b = i;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        int i2 = this.b;
        c cVar = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((un8) cVar).h(i2, obj3, (b) obj, ka2.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((bs8) cVar).h(i2, obj3, (b) obj, ka2.L(1));
                break;
        }
        return j6g.a;
    }
}
