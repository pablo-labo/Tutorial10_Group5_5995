package defpackage;

import androidx.fragment.app.g;
import com.indeed.android.messaging.data.conversations.model.SuggestedMessageModel;
import defpackage.ns7;
import defpackage.ur7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y00 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y00(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        String str;
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((g4a) obj).setValue((SuggestedMessageModel) obj3);
                ((g4a) obj2).setValue(Boolean.TRUE);
                break;
            case 1:
                Function1 function1 = (Function1) obj3;
                r6c r6cVar = (r6c) obj2;
                ((g4a) obj).setValue(Boolean.FALSE);
                function1.invoke(r6cVar != null ? r6cVar.a : null);
                break;
            case 2:
                ss8 ss8Var = (ss8) obj;
                yr8 yr8Var = (yr8) ((az3) obj3).getValue();
                break;
            case 3:
                svb svbVar = (svb) obj;
                wu5 wu5Var = (wu5) obj2;
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU = ((g) obj3).u();
                lr5VarU.getClass();
                p6c p6cVar = (p6c) z92.Q0(svbVar.n);
                ns7.h hVar = new ns7.h(p6cVar != null ? jsb.i(p6cVar) : null, new rzb(wu5Var, 1));
                p6c p6cVar2 = (p6c) z92.Q0(svbVar.n);
                if (p6cVar2 == null || (str = p6cVar2.a) == null) {
                    str = "";
                }
                vr7Var.e(lr5VarU, "ProfileUIPlatformDebugScreen", hVar, new ur7.c(str));
                break;
            default:
                vje.f((gu5) obj3, (g4a) obj, (Function1) obj2);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ y00(vu5 vu5Var, Object obj, g4a g4aVar, int i) {
        this.a = i;
        this.c = vu5Var;
        this.d = obj;
        this.b = g4aVar;
    }
}
