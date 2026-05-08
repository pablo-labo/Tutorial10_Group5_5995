package com.indeed.android.jobsearch;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.os.Process;
import androidx.appcompat.app.d;
import app.rive.runtime.kotlin.core.Rive;
import com.facebook.react.soloader.OpenSourceMergedSoMapping;
import com.facebook.soloader.SoLoader;
import com.horcrux.svg.SvgPackage;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.util.AppStartupTimes;
import com.microsoft.codepush.react.CodePushNotInitializedException;
import com.wlappdebug.r;
import defpackage.a81;
import defpackage.adc;
import defpackage.awg;
import defpackage.b23;
import defpackage.b24;
import defpackage.b45;
import defpackage.bbc;
import defpackage.boa;
import defpackage.cm0;
import defpackage.cr8;
import defpackage.ct;
import defpackage.d0h;
import defpackage.d2f;
import defpackage.d8c;
import defpackage.dm0;
import defpackage.e65;
import defpackage.ed4;
import defpackage.ehc;
import defpackage.ej2;
import defpackage.em0;
import defpackage.epa;
import defpackage.epb;
import defpackage.ewa;
import defpackage.f97;
import defpackage.f99;
import defpackage.fj;
import defpackage.fj2;
import defpackage.fm0;
import defpackage.fp7;
import defpackage.fwc;
import defpackage.g87;
import defpackage.gec;
import defpackage.gsa;
import defpackage.hcc;
import defpackage.hdc;
import defpackage.he;
import defpackage.hr;
import defpackage.hs;
import defpackage.i7b;
import defpackage.ibc;
import defpackage.in0;
import defpackage.inc;
import defpackage.iq9;
import defpackage.iwc;
import defpackage.j6g;
import defpackage.jcc;
import defpackage.jo9;
import defpackage.kd3;
import defpackage.kk2;
import defpackage.ksa;
import defpackage.kz9;
import defpackage.ldc;
import defpackage.lh0;
import defpackage.lt;
import defpackage.lve;
import defpackage.lz;
import defpackage.lz2;
import defpackage.ma;
import defpackage.mc;
import defpackage.med;
import defpackage.mh;
import defpackage.mh2;
import defpackage.mz;
import defpackage.ned;
import defpackage.np7;
import defpackage.p87;
import defpackage.pjc;
import defpackage.pnb;
import defpackage.pyd;
import defpackage.q87;
import defpackage.q9a;
import defpackage.qhc;
import defpackage.r81;
import defpackage.r8c;
import defpackage.rcc;
import defpackage.rec;
import defpackage.rh2;
import defpackage.rja;
import defpackage.rkc;
import defpackage.rr9;
import defpackage.rx9;
import defpackage.s87;
import defpackage.tbc;
import defpackage.th3;
import defpackage.tv0;
import defpackage.u34;
import defpackage.u63;
import defpackage.udc;
import defpackage.ue1;
import defpackage.uh8;
import defpackage.ui;
import defpackage.us0;
import defpackage.ut0;
import defpackage.uz7;
import defpackage.v40;
import defpackage.vge;
import defpackage.w91;
import defpackage.wdc;
import defpackage.web;
import defpackage.wg2;
import defpackage.wh8;
import defpackage.wid;
import defpackage.wl7;
import defpackage.yb;
import defpackage.yd8;
import defpackage.ydc;
import defpackage.ymc;
import defpackage.ynb;
import defpackage.yob;
import defpackage.yu5;
import defpackage.yv8;
import defpackage.z77;
import defpackage.z92;
import defpackage.zgc;
import defpackage.zpd;
import defpackage.zw;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.error.KoinAppAlreadyStartedException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/indeed/android/jobsearch/JobSearchApplication;", "Lr81;", "Lpjc;", "<init>", "()V", "a", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JobSearchApplication extends r81 implements pjc {
    public static JobSearchApplication X;
    public final ymc V = new ymc(this, new b());
    public final d2f W = new d2f(new hr(this, 8));
    public g87 b;
    public f97 c;
    public p87 d;
    public epb e;
    public z77 f;

    public static final class a {
        public static String a() {
            JobSearchApplication jobSearchApplication = JobSearchApplication.X;
            if (jobSearchApplication == null) {
                wl7.g("appInstance");
                throw null;
            }
            g87 g87Var = jobSearchApplication.b;
            if (g87Var != null) {
                return g87Var.b();
            }
            wl7.g("indeedDeviceId");
            throw null;
        }
    }

    public static final class b extends com.facebook.react.defaults.b {
        public final boolean d;

        public b() {
            super(JobSearchApplication.this);
            this.d = true;
        }

        @Override // defpackage.wmc
        public final boolean d() {
            return false;
        }

        @Override // com.facebook.react.defaults.b
        public final boolean f() {
            return this.d;
        }

        @Override // defpackage.wmc
        public final String getJSBundleFile() {
            if (com.microsoft.codepush.react.b.i == null) {
                throw new CodePushNotInitializedException("A CodePush instance has not been created yet. Have you added it to your app's list of ReactPackages?");
            }
            String strC = com.microsoft.codepush.react.b.i.c("index.android.bundle");
            ArrayList arrayList = lz2.a;
            lz2.d("JobSearchApplication", "Using OTA bundle file: ".concat(strC), false, null);
            return strC;
        }

        @Override // defpackage.wmc
        public final String getJSMainModuleName() {
            return "src/register";
        }

        @Override // defpackage.wmc
        public final List<inc> getPackages() {
            tbc tbcVar;
            f99 f99Var = new f99();
            zw zwVar = new zw(13);
            lz lzVar = new lz(11);
            epa epaVar = epa.a;
            jcc jccVar = new jcc(zwVar, lzVar, epa.b());
            zgc zgcVar = new zgc();
            adc adcVar = new adc();
            rcc rccVar = new rcc(0);
            med medVar = new med();
            bbc bbcVar = new bbc();
            hdc hdcVar = new hdc();
            udc udcVar = new udc(new mz(10));
            int i = 1;
            jo9 jo9Var = new jo9(i);
            kd3 kd3Var = new kd3(i);
            rx9 rx9Var = new rx9(0);
            int i2 = 15;
            kk2 kk2Var = new kk2(i2);
            lve lveVar = zpd.c;
            uh8 uh8Var = uh8.a;
            iwc iwcVar = fwc.a;
            rx9Var.a(new vge(new ue1(lveVar, iwcVar.b(iq9.class), null, kk2Var, uh8Var)));
            byte b = 0;
            v40.l(new ue1(lveVar, iwcVar.b(rr9.class), null, new fj2(i2, b), uh8Var), rx9Var);
            j6g j6gVar = j6g.a;
            mh2.o(rx9Var);
            wdc wdcVar = new wdc(b);
            ((np7) cr8.p(np7.class)).a("RNMyJobsModulePackage", "RNMyJobsModulePackage created");
            ldc ldcVar = new ldc();
            rec recVar = new rec();
            gec gecVar = new gec();
            ydc ydcVar = new ydc();
            jo9 jo9Var2 = new jo9(0);
            tbc tbcVar2 = new tbc();
            wid widVar = new wid();
            Context applicationContext = JobSearchApplication.this.getApplicationContext();
            if (com.microsoft.codepush.react.b.i == null) {
                synchronized (com.microsoft.codepush.react.b.h) {
                    try {
                        if (com.microsoft.codepush.react.b.i == null) {
                            tbcVar = tbcVar2;
                            com.microsoft.codepush.react.b.i = new com.microsoft.codepush.react.b(applicationContext);
                        } else {
                            tbcVar = tbcVar2;
                        }
                    } finally {
                    }
                }
            } else {
                tbcVar = tbcVar2;
            }
            int i3 = 1;
            return u63.a0(f99Var, qhc.c, jccVar, zgcVar, adcVar, rccVar, medVar, bbcVar, hdcVar, udcVar, jo9Var, kd3Var, wdcVar, ldcVar, recVar, gecVar, ydcVar, jo9Var2, tbcVar, widVar, com.microsoft.codepush.react.b.i, new hcc(), new SvgPackage(), new kd3(0), new tv0(), new a81(), new ibc(i3), new awg(), new rcc(i3), new ibc(0), new ehc((OkHttpClient) epa.h0.getValue(), new lt(4)), new wdc(1), new b45(), new i7b(), new com.indeed.android.reactnative.turbo.a());
        }
    }

    @Override // defpackage.pjc
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ymc getV() {
        return this.V;
    }

    @Override // defpackage.pjc
    public final rkc b() {
        return (rkc) this.W.getValue();
    }

    @Override // android.app.Application
    public final void onCreate() {
        ArrayList arrayList = lz2.a;
        byte b2 = 0;
        lz2.d("JobSearchApplication", "@@onCreate", false, null);
        d.s(1);
        AppStartupTimes appStartupTimes = AppStartupTimes.a;
        AppStartupTimes.a("app_create_start");
        super.onCreate();
        try {
            OpenSourceMergedSoMapping openSourceMergedSoMapping = OpenSourceMergedSoMapping.a;
            boolean z = SoLoader.a;
            synchronized (SoLoader.class) {
                SoLoader.o = openSourceMergedSoMapping;
            }
            SoLoader.init(this, 0);
            pnb.I();
            Rive.init$default(Rive.INSTANCE, this, null, 2, null);
            boa.H(this);
        } catch (Throwable th) {
            pyd.h0 = false;
            ArrayList arrayList2 = lz2.a;
            boolean zIs64Bit = Process.is64Bit();
            String[] strArr = Build.SUPPORTED_ABIS;
            strArr.getClass();
            lz2.b("ReactNativeInit", "initReactNative failed (64bit process: " + zIs64Bit + ", " + ut0.t0(strArr, ",", null, null, null, 62) + ")", false, th);
        }
        this.f = new z77(0);
        X = this;
        final rx9 rx9Var = new rx9(0);
        int i = 8;
        v40.l(new ue1(zpd.c, fwc.a.b(kz9.class), null, new em0(i), uh8.a), rx9Var);
        j6g j6gVar = j6g.a;
        ma maVar = new ma(this, i);
        final rx9 rx9Var2 = new rx9(0);
        maVar.invoke(rx9Var2);
        int i2 = 6;
        fj fjVar = new fj(this, i2);
        final rx9 rx9Var3 = new rx9(0);
        fjVar.invoke(rx9Var3);
        mc mcVar = new mc(i2);
        final rx9 rx9Var4 = new rx9(0);
        mcVar.invoke(rx9Var4);
        he heVar = new he(7);
        final rx9 rx9Var5 = new rx9(0);
        heVar.invoke(rx9Var5);
        yb ybVar = new yb(12);
        final rx9 rx9Var6 = new rx9(0);
        ybVar.invoke(rx9Var6);
        final rx9 rx9Var7 = new rx9(0);
        fm0 fm0Var = new fm0(11);
        lve lveVar = zpd.c;
        uh8 uh8Var = uh8.a;
        iwc iwcVar = fwc.a;
        ue1 ue1Var = new ue1(lveVar, iwcVar.b(ed4.class), null, fm0Var, uh8Var);
        vge vgeVar = new vge(ue1Var);
        rx9Var7.a(vgeVar);
        yd8 yd8VarB = iwcVar.b(yob.class);
        ue1Var.f = z92.g1(yd8VarB, ue1Var.f);
        rx9Var7.c.put(mh2.m(yd8VarB, null, lveVar), vgeVar);
        j6g j6gVar2 = j6g.a;
        final rx9 rx9Var8 = new rx9(0);
        ct ctVar = new ct(this, 4);
        lve lveVar2 = zpd.c;
        uh8 uh8Var2 = uh8.a;
        iwc iwcVar2 = fwc.a;
        rx9Var8.a(new vge(new ue1(lveVar2, iwcVar2.b(th3.class), null, ctVar, uh8Var2)));
        v40.l(new ue1(lveVar2, iwcVar2.b(r.b.class), null, new fm0(10), uh8Var2), rx9Var8);
        j6g j6gVar3 = j6g.a;
        ui uiVar = new ui(new q87(), 9);
        final rx9 rx9Var9 = new rx9(0);
        uiVar.invoke(rx9Var9);
        final rx9 rx9Var10 = new rx9(0);
        v40.l(new ue1(zpd.c, fwc.a.b(r81.class), null, new mh(this, 5), uh8.a), rx9Var10);
        j6g j6gVar4 = j6g.a;
        final rx9 rx9Var11 = new rx9(0);
        cm0 cm0Var = new cm0(i2);
        lve lveVar3 = zpd.c;
        uh8 uh8Var3 = uh8.b;
        iwc iwcVar3 = fwc.a;
        rx9Var11.a(new e65(new ue1(lveVar3, iwcVar3.b(d8c.class), null, cm0Var, uh8Var3)));
        v40.l(new ue1(lveVar3, iwcVar3.b(r8c.class), null, new dm0(8, b2), uh8.a), rx9Var11);
        j6g j6gVar5 = j6g.a;
        final rx9 rx9Var12 = new rx9(0);
        v40.l(new ue1(zpd.c, fwc.a.b(in0.class), null, new kk2(7), uh8.a), rx9Var12);
        j6g j6gVar6 = j6g.a;
        final rx9 rx9Var13 = new rx9(0);
        kk2 kk2Var = new kk2(10);
        lve lveVar4 = zpd.c;
        uh8 uh8Var4 = uh8.b;
        iwc iwcVar4 = fwc.a;
        rx9Var13.a(new e65(new ue1(lveVar4, iwcVar4.b(d0h.class), null, kk2Var, uh8Var4)));
        j6g j6gVar7 = j6g.a;
        final rx9 rx9Var14 = new rx9(0);
        rx9Var14.a(new e65(new ue1(lveVar4, iwcVar4.b(f97.class), null, new w91(this, 3), uh8Var4)));
        hs hsVar = new hs(10);
        final rx9 rx9Var15 = new rx9(0);
        hsVar.invoke(rx9Var15);
        uz7 uz7Var = new uz7(0);
        final rx9 rx9Var16 = new rx9(0);
        uz7Var.invoke(rx9Var16);
        yb ybVar2 = new yb(6);
        final rx9 rx9Var17 = new rx9(0);
        ybVar2.invoke(rx9Var17);
        final rx9 rx9Var18 = new rx9(0);
        us0 us0Var = new us0(3);
        lve lveVar5 = zpd.c;
        uh8 uh8Var5 = uh8.a;
        iwc iwcVar5 = fwc.a;
        rx9Var18.a(new vge(new ue1(lveVar5, iwcVar5.b(b24.class), null, us0Var, uh8Var5)));
        byte b3 = 0;
        v40.l(new ue1(lveVar5, iwcVar5.b(ned.class), null, new rh2(6, b3), uh8Var5), rx9Var18);
        j6g j6gVar8 = j6g.a;
        final rx9 rx9Var19 = new rx9(0);
        v40.l(new ue1(zpd.c, fwc.a.b(lh0.class), null, new ej2(7, b3), uh8.a), rx9Var19);
        j6g j6gVar9 = j6g.a;
        final rx9 rx9Var20 = new rx9(0);
        v40.l(new ue1(zpd.c, fwc.a.b(q9a.class), null, new ej2(6, (byte) 0), uh8.a), rx9Var20);
        j6g j6gVar10 = j6g.a;
        Function1 function1 = new Function1() { // from class: vz7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws DefinitionOverrideException {
                wh8 wh8Var = (wh8) obj;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                wh8Var.getClass();
                vh8 vh8Var = wh8Var.a;
                d80 d80Var = new d80(4);
                tu8 tu8Var = tu8.b;
                d80Var.c = tu8Var;
                vh8Var.getClass();
                vh8Var.c = d80Var;
                if (d80Var.E(tu8Var)) {
                    o81 o81Var = vh8Var.c;
                    if (o81Var.E(tu8Var)) {
                        o81Var.D(tu8Var, "[init] declare Android Context");
                    }
                }
                zh8 zh8Var = new zh8(this.a);
                rx9 rx9Var21 = new rx9(0);
                zh8Var.invoke(rx9Var21);
                vh8Var.a(u63.Z(rx9Var21), true);
                List<rx9> listA0 = u63.a0(rx9Var, rx9Var2, rx9Var3, rx9Var7, rx9Var8, rx9Var9, rx9Var10, rx9Var11, rx9Var12, rx9Var13, rx9Var14, rx9Var15, rx9Var16, rx9Var17, rx9Var4, rx9Var5, rx9Var6, rx9Var19, rx9Var18, rx9Var20);
                boolean z2 = wh8Var.b;
                if (vh8Var.c.E(tu8Var)) {
                    long jNanoTime = System.nanoTime();
                    vh8Var.a(listA0, z2);
                    double dDoubleValue = ((Number) new Pair(j6g.a, Double.valueOf((System.nanoTime() - jNanoTime) / 1000000.0d)).e()).doubleValue();
                    int size = vh8Var.b.b.size();
                    vh8Var.c.D(tu8Var, "loaded " + size + " definitions in " + dDoubleValue + " ms");
                } else {
                    vh8Var.a(listA0, z2);
                }
                return j6g.a;
            }
        };
        synchronized (web.c) {
            wh8 wh8Var = new wh8();
            if (web.d != null) {
                throw new KoinAppAlreadyStartedException("A Koin Application has already been started");
            }
            web.d = wh8Var.a;
            function1.invoke(wh8Var);
            wh8Var.a();
        }
        final rja rjaVar = new rja();
        yu5 yu5Var = new yu5(rjaVar) { // from class: tz7
            @Override // defpackage.yu5
            public final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                k39 k39Var = (k39) obj;
                String str = (String) obj3;
                ((Boolean) obj4).getClass();
                Throwable th2 = (Throwable) obj5;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                k39Var.getClass();
                ((String) obj2).getClass();
                str.getClass();
                Lazy<s87> lazy = s87.f;
                qpd qpdVarB = pnb.B(this.a);
                iwc iwcVar6 = fwc.a;
                gz4 gz4Var = (gz4) qpdVarB.a(null, iwcVar6.b(gz4.class), null);
                String strO = th2 != null ? boa.O(th2) : null;
                if (strO == null) {
                    strO = "";
                }
                String str2 = strO;
                String strM = z3.m(k39Var.a(), ".", th2 != null ? iwcVar6.b(th2.getClass()).r() : null);
                zx5 zx5Var = zx5.d;
                zx5Var.getClass();
                s87.a.a(gz4Var, new mja("non_fatal_error", str, str2, 0L, strM, zx5Var));
                return j6g.a;
            }
        };
        ArrayList arrayList3 = lz2.a;
        synchronized (arrayList3) {
            arrayList3.add(yu5Var);
            lz2.b = (yu5[]) arrayList3.toArray(new yu5[0]);
        }
        LocaleList locales = getResources().getConfiguration().getLocales();
        locales.getClass();
        if (locales.size() > 0) {
            Lazy lazy = b23.a;
            b23.c = locales.get(0);
        }
        ewa ewaVar = ewa.b;
        wg2 wg2Var = new wg2(27);
        synchronized (ewaVar) {
            ewa.c = wg2Var;
        }
        this.d = (p87) pnb.B(this).a(null, iwcVar4.b(p87.class), null);
        this.b = (g87) pnb.B(this).a(null, iwcVar4.b(g87.class), null);
        this.e = new epb();
        ksa ksaVar = (ksa) pnb.B(this).a(null, iwcVar4.b(gsa.class), null);
        g87 g87Var = this.b;
        if (g87Var == null) {
            wl7.g("indeedDeviceId");
            throw null;
        }
        this.c = new f97(ksaVar, g87Var);
        u34.a.a(this);
        ynb.X.f.a((yv8) pnb.B(this).a(null, iwcVar4.b(fp7.class), null));
        AppStartupTimes appStartupTimes2 = AppStartupTimes.a;
        AppStartupTimes.a("app_create_end");
    }
}
