package defpackage;

import android.content.Context;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.cv8;
import defpackage.sp7;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jt implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jt(mj3 mj3Var, g4a g4aVar, List list, g4a g4aVar2) {
        this.a = 2;
        this.b = mj3Var;
        this.c = g4aVar;
        this.e = list;
        this.d = g4aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        String str;
        int i = this.a;
        String str2 = "";
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-add-nursing-license", "save", null, null, 12));
                ((Function1) obj4).invoke(new av8((String) null, (String) ((g4a) obj3).getValue(), (List) null, (cv8.d) null, new cv8.b(null, null, null, null, null, null, null, null, (String) ((g4a) obj2).getValue()), k38.e, (ig3) ((g4a) obj).getValue(), 141));
                break;
            case 1:
                u63.Y((e13) obj4, null, null, new er0((ude) obj3, (SavedJobsDto) obj2, (Context) obj, null), 3);
                break;
            case 2:
                mj3 mj3Var = (mj3) obj4;
                List list = (List) obj;
                g4a g4aVar = (g4a) obj2;
                Integer num = (Integer) ((g4a) obj3).getValue();
                if (num != null && (str = (String) list.get(num.intValue())) != null) {
                    str2 = str;
                }
                String strP = mh2.p(str2);
                Function1<lx5, j6g> function1 = c05.a;
                c05.a.invoke(tx5.k(c05.b, "myjobs_native_screen", "invitationDeclineSurveyCTA", new a03(2, mj3Var.d, strP, mj3Var.e), 4));
                mj3Var.a.invoke(str2, (String) g4aVar.getValue());
                break;
            default:
                qa9.b(ca9.c, "Edit");
                ((g4a) obj3).setValue("");
                ((g4a) obj2).setValue(null);
                ((g4a) obj).setValue("");
                ((iba) obj4).r();
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ jt(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
