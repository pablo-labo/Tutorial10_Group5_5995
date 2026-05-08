package defpackage;

import androidx.compose.foundation.lazy.layout.j;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.ComposeView;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment;
import com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment.e;
import com.indeed.android.jobsearch.updatedterms.BlockingToSFragment;
import com.indeed.android.jobsearch.updatedterms.BlockingToSFragment.a;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.b29;
import defpackage.cva;
import defpackage.fr0;
import defpackage.gka;
import defpackage.sp7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class as implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ as(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        String str;
        int i = this.a;
        int i2 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((iba) obj2).p("DESCRIPTION");
                ((g4a) obj).setValue(null);
                return j6g.a;
            case 1:
                wv wvVar = (wv) obj2;
                ks7 ks7VarI = jsb.i((p6c) obj);
                wvVar.close();
                Function2<? super ps7, ? super ks7, j6g> function2 = wvVar.i0;
                if (function2 != null) {
                    function2.invoke(wvVar.j0 ? ps7.a : ps7.b, ks7VarI);
                }
                return j6g.a;
            case 2:
                ((fr0) obj2).r(new fr0.b.l(((SavedJobsDto) obj).getJobkey()));
                return j6g.a;
            case 3:
                pif pifVar = (pif) obj2;
                le0 le0Var = (le0) obj;
                if (pifVar == null) {
                    return le0Var;
                }
                SnapshotStateList<Function1<gcf, j6g>> snapshotStateList = pifVar.c;
                boolean zIsEmpty = snapshotStateList.isEmpty();
                le0 le0Var2 = pifVar.b;
                if (!zIsEmpty) {
                    gcf gcfVar = new gcf(le0Var2);
                    int size = snapshotStateList.size();
                    while (i2 < size) {
                        snapshotStateList.get(i2).invoke(gcfVar);
                        i2++;
                    }
                    le0Var2 = gcfVar.b;
                }
                pifVar.b = le0Var2;
                return le0Var2 == null ? le0Var : le0Var2;
            case 4:
                BlockingToSFragment blockingToSFragment = (BlockingToSFragment) obj2;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("BlockingToSFragment", "accept-terms", null, null, 12));
                u63.Y(hh1.A(blockingToSFragment), null, null, blockingToSFragment.new a((ComposeView) obj, null), 3);
                return j6g.a;
            case 5:
                gu5 gu5Var = (gu5) obj2;
                gu5 gu5Var2 = (gu5) obj;
                if (gu5Var != null) {
                    gu5Var.invoke();
                }
                gu5Var2.invoke();
                return j6g.a;
            case 6:
                cva cvaVar = (cva) ((fl3) obj2).f.getValue();
                cvaVar.getClass();
                ((UUID) obj).getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = cvaVar.d.entrySet().iterator();
                if (!it.hasNext()) {
                    return linkedHashSet;
                }
                ((cva.a) ((Map.Entry) it.next()).getValue()).getClass();
                throw null;
            case 7:
                GhostwriterDebugFragment ghostwriterDebugFragment = (GhostwriterDebugFragment) obj;
                u63.Y((e13) obj2, null, null, ghostwriterDebugFragment.new e(null), 3);
                Iterable iterable = (Iterable) ghostwriterDebugFragment.c.a.getValue();
                ArrayList arrayList = new ArrayList(t92.r0(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((vnd) it2.next()).a);
                }
                Iterable iterable2 = (Iterable) ghostwriterDebugFragment.e.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : iterable2) {
                    if (!arrayList.contains(((vnd) obj3).a)) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            case 8:
                ((Function1) obj2).invoke((vnd) obj);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                u67 u67Var = (u67) obj2;
                w47 w47Var = ((t67) ((g4a) obj).getValue()).e;
                w47Var.getClass();
                tp7 tp7Var = (tp7) cr8.p(tp7.class);
                int iOrdinal = w47Var.ordinal();
                if (iOrdinal == 0) {
                    str = "messagingInbox";
                } else if (iOrdinal == 1) {
                    str = "messagingArchive";
                } else if (iOrdinal == 2) {
                    str = "messagingSpam";
                } else {
                    if (iOrdinal != 3) {
                        l.g();
                        return null;
                    }
                    str = "messagingDrafts";
                }
                tp7Var.b(new sp7.e(str, "messagingInbox"));
                u67Var.h(w47.INBOX);
                return j6g.a;
            case 10:
                e2b e2bVar = (e2b) obj;
                p1b p1bVar = (p1b) ((az3) obj2).getValue();
                return new q1b(e2bVar, p1bVar, new j((oh7) e2bVar.d.f.getValue(), p1bVar));
            case 11:
                u63.Y((e13) obj2, null, null, new b29.a((hw9) obj, null), 3);
                return j6g.a;
            case 12:
                gka gkaVar = (gka) obj2;
                gka.a.b bVar = new gka.a.b(((SavedJobsDto) obj).getJobkey());
                gkaVar.getClass();
                u63.Y(ee3.p(gkaVar), null, null, new ika(null, bVar, gkaVar), 3);
                return j6g.a;
            case 13:
                yba ybaVar = (yba) obj2;
                gu5 gu5Var3 = (gu5) obj;
                ybaVar.V = ybaVar.g().f();
                ybaVar.f = ybaVar.g().e();
                if (gu5Var3 != null) {
                    gu5Var3.invoke();
                }
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((rq7) cr8.p(rq7.class)).i((lr5) obj2, new dsb((x1c) obj, i2));
                return j6g.a;
            case 15:
                x1c.D(((ksb) obj2).Q(), (String) obj);
                return j6g.a;
            case 16:
                ((mhg) obj2).a((String) obj);
                return j6g.a;
            case 17:
                hne hneVar = (hne) obj2;
                gu5 gu5Var4 = (gu5) obj;
                if (hneVar != null) {
                    hneVar.c();
                }
                gu5Var4.invoke();
                return j6g.a;
            default:
                ((Function1) obj2).invoke(((p6c) obj).a);
                return j6g.a;
        }
    }
}
