package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.v9b;
import java.util.Locale;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zw2 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zw2(u4b u4bVar, ConversationRecord.Participant participant, String str, String str2) {
        this.b = u4bVar;
        this.c = participant;
        this.d = str;
        this.e = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v51 v51Var;
        u51 u51Var;
        int i = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ax2.a((x1e) obj6, (jta) obj5, (gu5) obj4, (gu5) obj3, (b) obj, ka2.L(1));
                break;
            default:
                u4b u4bVar = (u4b) obj6;
                ConversationRecord.Participant participant = (ConversationRecord.Participant) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int iOrdinal = u4bVar.ordinal();
                    String upperCase = null;
                    if (iOrdinal == 0) {
                        v51Var = v51.SMALL;
                    } else if (iOrdinal != 1) {
                        l.g();
                    } else {
                        v51Var = v51.MEDIUM;
                    }
                    v51 v51Var2 = v51Var;
                    if (v9b.a.b[participant.getRole().ordinal()] == 1) {
                        u51Var = u51.b;
                    } else {
                        wv4 wv4Var = u51.d;
                        int iA = wv4Var.a();
                        u51Var = (u51) wv4Var.get(((str.hashCode() % iA) + iA) % iA);
                    }
                    u51 u51Var2 = u51Var;
                    if (str2 != null) {
                        upperCase = str2.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    }
                    vr6.a(v51Var2, u51Var2, null, upperCase, str2 != null ? "CircularAvatar" : "AnonymousAvatar", bVar, 384, 8);
                } else {
                    bVar.D();
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ zw2(x1e x1eVar, jta jtaVar, gu5 gu5Var, gu5 gu5Var2, int i) {
        this.b = x1eVar;
        this.c = jtaVar;
        this.d = gu5Var;
        this.e = gu5Var2;
    }
}
