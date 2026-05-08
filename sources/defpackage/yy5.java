package defpackage;

import androidx.navigation.k;
import androidx.navigation.l;
import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class yy5 extends mj8 implements Function1 {
    public static final yy5 b;
    public static final yy5 c;
    public static final yy5 d;
    public static final yy5 e;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new yy5(i, 0);
        c = new yy5(i, 1);
        d = new yy5(i, 2);
        e = new yy5(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yy5(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((lx5.b) obj).getClass();
                break;
            case 1:
                k kVar = (k) obj;
                kVar.getClass();
                if (kVar instanceof l) {
                    l lVar = (l) kVar;
                }
                break;
            case 2:
                pm8 pm8Var = (pm8) obj;
                if (pm8Var.d()) {
                    pm8Var.i0(false);
                }
                break;
            default:
                qf8<Object>[] qf8VarArr = o5e.a;
                r5e<Boolean> r5eVar = k5e.l;
                qf8<Object> qf8Var = o5e.a[5];
                ((s5e) obj).a(r5eVar, Boolean.TRUE);
                break;
        }
        return j6g.a;
    }
}
