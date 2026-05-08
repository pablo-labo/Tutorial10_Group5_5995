package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class nz3 implements Function1 {
    public static final nz3 b = new nz3(0);
    public static final nz3 c = new nz3(1);
    public final /* synthetic */ int a;

    public /* synthetic */ nz3(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                int i = pz3.f;
                return "";
            default:
                return ((rlg) obj).getType();
        }
    }
}
