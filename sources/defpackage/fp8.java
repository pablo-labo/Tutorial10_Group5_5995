package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fp8 extends qv5 implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fp8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                n8a n8aVar = (n8a) obj;
                n8aVar.getClass();
                gp8 gp8Var = (gp8) this.receiver;
                int i = gp8.v;
                return gp8Var.O(n8aVar);
            default:
                ((g3a) this.receiver).j((String) obj);
                return j6g.a;
        }
    }
}
