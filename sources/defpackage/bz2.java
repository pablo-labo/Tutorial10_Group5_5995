package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.s98;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bz2 {
    public static List a(String str) {
        str.getClass();
        s98.a aVar = s98.d;
        aVar.getClass();
        return (List) aVar.c(qp1.b(new gt0(ConversationRecord.Participant.INSTANCE.serializer(), 0)), str);
    }

    public static List b(String str) {
        str.getClass();
        s98.a aVar = s98.d;
        aVar.getClass();
        return (List) aVar.c(qp1.b(new gt0(EventRecord.Attachment.INSTANCE.serializer(), 0)), str);
    }

    public static List c(String str) {
        str.getClass();
        s98.a aVar = s98.d;
        aVar.getClass();
        return (List) aVar.c(new gt0(mve.a, 0), str);
    }

    public static EventRecord.TimelineModule d(String str) {
        if (str == null) {
            return null;
        }
        s98.a aVar = s98.d;
        aVar.getClass();
        return (EventRecord.TimelineModule) aVar.c(EventRecord.TimelineModule.INSTANCE.serializer(), str);
    }

    public static String e(List list) {
        list.getClass();
        s98.a aVar = s98.d;
        aVar.getClass();
        return aVar.b(new gt0(EventRecord.Attachment.INSTANCE.serializer(), 0), list);
    }
}
