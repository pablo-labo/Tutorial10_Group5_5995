package defpackage;

import android.util.Log;
import androidx.compose.runtime.b;
import androidx.navigation.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import defpackage.cd4;
import defpackage.jq7;
import expo.modules.video.player.VideoPlayer;
import expo.modules.video.player.a;
import expo.modules.video.records.VideoSource;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w91 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w91(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.a;
        int i3 = 2;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                y91 y91Var = (y91) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ne4 ne4Var = p97.a;
                    dd4 dd4Var = dd4.a;
                    ad4 ad4Var = dd4.n().a;
                    ad4Var.getClass();
                    ad4Var.e(cd4.a.D0);
                    cd4.i3.a.getClass();
                    rm2.a(ne4Var.a(h07.a), bh2.c(38854240, new pj(y91Var, 3), bVar), bVar, 56);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                w02 w02Var = (w02) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ne4 ne4Var2 = p97.a;
                    dd4 dd4Var2 = dd4.a;
                    ad4 ad4Var2 = dd4.n().a;
                    ad4Var2.getClass();
                    ad4Var2.e(cd4.a.D0);
                    cd4.i3.a.getClass();
                    rm2.a(ne4Var2.a(h07.a), bh2.c(1308669921, new v02(w02Var, 0), bVar2), bVar2, 56);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 2:
                IanMainFragment ianMainFragment = (IanMainFragment) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ne4 ne4Var3 = p97.a;
                    dd4 dd4Var3 = dd4.a;
                    ad4 ad4Var3 = dd4.n().a;
                    ad4Var3.getClass();
                    ad4Var3.e(cd4.a.D0);
                    cd4.i3.a.getClass();
                    rm2.a(ne4Var3.a(h07.a), bh2.c(8368023, new pr(ianMainFragment, i3), bVar3), bVar3, 56);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 3:
                qpd qpdVar = (qpd) obj;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                ksa ksaVar = (ksa) qpdVar.a(null, fwc.a.b(gsa.class), null);
                g87 g87Var = ((JobSearchApplication) obj3).b;
                if (g87Var != null) {
                    return new f97(ksaVar, g87Var);
                }
                wl7.g("indeedDeviceId");
                throw null;
            case 4:
                ((Integer) obj2).getClass();
                int i4 = x88.k0;
                ((x88) obj3).L(ka2.L(1), (b) obj);
                return j6g.a;
            case 5:
                ((Integer) obj2).getClass();
                vj8.b((String) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 6:
                ((Integer) obj2).getClass();
                ((faa) obj3).c(ka2.L(1), (b) obj);
                return j6g.a;
            case 7:
                h5b h5bVar = (h5b) obj3;
                b bVar4 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ne4 ne4Var4 = p97.a;
                    dd4 dd4Var4 = dd4.a;
                    ad4 ad4Var4 = dd4.n().a;
                    ad4Var4.getClass();
                    ad4Var4.e(cd4.a.D0);
                    cd4.i3.a.getClass();
                    rm2.a(ne4Var4.a(h07.a), bh2.c(-81313298, new yo0(h5bVar, 7), bVar4), bVar4, 56);
                } else {
                    bVar4.D();
                }
                return j6g.a;
            case 8:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                e.q((iba) obj3, new eq4(str, str2));
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                final x8f x8fVar = (x8f) obj3;
                b bVar5 = (b) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (bVar5.o(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) ((gme) x8fVar.R().b).getValue()).booleanValue();
                    String str3 = (String) ((gme) x8fVar.R().c).getValue();
                    boolean zBooleanValue2 = ((Boolean) ((gme) x8fVar.R().d).getValue()).booleanValue();
                    boolean zX = bVar5.x(x8fVar);
                    Object objV = bVar5.v();
                    int i5 = 18;
                    b.a.C0020a c0020a = b.a.a;
                    if (zX || objV == c0020a) {
                        objV = new j30(x8fVar, i5);
                        bVar5.p(objV);
                    }
                    gu5 gu5Var = (gu5) objV;
                    boolean zX2 = bVar5.x(x8fVar);
                    Object objV2 = bVar5.v();
                    if (zX2 || objV2 == c0020a) {
                        objV2 = new cq0(x8fVar, i5);
                        bVar5.p(objV2);
                    }
                    gu5 gu5Var2 = (gu5) objV2;
                    boolean zX3 = bVar5.x(x8fVar);
                    Object objV3 = bVar5.v();
                    int i6 = 24;
                    if (zX3 || objV3 == c0020a) {
                        objV3 = new a1(x8fVar, i6);
                        bVar5.p(objV3);
                    }
                    gu5 gu5Var3 = (gu5) objV3;
                    boolean zX4 = bVar5.x(x8fVar);
                    Object objV4 = bVar5.v();
                    int i7 = 19;
                    if (zX4 || objV4 == c0020a) {
                        objV4 = new le(x8fVar, i7);
                        bVar5.p(objV4);
                    }
                    gu5 gu5Var4 = (gu5) objV4;
                    boolean zX5 = bVar5.x(x8fVar);
                    Object objV5 = bVar5.v();
                    int i8 = 23;
                    if (zX5 || objV5 == c0020a) {
                        objV5 = new qr(x8fVar, 23);
                        bVar5.p(objV5);
                    }
                    gu5 gu5Var5 = (gu5) objV5;
                    boolean zX6 = bVar5.x(x8fVar);
                    Object objV6 = bVar5.v();
                    if (zX6 || objV6 == c0020a) {
                        objV6 = new xh(x8fVar, 16);
                        bVar5.p(objV6);
                    }
                    gu5 gu5Var6 = (gu5) objV6;
                    boolean zX7 = bVar5.x(x8fVar);
                    Object objV7 = bVar5.v();
                    if (zX7 || objV7 == c0020a) {
                        objV7 = new oe(x8fVar, i7);
                        bVar5.p(objV7);
                    }
                    gu5 gu5Var7 = (gu5) objV7;
                    boolean zX8 = bVar5.x(x8fVar);
                    Object objV8 = bVar5.v();
                    if (zX8 || objV8 == c0020a) {
                        objV8 = new zh(x8fVar, i8);
                        bVar5.p(objV8);
                    }
                    gu5 gu5Var8 = (gu5) objV8;
                    boolean zX9 = bVar5.x(x8fVar);
                    Object objV9 = bVar5.v();
                    if (zX9 || objV9 == c0020a) {
                        objV9 = new vx0(x8fVar, 11);
                        bVar5.p(objV9);
                    }
                    Function1 function1 = (Function1) objV9;
                    boolean zX10 = bVar5.x(x8fVar);
                    Object objV10 = bVar5.v();
                    if (zX10 || objV10 == c0020a) {
                        objV10 = new se(x8fVar, 15);
                        bVar5.p(objV10);
                    }
                    Function1 function12 = (Function1) objV10;
                    boolean zX11 = bVar5.x(x8fVar);
                    Object objV11 = bVar5.v();
                    if (zX11 || objV11 == c0020a) {
                        objV11 = new vz2(x8fVar, 7);
                        bVar5.p(objV11);
                    }
                    Function2 function2 = (Function2) objV11;
                    boolean zX12 = bVar5.x(x8fVar);
                    Object objV12 = bVar5.v();
                    if (zX12 || objV12 == c0020a) {
                        objV12 = new uk7(x8fVar, 1);
                        bVar5.p(objV12);
                    }
                    wu5 wu5Var = (wu5) objV12;
                    boolean zX13 = bVar5.x(x8fVar);
                    Object objV13 = bVar5.v();
                    if (zX13 || objV13 == c0020a) {
                        objV13 = new ig(x8fVar, 24);
                        bVar5.p(objV13);
                    }
                    gu5 gu5Var9 = (gu5) objV13;
                    boolean zX14 = bVar5.x(x8fVar);
                    Object objV14 = bVar5.v();
                    if (zX14 || objV14 == c0020a) {
                        objV14 = new vv(x8fVar, 24);
                        bVar5.p(objV14);
                    }
                    gu5 gu5Var10 = (gu5) objV14;
                    boolean zX15 = bVar5.x(x8fVar);
                    Object objV15 = bVar5.v();
                    if (zX15 || objV15 == c0020a) {
                        objV15 = new oa(x8fVar, 26);
                        bVar5.p(objV15);
                    }
                    gu5 gu5Var11 = (gu5) objV15;
                    boolean zX16 = bVar5.x(x8fVar);
                    Object objV16 = bVar5.v();
                    if (zX16 || objV16 == c0020a) {
                        final int i9 = 1;
                        objV16 = new gu5() { // from class: u8f
                            @Override // defpackage.gu5
                            public final Object invoke() {
                                int i10 = i9;
                                x8f x8fVar2 = x8fVar;
                                switch (i10) {
                                    case 0:
                                        rq7 rq7Var = (rq7) cr8.p(rq7.class);
                                        lr5 lr5VarU = x8fVar2.requireActivity().u();
                                        lr5VarU.getClass();
                                        rq7Var.f(lr5VarU, mh2.k(x8fVar2), jq7.j.INSTANCE, "tare-debug-screen");
                                        break;
                                    default:
                                        rq7 rq7Var2 = (rq7) cr8.p(rq7.class);
                                        lr5 lr5VarU2 = x8fVar2.requireActivity().u();
                                        lr5VarU2.getClass();
                                        rq7Var2.f(lr5VarU2, mh2.k(x8fVar2), jq7.d.INSTANCE, "tare-debug-screen");
                                        break;
                                }
                                return j6g.a;
                            }
                        };
                        bVar5.p(objV16);
                    }
                    gu5 gu5Var12 = (gu5) objV16;
                    boolean zX17 = bVar5.x(x8fVar);
                    Object objV17 = bVar5.v();
                    if (zX17 || objV17 == c0020a) {
                        final int i10 = 1;
                        objV17 = new gu5() { // from class: v8f
                            @Override // defpackage.gu5
                            public final Object invoke() {
                                int i11 = i10;
                                x8f x8fVar2 = x8fVar;
                                switch (i11) {
                                    case 0:
                                        x8fVar2.R();
                                        boolean zH = ((at7) cr8.p(at7.class)).h();
                                        ft7 ft7VarA = ((at7) cr8.p(at7.class)).a();
                                        ArrayList arrayList = lz2.a;
                                        Log.d("TareDebugViewModel", "canShowPushPrompt(): " + zH + ", Current Status: " + ft7VarA, null);
                                        break;
                                    default:
                                        rq7 rq7Var = (rq7) cr8.p(rq7.class);
                                        lr5 lr5VarU = x8fVar2.requireActivity().u();
                                        lr5VarU.getClass();
                                        rq7Var.f(lr5VarU, mh2.k(x8fVar2), jq7.g.INSTANCE, "tare-debug-screen");
                                        break;
                                }
                                return j6g.a;
                            }
                        };
                        bVar5.p(objV17);
                    }
                    gu5 gu5Var13 = (gu5) objV17;
                    boolean zX18 = bVar5.x(x8fVar);
                    Object objV18 = bVar5.v();
                    if (zX18 || objV18 == c0020a) {
                        final int i11 = 0;
                        objV18 = new gu5() { // from class: u8f
                            @Override // defpackage.gu5
                            public final Object invoke() {
                                int i102 = i11;
                                x8f x8fVar2 = x8fVar;
                                switch (i102) {
                                    case 0:
                                        rq7 rq7Var = (rq7) cr8.p(rq7.class);
                                        lr5 lr5VarU = x8fVar2.requireActivity().u();
                                        lr5VarU.getClass();
                                        rq7Var.f(lr5VarU, mh2.k(x8fVar2), jq7.j.INSTANCE, "tare-debug-screen");
                                        break;
                                    default:
                                        rq7 rq7Var2 = (rq7) cr8.p(rq7.class);
                                        lr5 lr5VarU2 = x8fVar2.requireActivity().u();
                                        lr5VarU2.getClass();
                                        rq7Var2.f(lr5VarU2, mh2.k(x8fVar2), jq7.d.INSTANCE, "tare-debug-screen");
                                        break;
                                }
                                return j6g.a;
                            }
                        };
                        bVar5.p(objV18);
                    }
                    gu5 gu5Var14 = (gu5) objV18;
                    boolean zX19 = bVar5.x(x8fVar);
                    Object objV19 = bVar5.v();
                    if (zX19 || objV19 == c0020a) {
                        final int i12 = 0;
                        objV19 = new gu5() { // from class: v8f
                            @Override // defpackage.gu5
                            public final Object invoke() {
                                int i112 = i12;
                                x8f x8fVar2 = x8fVar;
                                switch (i112) {
                                    case 0:
                                        x8fVar2.R();
                                        boolean zH = ((at7) cr8.p(at7.class)).h();
                                        ft7 ft7VarA = ((at7) cr8.p(at7.class)).a();
                                        ArrayList arrayList = lz2.a;
                                        Log.d("TareDebugViewModel", "canShowPushPrompt(): " + zH + ", Current Status: " + ft7VarA, null);
                                        break;
                                    default:
                                        rq7 rq7Var = (rq7) cr8.p(rq7.class);
                                        lr5 lr5VarU = x8fVar2.requireActivity().u();
                                        lr5VarU.getClass();
                                        rq7Var.f(lr5VarU, mh2.k(x8fVar2), jq7.g.INSTANCE, "tare-debug-screen");
                                        break;
                                }
                                return j6g.a;
                            }
                        };
                        bVar5.p(objV19);
                    }
                    gu5 gu5Var15 = (gu5) objV19;
                    Object objV20 = bVar5.v();
                    if (objV20 == c0020a) {
                        i = 18;
                        objV20 = new pd1(i);
                        bVar5.p(objV20);
                    } else {
                        i = 18;
                    }
                    gu5 gu5Var16 = (gu5) objV20;
                    Object objV21 = bVar5.v();
                    if (objV21 == c0020a) {
                        objV21 = new kr(i);
                        bVar5.p(objV21);
                    }
                    gu5 gu5Var17 = (gu5) objV21;
                    boolean zX20 = bVar5.x(x8fVar);
                    Object objV22 = bVar5.v();
                    if (zX20 || objV22 == c0020a) {
                        objV22 = new oq(x8fVar, 28);
                        bVar5.p(objV22);
                    }
                    int i13 = 23;
                    q9f.h(zBooleanValue, str3, zBooleanValue2, gu5Var, gu5Var2, gu5Var3, gu5Var4, gu5Var5, gu5Var6, gu5Var7, gu5Var8, function1, function12, function2, wu5Var, gu5Var9, gu5Var10, gu5Var11, gu5Var12, gu5Var13, gu5Var14, gu5Var15, gu5Var16, gu5Var17, (gu5) objV22, bVar5, 0);
                    if (((Boolean) ((gme) x8fVar.R().e).getValue()).booleanValue()) {
                        bVar5.L(-1130558253);
                        String strI = ak2.I(R.string.close, bVar5);
                        String strI2 = ak2.I(R.string.play_services_check_alert_positive_button, bVar5);
                        ah2 ah2VarC = bh2.c(1574543168, new ct(x8fVar, 13), bVar5);
                        boolean zX21 = bVar5.x(x8fVar);
                        Object objV23 = bVar5.v();
                        if (zX21 || objV23 == c0020a) {
                            objV23 = new qq(x8fVar, 25);
                            bVar5.p(objV23);
                        }
                        gu5 gu5Var18 = (gu5) objV23;
                        boolean zX22 = bVar5.x(x8fVar);
                        Object objV24 = bVar5.v();
                        if (zX22 || objV24 == c0020a) {
                            objV24 = new z0(x8fVar, i13);
                            bVar5.p(objV24);
                        }
                        ku6.a("JSTAppSessionInfo", strI, null, ah2VarC, strI2, null, gu5Var18, (gu5) objV24, null, null, null, bVar5, 24582, 0, 3660);
                    } else {
                        bVar5.L(-1143304089);
                    }
                    bVar5.F();
                } else {
                    bVar5.D();
                }
                return j6g.a;
            case 10:
                qf8<Object>[] qf8VarArr = VideoPlayer.w0;
                ((VideoPlayer) obj3).s0(new a.j((VideoSource) obj, (VideoSource) obj2));
                return j6g.a;
            default:
                ((Integer) obj2).getClass();
                ((g1h) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
        }
    }

    public /* synthetic */ w91(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
