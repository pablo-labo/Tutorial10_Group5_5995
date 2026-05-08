package defpackage;

import com.indeed.android.jsmappservices.bridge.AceNewConversationData;
import defpackage.kv0;
import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mm1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mm1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                AceNewConversationData aceNewConversationData = (AceNewConversationData) obj2;
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("from", (String) obj3);
                String str = aceNewConversationData.a;
                if (str == null) {
                    str = "";
                }
                bVar.a("messageContent", str);
                String str2 = aceNewConversationData.b;
                bVar.a("agentType", str2 != null ? str2 : "");
                return j6g.a;
            case 1:
                a4a a4aVar = (a4a) obj2;
                ((su2) obj3).t(obj);
                if (a4aVar != null) {
                    a4aVar.d(obj);
                }
                return j6g.a;
            case 2:
                hr7 hr7Var = (hr7) obj;
                hr7Var.getClass();
                hr7Var.a("sectionType", (String) obj3);
                hr7Var.a("itemId", (String) obj2);
                return j6g.a;
            default:
                Function1 function1 = (Function1) obj3;
                Function1 function12 = (Function1) obj2;
                kv0.b bVar2 = (kv0.b) obj;
                if (!(bVar2 instanceof kv0.b.c)) {
                    if (bVar2 instanceof kv0.b.d) {
                        if (function1 != null) {
                            function1.invoke(bVar2);
                        }
                    } else if (bVar2 instanceof kv0.b.C0300b) {
                        if (function12 != null) {
                            function12.invoke(bVar2);
                        }
                    } else if (!(bVar2 instanceof kv0.b.a)) {
                        l.g();
                        return null;
                    }
                }
                return j6g.a;
        }
    }
}
