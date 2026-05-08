package defpackage;

import defpackage.sp7;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oy4 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ oy4(wu5 wu5Var, g4a g4aVar, g4a g4aVar2, g4a g4aVar3) {
        this.a = 2;
        this.b = wu5Var;
        this.d = g4aVar;
        this.e = g4aVar2;
        this.c = g4aVar3;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                u63.Y((e13) obj4, null, null, new wy4((ss8) obj, (g4a) obj3, (g4a) obj2, null), 3);
                break;
            case 1:
                lcf lcfVar = (lcf) obj4;
                Function1 function1 = (Function1) obj;
                Function1 function12 = (Function1) obj3;
                jhf jhfVar = (jhf) obj2;
                lcf lcfVar2 = lcf.c;
                lcf lcfVar3 = lcf.b;
                if (lcfVar == lcfVar3) {
                    function1.invoke(lcfVar2);
                    pcf.c(function12, jhfVar, lcfVar3, lcfVar2);
                } else {
                    function1.invoke(lcfVar3);
                    pcf.c(function12, jhfVar, lcfVar2, lcfVar3);
                }
                break;
            default:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("work-schedule-preference", "save", null, null, 12));
                ((wu5) obj4).q((List) ((g4a) obj3).getValue(), (List) ((g4a) obj2).getValue(), (List) ((g4a) obj).getValue());
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ oy4(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
