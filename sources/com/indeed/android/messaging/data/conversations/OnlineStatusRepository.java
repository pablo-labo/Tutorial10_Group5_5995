package com.indeed.android.messaging.data.conversations;

import defpackage.j6g;
import defpackage.lu2;
import defpackage.vi5;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\bf\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nH¦@¢\u0006\u0004\b\u0013\u0010\u000fJ0\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/OnlineStatusRepository;", "", "Lvi5;", "", "", "observeOnlineEmployerIds", "()Lvi5;", "", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord;", "conversations", "Lj6g;", "registerTargetsForConversations", "(Ljava/util/List;Llu2;)Ljava/lang/Object;", "", "checkJSOnlineStatusPreference", "(Llu2;)Ljava/lang/Object;", "enabled", "updateJSOnlineStatusPreference", "(ZLlu2;)Ljava/lang/Object;", "refreshRegistration", "advertiserKey", "accountKey", "newStatus", "accountType", "updateEmployerOnlineStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "Companion", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OnlineStatusRepository {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int LISTEN_DURATION_SECONDS = 300;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/OnlineStatusRepository$Companion;", "", "<init>", "()V", "LISTEN_DURATION_SECONDS", "", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int LISTEN_DURATION_SECONDS = 300;

        private Companion() {
        }
    }

    Object checkJSOnlineStatusPreference(lu2<? super Boolean> lu2Var);

    vi5<Set<String>> observeOnlineEmployerIds();

    Object refreshRegistration(lu2<? super j6g> lu2Var);

    Object registerTargetsForConversations(List<ConversationRecord> list, lu2<? super j6g> lu2Var);

    Object updateEmployerOnlineStatus(String str, String str2, String str3, String str4, lu2<? super j6g> lu2Var);

    Object updateJSOnlineStatusPreference(boolean z, lu2<? super Boolean> lu2Var);
}
