package defpackage;

import android.content.Context;
import androidx.compose.ui.layout.w;
import com.facebook.react.bridge.ReadableMap;
import com.indeed.android.messaging.data.conversations.ConversationDao_Impl;
import com.indeed.android.messaging.data.events.EventDao_Impl;
import com.indeed.android.rninterviewprep.RNResumeCoachModule;
import defpackage.lx5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ev2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ev2(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 5;
        this.c = arrayList;
        this.b = arrayList2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                return ConversationDao_Impl.saveConversations$lambda$0((ConversationDao_Impl) obj2, (List) obj3, (zhd) obj);
            case 1:
                return EventDao_Impl.observeLastEvent$lambda$3("SELECT * FROM eventrecord WHERE conversationId = ? ORDER BY timestamp DESC LIMIT 1", (String) obj2, (EventDao_Impl) obj3, (zhd) obj);
            case 2:
                String str = (String) obj2;
                String str2 = (String) obj3;
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("subTabName", "Invitations");
                if (str != null) {
                    bVar.a("entityId", str);
                }
                if (str2 != null) {
                    bVar.a("jobKey", str2);
                }
                return j6g.a;
            case 3:
                ((m74) obj).getClass();
                return new mh4(2, (Context) obj2, (g4a) obj3);
            case 4:
                return RNResumeCoachModule.logResumeCoachEvent$lambda$4((ReadableMap) obj2, (RNResumeCoachModule) obj3, (lx5.b) obj);
            default:
                List list = (List) obj3;
                List list2 = (List) obj2;
                w.a aVar = (w.a) obj;
                if (list != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Pair pair = (Pair) list.get(i2);
                        w.a.w(aVar, (w) pair.a(), ((lh7) pair.b()).a);
                    }
                }
                if (list2 != null) {
                    int size2 = list2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        Pair pair2 = (Pair) list2.get(i3);
                        w wVar = (w) pair2.a();
                        gu5 gu5Var = (gu5) pair2.b();
                        w.a.w(aVar, wVar, gu5Var != null ? ((lh7) gu5Var.invoke()).a : 0L);
                    }
                }
                return j6g.a;
        }
    }

    public /* synthetic */ ev2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
