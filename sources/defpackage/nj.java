package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.g;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.regpromo.RegPromoFragment;
import com.indeed.android.profile.screens.sheets.profilesubtab.links.a;
import defpackage.jq7;
import defpackage.ox4;
import defpackage.s87;
import defpackage.sp7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nj implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        owf<?> owfVarA;
        lr5 lr5VarU;
        sl8 sl8Var;
        sl8 sl8Var2;
        qtc qtcVar;
        int i;
        int i2;
        sl8 sl8Var3;
        List list;
        sl8 sl8VarD;
        int[] iArr;
        int i3 = 1;
        z = true;
        z = true;
        boolean z = true;
        int i4 = 0;
        switch (this.a) {
            case 0:
                return new bxb(((rj) this.b).g0);
            case 1:
                du duVar = (du) this.b;
                ((gme) duVar.Q().e).setValue(b5g.a);
                duVar.close();
                Function2<? super ps7, ? super es7, j6g> function2 = duVar.i0;
                if (function2 != null) {
                    function2.invoke(ps7.d, null);
                }
                return j6g.a;
            case 2:
                pv pvVar = (pv) this.b;
                return new n2c(pvVar.h0, pvVar.g0);
            case 3:
                gy gyVar = (gy) this.b;
                ((gme) gyVar.Q().e).setValue(b5g.a);
                gyVar.close();
                Function2<? super ps7, ? super vs7, j6g> function22 = gyVar.k0;
                if (function22 != null) {
                    function22.invoke(ps7.d, null);
                }
                return j6g.a;
            case 4:
                rf0 rf0Var = (rf0) this.b;
                pwf pwfVar = rf0Var.b;
                zf8 zf8Var = rf0Var.a;
                return (pwfVar == null || (owfVarA = pwfVar.a(zf8Var)) == null) ? fxf.a.a(zf8Var) : owfVarA;
            case 5:
                pm0 pm0Var = (pm0) this.b;
                Lazy<s87> lazy = s87.f;
                s87.a.a(pm0Var.M(), tx5.g(pm0Var.g0, "app_rating_multi_prompt_feedback", null, 6));
                return j6g.a;
            case 6:
                return u63.Z((Pair) this.b);
            case 7:
                gr2 gr2Var = (gr2) this.b;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("rich-profile-contact-info-screen", "update-email", null, null, 12));
                g activity = gr2Var.getActivity();
                if (activity == null || (lr5VarU = activity.u()) == null) {
                    ArrayList arrayList = lz2.a;
                    lz2.c("ContactInfoFragment", "navigateToUpdateEmailWebView failed: activity is null", false, null, 8);
                    ((x1c) gr2Var.f.getValue()).E(qr2.c);
                } else {
                    ((rq7) cr8.p(rq7.class)).f(lr5VarU, mh2.k(gr2Var), new jq7.d0(null), "rich-profile-contact-info-screen");
                }
                return j6g.a;
            case 8:
                pm8 pm8VarF = us3.f((o03) this.b);
                if (!pm8VarF.h0) {
                    tm8.a(pm8VarF).c(pm8VarF);
                }
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                rc3 rc3Var = (rc3) this.b;
                return "Span " + rc3Var.b.j + " finished but duration already set; dropped spanId:" + rc3Var.b.e + " traceid:" + rc3Var.b.d;
            case 10:
                return new bxb(((a) this.b).h0);
            case 11:
                ((kr4) this.b).r.invoke();
                return j6g.a;
            case 12:
                ut5 ut5Var = (ut5) this.b;
                ut5Var.Y.f(true, ut5Var.N().g());
                return j6g.a;
            case 13:
                IanMainFragment ianMainFragment = (IanMainFragment) this.b;
                ((gme) ((jn0) ianMainFragment.l0.getValue()).b).setValue(Boolean.FALSE);
                ((in0) ianMainFragment.e.getValue()).getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("homePage", "suggestAppUpgradeSnooze", u63.Z("suggestUpgradePrompt"), null, 8));
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                nj7 nj7Var = (nj7) this.b;
                oj7 oj7Var = nj7Var.a.get();
                if (oj7Var != null) {
                    oj7Var.a();
                }
                nj7Var.b();
                return j6g.a;
            case 15:
                i5a i5aVar = (i5a) this.b;
                Lazy<s87> lazy2 = s87.f;
                s87.a.a((gz4) i5aVar.e.getValue(), tx5.k(i5aVar.X, "myjobs_logged_out_screen", "createAnAccountButton", null, 12));
                i5aVar.R();
                return j6g.a;
            case 16:
                b8a b8aVar = (b8a) this.b;
                int i5 = b8a.o0;
                b8aVar.Y.i("MY_JOBS");
                b8aVar.Y();
                return j6g.a;
            case 17:
                return ((h5b) this.b).M();
            case 18:
                final meb mebVar = (meb) this.b;
                return new ox4.c() { // from class: leb
                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
                    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
                    @Override // ox4.c
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final boolean a(int r4, java.lang.String r5) {
                        /*
                            r3 = this;
                            r5.getClass()
                            meb r3 = r1
                            java.lang.String r0 = r3.b
                            r1 = 0
                            if (r0 == 0) goto L8e
                            boolean r0 = r5.equals(r0)
                            r2 = 0
                            if (r0 != 0) goto L13
                            goto L81
                        L13:
                            int r0 = r5.hashCode()
                            switch(r0) {
                                case -1304584214: goto L48;
                                case -1304316135: goto L3f;
                                case -1304250340: goto L36;
                                case -1065042973: goto L2d;
                                case 383186882: goto L24;
                                case 1343400710: goto L1b;
                                default: goto L1a;
                            }
                        L1a:
                            goto L50
                        L1b:
                            java.lang.String r0 = "topPointerOut"
                            boolean r5 = r5.equals(r0)
                            if (r5 != 0) goto L57
                            goto L50
                        L24:
                            java.lang.String r0 = "topPointerCancel"
                            boolean r5 = r5.equals(r0)
                            if (r5 != 0) goto L57
                            goto L50
                        L2d:
                            java.lang.String r0 = "topPointerUp"
                            boolean r5 = r5.equals(r0)
                            if (r5 != 0) goto L57
                            goto L50
                        L36:
                            java.lang.String r0 = "topPointerOver"
                            boolean r5 = r5.equals(r0)
                            if (r5 == 0) goto L50
                            goto L57
                        L3f:
                            java.lang.String r0 = "topPointerMove"
                            boolean r5 = r5.equals(r0)
                            if (r5 != 0) goto L57
                            goto L50
                        L48:
                            java.lang.String r0 = "topPointerDown"
                            boolean r5 = r5.equals(r0)
                            if (r5 != 0) goto L57
                        L50:
                            int r3 = r3.getViewTag()
                            if (r3 != r4) goto L81
                            goto L7f
                        L57:
                            meb$a r3 = r3.e
                            if (r3 == 0) goto L88
                            java.util.HashMap r5 = r3.f
                            int r3 = r3.b
                            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                            java.lang.Object r3 = r5.get(r3)
                            if (r3 == 0) goto L82
                            java.util.List r3 = (java.util.List) r3
                            java.util.Iterator r3 = r3.iterator()
                        L6f:
                            boolean r5 = r3.hasNext()
                            if (r5 == 0) goto L81
                            java.lang.Object r5 = r3.next()
                            gpf$b r5 = (gpf.b) r5
                            int r5 = r5.a
                            if (r5 != r4) goto L6f
                        L7f:
                            r3 = 1
                            return r3
                        L81:
                            return r2
                        L82:
                            java.lang.String r3 = "Required value was null."
                            defpackage.r6.g(r3)
                            return r2
                        L88:
                            java.lang.String r3 = "eventState"
                            defpackage.wl7.g(r3)
                            throw r1
                        L8e:
                            java.lang.String r3 = "_eventName"
                            defpackage.wl7.g(r3)
                            throw r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.leb.a(int, java.lang.String):boolean");
                    }
                };
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                qlb qlbVar = (qlb) this.b;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab-minimum-pay-preference", "delete", null, null, 12));
                aub aubVarR = qlbVar.R();
                u63.Y(ee3.p(aubVarR), null, null, new jtb(aubVarR, null), 3);
                qlbVar.Q(hs7.b, null);
                return j6g.a;
            case 20:
                ((ra9) this.b).a(q92.d);
                return j6g.a;
            case 21:
                RegPromoFragment regPromoFragment = (RegPromoFragment) this.b;
                Lazy lazy3 = zwc.a;
                regPromoFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://cdn.p.recruit.co.jp/terms/cmn-t-1028/index.html")));
                regPromoFragment.E("secrecy-of-communications");
                return j6g.a;
            case 22:
                d9d d9dVar = (d9d) this.b;
                Context contextRequireContext = d9dVar.requireContext();
                contextRequireContext.getClass();
                g7b g7bVar = new g7b(contextRequireContext);
                Context contextRequireContext2 = d9dVar.requireContext();
                contextRequireContext2.getClass();
                return new q9d(g7bVar, new qq2(contextRequireContext2));
            case 23:
                j4e j4eVar = (j4e) this.b;
                qtc qtcVar2 = k4e.a;
                p4e p4eVar = j4eVar.a;
                ((gme) j4eVar.n).getValue();
                j6g j6gVar = j6g.a;
                if (j4eVar.g() != null && (sl8Var = j4eVar.m) != null && sl8Var.d()) {
                    ArrayList arrayListJ = p4eVar.j(j4eVar.k());
                    ArrayList arrayList2 = new ArrayList(arrayListJ.size());
                    int size = arrayListJ.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        uzd uzdVar = (uzd) arrayListJ.get(i6);
                        p2e p2eVarB = p4eVar.b().b(uzdVar.i());
                        Pair pair = p2eVarB != null ? new Pair(uzdVar, p2eVarB) : null;
                        if (pair != null) {
                            arrayList2.add(pair);
                        }
                    }
                    int size2 = arrayList2.size();
                    List listA0 = arrayList2;
                    listA0 = arrayList2;
                    if (size2 != 0 && size2 != 1) {
                        listA0 = u63.a0(z92.O0(arrayList2), z92.Y0(arrayList2));
                    }
                    if (!listA0.isEmpty()) {
                        if (listA0.isEmpty()) {
                            qtcVar = qtcVar2;
                            sl8Var2 = sl8Var;
                        } else {
                            int size3 = listA0.size();
                            int i7 = 0;
                            float fMin = Float.POSITIVE_INFINITY;
                            float fMin2 = Float.POSITIVE_INFINITY;
                            float fMax = Float.NEGATIVE_INFINITY;
                            float fMax2 = Float.NEGATIVE_INFINITY;
                            List list2 = listA0;
                            while (i7 < size3) {
                                Pair pair2 = (Pair) list2.get(i7);
                                uzd uzdVar2 = (uzd) pair2.a();
                                p2e p2eVar = (p2e) pair2.b();
                                int i8 = p2eVar.a.b;
                                int i9 = p2eVar.b.b;
                                if (i8 == i9 || (sl8VarD = uzdVar2.d()) == null) {
                                    i = size3;
                                    i2 = i4;
                                    sl8Var3 = sl8Var;
                                    list = list2;
                                } else {
                                    i2 = i4;
                                    int iMin = Math.min(i8, i9);
                                    int iMax = Math.max(i8, i9) - i3;
                                    if (iMin == iMax) {
                                        iArr = new int[i3];
                                        iArr[i2] = iMin;
                                    } else {
                                        int[] iArr2 = new int[2];
                                        iArr2[i2] = iMin;
                                        iArr2[i3] = iMax;
                                        iArr = iArr2;
                                    }
                                    int length = iArr.length;
                                    i = size3;
                                    int[] iArr3 = iArr;
                                    int i10 = i2;
                                    float fMax3 = Float.NEGATIVE_INFINITY;
                                    float fMax4 = Float.NEGATIVE_INFINITY;
                                    float fMin3 = Float.POSITIVE_INFINITY;
                                    float fMin4 = Float.POSITIVE_INFINITY;
                                    List list3 = list2;
                                    while (i10 < length) {
                                        int i11 = length;
                                        qtc qtcVarH = uzdVar2.h(iArr3[i10]);
                                        fMin3 = Math.min(fMin3, qtcVarH.a);
                                        fMin4 = Math.min(fMin4, qtcVarH.b);
                                        fMax3 = Math.max(fMax3, qtcVarH.c);
                                        fMax4 = Math.max(fMax4, qtcVarH.d);
                                        i10++;
                                        length = i11;
                                        list3 = list3;
                                    }
                                    list = list3;
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin3)) << 32) | (((long) Float.floatToRawIntBits(fMin4)) & 4294967295L);
                                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(fMax3);
                                    int iFloatToRawIntBits = Float.floatToRawIntBits(fMax4);
                                    sl8Var3 = sl8Var;
                                    long jG = sl8Var3.G(sl8VarD, jFloatToRawIntBits);
                                    long jG2 = sl8Var3.G(sl8VarD, (((long) iFloatToRawIntBits) & 4294967295L) | (jFloatToRawIntBits2 << 32));
                                    fMin = Math.min(fMin, Float.intBitsToFloat((int) (jG >> 32)));
                                    fMin2 = Math.min(fMin2, Float.intBitsToFloat((int) (jG & 4294967295L)));
                                    fMax = Math.max(fMax, Float.intBitsToFloat((int) (jG2 >> 32)));
                                    fMax2 = Math.max(fMax2, Float.intBitsToFloat((int) (jG2 & 4294967295L)));
                                }
                                i7++;
                                sl8Var = sl8Var3;
                                i4 = i2;
                                size3 = i;
                                list2 = list;
                                i3 = 1;
                            }
                            sl8Var2 = sl8Var;
                            qtcVar = new qtc(fMin, fMin2, fMax, fMax2);
                        }
                        if (!qtcVar.equals(qtcVar2)) {
                            qtc qtcVarE = k4e.c(sl8Var2).e(qtcVar);
                            if (qtcVarE.c - qtcVarE.a >= 0.0f && qtcVarE.d - qtcVarE.b >= 0.0f) {
                                qtc qtcVarI = qtcVarE.i(sl8Var2.a0(0L));
                                float f = qtcVarI.d;
                                r5e<s3e> r5eVar = t3e.a;
                                return qtc.a(qtcVarI, 0.0f, 0.0f, f + 100.0f, 7);
                            }
                        }
                    }
                }
                return null;
            case 24:
                csf csfVar = (csf) this.b;
                if (wl7.b(((gme) csfVar.d).getValue(), csfVar.a.a()) && ((eme) csfVar.g).a() == Long.MIN_VALUE && !((Boolean) ((gme) csfVar.h).getValue()).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                com.indeed.android.jobsearch.viewjob.a aVar = (com.indeed.android.jobsearch.viewjob.a) this.b;
                LaunchActivity launchActivity = aVar.A0;
                if (launchActivity == null) {
                    wl7.g("launchActivity");
                    throw null;
                }
                if (!launchActivity.isFinishing()) {
                    ArrayList arrayList3 = lz2.a;
                    lz2.d("view-job-bottom-sheet", "signin-complete-action", false, null);
                    ((cya) aVar.k0.getValue()).a();
                }
                return j6g.a;
        }
    }
}
