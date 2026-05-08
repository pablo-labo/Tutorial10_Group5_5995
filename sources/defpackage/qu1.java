package defpackage;

import defpackage.cfe;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class qu1 implements Function1 {
    public static final qu1 b = new qu1(0);
    public static final qu1 c = new qu1(1);
    public static final qu1 d = new qu1(2);
    public final /* synthetic */ int a;

    public /* synthetic */ qu1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Class cls = (Class) obj;
                kn2 kn2Var = uu1.a;
                cls.getClass();
                return new lf8(cls);
            case 1:
                Class cls2 = (Class) obj;
                cls2.getClass();
                return wuc.b(cls2);
            case 2:
                ((aj3) obj).getClass();
                return Boolean.valueOf(!(r2 instanceof uq2));
            default:
                cfe.a.C0106a c0106a = (cfe.a.C0106a) obj;
                c0106a.getClass();
                String strConcat = "java/util/".concat("Spliterator");
                rw7 rw7Var = zib.b;
                c0106a.c(strConcat, rw7Var, rw7Var);
                return j6g.a;
        }
    }
}
