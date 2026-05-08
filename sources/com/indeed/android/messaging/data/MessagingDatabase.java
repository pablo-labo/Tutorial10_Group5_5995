package com.indeed.android.messaging.data;

import com.indeed.android.messaging.data.conversations.ConversationDao;
import com.indeed.android.messaging.data.events.EventDao;
import defpackage.xed;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/messaging/data/MessagingDatabase;", "Lxed;", "<init>", "()V", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MessagingDatabase extends xed {
    public abstract ConversationDao y();

    public abstract EventDao z();
}
