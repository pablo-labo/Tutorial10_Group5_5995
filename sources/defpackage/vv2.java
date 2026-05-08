package defpackage;

import defpackage.sp7;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vv2 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vv2(Function2 function2, g4a g4aVar, g4a g4aVar2) {
        this.a = 2;
        this.b = function2;
        this.d = g4aVar;
        this.c = g4aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                u63.Y((e13) obj3, null, null, new bw2((hee) obj2, null), 3).d0(new zv2(0, (g4a) obj));
                break;
            case 1:
                ((Function2) obj3).invoke((fo7) obj2, (String) obj);
                break;
            case 2:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab-relocation-preference", "save", null, null, 12));
                ((Function2) obj3).invoke((tzc) ((g4a) obj).getValue(), (List) ((g4a) obj2).getValue());
                break;
            default:
                y1e y1eVar = (y1e) obj3;
                gu5 gu5Var = (gu5) obj2;
                bsb bsbVar = new bsb((Function1) obj, 1);
                y1eVar.getClass();
                gu5Var.getClass();
                u63.Y(ee3.p(y1eVar), null, null, new d2e(y1eVar, bsbVar, gu5Var, null), 3);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ vv2(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
