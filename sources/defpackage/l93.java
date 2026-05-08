package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class l93 extends mj8 implements Function1 {
    public static final l93 b;
    public static final l93 c;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new l93(i, 0);
        c = new l93(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l93(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                float[] fArr = ((if9) obj).a;
                break;
            default:
                ((lx5.b) obj).getClass();
                break;
        }
        return j6g.a;
    }
}
