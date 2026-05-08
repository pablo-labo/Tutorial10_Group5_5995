package defpackage;

import androidx.compose.runtime.b;
import defpackage.csf;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v3f implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v3f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
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
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.V;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                w3f.a((String) obj5, (Function1) obj4, (Function1) this.e, (Function1) this.f, (ah2) obj3, (b) obj, ka2.L(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                int iL = ka2.L(i2 | 1);
                Object obj6 = this.e;
                Object obj7 = this.f;
                msf.a((csf) obj5, (csf.d) obj4, obj6, obj7, (jf5) obj3, (b) obj, iL);
                break;
        }
        return j6g.a;
    }
}
