package defpackage;

import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import defpackage.cd4;
import defpackage.ig3;
import expo.modules.video.player.VideoPlayer;
import expo.modules.video.player.a;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mh implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Boolean bool = Boolean.FALSE;
                ((g4a) obj3).setValue(new ig3(null, bool, new ig3.b(bool, (s38) obj, (Integer) obj2)));
                break;
            case 1:
                IanMainFragment ianMainFragment = (IanMainFragment) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ne4 ne4Var = p97.a;
                    dd4 dd4Var = dd4.a;
                    ad4 ad4Var = dd4.n().a;
                    ad4Var.getClass();
                    ad4Var.e(cd4.a.D0);
                    cd4.i3.a.getClass();
                    rm2.a(ne4Var.a(h07.a), bh2.c(-1199536426, new rq(ianMainFragment, 3), bVar), bVar, 56);
                } else {
                    bVar.D();
                }
                break;
            case 2:
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = (IndeedApplyWebViewFragment) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    boolean zX = bVar2.x(indeedApplyWebViewFragment);
                    Object objV = bVar2.v();
                    if (zX || objV == c0020a) {
                        objV = new o91(indeedApplyWebViewFragment, 9);
                        bVar2.p(objV);
                    }
                    gu5 gu5Var = (gu5) objV;
                    boolean zX2 = bVar2.x(indeedApplyWebViewFragment);
                    Object objV2 = bVar2.v();
                    if (zX2 || objV2 == c0020a) {
                        objV2 = new oq(indeedApplyWebViewFragment, 11);
                        bVar2.p(objV2);
                    }
                    t54.a(gu5Var, (gu5) objV2, bVar2, 0);
                } else {
                    bVar2.D();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                vj7.e((wj7) obj3, (b) obj, ka2.L(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int i2 = ro7.n0;
                ((ro7) obj3).L(ka2.L(1), (b) obj);
                break;
            case 5:
                JobSearchApplication jobSearchApplication = (JobSearchApplication) obj3;
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                break;
            case 6:
                ((Integer) obj2).getClass();
                b88.b((c88) obj3, (b) obj, ka2.L(1));
                break;
            case 7:
                ApiError apiError = (ApiError) obj;
                apiError.getClass();
                ((zk6) ((epb) obj3).c.getValue()).getClass();
                zk6.b(apiError, (Request) obj2);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int i3 = fyb.n0;
                ((fyb) obj3).L(ka2.L(1), (b) obj);
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((Integer) obj2).getClass();
                int i4 = mud.t0;
                ((mud) obj3).L(ka2.L(1), (b) obj);
                break;
            case 10:
                n6f n6fVar = (n6f) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    bVar3.D();
                } else if (((bp7) cr8.p(bp7.class)).e()) {
                    bVar3.L(-400779134);
                    n6fVar.O(0, bVar3);
                    bVar3.F();
                } else {
                    bVar3.L(-400678105);
                    n6fVar.getD().getClass();
                    bVar3.L(-400566815);
                    String strI = ak2.I(R.string.rnmyjobs_header, bVar3);
                    bVar3.F();
                    String strI2 = ak2.I(R.string.rnmyjobs_logged_out_screen_title, bVar3);
                    bVar3.L(-400402143);
                    String strI3 = ak2.I(R.string.rnmyjobs_logged_out_screen_message, bVar3);
                    bVar3.F();
                    String strI4 = ak2.I(R.string.rnmyjobs_create_account, bVar3);
                    String strI5 = ak2.I(R.string.rnmyjobs_sign_in, bVar3);
                    x2b x2bVarA = z2b.a(R.drawable.hero_working_9, 0, bVar3);
                    boolean zX3 = bVar3.x(n6fVar);
                    Object objV3 = bVar3.v();
                    if (zX3 || objV3 == c0020a) {
                        objV3 = new o91(n6fVar, 25);
                        bVar3.p(objV3);
                    }
                    w39.a(strI, strI2, strI3, strI4, strI5, x2bVarA, (gu5) objV3, bVar3, 0);
                    bVar3.F();
                }
                break;
            case 11:
                jr7 jr7Var = (jr7) obj;
                Exception exc = (Exception) obj2;
                jr7Var.getClass();
                exc.getClass();
                ((z8f) obj3).getClass();
                z8f.b("userDidLogin", jr7Var, exc);
                break;
            default:
                VideoPlayer videoPlayer = (VideoPlayer) obj3;
                cdb cdbVar = (cdb) obj;
                cdb cdbVar2 = (cdb) obj2;
                qf8<Object>[] qf8VarArr = VideoPlayer.w0;
                cdbVar.getClass();
                cdbVar2.getClass();
                videoPlayer.X.g(cdbVar);
                float f = cdbVar2.a;
                float f2 = cdbVar.a;
                if (f != f2) {
                    videoPlayer.s0(new a.g(f2, Float.valueOf(f)));
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ mh(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
