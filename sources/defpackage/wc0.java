package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class wc0 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ wc0(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 1:
                return ak2.i(((ConversationRecord.Participant) obj).getParticipantName(), ((ConversationRecord.Participant) obj2).getParticipantName());
            case 2:
                return ak2.i(Boolean.valueOf(((SavedJobsDto) obj2).getShouldShowRedDot()), Boolean.valueOf(((SavedJobsDto) obj).getShouldShowRedDot()));
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                if (str == str2) {
                    return 0;
                }
                if (str != null && str.equals(str2)) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
        }
    }
}
