package defpackage;

import com.datadog.android.ndk.internal.NdkCrashLog;
import com.indeed.android.messaging.data.MessagingDatabase_Impl;
import defpackage.efd;
import defpackage.m7f;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class qq9 extends efd {
    public final /* synthetic */ MessagingDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq9(MessagingDatabase_Impl messagingDatabase_Impl) {
        super(24, "eda4c3fd58af1b449f195cfa01a87fa5", "4f16e08f39952c9459545e0bfaa6fde0");
        this.d = messagingDatabase_Impl;
    }

    @Override // defpackage.efd
    public final void a(zhd zhdVar) {
        zhdVar.getClass();
        zkd.y(zhdVar, "CREATE TABLE IF NOT EXISTS `ConversationRecord` (`id` TEXT NOT NULL, `companyName` TEXT NOT NULL, `participants` TEXT NOT NULL, `lastEventId` TEXT, `lastEventType` TEXT, `lastEventSenderRole` TEXT NOT NULL, `lastEventTimestamp` INTEGER NOT NULL, `lastMessagePreview` TEXT NOT NULL, `lastEventAttachmentPreview` TEXT, `unreadCount` INTEGER NOT NULL, `readReceiptCursorTimestamp` INTEGER, `readCursorTimestamp` INTEGER, `awaitingJobSeekerResponse` INTEGER NOT NULL, `folder` TEXT NOT NULL, `conversationContext` TEXT NOT NULL, `lockReason` TEXT, `lockDateTimestamp` INTEGER, `jobSeekerApplicationDateTimestamp` INTEGER, `companyLogoUrl` TEXT NOT NULL, `companyAverageRating` REAL, `advertiserKey` TEXT, `isExisting` INTEGER NOT NULL, `job_title` TEXT, `job_location` TEXT, `job_jobKey` TEXT, `job_compensationFormatted` TEXT, `job_attributes` TEXT NOT NULL, PRIMARY KEY(`id`))");
        zkd.y(zhdVar, "CREATE TABLE IF NOT EXISTS `EventRecord` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `subType` TEXT, `content` TEXT NOT NULL, `isHtmlFormat` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `isLocalMessage` INTEGER NOT NULL, `senderRole` TEXT NOT NULL, `senderAccountKey` TEXT, `conversationId` TEXT NOT NULL, `sendStatus` TEXT, `attachments` TEXT NOT NULL, `timelineModule` TEXT, PRIMARY KEY(`id`))");
        zkd.y(zhdVar, "CREATE TABLE IF NOT EXISTS `DraftRecord` (`conversationId` TEXT NOT NULL, `content` TEXT NOT NULL, `attachments` TEXT NOT NULL, PRIMARY KEY(`conversationId`))");
        zkd.y(zhdVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        zkd.y(zhdVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'eda4c3fd58af1b449f195cfa01a87fa5')");
    }

    @Override // defpackage.efd
    public final void b(zhd zhdVar) {
        zhdVar.getClass();
        zkd.y(zhdVar, "DROP TABLE IF EXISTS `ConversationRecord`");
        zkd.y(zhdVar, "DROP TABLE IF EXISTS `EventRecord`");
        zkd.y(zhdVar, "DROP TABLE IF EXISTS `DraftRecord`");
    }

    @Override // defpackage.efd
    public final void c(zhd zhdVar) {
        zhdVar.getClass();
    }

    @Override // defpackage.efd
    public final void d(zhd zhdVar) {
        zhdVar.getClass();
        this.d.t(zhdVar);
    }

    @Override // defpackage.efd
    public final void e(zhd zhdVar) {
        zhdVar.getClass();
    }

    @Override // defpackage.efd
    public final void f(zhd zhdVar) {
        zhdVar.getClass();
        pg8.n(zhdVar);
    }

    @Override // defpackage.efd
    public final efd.a g(zhd zhdVar) {
        zhdVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new m7f.a(1, 1, "id", "TEXT", null, true));
        linkedHashMap.put("companyName", new m7f.a(0, 1, "companyName", "TEXT", null, true));
        linkedHashMap.put("participants", new m7f.a(0, 1, "participants", "TEXT", null, true));
        linkedHashMap.put("lastEventId", new m7f.a(0, 1, "lastEventId", "TEXT", null, false));
        linkedHashMap.put("lastEventType", new m7f.a(0, 1, "lastEventType", "TEXT", null, false));
        linkedHashMap.put("lastEventSenderRole", new m7f.a(0, 1, "lastEventSenderRole", "TEXT", null, true));
        linkedHashMap.put("lastEventTimestamp", new m7f.a(0, 1, "lastEventTimestamp", "INTEGER", null, true));
        linkedHashMap.put("lastMessagePreview", new m7f.a(0, 1, "lastMessagePreview", "TEXT", null, true));
        linkedHashMap.put("lastEventAttachmentPreview", new m7f.a(0, 1, "lastEventAttachmentPreview", "TEXT", null, false));
        linkedHashMap.put("unreadCount", new m7f.a(0, 1, "unreadCount", "INTEGER", null, true));
        linkedHashMap.put("readReceiptCursorTimestamp", new m7f.a(0, 1, "readReceiptCursorTimestamp", "INTEGER", null, false));
        linkedHashMap.put("readCursorTimestamp", new m7f.a(0, 1, "readCursorTimestamp", "INTEGER", null, false));
        linkedHashMap.put("awaitingJobSeekerResponse", new m7f.a(0, 1, "awaitingJobSeekerResponse", "INTEGER", null, true));
        linkedHashMap.put("folder", new m7f.a(0, 1, "folder", "TEXT", null, true));
        linkedHashMap.put("conversationContext", new m7f.a(0, 1, "conversationContext", "TEXT", null, true));
        linkedHashMap.put("lockReason", new m7f.a(0, 1, "lockReason", "TEXT", null, false));
        linkedHashMap.put("lockDateTimestamp", new m7f.a(0, 1, "lockDateTimestamp", "INTEGER", null, false));
        linkedHashMap.put("jobSeekerApplicationDateTimestamp", new m7f.a(0, 1, "jobSeekerApplicationDateTimestamp", "INTEGER", null, false));
        linkedHashMap.put("companyLogoUrl", new m7f.a(0, 1, "companyLogoUrl", "TEXT", null, true));
        linkedHashMap.put("companyAverageRating", new m7f.a(0, 1, "companyAverageRating", "REAL", null, false));
        linkedHashMap.put("advertiserKey", new m7f.a(0, 1, "advertiserKey", "TEXT", null, false));
        linkedHashMap.put("isExisting", new m7f.a(0, 1, "isExisting", "INTEGER", null, true));
        linkedHashMap.put("job_title", new m7f.a(0, 1, "job_title", "TEXT", null, false));
        linkedHashMap.put("job_location", new m7f.a(0, 1, "job_location", "TEXT", null, false));
        linkedHashMap.put("job_jobKey", new m7f.a(0, 1, "job_jobKey", "TEXT", null, false));
        linkedHashMap.put("job_compensationFormatted", new m7f.a(0, 1, "job_compensationFormatted", "TEXT", null, false));
        linkedHashMap.put("job_attributes", new m7f.a(0, 1, "job_attributes", "TEXT", null, true));
        m7f m7fVar = new m7f("ConversationRecord", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        m7f m7fVarA = m7f.b.a(zhdVar, "ConversationRecord");
        if (!m7fVar.equals(m7fVarA)) {
            return new efd.a(v40.f("ConversationRecord(com.indeed.android.messaging.data.conversations.ConversationRecord).\n Expected:\n", m7fVar, "\n Found:\n", m7fVarA), false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new m7f.a(1, 1, "id", "TEXT", null, true));
        linkedHashMap2.put("type", new m7f.a(0, 1, "type", "TEXT", null, true));
        linkedHashMap2.put("subType", new m7f.a(0, 1, "subType", "TEXT", null, false));
        linkedHashMap2.put("content", new m7f.a(0, 1, "content", "TEXT", null, true));
        linkedHashMap2.put("isHtmlFormat", new m7f.a(0, 1, "isHtmlFormat", "INTEGER", null, true));
        linkedHashMap2.put(NdkCrashLog.TIMESTAMP_KEY_NAME, new m7f.a(0, 1, NdkCrashLog.TIMESTAMP_KEY_NAME, "INTEGER", null, true));
        linkedHashMap2.put("isLocalMessage", new m7f.a(0, 1, "isLocalMessage", "INTEGER", null, true));
        linkedHashMap2.put("senderRole", new m7f.a(0, 1, "senderRole", "TEXT", null, true));
        linkedHashMap2.put("senderAccountKey", new m7f.a(0, 1, "senderAccountKey", "TEXT", null, false));
        linkedHashMap2.put("conversationId", new m7f.a(0, 1, "conversationId", "TEXT", null, true));
        linkedHashMap2.put("sendStatus", new m7f.a(0, 1, "sendStatus", "TEXT", null, false));
        linkedHashMap2.put("attachments", new m7f.a(0, 1, "attachments", "TEXT", null, true));
        linkedHashMap2.put("timelineModule", new m7f.a(0, 1, "timelineModule", "TEXT", null, false));
        m7f m7fVar2 = new m7f("EventRecord", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
        m7f m7fVarA2 = m7f.b.a(zhdVar, "EventRecord");
        if (!m7fVar2.equals(m7fVarA2)) {
            return new efd.a(v40.f("EventRecord(com.indeed.android.messaging.data.events.EventRecord).\n Expected:\n", m7fVar2, "\n Found:\n", m7fVarA2), false);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("conversationId", new m7f.a(1, 1, "conversationId", "TEXT", null, true));
        linkedHashMap3.put("content", new m7f.a(0, 1, "content", "TEXT", null, true));
        linkedHashMap3.put("attachments", new m7f.a(0, 1, "attachments", "TEXT", null, true));
        m7f m7fVar3 = new m7f("DraftRecord", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
        m7f m7fVarA3 = m7f.b.a(zhdVar, "DraftRecord");
        return !m7fVar3.equals(m7fVarA3) ? new efd.a(v40.f("DraftRecord(com.indeed.android.messaging.data.conversations.DraftRecord).\n Expected:\n", m7fVar3, "\n Found:\n", m7fVarA3), false) : new efd.a(null, true);
    }
}
