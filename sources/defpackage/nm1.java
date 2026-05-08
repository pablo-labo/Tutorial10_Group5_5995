package defpackage;

import android.view.View;
import com.indeed.android.jsmappservices.bridge.AceOpenConversationWithIdData;
import com.indeed.android.messaging.data.conversations.ConversationDao_Impl;
import com.indeed.android.messaging.data.events.EventDao_Impl;
import defpackage.lx5;
import defpackage.no8;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nm1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nm1(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                AceOpenConversationWithIdData aceOpenConversationWithIdData = (AceOpenConversationWithIdData) obj3;
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("conversationId", aceOpenConversationWithIdData.a);
                bVar.a("from", (String) obj2);
                String str = aceOpenConversationWithIdData.b;
                if (str == null) {
                    str = "";
                }
                bVar.a("messageContent", str);
                String str2 = aceOpenConversationWithIdData.c;
                bVar.a("agentType", str2 != null ? str2 : "");
                return j6g.a;
            case 1:
                return ConversationDao_Impl.getDraftById$lambda$5("SELECT * FROM draftrecord WHERE conversationId = ?", (String) obj2, (ConversationDao_Impl) obj3, (zhd) obj);
            case 2:
                return EventDao_Impl.saveEvent$lambda$0((EventDao_Impl) obj3, (List) obj2, (zhd) obj);
            case 3:
                lx5.b bVar2 = (lx5.b) obj;
                bVar2.getClass();
                bVar2.a("source", (String) obj2);
                ((Function1) obj3).invoke(bVar2);
                return j6g.a;
            case 4:
                ljg ljgVar = (ljg) obj;
                ljgVar.getClass();
                n76.g((g4a) obj3, true);
                ((g4a) obj2).setValue(new ah2(-738581106, new f76(ljgVar, i2), true));
                return j6g.a;
            case 5:
                g4a g4aVar = (g4a) obj2;
                if (!((hee) obj3).c()) {
                    g4aVar.setValue(null);
                }
                return j6g.a;
            case 6:
                bo8 bo8Var = (bo8) obj2;
                no8.c cVarB = ((no8) obj3).b(((Integer) obj).intValue());
                int i3 = cVarB.a;
                List<ld6> list = cVarB.b;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i4 = 0;
                while (i2 < size) {
                    int i5 = (int) list.get(i2).a;
                    arrayList.add(new Pair(Integer.valueOf(i3), new iq2(bo8Var.a(i4, i5))));
                    i3++;
                    i4 += i5;
                    i2++;
                }
                return arrayList;
            default:
                View view = (View) obj3;
                m6f m6fVar = (m6f) obj2;
                if (((d6f) ((jz2) obj).a()) != null) {
                    view.requestFocus(130);
                    m6fVar.J();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ nm1(String str, int i, Object obj) {
        this.a = i;
        this.b = str;
        this.c = obj;
    }
}
