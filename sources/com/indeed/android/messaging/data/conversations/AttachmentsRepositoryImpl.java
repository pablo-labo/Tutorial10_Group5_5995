package com.indeed.android.messaging.data.conversations;

import android.net.Uri;
import android.util.Base64;
import androidx.fragment.app.g;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.indeed.android.messaging.data.MessagingDatabase;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.a32;
import defpackage.a74;
import defpackage.ahg;
import defpackage.bx0;
import defpackage.cr8;
import defpackage.dq9;
import defpackage.eq3;
import defpackage.es9;
import defpackage.f13;
import defpackage.g13;
import defpackage.h4a;
import defpackage.hb5;
import defpackage.hh2;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.m6;
import defpackage.no3;
import defpackage.pu2;
import defpackage.t40;
import defpackage.u63;
import defpackage.uh3;
import defpackage.v1g;
import defpackage.wg0;
import defpackage.wl7;
import defpackage.zr4;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00100\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u001c\u0010\u000eJ\"\u0010\u001d\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u001d\u0010\u000eJD\u0010$\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\f0!H\u0096@¢\u0006\u0004\b$\u0010%J2\u0010(\u001a\u0004\u0018\u00010\u00182\u0006\u0010'\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R \u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/AttachmentsRepositoryImpl;", "Lcom/indeed/android/messaging/data/conversations/AttachmentsRepository;", "Ldq9;", "messagingApi", "Lcom/indeed/android/messaging/data/MessagingDatabase;", "database", "<init>", "(Ldq9;Lcom/indeed/android/messaging/data/MessagingDatabase;)V", "Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;", "attachment", "", "conversationId", "Lj6g;", "doUpload", "(Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "Lh4a;", "", "observeList", "()Lh4a;", "clear", "(Llu2;)Ljava/lang/Object;", "list", "set", "(Ljava/util/List;Llu2;)Ljava/lang/Object;", "Ljava/io/File;", "file", "uploadAttachment", "(Ljava/io/File;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "retryAttachmentUpload", "removeAttachment", "Landroidx/fragment/app/g;", "activity", "messageId", "Lkotlin/Function1;", "", "onDownloadFileCallback", "downloadAttachmentWithoutPreview", "(Landroidx/fragment/app/g;Ljava/lang/String;Ljava/lang/String;Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;Lkotlin/jvm/functions/Function1;Llu2;)Ljava/lang/Object;", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "downloadAttachmentPreview", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;Llu2;)Ljava/lang/Object;", "Ldq9;", "Lcom/indeed/android/messaging/data/MessagingDatabase;", "attachmentsFlow", "Lh4a;", "", "attachments", "Ljava/util/List;", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AttachmentsRepositoryImpl implements AttachmentsRepository {
    public static final int $stable = 8;
    private final List<EventRecord.Attachment> attachments;
    private final h4a<List<EventRecord.Attachment>> attachmentsFlow;
    private final MessagingDatabase database;
    private final dq9 messagingApi;

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl$doUpload$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl", f = "AttachmentsRepository.kt", l = {93, 95, 113, 116}, m = "doUpload")
    public static final class AnonymousClass1 extends pu2 {
        int I$0;
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
            return AttachmentsRepositoryImpl.this.doUpload(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl$downloadAttachmentPreview$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl", f = "AttachmentsRepository.kt", l = {162}, m = "downloadAttachmentPreview")
    public static final class C06281 extends pu2 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C06281(lu2<? super C06281> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AttachmentsRepositoryImpl.this.downloadAttachmentPreview(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl$removeAttachment$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl", f = "AttachmentsRepository.kt", l = {126, 129}, m = "removeAttachment")
    public static final class C06291 extends pu2 {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C06291(lu2<? super C06291> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AttachmentsRepositoryImpl.this.removeAttachment(null, null, this);
        }
    }

    public AttachmentsRepositoryImpl(dq9 dq9Var, MessagingDatabase messagingDatabase) {
        dq9Var.getClass();
        messagingDatabase.getClass();
        this.messagingApi = dq9Var;
        this.database = messagingDatabase;
        this.attachmentsFlow = hh2.e(zr4.a);
        this.attachments = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013d, code lost:
    
        if (r14.saveConversationDraft(r13, null, r12, r0) == r8) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0121 A[PHI: r13
  0x0121: PHI (r13v4 java.lang.String) = (r13v3 java.lang.String), (r13v15 java.lang.String) binds: [B:39:0x011e, B:17:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object doUpload(final com.indeed.android.messaging.data.events.EventRecord.Attachment r13, java.lang.String r14, defpackage.lu2<? super defpackage.j6g> r15) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl.doUpload(com.indeed.android.messaging.data.events.EventRecord$Attachment, java.lang.String, lu2):java.lang.Object");
    }

    public static /* synthetic */ Object doUpload$default(AttachmentsRepositoryImpl attachmentsRepositoryImpl, EventRecord.Attachment attachment, String str, lu2 lu2Var, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return attachmentsRepositoryImpl.doUpload(attachment, str, lu2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventRecord.Attachment doUpload$lambda$4(EventRecord.Attachment attachment, EventRecord.Attachment attachment2) {
        attachment2.getClass();
        return wl7.b(attachment2.getContentHash(), attachment.getContentHash()) ? EventRecord.Attachment.copy$default(attachment2, null, null, null, EventRecord.AttachmentSentStatus.UPLOADING, null, null, 55, null) : attachment2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean doUpload$lambda$5(ahg.c cVar, EventRecord.Attachment attachment) {
        attachment.getClass();
        return wl7.b(attachment.getContentHash(), cVar != null ? cVar.c : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean doUpload$lambda$6(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventRecord.Attachment doUpload$lambda$7(EventRecord.Attachment attachment, ahg.c cVar, wg0 wg0Var, EventRecord.Attachment attachment2) {
        String contentHash;
        String fileName;
        String fileExtension;
        attachment2.getClass();
        if (!wl7.b(attachment2.getContentHash(), attachment.getContentHash())) {
            return attachment2;
        }
        if (cVar == null || (contentHash = cVar.c) == null) {
            contentHash = attachment2.getContentHash();
        }
        String str = contentHash;
        if (cVar == null || (fileName = cVar.d) == null) {
            fileName = attachment2.getFileName();
        }
        String str2 = fileName;
        if (cVar == null || (fileExtension = cVar.e) == null) {
            fileExtension = attachment2.getFileExtension();
        }
        return EventRecord.Attachment.copy$default(attachment2, str, str2, fileExtension, wg0Var.d() ? EventRecord.AttachmentSentStatus.SUCCESS : EventRecord.AttachmentSentStatus.FAILURE, null, null, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g downloadAttachmentWithoutPreview$lambda$12(Function1 function1, int i) {
        function1.invoke(Integer.valueOf(i));
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeAttachment$lambda$10(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeAttachment$lambda$9(EventRecord.Attachment attachment, EventRecord.Attachment attachment2) {
        attachment2.getClass();
        return wl7.b(attachment2.getContentHash(), attachment.getContentHash());
    }

    @Override // com.indeed.android.messaging.data.conversations.AttachmentsRepository
    public Object clear(lu2<? super j6g> lu2Var) {
        Object obj = set(zr4.a, lu2Var);
        return obj == g13.a ? obj : j6g.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.indeed.android.messaging.data.conversations.AttachmentsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object downloadAttachmentPreview(android.content.Context r5, java.lang.String r6, java.lang.String r7, com.indeed.android.messaging.data.events.EventRecord.Attachment r8, defpackage.lu2<? super java.io.File> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl.C06281
            if (r0 == 0) goto L14
            r0 = r9
            com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl$downloadAttachmentPreview$1 r0 = (com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl.C06281) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl$downloadAttachmentPreview$1 r0 = new com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl$downloadAttachmentPreview$1
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r0 = r9.result
            int r1 = r9.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3e
            if (r1 != r2) goto L38
            java.lang.Object r4 = r9.L$3
            com.indeed.android.messaging.data.events.EventRecord$Attachment r4 = (com.indeed.android.messaging.data.events.EventRecord.Attachment) r4
            java.lang.Object r4 = r9.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r9.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r9.L$0
            android.content.Context r4 = (android.content.Context) r4
            defpackage.r7d.b(r0)     // Catch: java.lang.Exception -> L5c
            goto L59
        L38:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r3
        L3e:
            defpackage.r7d.b(r0)
            dq9 r4 = r4.messagingApi     // Catch: java.lang.Exception -> L5c
            r9.L$0 = r3     // Catch: java.lang.Exception -> L5c
            r9.L$1 = r3     // Catch: java.lang.Exception -> L5c
            r9.L$2 = r3     // Catch: java.lang.Exception -> L5c
            r9.L$3 = r3     // Catch: java.lang.Exception -> L5c
            r9.label = r2     // Catch: java.lang.Exception -> L5c
            r4.getClass()     // Catch: java.lang.Exception -> L5c
            java.lang.Object r0 = defpackage.gs9.e(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L5c
            g13 r4 = defpackage.g13.a
            if (r0 != r4) goto L59
            return r4
        L59:
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Exception -> L5c
            return r0
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl.downloadAttachmentPreview(android.content.Context, java.lang.String, java.lang.String, com.indeed.android.messaging.data.events.EventRecord$Attachment, lu2):java.lang.Object");
    }

    @Override // com.indeed.android.messaging.data.conversations.AttachmentsRepository
    public Object downloadAttachmentWithoutPreview(g gVar, String str, String str2, EventRecord.Attachment attachment, Function1<? super Integer, j6g> function1, lu2<? super j6g> lu2Var) {
        dq9 dq9Var = this.messagingApi;
        String contentHash = attachment.getContentHash();
        String fileName = attachment.getFileName();
        bx0 bx0Var = new bx0(function1, 0);
        dq9Var.getClass();
        gVar.getClass();
        str.getClass();
        str2.getClass();
        contentHash.getClass();
        fileName.getClass();
        byte[] bytes = "CONVERSATION_SERVICE_ENCRYPTED///".concat(str).getBytes(a32.b);
        bytes.getClass();
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        strEncodeToString.getClass();
        String strA = ((v1g) cr8.p(v1g.class)).a();
        StringBuilder sb = new StringBuilder();
        sb.append(strA);
        sb.append("messaging/jobseekers/v2/conversations/");
        sb.append(strEncodeToString);
        sb.append("/messages/");
        sb.append(str2);
        String strH = m6.h(sb, "/files/", contentHash, "?ims=1");
        eq3 eq3Var = a74.a;
        u63.Y(f13.a(no3.c), null, null, new es9(gVar, strH, fileName, bx0Var, null), 3);
        return j6g.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        if (r7.saveConversationDraft(r8, null, r6, r0) == r5) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.indeed.android.messaging.data.conversations.AttachmentsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object removeAttachment(com.indeed.android.messaging.data.events.EventRecord.Attachment r7, java.lang.String r8, defpackage.lu2<? super defpackage.j6g> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl.C06291
            if (r0 == 0) goto L13
            r0 = r9
            com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl$removeAttachment$1 r0 = (com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl.C06291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl$removeAttachment$1 r0 = new com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl$removeAttachment$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L4a
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L37
            java.lang.Object r6 = r0.L$2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.L$0
            com.indeed.android.messaging.data.events.EventRecord$Attachment r6 = (com.indeed.android.messaging.data.events.EventRecord.Attachment) r6
            defpackage.r7d.b(r9)
            goto L8f
        L37:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r4
        L3d:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.L$0
            com.indeed.android.messaging.data.events.EventRecord$Attachment r7 = (com.indeed.android.messaging.data.events.EventRecord.Attachment) r7
            defpackage.r7d.b(r9)
            goto L73
        L4a:
            defpackage.r7d.b(r9)
            java.util.List<com.indeed.android.messaging.data.events.EventRecord$Attachment> r9 = r6.attachments
            cd r1 = new cd
            r1.<init>(r7, r2)
            ax0 r7 = new ax0
            r7.<init>()
            r9.removeIf(r7)
            h4a<java.util.List<com.indeed.android.messaging.data.events.EventRecord$Attachment>> r7 = r6.attachmentsFlow
            java.util.List<com.indeed.android.messaging.data.events.EventRecord$Attachment> r9 = r6.attachments
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r9 = defpackage.z92.z1(r9)
            r0.L$0 = r4
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r7 = r7.a(r9, r0)
            if (r7 != r5) goto L73
            goto L8e
        L73:
            if (r8 == 0) goto L8f
            com.indeed.android.messaging.data.MessagingDatabase r7 = r6.database
            com.indeed.android.messaging.data.conversations.ConversationDao r7 = r7.y()
            java.util.List<com.indeed.android.messaging.data.events.EventRecord$Attachment> r6 = r6.attachments
            r0.L$0 = r4
            r0.L$1 = r4
            r0.L$2 = r4
            r9 = 0
            r0.I$0 = r9
            r0.label = r2
            java.lang.Object r6 = r7.saveConversationDraft(r8, r4, r6, r0)
            if (r6 != r5) goto L8f
        L8e:
            return r5
        L8f:
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl.removeAttachment(com.indeed.android.messaging.data.events.EventRecord$Attachment, java.lang.String, lu2):java.lang.Object");
    }

    @Override // com.indeed.android.messaging.data.conversations.AttachmentsRepository
    public Object retryAttachmentUpload(EventRecord.Attachment attachment, String str, lu2<? super j6g> lu2Var) {
        Object objDoUpload = doUpload(attachment, str, lu2Var);
        return objDoUpload == g13.a ? objDoUpload : j6g.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    @Override // com.indeed.android.messaging.data.conversations.AttachmentsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object set(java.util.List<com.indeed.android.messaging.data.events.EventRecord.Attachment> r13, defpackage.lu2<? super defpackage.j6g> r14) {
        /*
            r12 = this;
            java.util.List<com.indeed.android.messaging.data.events.EventRecord$Attachment> r0 = r12.attachments
            r0.clear()
            java.util.List<com.indeed.android.messaging.data.events.EventRecord$Attachment> r0 = r12.attachments
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r13 = r13.iterator()
        L12:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r13.next()
            r3 = r2
            com.indeed.android.messaging.data.events.EventRecord$Attachment r3 = (com.indeed.android.messaging.data.events.EventRecord.Attachment) r3
            com.indeed.android.messaging.data.events.EventRecord$AttachmentSentStatus r2 = r3.getStatus()
            com.indeed.android.messaging.data.events.EventRecord$AttachmentSentStatus r4 = com.indeed.android.messaging.data.events.EventRecord.AttachmentSentStatus.SUCCESS
            if (r2 == r4) goto L56
            java.lang.String r2 = r3.getFileUri()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r4 = 0
            if (r2 == 0) goto L55
            java.lang.String r2 = r2.getPath()
            if (r2 == 0) goto L55
            java.io.File r5 = new java.io.File
            r5.<init>(r2)
            boolean r2 = r5.exists()
            if (r2 == 0) goto L45
            r9 = r5
            goto L46
        L45:
            r9 = r4
        L46:
            if (r9 == 0) goto L55
            r10 = 31
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            com.indeed.android.messaging.data.events.EventRecord$Attachment r3 = com.indeed.android.messaging.data.events.EventRecord.Attachment.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L56
        L55:
            r3 = r4
        L56:
            if (r3 == 0) goto L12
            r1.add(r3)
            goto L12
        L5c:
            r0.addAll(r1)
            h4a<java.util.List<com.indeed.android.messaging.data.events.EventRecord$Attachment>> r13 = r12.attachmentsFlow
            java.util.List<com.indeed.android.messaging.data.events.EventRecord$Attachment> r12 = r12.attachments
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.List r12 = defpackage.z92.z1(r12)
            java.lang.Object r12 = r13.a(r12, r14)
            g13 r13 = defpackage.g13.a
            if (r12 != r13) goto L72
            return r12
        L72:
            j6g r12 = defpackage.j6g.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl.set(java.util.List, lu2):java.lang.Object");
    }

    @Override // com.indeed.android.messaging.data.conversations.AttachmentsRepository
    public Object uploadAttachment(File file, String str, lu2<? super j6g> lu2Var) {
        String strH = t40.h();
        String name = file.getName();
        name.getClass();
        EventRecord.Attachment attachment = new EventRecord.Attachment(strH, name, hb5.Q(file), null, Uri.fromFile(file).toString(), file, 8, null);
        this.attachments.add(attachment);
        Object objDoUpload = doUpload(attachment, str, lu2Var);
        return objDoUpload == g13.a ? objDoUpload : j6g.a;
    }

    @Override // com.indeed.android.messaging.data.conversations.AttachmentsRepository
    public h4a<List<EventRecord.Attachment>> observeList() {
        return this.attachmentsFlow;
    }
}
