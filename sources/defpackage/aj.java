package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.layout.w;
import com.indeed.android.jobsearch.R;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import com.swmansion.rnscreens.a;
import com.swmansion.rnscreens.d;
import defpackage.csf;
import defpackage.ude;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aj(luc lucVar, d dVar) {
        this.a = 3;
        this.c = lucVar;
        this.b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                f51 f51Var = (f51) obj3;
                String str = (String) obj;
                str.getClass();
                Locale locale = (Locale) ((luc) obj2).element;
                f51Var.y(str, locale != null ? locale.getCountry() : null);
                return j6g.a;
            case 1:
                ArrayList arrayList = (ArrayList) obj3;
                int[] iArr = (int[]) obj2;
                w.a aVar = (w.a) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    w.a.y(aVar, (w) arrayList.get(i2), 0, iArr[i2]);
                }
                return j6g.a;
            case 2:
                hw9 hw9Var = (hw9) obj3;
                d40<iw9> d40Var = hw9Var.c;
                e13 e13Var = (e13) obj2;
                s5e s5eVar = (s5e) obj;
                if (hw9Var.c()) {
                    vm7 vm7Var = new vm7(hw9Var, e13Var);
                    qf8<Object>[] qf8VarArr = o5e.a;
                    s5eVar.a(v4e.u, new r5(null, vm7Var));
                    Object value = ((gme) d40Var.g).getValue();
                    iw9 iw9Var = iw9.c;
                    if (value == iw9Var) {
                        s5eVar.a(v4e.s, new r5(null, new yp0(6, hw9Var, e13Var)));
                    } else if (d40Var.e().d(iw9Var)) {
                        s5eVar.a(v4e.t, new r5(null, new pc7(hw9Var, e13Var)));
                    }
                }
                return j6g.a;
            case 3:
                d dVar = (d) obj3;
                sqd sqdVar = (sqd) obj;
                sqdVar.getClass();
                return Boolean.valueOf(!(sqdVar == ((luc) obj2).element || z92.I0(dVar.a0, sqdVar)) || sqdVar.l().getActivityState() == a.EnumC0194a.a);
            case 4:
                l4e l4eVar = new l4e(0, (gu5) obj);
                w34 w34Var = new w34(9, (iy3) obj3, (g4a) obj2);
                if (i89.a()) {
                    return i89.b(l4eVar, w34Var, Build.VERSION.SDK_INT == 28 ? xbb.a : ybb.a);
                }
                b0.u("Magnifier is only supported on API level 28 and higher.");
                return null;
            case 5:
                vde vdeVarI = ((ude) obj3).i();
                ude.c.g0 g0Var = (ude.c.g0) ((ude.c) obj2);
                String str2 = g0Var.a;
                SavedJobsDto savedJobsDto = g0Var.b;
                Context context = g0Var.d;
                str2.getClass();
                savedJobsDto.getClass();
                context.getClass();
                ArrayList arrayList2 = new ArrayList();
                if (c0h.P(savedJobsDto)) {
                    String string = context.getString(R.string.hired);
                    string.getClass();
                    String string2 = context.getString(R.string.status_updated);
                    string2.getClass();
                    fo7 fo7Var = new fo7(4, string, R.drawable.icon_hired, new ude.a.C0431a(12, savedJobsDto, string2), null, 16);
                    String string3 = context.getString(R.string.not_selected_by_employer);
                    string3.getClass();
                    String string4 = context.getString(R.string.status_updated);
                    string4.getClass();
                    arrayList2.addAll(u63.a0(fo7Var, new fo7(5, string3, R.drawable.icon_not_selected, new ude.a.d(savedJobsDto, string4), null, 16)));
                } else {
                    if (!savedJobsDto.getEmployerStartedReview() && !wl7.b(savedJobsDto.getEmployerReplyLikelihood(), "RESPONSE_UNLIKELY")) {
                        String string5 = context.getString(R.string.applied);
                        string5.getClass();
                        String string6 = context.getString(R.string.status_updated);
                        string6.getClass();
                        arrayList2.add(new fo7(1, string5, R.drawable.applied_icon, new ude.a.i(savedJobsDto, string6), null, 16));
                    }
                    String string7 = context.getString(R.string.interviewing);
                    string7.getClass();
                    String string8 = context.getString(R.string.status_updated);
                    string8.getClass();
                    fo7 fo7Var2 = new fo7(2, string7, R.drawable.icon_interviewing, new ude.a.b(12, savedJobsDto, string8), null, 16);
                    String string9 = context.getString(R.string.offer_received);
                    string9.getClass();
                    String string10 = context.getString(R.string.status_updated);
                    string10.getClass();
                    fo7 fo7Var3 = new fo7(3, string9, R.drawable.offer_received, new ude.a.e(12, savedJobsDto, string10), null, 16);
                    String string11 = context.getString(R.string.hired);
                    string11.getClass();
                    String string12 = context.getString(R.string.status_updated);
                    string12.getClass();
                    fo7 fo7Var4 = new fo7(4, string11, R.drawable.icon_hired, new ude.a.C0431a(12, savedJobsDto, string12), null, 16);
                    String string13 = context.getString(R.string.not_selected_by_employer);
                    string13.getClass();
                    String string14 = context.getString(R.string.status_updated);
                    string14.getClass();
                    fo7 fo7Var5 = new fo7(5, string13, R.drawable.icon_not_selected, new ude.a.d(savedJobsDto, string14), null, 16);
                    String string15 = context.getString(R.string.no_longer_interested);
                    string15.getClass();
                    String string16 = context.getString(R.string.status_updated);
                    string16.getClass();
                    arrayList2.addAll(u63.a0(fo7Var2, fo7Var3, fo7Var4, fo7Var5, new fo7(6, string15, R.drawable.thums_down_icon, new ude.a.c(savedJobsDto, string16), null, 16)));
                }
                String string17 = context.getString(R.string.update_application_status);
                string17.getClass();
                return vde.a(vdeVarI, new kk1(string17, str2, arrayList2, new hs(4), "Applied", true), true, g0Var.c, null, null, null, null, null, false, null, null, null, 4088);
            case 6:
                ((String) obj).getClass();
                ((Function1) obj3).invoke((zie) obj2);
                return j6g.a;
            default:
                csf csfVar = (csf) obj3;
                csf.d dVar2 = (csf.d) obj2;
                csfVar.i.add(dVar2);
                return new jsf(csfVar, dVar2);
        }
    }

    public /* synthetic */ aj(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
