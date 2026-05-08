package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.gs7;
import defpackage.xa1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qv implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qv(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke((cqb) obj);
                break;
            case 1:
                ((u12) obj2).f(obj);
                break;
            case 2:
                zhd zhdVarA = ((xa1.a) obj2).a((String) obj);
                zkd.y(zhdVarA, "PRAGMA query_only = 1");
                break;
            case 3:
                n76.h((g4a) obj2, (g4a) obj);
                break;
            case 4:
                e37.a((Context) obj2);
                ((gu5) obj).invoke();
                break;
            case 5:
                ka2.H((String) obj2, false, false, (FragmentManager) obj);
                break;
            case 6:
                ((kbc) obj2).L((FragmentManager) obj, "AceConversationBottomSheet");
                break;
            case 7:
                bhd bhdVar = (bhd) obj;
                ((wu5) obj2).q(bhdVar.a, bhdVar.d, "countryList");
                break;
            case 8:
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((Function1) obj2).invoke(((dub) obj).c);
                break;
            case 10:
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU = ((g) obj2).u();
                lr5VarU.getClass();
                vr7Var.a(lr5VarU, new gs7.b(null, new yzb((wu5) obj, 1)));
                break;
            default:
                ((Function1) obj2).invoke(vje.g((yie) obj));
                break;
        }
        return j6g.a;
    }
}
