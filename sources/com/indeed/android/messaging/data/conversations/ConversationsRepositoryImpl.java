package com.indeed.android.messaging.data.conversations;

import com.indeed.android.messaging.data.MessagingDatabase;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.c1f;
import defpackage.dq9;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lr9;
import defpackage.lu2;
import defpackage.pk5;
import defpackage.pu2;
import defpackage.r2b;
import defpackage.uh3;
import defpackage.vi5;
import defpackage.w47;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0017\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u001f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010&J$\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0(0\u001f2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b)\u0010*J$\u0010,\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0004\b,\u0010-J\u001a\u0010.\u001a\u0004\u0018\u00010$2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b.\u0010*J\u0018\u00100\u001a\u00020/2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b0\u0010*J\u0018\u00101\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b1\u0010*J8\u00105\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\f\u00104\u001a\b\u0012\u0004\u0012\u0002030 2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096@¢\u0006\u0004\b5\u00106J*\u00108\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096@¢\u0006\u0004\b8\u00109J \u0010:\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b:\u0010;J2\u0010=\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010<\u001a\u0004\u0018\u00010\f2\u000e\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010 H\u0096@¢\u0006\u0004\b=\u0010>J\u001a\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b@\u0010*J\u0018\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020\fH\u0096@¢\u0006\u0004\bC\u0010*J&\u0010F\u001a\b\u0012\u0004\u0012\u00020E0 2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010D\u001a\u00020\fH\u0096@¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010HR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010IR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010JR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010K¨\u0006L"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/ConversationsRepositoryImpl;", "Lcom/indeed/android/messaging/data/conversations/ConversationsRepository;", "Lcom/indeed/android/messaging/data/conversations/ConversationsRemoteDataSource;", "conversationsRemoteDataSource", "Lcom/indeed/android/messaging/data/MessagingDatabase;", "database", "Ldq9;", "messagingApi", "Llr9;", "messagingLogger", "<init>", "(Lcom/indeed/android/messaging/data/conversations/ConversationsRemoteDataSource;Lcom/indeed/android/messaging/data/MessagingDatabase;Ldq9;Llr9;)V", "", "conversationId", "Lcom/indeed/android/messaging/data/events/EventRecord;", "event", "Laib;", "scope", "Lj6g;", "postMessage", "(Ljava/lang/String;Lcom/indeed/android/messaging/data/events/EventRecord;Laib;Llu2;)Ljava/lang/Object;", "Ljk8;", "lastEvent", "updateLocalConversationAfterPost", "(Ljava/lang/String;Ljk8;Llu2;)Ljava/lang/Object;", "", "unreadCount", "updateLocalConversationAfterRead", "(Ljava/lang/String;ILlu2;)Ljava/lang/Object;", "Lw47;", "folder", "Lvi5;", "", "Lcom/indeed/android/messaging/data/conversations/ConversationWithDraft;", "observeList", "(Lw47;)Lvi5;", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord;", "observeSelectedConversation", "(Ljava/lang/String;)Lvi5;", "observeLastEvent", "Ll2b;", "observeSelectedConversationMessages", "(Ljava/lang/String;Llu2;)Ljava/lang/Object;", "loadMoreStartCursor", "loadConversationListNextPage", "(Lw47;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "loadSelectedConversation", "", "doesConversationHasCachedMessages", "markConversationRead", "messageBody", "Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;", "attachments", "sendMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Laib;Llu2;)Ljava/lang/Object;", "messageId", "retryMessageSend", "(Ljava/lang/String;Ljava/lang/String;Laib;Llu2;)Ljava/lang/Object;", "moveConversationToFolder", "(Ljava/lang/String;Lw47;Llu2;)Ljava/lang/Object;", "message", "saveDraft", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Llu2;)Ljava/lang/Object;", "Lcom/indeed/android/messaging/data/conversations/DraftRecord;", "getDraft", "token", "Lcom/indeed/android/messaging/data/conversations/InitiateResponse;", "initiateConversation", "draft", "Lcom/indeed/android/messaging/data/conversations/model/SuggestedMessageModel;", "getSuggestedMessageModelList", "(Ljava/lang/String;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "Lcom/indeed/android/messaging/data/conversations/ConversationsRemoteDataSource;", "Lcom/indeed/android/messaging/data/MessagingDatabase;", "Ldq9;", "Llr9;", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConversationsRepositoryImpl implements ConversationsRepository {
    public static final int $stable = 8;
    private final ConversationsRemoteDataSource conversationsRemoteDataSource;
    private final MessagingDatabase database;
    private final dq9 messagingApi;
    private final lr9 messagingLogger;

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$doesConversationHasCachedMessages$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl", f = "ConversationsRepository.kt", l = {158}, m = "doesConversationHasCachedMessages")
    public static final class AnonymousClass1 extends pu2 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(lu2<? super AnonymousClass1> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRepositoryImpl.this.doesConversationHasCachedMessages(null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$getSuggestedMessageModelList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl", f = "ConversationsRepository.kt", l = {282}, m = "getSuggestedMessageModelList")
    public static final class C06421 extends pu2 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C06421(lu2<? super C06421> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRepositoryImpl.this.getSuggestedMessageModelList(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$initiateConversation$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl", f = "ConversationsRepository.kt", l = {247, 252, 258}, m = "initiateConversation")
    public static final class C06431 extends pu2 {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C06431(lu2<? super C06431> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRepositoryImpl.this.initiateConversation(null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$loadConversationListNextPage$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl", f = "ConversationsRepository.kt", l = {126, 130, 135}, m = "loadConversationListNextPage")
    public static final class C06441 extends pu2 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C06441(lu2<? super C06441> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRepositoryImpl.this.loadConversationListNextPage(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$loadSelectedConversation$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl", f = "ConversationsRepository.kt", l = {147, 151, 152}, m = "loadSelectedConversation")
    public static final class C06451 extends pu2 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C06451(lu2<? super C06451> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRepositoryImpl.this.loadSelectedConversation(null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$markConversationRead$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl", f = "ConversationsRepository.kt", l = {166, 167, 179, 182}, m = "markConversationRead")
    public static final class C06461 extends pu2 {
        int I$0;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C06461(lu2<? super C06461> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRepositoryImpl.this.markConversationRead(null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$moveConversationToFolder$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl", f = "ConversationsRepository.kt", l = {224, 225}, m = "moveConversationToFolder")
    public static final class C06471 extends pu2 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C06471(lu2<? super C06471> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRepositoryImpl.this.moveConversationToFolder(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$observeSelectedConversationMessages$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl", f = "ConversationsRepository.kt", l = {106}, m = "observeSelectedConversationMessages")
    public static final class C06491 extends pu2 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C06491(lu2<? super C06491> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRepositoryImpl.this.observeSelectedConversationMessages(null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$postMessage$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl", f = "ConversationsRepository.kt", l = {306, 308, 317, 322, 323}, m = "postMessage")
    public static final class C06501 extends pu2 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C06501(lu2<? super C06501> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRepositoryImpl.this.postMessage(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$retryMessageSend$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl", f = "ConversationsRepository.kt", l = {217, 219}, m = "retryMessageSend")
    public static final class C06511 extends pu2 {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C06511(lu2<? super C06511> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRepositoryImpl.this.retryMessageSend(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$sendMessage$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl", f = "ConversationsRepository.kt", l = {207, 208, 209}, m = "sendMessage")
    public static final class C06521 extends pu2 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C06521(lu2<? super C06521> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRepositoryImpl.this.sendMessage(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$updateLocalConversationAfterPost$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl", f = "ConversationsRepository.kt", l = {335, 343}, m = "updateLocalConversationAfterPost")
    public static final class C06531 extends pu2 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C06531(lu2<? super C06531> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRepositoryImpl.this.updateLocalConversationAfterPost(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$updateLocalConversationAfterRead$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl", f = "ConversationsRepository.kt", l = {355, 359}, m = "updateLocalConversationAfterRead")
    public static final class C06541 extends pu2 {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C06541(lu2<? super C06541> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRepositoryImpl.this.updateLocalConversationAfterRead(null, 0, this);
        }
    }

    public ConversationsRepositoryImpl(ConversationsRemoteDataSource conversationsRemoteDataSource, MessagingDatabase messagingDatabase, dq9 dq9Var, lr9 lr9Var) {
        conversationsRemoteDataSource.getClass();
        messagingDatabase.getClass();
        dq9Var.getClass();
        lr9Var.getClass();
        this.conversationsRemoteDataSource = conversationsRemoteDataSource;
        this.database = messagingDatabase;
        this.messagingApi = dq9Var;
        this.messagingLogger = lr9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r2b observeSelectedConversationMessages$lambda$0(ConversationsRepositoryImpl conversationsRepositoryImpl, String str) {
        return conversationsRepositoryImpl.database.z().getPagingEvents(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013a, code lost:
    
        if (updateLocalConversationAfterPost(r3, r2, r8) == r14) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x017e, code lost:
    
        if (r0.updateSendStatus(r1, r2, r8) != r14) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.indeed.android.messaging.data.events.EventRecord] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object postMessage(java.lang.String r24, com.indeed.android.messaging.data.events.EventRecord r25, defpackage.aib r26, defpackage.lu2<? super defpackage.j6g> r27) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.postMessage(java.lang.String, com.indeed.android.messaging.data.events.EventRecord, aib, lu2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
    
        if (r0.saveConversations(r1, r2) == r7) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateLocalConversationAfterPost(java.lang.String r36, defpackage.jk8 r37, defpackage.lu2<? super defpackage.j6g> r38) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.updateLocalConversationAfterPost(java.lang.String, jk8, lu2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bd, code lost:
    
        if (r0.saveConversations(r1, r2) == r7) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateLocalConversationAfterRead(java.lang.String r36, int r37, defpackage.lu2<? super defpackage.j6g> r38) {
        /*
            r35 = this;
            r0 = r35
            r1 = r38
            boolean r2 = r1 instanceof com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.C06541
            if (r2 == 0) goto L17
            r2 = r1
            com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$updateLocalConversationAfterRead$1 r2 = (com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.C06541) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$updateLocalConversationAfterRead$1 r2 = new com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$updateLocalConversationAfterRead$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            int r3 = r2.label
            r4 = 2
            r5 = 1
            r6 = 0
            g13 r7 = defpackage.g13.a
            if (r3 == 0) goto L4e
            if (r3 == r5) goto L42
            if (r3 != r4) goto L3c
            java.lang.Object r0 = r2.L$2
            com.indeed.android.messaging.data.conversations.ConversationRecord r0 = (com.indeed.android.messaging.data.conversations.ConversationRecord) r0
            java.lang.Object r0 = r2.L$1
            com.indeed.android.messaging.data.conversations.ConversationRecord r0 = (com.indeed.android.messaging.data.conversations.ConversationRecord) r0
            java.lang.Object r0 = r2.L$0
            java.lang.String r0 = (java.lang.String) r0
            defpackage.r7d.b(r1)
            goto Lc0
        L3c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r0)
            return r6
        L42:
            int r3 = r2.I$0
            java.lang.Object r5 = r2.L$0
            java.lang.String r5 = (java.lang.String) r5
            defpackage.r7d.b(r1)
        L4b:
            r19 = r3
            goto L6c
        L4e:
            defpackage.r7d.b(r1)
            com.indeed.android.messaging.data.MessagingDatabase r1 = r0.database
            com.indeed.android.messaging.data.conversations.ConversationDao r1 = r1.y()
            r3 = r36
            vi5 r1 = r1.findById(r3)
            r2.L$0 = r6
            r3 = r37
            r2.I$0 = r3
            r2.label = r5
            java.lang.Object r1 = defpackage.wg2.D(r1, r2)
            if (r1 != r7) goto L4b
            goto Lbf
        L6c:
            r8 = r1
            com.indeed.android.messaging.data.conversations.ConversationRecord r8 = (com.indeed.android.messaging.data.conversations.ConversationRecord) r8
            if (r8 != 0) goto L74
            j6g r0 = defpackage.j6g.a
            return r0
        L74:
            r33 = 8388095(0x7ffdff, float:1.1754225E-38)
            r34 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            com.indeed.android.messaging.data.conversations.ConversationRecord r1 = com.indeed.android.messaging.data.conversations.ConversationRecord.copy$default(r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r3 = r19
            com.indeed.android.messaging.data.MessagingDatabase r0 = r0.database
            com.indeed.android.messaging.data.conversations.ConversationDao r0 = r0.y()
            java.util.List r1 = defpackage.u63.Z(r1)
            r2.L$0 = r6
            r2.L$1 = r6
            r2.L$2 = r6
            r2.I$0 = r3
            r2.label = r4
            java.lang.Object r0 = r0.saveConversations(r1, r2)
            if (r0 != r7) goto Lc0
        Lbf:
            return r7
        Lc0:
            j6g r0 = defpackage.j6g.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.updateLocalConversationAfterRead(java.lang.String, int, lu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.indeed.android.messaging.data.conversations.ConversationsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doesConversationHasCachedMessages(java.lang.String r5, defpackage.lu2<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$doesConversationHasCachedMessages$1 r0 = (com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$doesConversationHasCachedMessages$1 r0 = new com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$doesConversationHasCachedMessages$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            java.lang.Object r4 = r0.L$0
            java.lang.String r4 = (java.lang.String) r4
            defpackage.r7d.b(r6)
            goto L46
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L30:
            defpackage.r7d.b(r6)
            com.indeed.android.messaging.data.MessagingDatabase r4 = r4.database
            com.indeed.android.messaging.data.events.EventDao r4 = r4.z()
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r4.countByConversationId(r5, r0)
            g13 r4 = defpackage.g13.a
            if (r6 != r4) goto L46
            return r4
        L46:
            java.lang.Number r6 = (java.lang.Number) r6
            int r4 = r6.intValue()
            if (r4 <= 0) goto L4f
            goto L50
        L4f:
            r3 = 0
        L50:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.doesConversationHasCachedMessages(java.lang.String, lu2):java.lang.Object");
    }

    @Override // com.indeed.android.messaging.data.conversations.ConversationsRepository
    public Object getDraft(String str, lu2<? super DraftRecord> lu2Var) {
        return this.database.y().getDraftById(str, lu2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.indeed.android.messaging.data.conversations.ConversationsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getSuggestedMessageModelList(java.lang.String r7, java.lang.String r8, defpackage.lu2<? super java.util.List<com.indeed.android.messaging.data.conversations.model.SuggestedMessageModel>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.C06421
            if (r0 == 0) goto L13
            r0 = r9
            com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$getSuggestedMessageModelList$1 r0 = (com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.C06421) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$getSuggestedMessageModelList$1 r0 = new com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$getSuggestedMessageModelList$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 != r4) goto L2f
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            defpackage.r7d.b(r9)
            goto L49
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r3
        L35:
            defpackage.r7d.b(r9)
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource r6 = r6.conversationsRemoteDataSource
            r0.L$0 = r3
            r0.L$1 = r3
            r0.label = r4
            java.lang.Object r9 = r6.getSuggestedMessageList(r7, r2, r8, r0)
            g13 r6 = defpackage.g13.a
            if (r9 != r6) goto L49
            return r6
        L49:
            j56$d r9 = (j56.d) r9
            if (r9 == 0) goto L8a
            java.util.ArrayList r6 = r9.a
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L56
            goto L8a
        L56:
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.t92.r0(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L89
            java.lang.Object r8 = r6.next()
            int r0 = r2 + 1
            if (r2 < 0) goto L85
            j56$c r8 = (j56.c) r8
            java.lang.String r1 = r8.a
            java.lang.String r8 = r8.b
            java.lang.String r4 = r9.b
            com.indeed.android.messaging.data.conversations.model.SuggestedMessageModel r5 = new com.indeed.android.messaging.data.conversations.model.SuggestedMessageModel
            r5.<init>(r1, r8, r4, r2)
            r7.add(r5)
            r2 = r0
            goto L65
        L85:
            defpackage.u63.o0()
            throw r3
        L89:
            return r7
        L8a:
            zr4 r6 = defpackage.zr4.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.getSuggestedMessageModelList(java.lang.String, java.lang.String, lu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.indeed.android.messaging.data.conversations.ConversationsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object initiateConversation(java.lang.String r11, defpackage.lu2<? super com.indeed.android.messaging.data.conversations.InitiateResponse> r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.initiateConversation(java.lang.String, lu2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        if (r11.clearOutdatedConversations(r7, r10, r0) == r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        if (r12.saveConversations(r1, r0) != r6) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.indeed.android.messaging.data.conversations.ConversationsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object loadConversationListNextPage(defpackage.w47 r10, java.lang.String r11, defpackage.lu2<? super java.lang.String> r12) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.loadConversationListNextPage(w47, java.lang.String, lu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.indeed.android.messaging.data.conversations.ConversationsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object loadSelectedConversation(java.lang.String r8, defpackage.lu2<? super com.indeed.android.messaging.data.conversations.ConversationRecord> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.C06451
            if (r0 == 0) goto L13
            r0 = r9
            com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$loadSelectedConversation$1 r0 = (com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.C06451) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$loadSelectedConversation$1 r0 = new com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$loadSelectedConversation$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            g13 r6 = defpackage.g13.a
            if (r1 == 0) goto L50
            if (r1 == r4) goto L48
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L36
            java.lang.Object r7 = r0.L$1
            com.indeed.android.messaging.data.conversations.model.ConversationWithMessages r7 = (com.indeed.android.messaging.data.conversations.model.ConversationWithMessages) r7
            java.lang.Object r8 = r0.L$0
            java.lang.String r8 = (java.lang.String) r8
            defpackage.r7d.b(r9)
            goto L99
        L36:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r5
        L3c:
            java.lang.Object r8 = r0.L$1
            com.indeed.android.messaging.data.conversations.model.ConversationWithMessages r8 = (com.indeed.android.messaging.data.conversations.model.ConversationWithMessages) r8
            java.lang.Object r1 = r0.L$0
            java.lang.String r1 = (java.lang.String) r1
            defpackage.r7d.b(r9)
            goto L7d
        L48:
            java.lang.Object r8 = r0.L$0
            java.lang.String r8 = (java.lang.String) r8
            defpackage.r7d.b(r9)
            goto L60
        L50:
            defpackage.r7d.b(r9)
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource r9 = r7.conversationsRemoteDataSource
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r9 = r9.fetchConversationWithMessages(r8, r5, r0)
            if (r9 != r6) goto L60
            goto L97
        L60:
            com.indeed.android.messaging.data.conversations.model.ConversationWithMessages r9 = (com.indeed.android.messaging.data.conversations.model.ConversationWithMessages) r9
            if (r9 != 0) goto L65
            return r5
        L65:
            com.indeed.android.messaging.data.MessagingDatabase r8 = r7.database
            com.indeed.android.messaging.data.events.EventDao r8 = r8.z()
            java.util.List r1 = r9.getEvents()
            r0.L$0 = r5
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r8 = r8.saveEvent(r1, r0)
            if (r8 != r6) goto L7c
            goto L97
        L7c:
            r8 = r9
        L7d:
            com.indeed.android.messaging.data.MessagingDatabase r7 = r7.database
            com.indeed.android.messaging.data.conversations.ConversationDao r7 = r7.y()
            com.indeed.android.messaging.data.conversations.ConversationRecord r9 = r8.getConversation()
            java.util.List r9 = defpackage.u63.Z(r9)
            r0.L$0 = r5
            r0.L$1 = r8
            r0.label = r2
            java.lang.Object r7 = r7.saveConversations(r9, r0)
            if (r7 != r6) goto L98
        L97:
            return r6
        L98:
            r7 = r8
        L99:
            com.indeed.android.messaging.data.conversations.ConversationRecord r7 = r7.getConversation()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.loadSelectedConversation(java.lang.String, lu2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f7, code lost:
    
        if (r1.f(r6, r0) == r8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010e, code lost:
    
        if (updateLocalConversationAfterRead(r4, 0, r0) == r8) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.indeed.android.messaging.data.conversations.ConversationsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object markConversationRead(java.lang.String r12, defpackage.lu2<? super defpackage.j6g> r13) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.markConversationRead(java.lang.String, lu2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r6.updateConversationFolder(r7, r8, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.indeed.android.messaging.data.conversations.ConversationsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object moveConversationToFolder(java.lang.String r7, defpackage.w47 r8, defpackage.lu2<? super defpackage.j6g> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.C06471
            if (r0 == 0) goto L13
            r0 = r9
            com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$moveConversationToFolder$1 r0 = (com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.C06471) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$moveConversationToFolder$1 r0 = new com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$moveConversationToFolder$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L46
            if (r1 == r4) goto L39
            if (r1 != r3) goto L33
            java.lang.Object r6 = r0.L$1
            w47 r6 = (defpackage.w47) r6
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            defpackage.r7d.b(r9)
            goto L6b
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r2
        L39:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            w47 r8 = (defpackage.w47) r8
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            defpackage.r7d.b(r9)
            goto L58
        L46:
            defpackage.r7d.b(r9)
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource r9 = r6.conversationsRemoteDataSource
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.moveConversationToFolder(r7, r8, r0)
            if (r9 != r5) goto L58
            goto L6a
        L58:
            com.indeed.android.messaging.data.MessagingDatabase r6 = r6.database
            com.indeed.android.messaging.data.conversations.ConversationDao r6 = r6.y()
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r6 = r6.updateConversationFolder(r7, r8, r0)
            if (r6 != r5) goto L6b
        L6a:
            return r5
        L6b:
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.moveConversationToFolder(java.lang.String, w47, lu2):java.lang.Object");
    }

    @Override // com.indeed.android.messaging.data.conversations.ConversationsRepository
    public vi5<EventRecord> observeLastEvent(String conversationId) {
        conversationId.getClass();
        return this.database.z().observeLastEvent(conversationId);
    }

    @Override // com.indeed.android.messaging.data.conversations.ConversationsRepository
    public vi5<List<ConversationWithDraft>> observeList(w47 folder) {
        folder.getClass();
        return new pk5(this.database.y().observeConversationQuery(folder), new C06481(null));
    }

    @Override // com.indeed.android.messaging.data.conversations.ConversationsRepository
    public vi5<ConversationRecord> observeSelectedConversation(String conversationId) {
        conversationId.getClass();
        return this.database.y().findById(conversationId);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.indeed.android.messaging.data.conversations.ConversationsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object observeSelectedConversationMessages(java.lang.String r6, defpackage.lu2<? super defpackage.vi5<defpackage.l2b<com.indeed.android.messaging.data.events.EventRecord>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.C06491
            if (r0 == 0) goto L13
            r0 = r7
            com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$observeSelectedConversationMessages$1 r0 = (com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.C06491) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$observeSelectedConversationMessages$1 r0 = new com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$observeSelectedConversationMessages$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            defpackage.r7d.b(r7)
            goto L4a
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r2
        L30:
            defpackage.r7d.b(r7)
            com.indeed.android.messaging.data.MessagingDatabase r7 = r5.database
            com.indeed.android.messaging.data.conversations.ConversationDao r7 = r7.y()
            vi5 r7 = r7.findById(r6)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = defpackage.wg2.D(r7, r0)
            g13 r0 = defpackage.g13.a
            if (r7 != r0) goto L4a
            return r0
        L4a:
            com.indeed.android.messaging.data.conversations.ConversationRecord r7 = (com.indeed.android.messaging.data.conversations.ConversationRecord) r7
            r0 = 0
            if (r7 == 0) goto L56
            boolean r7 = r7.isExisting()
            if (r7 != 0) goto L56
            goto L57
        L56:
            r3 = r0
        L57:
            h4 r7 = new h4
            r0 = 26
            r7.<init>(r0)
            com.indeed.android.messaging.data.events.EventRemoteMediator r0 = new com.indeed.android.messaging.data.events.EventRemoteMediator
            com.indeed.android.messaging.data.MessagingDatabase r1 = r5.database
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource r4 = r5.conversationsRemoteDataSource
            r0.<init>(r1, r4, r6, r3)
            gq0 r1 = new gq0
            r3 = 3
            r1.<init>(r3, r5, r6)
            lza r5 = new lza
            y0b r6 = new y0b
            r6.<init>(r1, r2)
            r5.<init>(r6, r7, r0)
            vi5<l2b<Value>> r5 = r5.e
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.observeSelectedConversationMessages(java.lang.String, lu2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (postMessage(r7, r10, r9, r0) == r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.indeed.android.messaging.data.conversations.ConversationsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object retryMessageSend(java.lang.String r7, java.lang.String r8, defpackage.aib r9, defpackage.lu2<? super defpackage.j6g> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.C06511
            if (r0 == 0) goto L13
            r0 = r10
            com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$retryMessageSend$1 r0 = (com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.C06511) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$retryMessageSend$1 r0 = new com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$retryMessageSend$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L56
            if (r1 == r3) goto L45
            if (r1 != r2) goto L3f
            java.lang.Object r6 = r0.L$4
            com.indeed.android.messaging.data.events.EventRecord r6 = (com.indeed.android.messaging.data.events.EventRecord) r6
            java.lang.Object r6 = r0.L$3
            com.indeed.android.messaging.data.events.EventRecord r6 = (com.indeed.android.messaging.data.events.EventRecord) r6
            java.lang.Object r6 = r0.L$2
            aib r6 = (defpackage.aib) r6
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            defpackage.r7d.b(r10)
            goto L88
        L3f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r4
        L45:
            java.lang.Object r7 = r0.L$2
            r9 = r7
            aib r9 = (defpackage.aib) r9
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            defpackage.r7d.b(r10)
            goto L6e
        L56:
            defpackage.r7d.b(r10)
            com.indeed.android.messaging.data.MessagingDatabase r10 = r6.database
            com.indeed.android.messaging.data.events.EventDao r10 = r10.z()
            r0.L$0 = r7
            r0.L$1 = r4
            r0.L$2 = r9
            r0.label = r3
            java.lang.Object r10 = r10.findById(r8, r0)
            if (r10 != r5) goto L6e
            goto L87
        L6e:
            com.indeed.android.messaging.data.events.EventRecord r10 = (com.indeed.android.messaging.data.events.EventRecord) r10
            if (r10 == 0) goto L88
            r0.L$0 = r4
            r0.L$1 = r4
            r0.L$2 = r4
            r0.L$3 = r4
            r0.L$4 = r4
            r8 = 0
            r0.I$0 = r8
            r0.label = r2
            java.lang.Object r6 = r6.postMessage(r7, r10, r9, r0)
            if (r6 != r5) goto L88
        L87:
            return r5
        L88:
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.retryMessageSend(java.lang.String, java.lang.String, aib, lu2):java.lang.Object");
    }

    @Override // com.indeed.android.messaging.data.conversations.ConversationsRepository
    public Object saveDraft(String str, String str2, List<EventRecord.Attachment> list, lu2<? super j6g> lu2Var) {
        Object objSaveConversationDraft = this.database.y().saveConversationDraft(str, str2, list, lu2Var);
        return objSaveConversationDraft == g13.a ? objSaveConversationDraft : j6g.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0101, code lost:
    
        if (postMessage(r6, r3, r5, r2) != r8) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.indeed.android.messaging.data.conversations.ConversationsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object sendMessage(java.lang.String r27, java.lang.String r28, java.util.List<com.indeed.android.messaging.data.events.EventRecord.Attachment> r29, defpackage.aib r30, defpackage.lu2<? super defpackage.j6g> r31) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.sendMessage(java.lang.String, java.lang.String, java.util.List, aib, lu2):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$observeList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/indeed/android/messaging/data/conversations/ConversationWithDraft;", "conversationList", "Lj6g;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 2, 0})
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl$observeList$1", f = "ConversationsRepository.kt", l = {92}, m = "invokeSuspend")
    public static final class C06481 extends c1f implements Function2<List<? extends ConversationWithDraft>, lu2<? super j6g>, Object> {
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;

        public C06481(lu2<? super C06481> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            C06481 c06481 = ConversationsRepositoryImpl.this.new C06481(lu2Var);
            c06481.L$0 = obj;
            return c06481;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<ConversationWithDraft> list, lu2<? super j6g> lu2Var) {
            return ((C06481) create(list, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Path cross not found for [B:17:0x007f, B:22:0x0095], limit reached: 26 */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x007a -> B:15:0x007b). Please report as a decompilation issue!!! */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = r12.L$0
                java.util.List r0 = (java.util.List) r0
                int r1 = r12.label
                r2 = 1
                r3 = 0
                r4 = 0
                if (r1 == 0) goto L31
                if (r1 != r2) goto L2b
                int r0 = r12.I$0
                java.lang.Object r1 = r12.L$7
                com.indeed.android.messaging.data.conversations.ConversationRecord r1 = (com.indeed.android.messaging.data.conversations.ConversationRecord) r1
                java.lang.Object r5 = r12.L$6
                com.indeed.android.messaging.data.conversations.ConversationRecord r5 = (com.indeed.android.messaging.data.conversations.ConversationRecord) r5
                java.lang.Object r6 = r12.L$5
                com.indeed.android.messaging.data.conversations.ConversationWithDraft r6 = (com.indeed.android.messaging.data.conversations.ConversationWithDraft) r6
                java.lang.Object r6 = r12.L$3
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r12.L$2
                com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl r7 = (com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl) r7
                java.lang.Object r8 = r12.L$1
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                defpackage.r7d.b(r13)
                goto L7b
            L2b:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r12)
                return r3
            L31:
                defpackage.r7d.b(r13)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl r13 = com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.this
                java.util.Iterator r0 = r0.iterator()
                r7 = r13
                r6 = r0
                r0 = r4
            L3f:
                boolean r13 = r6.hasNext()
                if (r13 == 0) goto L9a
                java.lang.Object r13 = r6.next()
                com.indeed.android.messaging.data.conversations.ConversationWithDraft r13 = (com.indeed.android.messaging.data.conversations.ConversationWithDraft) r13
                com.indeed.android.messaging.data.conversations.ConversationRecord r1 = r13.getConversation()
                com.indeed.android.messaging.data.MessagingDatabase r13 = com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.access$getDatabase$p(r7)
                com.indeed.android.messaging.data.events.EventDao r13 = r13.z()
                java.lang.String r5 = r1.getId()
                r12.L$0 = r3
                r12.L$1 = r3
                r12.L$2 = r7
                r12.L$3 = r6
                r12.L$4 = r3
                r12.L$5 = r3
                r12.L$6 = r1
                r12.L$7 = r1
                r12.I$0 = r0
                r12.I$1 = r4
                r12.label = r2
                java.lang.Object r13 = r13.getLocalLastEvent(r5, r12)
                g13 r5 = defpackage.g13.a
                if (r13 != r5) goto L7a
                return r5
            L7a:
                r5 = r1
            L7b:
                com.indeed.android.messaging.data.events.EventRecord r13 = (com.indeed.android.messaging.data.events.EventRecord) r13
                if (r13 == 0) goto L95
                com.indeed.android.messaging.data.events.EventRecord$MessageSendStatus r8 = r13.getSendStatus()
                com.indeed.android.messaging.data.events.EventRecord$MessageSendStatus r9 = com.indeed.android.messaging.data.events.EventRecord.MessageSendStatus.FAILED
                if (r8 != r9) goto L95
                long r8 = r13.getTimestamp()
                long r10 = r5.getLastEventTimestamp()
                int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r13 <= 0) goto L95
                r13 = r2
                goto L96
            L95:
                r13 = r4
            L96:
                r1.setFailedToSendLastMessage(r13)
                goto L3f
            L9a:
                j6g r12 = defpackage.j6g.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl.C06481.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends ConversationWithDraft> list, lu2<? super j6g> lu2Var) {
            return invoke2((List<ConversationWithDraft>) list, lu2Var);
        }
    }
}
