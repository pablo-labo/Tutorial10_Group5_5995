package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.R;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.b29;
import defpackage.os7;
import defpackage.pld;
import defpackage.sp7;
import defpackage.ude;
import defpackage.ur7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class za implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ za(g4a g4aVar, g4a g4aVar2) {
        this.a = 4;
        this.c = g4aVar;
        this.b = g4aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        ps7 ps7Var = ps7.b;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((iba) obj2).p("TIME_PERIOD");
                ((g4a) obj).setValue("");
                return j6g.a;
            case 1:
                fd fdVar = (fd) obj2;
                pr7 pr7VarP = jsb.p((m61) obj);
                fdVar.close();
                Function2<? super ps7, ? super pr7, j6g> function2 = fdVar.j0;
                if (function2 != null) {
                    function2.invoke(ps7Var, pr7VarP);
                }
                return j6g.a;
            case 2:
                sq sqVar = (sq) obj2;
                yr7 yr7VarE = jsb.e((wj8) obj);
                sqVar.close();
                Function2<? super ps7, ? super yr7, j6g> function22 = sqVar.j0;
                if (function22 != null) {
                    function22.invoke(ps7Var, yr7VarE);
                }
                return j6g.a;
            case 3:
                ((gi4) obj2).Q(ps7Var, jsb.q((go4) obj));
                return j6g.a;
            case 4:
                n76.h((g4a) obj, (g4a) obj2);
                return j6g.a;
            case 5:
                ((Function1) obj2).invoke(((vnd) obj).a);
                return j6g.a;
            case 6:
                ude udeVar = (ude) obj2;
                Context context = (Context) obj;
                String string = context.getString(R.string.we_re_working_on_it);
                string.getClass();
                String string2 = context.getString(R.string.interview_tab_dialog_body);
                string2.getClass();
                udeVar.m(new ude.c.a0(string, string2, "app-tracker-interviews-emptytabmodalcta"));
                udeVar.m(new ude.c.s("Interview"));
                return j6g.a;
            case 7:
                ((kbc) obj2).L((FragmentManager) obj, "ScheduleApplyOnboardingBottomSheet");
                return j6g.a;
            case 8:
                u63.Y((e13) obj2, null, null, new b29.b((hw9) obj, null), 3);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab-commute-time-preference", "save", null, null, 12));
                ((Function1) obj2).invoke(Integer.valueOf(((Number) ((g4a) obj).getValue()).intValue()));
                return j6g.a;
            case 10:
                ((x1c) obj2).B(false);
                ((gu5) obj).invoke();
                return j6g.a;
            case 11:
                av8 av8Var = (av8) obj2;
                Function2 function23 = (Function2) obj;
                String str = av8Var.a;
                if (str != null) {
                    function23.invoke(av8Var.f, str);
                }
                return j6g.a;
            case 12:
                ((Function1) obj2).invoke((k38) obj);
                return j6g.a;
            case 13:
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU = ((g) obj2).u();
                lr5VarU.getClass();
                vr7Var.b(lr5VarU, new os7.d(null, new ozb((wu5) obj, 0)), ur7.a.a);
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                xac xacVar = (xac) obj2;
                boolean zBooleanValue = ((Boolean) ((g4a) obj).getValue()).booleanValue();
                c7 c7Var = xacVar.e;
                if (zBooleanValue) {
                    if (c7Var == null) {
                        wl7.g("binding");
                        throw null;
                    }
                    c7Var.d.setVisibility(0);
                    c7 c7Var2 = xacVar.e;
                    if (c7Var2 == null) {
                        wl7.g("binding");
                        throw null;
                    }
                    c7Var2.d.post(new rx0(xacVar, 7));
                } else {
                    if (c7Var == null) {
                        wl7.g("binding");
                        throw null;
                    }
                    c7Var.d.setVisibility(8);
                    c7 c7Var3 = xacVar.e;
                    if (c7Var3 == null) {
                        wl7.g("binding");
                        throw null;
                    }
                    c7Var3.d.clearFocus();
                }
                return j6g.a;
            default:
                ((pld) obj2).q(new pld.c.f(((SavedJobsDto) obj).getJobkey()));
                return j6g.a;
        }
    }

    public /* synthetic */ za(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
