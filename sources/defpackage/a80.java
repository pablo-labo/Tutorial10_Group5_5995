package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.hu8;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a80 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a80(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        dbf dbfVar;
        Object next;
        int i = this.a;
        str = null;
        String str = null;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                mu8 mu8Var = (mu8) obj;
                hu8.a aVar = ((c80) obj5).a;
                mu8Var.h = (jhf) obj6;
                mu8Var.i = (t37) obj4;
                mu8Var.c = (t2d) obj3;
                mu8Var.d = (Function1) obj2;
                mu8Var.e = aVar != null ? aVar.K1() : null;
                mu8Var.f = aVar != null ? aVar.d1() : null;
                mu8Var.g = aVar != null ? aVar.getViewConfiguration() : null;
                break;
            case 1:
                List list = (List) obj6;
                yvb yvbVar = (yvb) obj5;
                iba ibaVar = (iba) obj4;
                g4a g4aVar = (g4a) obj3;
                g4a g4aVar2 = (g4a) obj2;
                zie zieVar = (zie) obj;
                zieVar.getClass();
                qm4.b(in4.c, "");
                String str2 = zieVar.b;
                if (str2 == null) {
                    str2 = "";
                }
                g4aVar.setValue(str2);
                g4aVar2.setValue(zieVar.c);
                if (!wl7.b(zieVar.g, Boolean.TRUE)) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            b42 b42Var = ((zie) next).h;
                            String str3 = b42Var != null ? b42Var.a : null;
                            dbf dbfVar2 = zieVar.i;
                            if (wl7.b(str3, dbfVar2 != null ? dbfVar2.b : null)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    zieVar = (zie) next;
                }
                if (zieVar != null && (dbfVar = zieVar.i) != null) {
                    str = dbfVar.b;
                }
                String str4 = str != null ? str : "";
                if (str4.length() > 0) {
                    yvbVar.s(str4);
                }
                ibaVar.p("EDIT_SKILL_EDIT_HOME");
                break;
            default:
                wu5 wu5Var = (wu5) obj5;
                e13 e13Var = (e13) obj4;
                hee heeVar = (hee) obj3;
                g4a g4aVar3 = (g4a) obj2;
                ((w47) obj).getClass();
                ConversationRecord conversationRecord = (ConversationRecord) ((g4a) obj6).getValue();
                if (conversationRecord != null) {
                    u63.Y(e13Var, null, null, new q67(heeVar, null), 3).d0(new nm1(5, heeVar, g4aVar3));
                    wu5Var.q(conversationRecord, p12.b, new zw(5));
                }
                break;
        }
        return j6g.a;
    }
}
