package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.fragment.app.g;
import androidx.navigation.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.profile.screens.sheets.profilesubtab.skills.a;
import defpackage.af1;
import defpackage.dr9;
import expo.modules.video.player.VideoPlayer;
import expo.modules.video.player.a;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pa implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pa(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 1;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((ra) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 1:
                return Integer.valueOf(((af1.b) obj3).a(0, ((Integer) obj).intValue()));
            case 2:
                ((Integer) obj2).getClass();
                by2.e((w47) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 3:
                ((Integer) obj2).getClass();
                ((bj4) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 4:
                ((Integer) obj2).getClass();
                ((a) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 5:
                Function1 function1 = (Function1) obj3;
                int iIntValue = ((Integer) obj).intValue();
                ((Boolean) obj2).booleanValue();
                function1.invoke(Boolean.valueOf(iIntValue == 0));
                return j6g.a;
            case 6:
                String str = (String) obj;
                ((Boolean) obj2).getClass();
                str.getClass();
                g3a<jz2<j6g>> g3aVar = kqg.a;
                lr5 lr5VarU = ((g) obj3).u();
                lr5VarU.getClass();
                kqg.a(str, lr5VarU, true, null);
                return j6g.a;
            case 7:
                ((Integer) obj2).getClass();
                s27.a((File) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 8:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                z77 z77Var = ((JobSearchApplication) obj3).f;
                if (z77Var != null) {
                    return z77Var;
                }
                wl7.g("indeedMobileCookieHandler");
                throw null;
            case DatadogLogGenerator.CRASH /* 9 */:
                final dr9 dr9Var = (dr9) obj3;
                b bVar = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    final lr5 lr5VarU2 = dr9Var.requireActivity().u();
                    lr5VarU2.getClass();
                    final boolean zE = ((bp7) cr8.p(bp7.class)).e();
                    ne4 ne4Var = p97.a;
                    ((kr7) cr8.p(kr7.class)).e("jsj_ifl7_tst");
                    rm2.a(ne4Var.a(h07.a), bh2.c(-414816047, new Function2() { // from class: cr9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            e eVarK;
                            b bVar2 = (b) obj4;
                            int iIntValue3 = ((Integer) obj5).intValue();
                            if (bVar2.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                boolean z = zE;
                                dr9 dr9Var2 = dr9Var;
                                lr5 lr5Var = lr5VarU2;
                                b.a.C0020a c0020a = b.a.a;
                                if (z) {
                                    bVar2.L(-1163866874);
                                    u67 u67VarP = dr9Var2.P();
                                    kta ktaVar = (kta) dr9Var2.V.getValue();
                                    fnf fnfVar = (fnf) dr9Var2.Y.getValue();
                                    d4g d4gVar = (d4g) dr9Var2.b0.getValue();
                                    j7d j7dVar = (j7d) dr9Var2.c0.getValue();
                                    try {
                                        eVarK = mh2.k(dr9Var2);
                                    } catch (IllegalStateException unused) {
                                        eVarK = null;
                                    }
                                    e eVar = eVarK;
                                    boolean zX = bVar2.x(dr9Var2);
                                    Object objV = bVar2.v();
                                    if (zX || objV == c0020a) {
                                        dr9.c cVar = new dr9.c(1, dr9Var2, dr9.class, "showSelectedConversationFragment", "showSelectedConversationFragment(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", 0);
                                        bVar2.p(cVar);
                                        objV = cVar;
                                    }
                                    Function1 function12 = (Function1) objV;
                                    boolean zX2 = bVar2.x(dr9Var2);
                                    Object objV2 = bVar2.v();
                                    if (zX2 || objV2 == c0020a) {
                                        dr9.d dVar = new dr9.d(2, dr9Var2, dr9.class, "notifyScrollState", "notifyScrollState(ZLcom/indeed/android/uiplugin/tab/eventmanager/ScrollDirection;)V", 0);
                                        bVar2.p(dVar);
                                        objV2 = dVar;
                                    }
                                    Function2 function2 = (Function2) ((ve8) objV2);
                                    boolean zX3 = bVar2.x(lr5Var) | bVar2.x(dr9Var2);
                                    Object objV3 = bVar2.v();
                                    if (zX3 || objV3 == c0020a) {
                                        objV3 = new s71(4, lr5Var, dr9Var2);
                                        bVar2.p(objV3);
                                    }
                                    ak2.c(36864, (gu5) objV3, u67VarP, ktaVar, j7dVar, fnfVar, d4gVar, bVar2, lr5Var, eVar, function12, function2);
                                    bVar2.F();
                                } else {
                                    bVar2.L(-1162567974);
                                    boolean zX4 = bVar2.x(lr5Var);
                                    Object objV4 = bVar2.v();
                                    if (zX4 || objV4 == c0020a) {
                                        objV4 = new o91(lr5Var, 12);
                                        bVar2.p(objV4);
                                    }
                                    gu5 gu5Var = (gu5) objV4;
                                    boolean zX5 = bVar2.x(lr5Var) | bVar2.x(dr9Var2);
                                    Object objV5 = bVar2.v();
                                    if (zX5 || objV5 == c0020a) {
                                        objV5 = new jp0(8, lr5Var, dr9Var2);
                                        bVar2.p(objV5);
                                    }
                                    u39.a(gu5Var, (gu5) objV5, bVar2, 0);
                                    bVar2.F();
                                }
                            } else {
                                bVar2.D();
                            }
                            return j6g.a;
                        }
                    }, bVar), bVar, 56);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 10:
                ((zk6) ((tga) obj3).c.getValue()).getClass();
                zk6.b((ApiError) obj, (Request) obj2);
                return j6g.a;
            case 11:
                ((Integer) obj2).getClass();
                s7b.e((t7b) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 12:
                o97 o97Var = (o97) obj3;
                b bVar2 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ay1.b(androidx.compose.foundation.layout.g.f(e.a.b, 1.0f), ggd.a(16.0f), null, null, null, bh2.c(836991593, new bq0(o97Var, i2), bVar2), bVar2, 196614, 28);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            default:
                VideoPlayer videoPlayer = (VideoPlayer) obj3;
                float fFloatValue = ((Float) obj).floatValue();
                Float f = (Float) obj2;
                f.getClass();
                videoPlayer.X.k0(videoPlayer.k0() ? 0.0f : fFloatValue);
                videoPlayer.e0 = videoPlayer.o0();
                videoPlayer.s0(new a.r(fFloatValue, f));
                return j6g.a;
        }
    }

    public /* synthetic */ pa(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
