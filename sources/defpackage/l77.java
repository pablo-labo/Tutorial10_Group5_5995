package defpackage;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import defpackage.jra;
import defpackage.pgd;
import expo.modules.imagepicker.FailedToReadFileException;
import expo.modules.imagepicker.MissingModuleException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class l77 implements jra {
    public final LaunchActivity a;
    public final vx0 b;

    public l77(LaunchActivity launchActivity, vx0 vx0Var) {
        launchActivity.getClass();
        this.a = launchActivity;
        this.b = vx0Var;
    }

    @Override // defpackage.jra
    public final jra.a h(WebView webView, WebResourceRequest webResourceRequest) throws MissingModuleException, FailedToReadFileException {
        LaunchActivity launchActivity = this.a;
        String url = webView.getUrl();
        if (url == null) {
            url = "";
        }
        String string = webResourceRequest.getUrl().toString();
        string.getClass();
        pgd pgdVarB = yhg.a.b(url, string);
        if (!(pgdVarB instanceof pgd.m)) {
            if (!(pgdVarB instanceof pgd.m0) && !(pgdVarB instanceof pgd.g0) && !(pgdVarB instanceof pgd.h0)) {
                return jra.a.b.a;
            }
            this.b.invoke(string);
            return new jra.a.C0281a(pgdVarB);
        }
        try {
            if (!launchActivity.isFinishing()) {
                lr5 lr5VarU = launchActivity.u();
                lr5VarU.getClass();
                String str = ((pgd.m) pgdVarB).b;
                pd1 pd1Var = new pd1(8);
                jr jrVar = new jr(10);
                str.getClass();
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = new IndeedApplyWebViewFragment();
                Bundle bundle = new Bundle();
                bundle.putString("KEY_APPLY_URL", str);
                indeedApplyWebViewFragment.setArguments(bundle);
                indeedApplyWebViewFragment.G0 = pd1Var;
                indeedApplyWebViewFragment.H0 = jrVar;
                indeedApplyWebViewFragment.L(lr5VarU, "IndeedApplyWebViewFragment");
            }
        } catch (Exception e) {
            ArrayList arrayList = lz2.a;
            lz2.c("IndeedApplyModalComponent", "Error occurred in showing Indeed Apply flow", false, e, 4);
        }
        return new jra.a.C0281a();
    }
}
