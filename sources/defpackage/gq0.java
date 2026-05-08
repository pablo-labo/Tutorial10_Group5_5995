package defpackage;

import android.content.Context;
import androidx.fragment.app.g;
import com.indeed.android.jobsearch.R;
import defpackage.n76;
import defpackage.ns7;
import defpackage.ude;
import defpackage.ur7;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gq0 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gq0(int i, Object obj, Object obj2) {
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
                ude udeVar = (ude) obj2;
                Context context = (Context) obj;
                String string = context.getString(R.string.not_seeing_an_application);
                string.getClass();
                String string2 = context.getString(R.string.applied_tab_dialog_body);
                string2.getClass();
                udeVar.m(new ude.c.a0(string, string2, "app-tracker-applied-emptytabmodalcta"));
                udeVar.m(new ude.c.s("Applied"));
                break;
            case 1:
                fe1 fe1Var = (fe1) obj2;
                e13 e13Var = (e13) obj;
                if (fe1Var.isVisible()) {
                    u63.Y(e13Var, null, null, new yd1(fe1Var, null), 3);
                }
                break;
            case 2:
                u63.Y((e13) obj2, null, null, new am1((hw9) obj, null), 3);
                break;
            case 3:
                break;
            case 4:
                h64 h64Var = (h64) obj;
                h95 h95Var = (h95) ((g64) obj2).c.getValue();
                vfb vfbVar = h64Var.b;
                yn9 yn9VarB = vfbVar.b(h64Var.e);
                yn9VarB.getClass();
                cgb cgbVarC = vfbVar.c();
                cgbVarC.getClass();
                s15 s15Var = h64Var.c;
                ExecutorService executorServiceH = s15Var.h();
                executorServiceH.getClass();
                ExecutorService executorServiceC = s15Var.c();
                executorServiceC.getClass();
                break;
            case 5:
                ((cj4) obj2).Q(ps7.b, jsb.e((wj8) obj));
                break;
            case 6:
                u63.Y((e13) obj2, null, null, new n76.a((Function1) obj, null), 3);
                break;
            case 7:
                ((Function1) obj2).invoke(((vnd) obj).a);
                break;
            case 8:
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU = ((g) obj2).u();
                lr5VarU.getClass();
                vr7Var.e(lr5VarU, "ProfileUIPlatformDebugScreen", new ns7.f(null, new rzb((wu5) obj, 2)), ur7.a.a);
                break;
            default:
                ((Function1) obj2).invoke((List) ((g4a) obj).getValue());
                break;
        }
        return j6g.a;
    }
}
