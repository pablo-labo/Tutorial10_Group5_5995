package com.indeed.android.messaging.data.conversations;

import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.pu2;
import defpackage.uh3;
import defpackage.vi5;
import defpackage.w47;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\bJ#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00042\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0005H§@¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0015\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010!\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0005H\u0097@¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u000bH§@¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b%\u0010$¨\u0006&À\u0006\u0003"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/ConversationDao;", "", "Lw47;", "folder", "Lvi5;", "", "Lcom/indeed/android/messaging/data/conversations/ConversationWithDraft;", "observeConversationList", "(Lw47;)Lvi5;", "observeDraftConversations", "observeConversationQuery", "", "id", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord;", "findById", "(Ljava/lang/String;)Lvi5;", "conversationRecord", "Lj6g;", "saveConversations", "(Ljava/util/List;Llu2;)Ljava/lang/Object;", "existingIds", "clearOutdatedConversations", "(Ljava/util/List;Lw47;Llu2;)Ljava/lang/Object;", "updateConversationFolder", "(Ljava/lang/String;Lw47;Llu2;)Ljava/lang/Object;", "Lcom/indeed/android/messaging/data/conversations/DraftRecord;", "draft", "upsertConversationDraft", "(Lcom/indeed/android/messaging/data/conversations/DraftRecord;Llu2;)Ljava/lang/Object;", "conversationId", "content", "Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;", "attachments", "saveConversationDraft", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Llu2;)Ljava/lang/Object;", "getDraftById", "(Ljava/lang/String;Llu2;)Ljava/lang/Object;", "deleteDraft", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ConversationDao {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static vi5<List<ConversationWithDraft>> observeConversationQuery(ConversationDao conversationDao, w47 w47Var) {
            w47Var.getClass();
            return ConversationDao.super.observeConversationQuery(w47Var);
        }

        @Deprecated
        public static Object saveConversationDraft(ConversationDao conversationDao, String str, String str2, List<EventRecord.Attachment> list, lu2<? super j6g> lu2Var) {
            return ConversationDao.super.saveConversationDraft(str, str2, list, lu2Var);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationDao$saveConversationDraft$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationDao", f = "ConversationDao.kt", l = {52, 66}, m = "saveConversationDraft$suspendImpl")
    public static final class AnonymousClass1 extends pu2 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(lu2<? super AnonymousClass1> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationDao.saveConversationDraft$suspendImpl(ConversationDao.this, null, null, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        if (r6.upsertConversationDraft(r1, r0) == r5) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.Object saveConversationDraft$suspendImpl(com.indeed.android.messaging.data.conversations.ConversationDao r6, java.lang.String r7, java.lang.String r8, java.util.List<com.indeed.android.messaging.data.events.EventRecord.Attachment> r9, defpackage.lu2<? super defpackage.j6g> r10) {
        /*
            boolean r0 = r10 instanceof com.indeed.android.messaging.data.conversations.ConversationDao.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            com.indeed.android.messaging.data.conversations.ConversationDao$saveConversationDraft$1 r0 = (com.indeed.android.messaging.data.conversations.ConversationDao.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.indeed.android.messaging.data.conversations.ConversationDao$saveConversationDraft$1 r0 = new com.indeed.android.messaging.data.conversations.ConversationDao$saveConversationDraft$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L60
            if (r1 == r3) goto L49
            if (r1 != r2) goto L43
            java.lang.Object r6 = r0.L$5
            com.indeed.android.messaging.data.conversations.DraftRecord r6 = (com.indeed.android.messaging.data.conversations.DraftRecord) r6
            java.lang.Object r6 = r0.L$4
            com.indeed.android.messaging.data.conversations.DraftRecord r6 = (com.indeed.android.messaging.data.conversations.DraftRecord) r6
            java.lang.Object r6 = r0.L$3
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = r0.L$2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.L$0
            com.indeed.android.messaging.data.conversations.ConversationDao r6 = (com.indeed.android.messaging.data.conversations.ConversationDao) r6
            defpackage.r7d.b(r10)
            goto Lac
        L43:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r4
        L49:
            java.lang.Object r6 = r0.L$3
            r9 = r6
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r6 = r0.L$2
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r6 = r0.L$1
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.L$0
            com.indeed.android.messaging.data.conversations.ConversationDao r6 = (com.indeed.android.messaging.data.conversations.ConversationDao) r6
            defpackage.r7d.b(r10)
            goto L74
        L60:
            defpackage.r7d.b(r10)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r9
            r0.label = r3
            java.lang.Object r10 = r6.getDraftById(r7, r0)
            if (r10 != r5) goto L74
            goto Lab
        L74:
            com.indeed.android.messaging.data.conversations.DraftRecord r10 = (com.indeed.android.messaging.data.conversations.DraftRecord) r10
            if (r10 == 0) goto L8a
            com.indeed.android.messaging.data.conversations.DraftRecord r1 = new com.indeed.android.messaging.data.conversations.DraftRecord
            if (r8 != 0) goto L80
            java.lang.String r8 = r10.getContent()
        L80:
            if (r9 != 0) goto L86
            java.util.List r9 = r10.getAttachments()
        L86:
            r1.<init>(r7, r8, r9)
            goto L97
        L8a:
            com.indeed.android.messaging.data.conversations.DraftRecord r1 = new com.indeed.android.messaging.data.conversations.DraftRecord
            if (r8 != 0) goto L90
            java.lang.String r8 = ""
        L90:
            if (r9 != 0) goto L94
            zr4 r9 = defpackage.zr4.a
        L94:
            r1.<init>(r7, r8, r9)
        L97:
            r0.L$0 = r4
            r0.L$1 = r4
            r0.L$2 = r4
            r0.L$3 = r4
            r0.L$4 = r4
            r0.L$5 = r4
            r0.label = r2
            java.lang.Object r6 = r6.upsertConversationDraft(r1, r0)
            if (r6 != r5) goto Lac
        Lab:
            return r5
        Lac:
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationDao.saveConversationDraft$suspendImpl(com.indeed.android.messaging.data.conversations.ConversationDao, java.lang.String, java.lang.String, java.util.List, lu2):java.lang.Object");
    }

    Object clearOutdatedConversations(List<String> list, w47 w47Var, lu2<? super j6g> lu2Var);

    Object deleteDraft(String str, lu2<? super j6g> lu2Var);

    vi5<ConversationRecord> findById(String id);

    Object getDraftById(String str, lu2<? super DraftRecord> lu2Var);

    vi5<List<ConversationWithDraft>> observeConversationList(w47 folder);

    default vi5<List<ConversationWithDraft>> observeConversationQuery(w47 folder) {
        folder.getClass();
        return folder == w47.DRAFTS ? observeDraftConversations(w47.INBOX) : observeConversationList(folder);
    }

    vi5<List<ConversationWithDraft>> observeDraftConversations(w47 folder);

    default Object saveConversationDraft(String str, String str2, List<EventRecord.Attachment> list, lu2<? super j6g> lu2Var) {
        return saveConversationDraft$suspendImpl(this, str, str2, list, lu2Var);
    }

    Object saveConversations(List<ConversationRecord> list, lu2<? super j6g> lu2Var);

    Object updateConversationFolder(String str, w47 w47Var, lu2<? super j6g> lu2Var);

    Object upsertConversationDraft(DraftRecord draftRecord, lu2<? super j6g> lu2Var);
}
