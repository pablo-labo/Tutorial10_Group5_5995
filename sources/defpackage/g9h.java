package defpackage;

import com.google.android.gms.common.api.Scope;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g9h implements Comparator {
    public static final /* synthetic */ g9h b = new g9h(0);
    public final /* synthetic */ int a;

    public /* synthetic */ g9h(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 1:
                return ak2.i(Long.valueOf(-((File) obj).lastModified()), Long.valueOf(-((File) obj2).lastModified()));
            default:
                return ak2.i(((ConversationRecord.Participant) obj).getAnonymousGuestEmailId(), ((ConversationRecord.Participant) obj2).getAnonymousGuestEmailId());
        }
    }
}
