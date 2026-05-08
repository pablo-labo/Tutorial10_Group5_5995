package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.R;
import defpackage.os7;
import defpackage.ude;
import defpackage.ur7;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x9 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x9(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15, types: [T, java.lang.Object] */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        int i2 = 7;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((gu5) obj2).invoke();
                ((g4a) obj).setValue(Boolean.FALSE);
                break;
            case 1:
                du duVar = (du) obj2;
                es7 es7VarH = jsb.h((n5b) obj);
                duVar.close();
                Function2<? super ps7, ? super es7, j6g> function2 = duVar.i0;
                if (function2 != null) {
                    function2.invoke(duVar.j0 ? ps7.a : ps7.b, es7VarH);
                }
                break;
            case 2:
                ((iba) obj2).p("LOCATION");
                ((g4a) obj).setValue(null);
                break;
            case 3:
                ((luc) obj).element = ((gu5) obj2).invoke();
                break;
            case 4:
                ude udeVar = (ude) obj2;
                Context context = (Context) obj;
                String string = context.getString(R.string.not_seeing_an_archived_application);
                string.getClass();
                String string2 = context.getString(R.string.archived_tab_dialog_body);
                string2.getClass();
                udeVar.m(new ude.c.a0(string, string2, "app-tracker-archived-emptytabmodalcta"));
                udeVar.m(new ude.c.s("Archived"));
                break;
            case 5:
                ((LinkedHashMap) ((i62) obj2).a).remove((Class) obj);
                break;
            case 6:
                g4a g4aVar = (g4a) obj;
                g4a g4aVar2 = (g4a) obj2;
                kre kreVar = (kre) g4aVar.getValue();
                kre kreVar2 = kre.b;
                kre kreVar3 = kre.a;
                if (kreVar == kreVar2) {
                    g4aVar.setValue(kreVar3);
                } else if (((kre) g4aVar.getValue()) == kreVar3) {
                    g4aVar2.setValue(qi3.a);
                }
                break;
            case 7:
                e37.a((Context) obj);
                ((gu5) obj2).invoke();
                break;
            case 8:
                ka2.H((String) ((luc) obj2).element, false, false, (FragmentManager) obj);
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                so8 so8Var = (so8) obj;
                qn8 qn8Var = (qn8) ((az3) obj2).getValue();
                break;
            case 10:
                ((Function1) obj2).invoke((String) obj);
                break;
            case 11:
                ((Function1) obj).invoke(new vr(7, (gu5) obj2));
                qa9.b(ca9.a, "");
                break;
            case 12:
                ((g4a) obj).setValue((s38) obj2);
                break;
            case 13:
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                break;
            case 15:
                ((Function1) obj2).invoke(((j2h) obj).a);
                break;
            default:
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU = ((g) obj2).u();
                lr5VarU.getClass();
                vr7Var.b(lr5VarU, new os7.f(u63.a0(new qs7("TEST SKILL 1", 5, new ts7(null, null, "TEST SKILL 1", "TEST SKILL 1", null)), new qs7("TEST SKILL 2", 5, new ts7(null, null, "TEST SKILL 2", "TEST SKILL 2", null))), new fr2((wu5) obj, i2)), ur7.b.a);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ x9(int i, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
