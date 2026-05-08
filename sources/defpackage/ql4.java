package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.messaging.data.conversations.ConversationWithDraft;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ql4 implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ql4(t67 t67Var, gu5 gu5Var, Function1 function1, i7d i7dVar, gu5 gu5Var2, gu5 gu5Var3) {
        this.a = 1;
        this.f = t67Var;
        this.b = gu5Var;
        this.c = function1;
        this.V = i7dVar;
        this.d = gu5Var2;
        this.e = gu5Var3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.V;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.b;
        Object obj7 = this.c;
        Object obj8 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                sl4.a((vsb) obj8, (Function1) obj7, (gu5) obj6, (gu5) obj5, (gu5) obj4, (b5g) obj3, (b) obj, ka2.L(1));
                break;
            case 1:
                t67 t67Var = (t67) obj8;
                gu5 gu5Var = (gu5) obj6;
                Function1 function1 = (Function1) obj7;
                i7d i7dVar = (i7d) obj3;
                gu5 gu5Var2 = (gu5) obj5;
                gu5 gu5Var3 = (gu5) obj4;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Boolean bool = t67Var.a;
                    List<ConversationWithDraft> list = t67Var.d;
                    if (wl7.b(bool, Boolean.TRUE) && list.isEmpty()) {
                        bVar.L(45736543);
                        z47.a(0, bVar);
                        bVar.F();
                    } else {
                        bVar.L(45818414);
                        w47 w47Var = t67Var.e;
                        y47.a(gu5Var, function1, w47Var, w47Var == w47.INBOX && !list.isEmpty(), i7dVar, gu5Var2, gu5Var3, bVar, 0);
                        bVar.F();
                    }
                } else {
                    bVar.D();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                nec.c((x1c) obj8, (yvb) obj7, (aub) obj6, (p9d) obj5, (j7d) obj4, (lr5) obj3, (b) obj, ka2.L(14192641));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ ql4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.a = i2;
        this.f = obj;
        this.c = obj2;
        this.b = obj3;
        this.d = obj4;
        this.e = obj5;
        this.V = obj6;
    }
}
