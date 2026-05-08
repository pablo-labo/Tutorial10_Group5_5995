package defpackage;

import android.util.Patterns;
import androidx.fragment.app.g;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.ns7;
import defpackage.ur7;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xv implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xv(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        String str;
        String id;
        String str2;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                iba ibaVar = (iba) obj3;
                g4a g4aVar = (g4a) obj2;
                g4a g4aVar2 = (g4a) obj;
                if (Patterns.WEB_URL.matcher(String.valueOf((String) g4aVar.getValue())).matches() || (str = (String) g4aVar.getValue()) == null || str.length() == 0) {
                    g4aVar2.setValue(Boolean.FALSE);
                    ibaVar.p("DATE_PUBLISHED");
                } else {
                    g4aVar2.setValue(Boolean.TRUE);
                }
                break;
            case 1:
                Function2 function2 = (Function2) obj2;
                EventRecord eventRecord = (EventRecord) obj;
                ConversationRecord conversationRecord = ((x1e) obj3).a;
                if (conversationRecord != null && (id = conversationRecord.getId()) != null) {
                    function2.invoke(id, eventRecord.getId());
                }
                break;
            case 2:
                ((g4a) obj2).setValue(j7f.b);
                u63.Y((e13) obj3, null, null, new q7a((e2b) obj, null), 3);
                break;
            default:
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU = ((g) obj3).u();
                lr5VarU.getClass();
                ns7.d dVar = new ns7.d(null, new f0c((wu5) obj, 1));
                lu0 lu0Var = (lu0) z92.Q0(((svb) obj2).C);
                if (lu0Var == null || (str2 = lu0Var.a) == null) {
                    str2 = "";
                }
                vr7Var.e(lr5VarU, "ProfileUIPlatformDebugScreen", dVar, new ur7.c(str2));
                break;
        }
        return j6g.a;
    }
}
