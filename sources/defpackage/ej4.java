package defpackage;

import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ej4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ej4(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                wj8 wj8Var = (wj8) obj;
                wj8Var.getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-edit-language", "save", null, null, 12));
                function1.invoke(wj8Var);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-edit-language", "undo-delete", null, null, 12));
                function1.invoke(str);
                break;
            case 2:
                ConversationRecord conversationRecord = (ConversationRecord) obj;
                conversationRecord.getClass();
                function1.invoke(conversationRecord.getId());
                break;
            case 3:
                sl8 sl8Var = (sl8) obj;
                sl8Var.getClass();
                function1.invoke(new th7(sl8Var.a()));
                break;
            default:
                ((Boolean) obj).booleanValue();
                function1.invoke(SearchType.b);
                break;
        }
        return j6g.a;
    }
}
