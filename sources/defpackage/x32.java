package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class x32 implements Function1 {
    public static final x32 b = new x32(0);
    public static final x32 c = new x32(1);
    public static final x32 d = new x32(2);
    public static final x32 e = new x32(3);
    public static final x32 f = new x32(4);
    public final /* synthetic */ int a;

    public /* synthetic */ x32(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((kv5) obj).getClass();
                return null;
            case 1:
                ((a62) obj).getClass();
                return 0;
            case 2:
                ui8 ui8Var = (ui8) obj;
                ui8Var.getClass();
                return ui8Var.toString();
            case 3:
                in9 in9Var = (in9) obj;
                int i = up8.p;
                in9Var.getClass();
                return in9Var.c();
            default:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
        }
    }
}
