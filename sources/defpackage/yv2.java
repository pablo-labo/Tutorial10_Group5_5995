package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.ns7;
import defpackage.pld;
import defpackage.ur7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yv2 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yv2(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                u63.Y((e13) obj3, null, null, new cw2((hee) obj2, (g4a) obj, null), 3);
                break;
            case 1:
                FragmentManager fragmentManager = (FragmentManager) obj3;
                String str = (String) obj2;
                Function1 function1 = (Function1) obj;
                br7 br7Var = new br7(function1, 0);
                z0 z0Var = new z0(function1, 11);
                fragmentManager.getClass();
                str.getClass();
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = new IndeedApplyWebViewFragment();
                Bundle bundle = new Bundle();
                bundle.putString("KEY_APPLY_URL", str);
                indeedApplyWebViewFragment.setArguments(bundle);
                indeedApplyWebViewFragment.G0 = br7Var;
                indeedApplyWebViewFragment.H0 = z0Var;
                indeedApplyWebViewFragment.L(fragmentManager, "IndeedApplyWebViewFragment");
                break;
            case 2:
                svb svbVar = (svb) obj2;
                wu5 wu5Var = (wu5) obj;
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU = ((g) obj3).u();
                lr5VarU.getClass();
                j2h j2hVar = (j2h) z92.Q0(svbVar.g);
                ns7.i iVar = new ns7.i(j2hVar != null ? jsb.l(j2hVar) : null, new lzb(wu5Var, 2));
                j2h j2hVar2 = (j2h) z92.Q0(svbVar.g);
                vr7Var.e(lr5VarU, "ProfileUIPlatformDebugScreen", iVar, new ur7.c(j2hVar2 != null ? j2hVar2.a : ""));
                break;
            default:
                SavedJobsDto savedJobsDto = (SavedJobsDto) obj2;
                ((pld) obj3).q(new pld.c.g(savedJobsDto.getJobkey(), savedJobsDto.getJobUrl(), new vi1(5, (e8a) obj, savedJobsDto)));
                break;
        }
        return j6g.a;
    }
}
