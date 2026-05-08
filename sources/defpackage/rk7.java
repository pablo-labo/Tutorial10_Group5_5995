package defpackage;

import androidx.compose.runtime.b;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rk7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rk7(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vk7.c((List) obj6, (e8a) obj5, (mk7) obj4, (ss8) obj3, (b) obj, ka2.L(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                v4f.a((tg2) obj6, (Map) obj5, (String) obj4, (ah2) obj3, (b) obj, ka2.L(i2 | 1));
                break;
        }
        return j6g.a;
    }
}
