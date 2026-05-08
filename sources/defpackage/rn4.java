package defpackage;

import defpackage.sp7;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rn4 implements gu5 {
    public final /* synthetic */ g4a V;
    public final /* synthetic */ Object W;
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ g4a b;
    public final /* synthetic */ g4a c;
    public final /* synthetic */ g4a d;
    public final /* synthetic */ g4a e;
    public final /* synthetic */ g4a f;

    public /* synthetic */ rn4(g4a g4aVar, g4a g4aVar2, g4a g4aVar3, g4a g4aVar4, g4a g4aVar5, g4a g4aVar6, g4a g4aVar7, g4a g4aVar8) {
        this.b = g4aVar;
        this.c = g4aVar2;
        this.d = g4aVar3;
        this.e = g4aVar4;
        this.f = g4aVar5;
        this.V = g4aVar6;
        this.W = g4aVar7;
        this.X = g4aVar8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.X;
        Object obj2 = this.W;
        g4a g4aVar = this.V;
        g4a g4aVar2 = this.f;
        g4a g4aVar3 = this.e;
        g4a g4aVar4 = this.d;
        g4a g4aVar5 = this.c;
        g4a g4aVar6 = this.b;
        switch (i) {
            case 0:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-edit-work-experience", "save", null, null, 12));
                ((Function1) obj2).invoke(new g2h((String) obj, (String) g4aVar6.getValue(), (String) g4aVar5.getValue(), (Locale) g4aVar2.getValue(), (String) g4aVar4.getValue(), (ig3) g4aVar3.getValue(), (String) g4aVar.getValue(), 8));
                break;
            default:
                Boolean bool = Boolean.TRUE;
                g4aVar6.setValue(bool);
                g4aVar5.setValue(bool);
                Boolean bool2 = Boolean.FALSE;
                g4aVar4.setValue(bool2);
                g4aVar3.setValue(bool2);
                g4aVar2.setValue(bool2);
                g4aVar.setValue(bool);
                ((g4a) obj2).setValue(bool2);
                ((g4a) obj).setValue(bool2);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ rn4(Function1 function1, String str, g4a g4aVar, g4a g4aVar2, g4a g4aVar3, g4a g4aVar4, g4a g4aVar5, g4a g4aVar6) {
        this.W = function1;
        this.X = str;
        this.b = g4aVar;
        this.c = g4aVar2;
        this.d = g4aVar3;
        this.e = g4aVar4;
        this.f = g4aVar5;
        this.V = g4aVar6;
    }
}
