package defpackage;

import com.indeed.android.messaging.data.conversations.model.SuggestedMessageModel;
import defpackage.b5a;
import defpackage.ks0;
import defpackage.ude;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a10 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a10(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj2;
                SuggestedMessageModel suggestedMessageModel = (SuggestedMessageModel) ((g4a) obj).getValue();
                if (suggestedMessageModel != null) {
                    function1.invoke(suggestedMessageModel);
                }
                break;
            case 1:
                u63.Y((e13) obj, null, null, new ks0.d((e8a) obj2, null), 3);
                break;
            case 2:
                ((Function1) obj2).invoke((String) obj);
                break;
            case 3:
                u63.Y((e13) obj, null, null, new x4b((fe1) obj2, null), 3);
                break;
            case 4:
                ((e8a) obj).a0.k(new b5a.b(n7g.a(ie7.f, "app-tracker-saved-emptysavedtabcta")));
                ((ude) obj2).m(new ude.c.f());
                break;
            default:
                ((Function1) obj2).invoke(vje.g((yie) obj));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ a10(Function1 function1, Object obj, int i) {
        this.a = i;
        this.c = function1;
        this.b = obj;
    }
}
