package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class zz3 implements Function1 {
    public static final zz3 b = new zz3(0);
    public static final zz3 c = new zz3(1);
    public final /* synthetic */ int a;

    public /* synthetic */ zz3(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                aj3 aj3Var = (aj3) obj;
                int i = b04.a;
                aj3Var.getClass();
                return aj3Var.d();
            default:
                ((n8a) obj).getClass();
                return Boolean.TRUE;
        }
    }
}
