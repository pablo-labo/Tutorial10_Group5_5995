package com.indeed.android.messaging.data.conversations;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.ak2;
import defpackage.gy2;
import defpackage.jk8;
import defpackage.jv2;
import defpackage.qy2;
import defpackage.r29;
import defpackage.rd7;
import defpackage.rx7;
import defpackage.t92;
import defpackage.w47;
import defpackage.wl7;
import defpackage.z92;
import defpackage.zr4;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/Mapper;", "", "<init>", "()V", "Lrx7;", "job", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord$ConversationJobData;", "mapJob", "(Lrx7;)Lcom/indeed/android/messaging/data/conversations/ConversationRecord$ConversationJobData;", "", "getCompanyRating", "(Lrx7;)Ljava/lang/Float;", "", "Ljv2$f;", "scope", "", "getAdvertiserKey", "(Ljava/util/List;)Ljava/lang/String;", "Ljv2;", "result", "Lkotlin/Pair;", "Lr29;", "", "getConversationLockedStatus", "(Ljv2;)Lkotlin/Pair;", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord;", "mapToConversationRecord", "(Ljv2;)Lcom/indeed/android/messaging/data/conversations/ConversationRecord;", "conversationId", "Lrd7$c;", "data", "mapToInitiateConversationRecord", "(Ljava/lang/String;Lrx7;Lrd7$c;)Lcom/indeed/android/messaging/data/conversations/ConversationRecord;", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Mapper {
    public static final int $stable = 0;
    public static final Mapper INSTANCE = new Mapper();

    private Mapper() {
    }

    private final String getAdvertiserKey(List<jv2.f> scope) {
        Object next;
        List<jv2.f> list = scope;
        if (list != null && !list.isEmpty()) {
            Iterator<T> it = scope.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((jv2.f) next).a == qy2.c) {
                    break;
                }
            }
            jv2.f fVar = (jv2.f) next;
            if (fVar != null) {
                return fVar.b;
            }
        }
        return null;
    }

    private final Float getCompanyRating(rx7 job) {
        rx7.d dVar;
        rx7.k kVar;
        rx7.i iVar;
        rx7.h hVar;
        Double d;
        if (job == null || (dVar = job.f) == null || (kVar = dVar.b) == null || (iVar = kVar.a) == null || (hVar = iVar.a) == null || (d = hVar.a) == null) {
            return null;
        }
        float fDoubleValue = (float) d.doubleValue();
        if (fDoubleValue > 0.0f) {
            return Float.valueOf(fDoubleValue);
        }
        return null;
    }

    private final Pair<r29, Long> getConversationLockedStatus(jv2 result) {
        Object next;
        Date date;
        ArrayList arrayList = result.i;
        Long lValueOf = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (wl7.b(((jv2.c) next).a, Boolean.TRUE)) {
                break;
            }
        }
        jv2.c cVar = (jv2.c) next;
        if (cVar == null) {
            cVar = (jv2.c) z92.Q0(z92.p1(arrayList, new Comparator() { // from class: com.indeed.android.messaging.data.conversations.Mapper$getConversationLockedStatus$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ak2.i(((jv2.c) t2).c, ((jv2.c) t).c);
                }
            }));
        }
        r29 r29Var = cVar != null ? cVar.b : null;
        if (cVar != null && (date = cVar.c) != null) {
            lValueOf = Long.valueOf(date.getTime());
        }
        return new Pair<>(r29Var, lValueOf);
    }

    private final ConversationRecord.ConversationJobData mapJob(rx7 job) {
        if (job == null) {
            return new ConversationRecord.ConversationJobData((String) null, (String) null, (String) null, (String) null, (List) null, 31, (DefaultConstructorMarker) null);
        }
        String str = job.c;
        String str2 = job.d.a.b;
        String str3 = job.a;
        rx7.b bVar = job.g;
        String str4 = bVar != null ? bVar.a : null;
        ArrayList arrayList = job.h;
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((rx7.a) it.next()).b);
        }
        return new ConversationRecord.ConversationJobData(str, str2, str3, str4, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence mapToConversationRecord$lambda$2(jk8.a aVar) {
        aVar.getClass();
        return aVar.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.indeed.android.messaging.data.conversations.ConversationRecord mapToConversationRecord(defpackage.jv2 r39) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.Mapper.mapToConversationRecord(jv2):com.indeed.android.messaging.data.conversations.ConversationRecord");
    }

    public final ConversationRecord mapToInitiateConversationRecord(String conversationId, rx7 job, rd7.c data) {
        rx7.d dVar;
        rx7.c cVar;
        rx7.f fVar;
        rx7.j jVar;
        conversationId.getClass();
        data.getClass();
        ConversationRecord.ConversationJobData conversationJobDataMapJob = mapJob(job);
        rd7.d dVar2 = data.d;
        String str = dVar2.b;
        gy2 gy2Var = gy2.e;
        String str2 = "";
        String str3 = job != null ? job.e : "";
        Float companyRating = getCompanyRating(job);
        if (job != null && (dVar = job.f) != null && (cVar = dVar.a) != null && (fVar = cVar.a) != null && (jVar = fVar.a) != null) {
            str2 = jVar.b;
        }
        return new ConversationRecord(conversationId, str3, zr4.a, null, null, gy2Var, 0L, "", null, 0, null, null, false, w47.INBOX, null, null, null, dVar2.f, str2, companyRating, conversationJobDataMapJob, str, false, 122648, null);
    }
}
