package com.indeed.android.messaging.data.events;

import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.pu2;
import defpackage.r2b;
import defpackage.uh3;
import defpackage.vi5;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\nJ\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\nJ\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\nJ \u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lcom/indeed/android/messaging/data/events/EventDao;", "", "", "conversationId", "Lr2b;", "", "Lcom/indeed/android/messaging/data/events/EventRecord;", "getPagingEvents", "(Ljava/lang/String;)Lr2b;", "getLocalLastEvent", "(Ljava/lang/String;Llu2;)Ljava/lang/Object;", "Lvi5;", "observeLastEvent", "(Ljava/lang/String;)Lvi5;", "", "eventRecords", "Lj6g;", "saveEvent", "(Ljava/util/List;Llu2;)Ljava/lang/Object;", "id", "findById", "countByConversationId", "delete", "Lcom/indeed/android/messaging/data/events/EventRecord$MessageSendStatus;", "status", "updateSendStatus", "(Ljava/lang/String;Lcom/indeed/android/messaging/data/events/EventRecord$MessageSendStatus;Llu2;)Ljava/lang/Object;", "localMessageId", "serverMessageId", "replaceMessage", "(Ljava/lang/String;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EventDao {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static Object replaceMessage(EventDao eventDao, String str, String str2, lu2<? super EventRecord> lu2Var) {
            return EventDao.super.replaceMessage(str, str2, lu2Var);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.events.EventDao$replaceMessage$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.events.EventDao", f = "EventDao.kt", l = {46, 47, 53}, m = "replaceMessage$suspendImpl")
    public static final class AnonymousClass1 extends pu2 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(lu2<? super AnonymousClass1> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventDao.replaceMessage$suspendImpl(EventDao.this, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.Object replaceMessage$suspendImpl(com.indeed.android.messaging.data.events.EventDao r28, java.lang.String r29, java.lang.String r30, defpackage.lu2<? super com.indeed.android.messaging.data.events.EventRecord> r31) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.events.EventDao.replaceMessage$suspendImpl(com.indeed.android.messaging.data.events.EventDao, java.lang.String, java.lang.String, lu2):java.lang.Object");
    }

    Object countByConversationId(String str, lu2<? super Integer> lu2Var);

    Object delete(String str, lu2<? super j6g> lu2Var);

    Object findById(String str, lu2<? super EventRecord> lu2Var);

    Object getLocalLastEvent(String str, lu2<? super EventRecord> lu2Var);

    r2b<Integer, EventRecord> getPagingEvents(String conversationId);

    vi5<EventRecord> observeLastEvent(String conversationId);

    default Object replaceMessage(String str, String str2, lu2<? super EventRecord> lu2Var) {
        return replaceMessage$suspendImpl(this, str, str2, lu2Var);
    }

    Object saveEvent(List<EventRecord> list, lu2<? super j6g> lu2Var);

    Object updateSendStatus(String str, EventRecord.MessageSendStatus messageSendStatus, lu2<? super j6g> lu2Var);
}
