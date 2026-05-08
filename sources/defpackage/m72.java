package defpackage;

import android.os.Build;
import androidx.compose.ui.layout.w;
import com.indeed.android.myjobs.data.model.AppStatusJob;
import com.indeed.android.myjobs.data.model.UserJobStatus;
import com.indeed.android.myjobs.data.model.dto.DtoExtensionKt;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.ig3;
import defpackage.lx5;
import defpackage.pld;
import defpackage.sp7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m72 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m72(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iJ;
        ig3.b bVar;
        ig3 ig3VarA;
        ig3.b bVar2;
        String str;
        int i = this.a;
        int iG = 0;
        byte b = 0;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                mif mifVar = (mif) obj;
                ((g4a) obj2).setValue(mifVar);
                ((Function1) obj3).invoke(mifVar);
                return j6g.a;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                ((g4a) obj2).setValue(str2);
                ((iba) obj3).r();
                return j6g.a;
            case 2:
                lx5.b bVar3 = (lx5.b) obj;
                w40.l(bVar3, "subTabName", (String) obj2, "uiElement", "nativeMoreIcon");
                bVar3.a("myjobsPageTk", ie7.Z);
                bVar3.a("appTk", (String) obj3);
                return j6g.a;
            case 3:
                bl5 bl5Var = (bl5) obj2;
                gl5 gl5Var = (gl5) obj3;
                w wVar = (w) obj;
                if (wVar != null) {
                    iG = gl5Var.g(wVar);
                    iJ = gl5Var.j(wVar);
                } else {
                    iJ = 0;
                }
                bl5Var.f = new eh7(eh7.a(iG, iJ));
                bl5Var.c = wVar;
                return j6g.a;
            case 4:
                Function1 function1 = (Function1) obj3;
                ig3 ig3Var = (ig3) obj2;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                if (ig3Var != null) {
                    ig3.b bVar4 = ig3Var.c;
                    if (bVar4 != null) {
                        bVar2 = new ig3.b(bool, zBooleanValue ? null : bVar4.b, zBooleanValue ? null : bVar4.c);
                    } else {
                        bVar2 = null;
                    }
                    ig3VarA = ig3.a(ig3Var, null, bool, bVar2, 1);
                } else {
                    ig3 ig3Var2 = v1c.b;
                    ig3.b bVar5 = ig3Var2.c;
                    if (bVar5 != null) {
                        bVar = new ig3.b(bool, zBooleanValue ? null : bVar5.b, zBooleanValue ? null : bVar5.c);
                    } else {
                        bVar = null;
                    }
                    ig3VarA = ig3.a(ig3Var2, null, bool, bVar, 1);
                }
                function1.invoke(ig3VarA);
                return j6g.a;
            case 5:
                Function2 function2 = (Function2) obj2;
                Function1 function12 = (Function1) obj3;
                String str3 = (String) obj;
                boolean zH = v1c.h(str3);
                hvb hvbVar = hvb.a0;
                if (zH) {
                    str3.getClass();
                    function2.invoke(hvbVar, str3);
                    str = "edit-link";
                } else {
                    function12.invoke(hvbVar);
                    str = "add-link";
                }
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab", str, null, null, 12));
                return j6g.a;
            case 6:
                pld pldVar = (pld) obj2;
                SavedJobsDto savedJobsDto = (SavedJobsDto) obj3;
                ((String) obj).getClass();
                String jobkey = savedJobsDto.getJobkey();
                String appTk = savedJobsDto.getAppTk();
                UserJobStatus userJobStatus = savedJobsDto.getUserJobStatus();
                pldVar.q(new pld.c.n(jobkey, appTk, userJobStatus != null ? userJobStatus.getStatus() : null));
                return j6g.a;
            case 7:
                ((old) obj).getClass();
                old oldVarI = ((pld) obj2).i();
                List list = (List) obj3;
                ArrayList arrayList = new ArrayList(t92.r0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(DtoExtensionKt.toSavedJobDTO((AppStatusJob) it.next()));
                }
                return old.a(oldVarI, null, arrayList, false, 0, null, null, false, null, false, null, false, null, null, false, false, 0, 262141);
            case 8:
                ((Function1) obj3).invoke(obj);
                ((Function1) obj2).invoke(obj);
                return j6g.a;
            default:
                pe0 pe0Var = new pe0((gu5) obj, 16);
                o72 o72Var = new o72(9, (iy3) obj3, (g4a) obj2, b == true ? 1 : 0);
                if (i89.a()) {
                    return i89.b(pe0Var, o72Var, Build.VERSION.SDK_INT == 28 ? xbb.a : ybb.a);
                }
                b0.u("Magnifier is only supported on API level 28 and higher.");
                return null;
        }
    }

    public /* synthetic */ m72(int i, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
