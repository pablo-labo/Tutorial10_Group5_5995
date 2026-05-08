package com.indeed.android.messaging.data;

import com.indeed.android.messaging.data.conversations.ConversationDao;
import com.indeed.android.messaging.data.conversations.ConversationDao_Impl;
import com.indeed.android.messaging.data.events.EventDao;
import com.indeed.android.messaging.data.events.EventDao_Impl;
import defpackage.ak2;
import defpackage.boa;
import defpackage.d2f;
import defpackage.ffd;
import defpackage.fwc;
import defpackage.iwc;
import defpackage.km7;
import defpackage.le;
import defpackage.qq9;
import defpackage.qr;
import defpackage.yd8;
import defpackage.yed;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/messaging/data/MessagingDatabase_Impl;", "Lcom/indeed/android/messaging/data/MessagingDatabase;", "<init>", "()V", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MessagingDatabase_Impl extends MessagingDatabase {
    public final d2f l = new d2f(new le(this, 10));
    public final d2f m = new d2f(new qr(this, 13));

    @Override // defpackage.xed
    public final void d() throws Throwable {
        a();
        b();
        boa.N(new yed(this, false, new String[]{"ConversationRecord", "EventRecord", "DraftRecord"}, null));
    }

    @Override // defpackage.xed
    public final List e(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // defpackage.xed
    public final km7 f() {
        return new km7(this, new LinkedHashMap(), new LinkedHashMap(), "ConversationRecord", "EventRecord", "DraftRecord");
    }

    @Override // defpackage.xed
    public final ffd g() {
        return new qq9(this);
    }

    @Override // defpackage.xed
    public final Set<yd8<? extends ak2>> m() {
        return new LinkedHashSet();
    }

    @Override // defpackage.xed
    public final LinkedHashMap o() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        iwc iwcVar = fwc.a;
        linkedHashMap.put(iwcVar.b(ConversationDao.class), ConversationDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(iwcVar.b(EventDao.class), EventDao_Impl.INSTANCE.getRequiredConverters());
        return linkedHashMap;
    }

    @Override // com.indeed.android.messaging.data.MessagingDatabase
    public final ConversationDao y() {
        return (ConversationDao) this.l.getValue();
    }

    @Override // com.indeed.android.messaging.data.MessagingDatabase
    public final EventDao z() {
        return (EventDao) this.m.getValue();
    }
}
