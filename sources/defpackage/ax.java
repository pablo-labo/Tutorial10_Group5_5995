package defpackage;

import defpackage.sp7;
import defpackage.ym7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ax implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;
    public final /* synthetic */ g4a c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ax(Object obj, g4a g4aVar, g4a g4aVar2, Object obj2, int i) {
        this.a = i;
        this.d = obj;
        this.b = g4aVar;
        this.c = g4aVar2;
        this.e = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.e;
        g4a g4aVar = this.c;
        g4a g4aVar2 = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-skill", "save", null, null, 12));
                ((Function1) obj2).invoke(new zie(null, (String) g4aVar2.getValue(), (Integer) g4aVar.getValue(), q68.c, false, (String) ((g4a) obj).getValue(), null, null, null, null, 977));
                mx.b(nx.b);
                break;
            default:
                Function1<lx5, j6g> function1 = c05.a;
                c05.a.invoke(tx5.k(c05.b, "myjobs_native_screen", "acceptInvitationModalDismiss", new pu(2, (String) g4aVar2.getValue(), (String) g4aVar.getValue()), 4));
                u63.Y((e13) obj2, null, null, new ym7.e((hw9) obj, null), 3);
                break;
        }
        return j6g.a;
    }
}
