package defpackage;

import androidx.navigation.q;
import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class m93 extends mj8 implements Function1 {
    public static final m93 b;
    public static final m93 c;
    public static final m93 d;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new m93(i, 0);
        c = new m93(i, 1);
        d = new m93(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m93(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                float[] fArr = ((if9) obj).a;
                break;
            case 1:
                ((lx5.b) obj).getClass();
                break;
            default:
                q qVar = (q) obj;
                qVar.getClass();
                qVar.c = true;
                break;
        }
        return j6g.a;
    }
}
