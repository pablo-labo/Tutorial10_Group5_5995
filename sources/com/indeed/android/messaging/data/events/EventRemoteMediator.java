package com.indeed.android.messaging.data.events;

import com.indeed.android.messaging.data.MessagingDatabase;
import com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource;
import defpackage.lu2;
import defpackage.pu2;
import defpackage.r0d;
import defpackage.uh3;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/indeed/android/messaging/data/events/EventRemoteMediator;", "Lr0d;", "", "Lcom/indeed/android/messaging/data/events/EventRecord;", "Lcom/indeed/android/messaging/data/MessagingDatabase;", "database", "Lcom/indeed/android/messaging/data/conversations/ConversationsRemoteDataSource;", "conversationsRemoteDataSource", "", "conversationId", "", "isPAJIM", "<init>", "(Lcom/indeed/android/messaging/data/MessagingDatabase;Lcom/indeed/android/messaging/data/conversations/ConversationsRemoteDataSource;Ljava/lang/String;Z)V", "Lzz8;", "loadType", "Ls2b;", "state", "Lr0d$b;", "load", "(Lzz8;Ls2b;Llu2;)Ljava/lang/Object;", "Lcom/indeed/android/messaging/data/MessagingDatabase;", "Lcom/indeed/android/messaging/data/conversations/ConversationsRemoteDataSource;", "Ljava/lang/String;", "Z", "startCursor", "getStartCursor", "()Ljava/lang/String;", "setStartCursor", "(Ljava/lang/String;)V", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EventRemoteMediator extends r0d<Integer, EventRecord> {
    public static final int $stable = 8;
    private final String conversationId;
    private final ConversationsRemoteDataSource conversationsRemoteDataSource;
    private final MessagingDatabase database;
    private final boolean isPAJIM;
    private String startCursor;

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.events.EventRemoteMediator$load$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.events.EventRemoteMediator", f = "EventRemoteMediator.kt", l = {28, 34, 35}, m = "load")
    public static final class AnonymousClass1 extends pu2 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(lu2<? super AnonymousClass1> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventRemoteMediator.this.load(null, null, this);
        }
    }

    public EventRemoteMediator(MessagingDatabase messagingDatabase, ConversationsRemoteDataSource conversationsRemoteDataSource, String str, boolean z) {
        messagingDatabase.getClass();
        conversationsRemoteDataSource.getClass();
        str.getClass();
        this.database = messagingDatabase;
        this.conversationsRemoteDataSource = conversationsRemoteDataSource;
        this.conversationId = str;
        this.isPAJIM = z;
    }

    public final String getStartCursor() {
        return this.startCursor;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.r0d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object load(defpackage.zz8 r7, defpackage.s2b<java.lang.Integer, com.indeed.android.messaging.data.events.EventRecord> r8, defpackage.lu2<? super r0d.b> r9) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.events.EventRemoteMediator.load(zz8, s2b, lu2):java.lang.Object");
    }

    public final void setStartCursor(String str) {
        this.startCursor = str;
    }
}
