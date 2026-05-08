package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lo0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ lo0(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        String str = this.b;
        b bVar = (b) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                wo0.b(str, bVar, ka2.L(1));
                break;
            case 1:
                e59.a(str, bVar, ka2.L(49));
                break;
            default:
                xra.a(str, bVar, ka2.L(1));
                break;
        }
        return j6g.a;
    }
}
