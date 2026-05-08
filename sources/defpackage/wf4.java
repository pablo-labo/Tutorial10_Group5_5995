package defpackage;

import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.sp7;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wf4 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wf4(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj3;
                av8 av8Var = (av8) obj2;
                ((g4a) obj).setValue(Boolean.FALSE);
                function1.invoke(av8Var != null ? av8Var.a : null);
                return j6g.a;
            case 1:
                ((wu5) obj3).q((String) obj2, (String) obj, "stay");
                return j6g.a;
            case 2:
                x1e x1eVar = (x1e) obj3;
                gu5 gu5Var = (gu5) obj2;
                g4a g4aVar = (g4a) obj;
                List<EventRecord.Attachment> list = x1eVar.b;
                int i2 = 0;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((EventRecord.Attachment) it.next()).getStatus() == EventRecord.AttachmentSentStatus.FAILURE && (i2 = i2 + 1) < 0) {
                            u63.n0();
                            throw null;
                        }
                    }
                }
                final int size = x1eVar.b.size();
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("messagingConversation", "sendMessage", null, new Function1() { // from class: sq9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        hr7 hr7Var = (hr7) obj4;
                        hr7Var.getClass();
                        hr7Var.c(Integer.valueOf(size), "nbAttachments");
                        return j6g.a;
                    }
                }, 4));
                if (i2 > 0) {
                    g4aVar.setValue(Boolean.TRUE);
                } else {
                    gu5Var.invoke();
                }
                return j6g.a;
            default:
                return x7b.j((x7b) obj3, (rc3) obj2, (BigInteger) obj);
        }
    }
}
