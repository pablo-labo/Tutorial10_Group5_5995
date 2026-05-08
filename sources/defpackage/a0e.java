package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.fragment.app.g;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.sp7;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a0e implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a0e(int i, gu5 gu5Var, List list, Function1 function1) {
        this.b = list;
        this.c = gu5Var;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                g gVar = (g) obj5;
                y1e y1eVar = (y1e) obj4;
                iba ibaVar = (iba) obj3;
                EventRecord eventRecord = (EventRecord) obj;
                EventRecord.Attachment attachment = (EventRecord.Attachment) obj2;
                eventRecord.getClass();
                attachment.getClass();
                String fileExtensionTrimmed = attachment.getFileExtensionTrimmed();
                String string = eventRecord.getSenderRole().toString();
                fileExtensionTrimmed.getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("messagingConversation", "attachmentCard", null, new xq9(fileExtensionTrimmed, string, 0), 4));
                if (gVar != null) {
                    y1eVar.l(gVar, eventRecord.getId(), attachment, new bs(ibaVar, 7));
                }
                break;
            default:
                ((Integer) obj2).getClass();
                int iL = ka2.L(1);
                yye.b((List) obj5, (gu5) obj4, (Function1) obj3, e.a.b, (b) obj, iL);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ a0e(g gVar, y1e y1eVar, iba ibaVar) {
        this.b = gVar;
        this.c = y1eVar;
        this.d = ibaVar;
    }
}
