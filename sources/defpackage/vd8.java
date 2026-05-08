package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class vd8 implements gu5 {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;

    public /* synthetic */ vd8(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                rlg rlgVar = ((hv1) obj).i().get(i2);
                rlgVar.getClass();
                return rlgVar;
            default:
                ((Function1) obj).invoke(Integer.valueOf(i2));
                return j6g.a;
        }
    }
}
