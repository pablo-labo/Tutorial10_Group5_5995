package defpackage;

import android.content.Context;
import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lu implements gu5 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ g4a b;
    public final /* synthetic */ vu5 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lu(gu5 gu5Var, e13 e13Var, String str, g4a g4aVar, Context context, String str2) {
        this.c = gu5Var;
        this.d = e13Var;
        this.e = str;
        this.b = g4aVar;
        this.f = context;
        this.V = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.V;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        vu5 vu5Var = this.c;
        switch (i) {
            case 0:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-patent", "save", null, null, 12));
                String str = (String) this.b.getValue();
                String str2 = (String) ((g4a) obj4).getValue();
                ((Function1) vu5Var).invoke(new n5b((tg3) ((g4a) obj).getValue(), (String) ((g4a) obj3).getValue(), str, str2, (String) ((g4a) obj2).getValue(), 1));
                break;
            default:
                c05.a.invoke(tx5.k(c05.b, "myjobs_native_screen", "shareHiredShareButton", null, 12));
                ((gu5) vu5Var).invoke();
                g4a g4aVar = this.b;
                u63.Y((e13) obj4, null, null, new hi6((String) obj3, g4aVar, (Context) obj2, (String) obj, null), 3);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ lu(Function1 function1, g4a g4aVar, g4a g4aVar2, g4a g4aVar3, g4a g4aVar4, g4a g4aVar5) {
        this.c = function1;
        this.b = g4aVar;
        this.d = g4aVar2;
        this.e = g4aVar3;
        this.f = g4aVar4;
        this.V = g4aVar5;
    }
}
