package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class hhd implements Comparator {
    public static final hhd b = new hhd(0);
    public final /* synthetic */ int a;

    public /* synthetic */ hhd(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qtc qtcVarH = ((f5e) obj).h();
                qtc qtcVarH2 = ((f5e) obj2).h();
                int iCompare = Float.compare(qtcVarH2.c, qtcVarH.c);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(qtcVarH.b, qtcVarH2.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(qtcVarH.d, qtcVarH2.d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(qtcVarH2.a, qtcVarH.a);
            case 1:
                return ak2.i(Integer.valueOf(((ConversationRecord.Participant) obj).getRole().ordinal() != 0 ? 0 : 1), Integer.valueOf(((ConversationRecord.Participant) obj2).getRole().ordinal() == 0 ? 1 : 0));
            default:
                return ak2.i(((t6h) obj).a, ((t6h) obj2).a);
        }
    }
}
