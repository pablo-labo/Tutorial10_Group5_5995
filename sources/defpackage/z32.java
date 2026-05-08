package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class z32 implements Function1 {
    public static final z32 b = new z32(0);
    public static final z32 c = new z32(1);
    public static final z32 d = new z32(2);
    public final /* synthetic */ int a;

    public /* synthetic */ z32(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((kv5) obj).getClass();
                return null;
            case 1:
                int i = gp8.v;
                ((gv7) obj).getClass();
                return Boolean.valueOf(!r1.b());
            default:
                p7g p7gVar = (p7g) obj;
                p7gVar.getClass();
                return Boolean.valueOf(p7gVar instanceof cjc);
        }
    }
}
