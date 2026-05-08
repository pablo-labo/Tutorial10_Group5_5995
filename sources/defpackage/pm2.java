package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import defpackage.n3f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pm2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pm2(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                rm2.a((i6c) obj4, (Function2) obj3, (b) obj, ka2.L(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                lu6.a((String) obj4, (String) obj3, (b) obj, ka2.L(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                c7d.c((i7d) obj4, (e) obj3, (b) obj, ka2.L(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                v4f.b((n3f.c) obj4, (ah2) obj3, (b) obj, ka2.L(i2 | 1));
                break;
        }
        return j6g.a;
    }
}
