package defpackage;

import defpackage.cv8;
import defpackage.sp7;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cw implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ g4a c;
    public final /* synthetic */ g4a d;
    public final /* synthetic */ g4a e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cw(Function1 function1, g4a g4aVar, g4a g4aVar2, g4a g4aVar3, g4a g4aVar4) {
        this.a = 0;
        this.b = function1;
        this.c = g4aVar;
        this.d = g4aVar2;
        this.e = g4aVar3;
        this.f = g4aVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        g4a g4aVar = this.e;
        g4a g4aVar2 = this.d;
        g4a g4aVar3 = this.c;
        Object obj = this.f;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-publication", "refresh", null, null, 12));
                function1.invoke(new p6c((tg3) ((g4a) obj).getValue(), (String) g4aVar.getValue(), (String) g4aVar3.getValue(), (String) g4aVar2.getValue(), 1));
                break;
            case 1:
                m61 m61Var = (m61) obj;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("edit-award", "refresh", null, null, 12));
                function1.invoke(new m61(m61Var != null ? m61Var.a : null, (tg3) g4aVar2.getValue(), (String) g4aVar.getValue(), (String) g4aVar3.getValue()));
                break;
            case 2:
                hz1 hz1Var = (hz1) obj;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-edit-certification", "refresh", null, null, 12));
                function1.invoke(new hz1(hz1Var != null ? hz1Var.a : null, (String) g4aVar3.getValue(), (ig3) g4aVar2.getValue(), (String) g4aVar.getValue(), 4));
                break;
            default:
                av8 av8Var = (av8) obj;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-edit-nursing-license", "refresh", null, null, 12));
                function1.invoke(new av8(av8Var != null ? av8Var.a : null, (String) g4aVar3.getValue(), (List) null, (cv8.d) null, new cv8.b(null, null, null, null, null, null, null, null, (String) g4aVar.getValue()), (k38) null, (ig3) g4aVar2.getValue(), 172));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ cw(Function1 function1, Object obj, g4a g4aVar, g4a g4aVar2, g4a g4aVar3, int i) {
        this.a = i;
        this.b = function1;
        this.f = obj;
        this.c = g4aVar;
        this.d = g4aVar2;
        this.e = g4aVar3;
    }
}
