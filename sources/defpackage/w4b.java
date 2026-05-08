package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class w4b<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return ak2.i(((ConversationRecord.Participant) t).getAnonymousEmployerId(), ((ConversationRecord.Participant) t2).getAnonymousEmployerId());
    }
}
