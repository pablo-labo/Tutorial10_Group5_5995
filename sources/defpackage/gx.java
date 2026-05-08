package defpackage;

import androidx.fragment.app.FragmentManager;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.fr0;
import defpackage.o7d;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.test.internal.TestMainDispatcherFactory;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gx implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gx(l89 l89Var, ArrayList arrayList, TestMainDispatcherFactory testMainDispatcherFactory) {
        this.a = 10;
        this.b = l89Var;
        this.c = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object] */
    @Override // defpackage.gu5
    public final Object invoke() {
        Object aVar;
        int i = this.a;
        boolean z = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                yvb yvbVar = (yvb) obj2;
                String str = (String) ((g4a) obj).getValue();
                if (str == null) {
                    str = "";
                }
                yvbVar.t(str);
                return j6g.a;
            case 1:
                ((fr0) obj2).r(new fr0.b.m(((SavedJobsDto) obj).getJobkey()));
                return j6g.a;
            case 2:
                ((Function1) obj2).invoke((wj1) obj);
                return j6g.a;
            case 3:
                ((luc) obj2).element = om2.a((fn5) obj, lab.a);
                return j6g.a;
            case 4:
                ((Function1) obj2).invoke((vnd) obj);
                return j6g.a;
            case 5:
                u67 u67Var = (u67) obj2;
                g4a g4aVar = (g4a) obj;
                g4aVar.setValue(Boolean.TRUE);
                qg4 qg4Var = new qg4(2, g4aVar);
                u67Var.d.f("pull-down-refresh");
                u63.Y(ee3.p(u67Var), null, null, new v67(u67Var, qg4Var, null), 3);
                return j6g.a;
            case 6:
                ka2.H((String) obj2, false, false, (FragmentManager) obj);
                return j6g.a;
            case 7:
                e2b e2bVar = (e2b) obj2;
                e13 e13Var = (e13) obj;
                if (e2bVar.c()) {
                    u63.Y(e13Var, null, null, new l1b(e2bVar, null), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                hne hneVar = (hne) obj2;
                gu5 gu5Var = (gu5) obj;
                if (hneVar != null) {
                    hneVar.c();
                }
                gu5Var.invoke();
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                String str2 = (String) obj2;
                Function1 function1 = (Function1) obj;
                if (str2 != null) {
                    function1.invoke(str2);
                }
                return j6g.a;
            default:
                try {
                    k89 k89VarA = ((l89) obj2).a((ArrayList) obj);
                    if (!(k89VarA.J1() instanceof iu9)) {
                        return k89VarA;
                    }
                    try {
                        k89VarA.v1(k89VarA, new udb());
                        aVar = j6g.a;
                        break;
                    } catch (Throwable th) {
                        aVar = new o7d.a(th);
                    }
                    ja.m("Dispatchers.Main was accessed when the platform dispatcher was absent and the test dispatcher was unset. Please make sure that Dispatchers.setMain() is called before accessing Dispatchers.Main and that Dispatchers.Main is not accessed after Dispatchers.resetMain().", o7d.a(aVar));
                    return null;
                } catch (Throwable th2) {
                    ja.m("Dispatchers.Main was accessed when the platform dispatcher was absent and the test dispatcher was unset. Please make sure that Dispatchers.setMain() is called before accessing Dispatchers.Main and that Dispatchers.Main is not accessed after Dispatchers.resetMain().", th2);
                    return null;
                }
        }
    }

    public /* synthetic */ gx(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
