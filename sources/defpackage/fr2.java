package defpackage;

import android.net.Uri;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jsmappservices.bridge.SearchType;
import defpackage.azg;
import defpackage.c20;
import defpackage.cd4;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.rsc;
import defpackage.s87;
import defpackage.saa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fr2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fr2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 2;
        final int i3 = 1;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                gr2 gr2Var = (gr2) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ne4 ne4Var = p97.a;
                    ((kr7) cr8.p(kr7.class)).e("jsj_ifl7_tst");
                    rm2.a(ne4Var.a(h07.a), bh2.c(1380949644, new uw(gr2Var, i2), bVar), bVar, 56);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                zie zieVar = (zie) obj;
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                zieVar.getClass();
                ((Function2) obj3).invoke(zieVar, bool);
                return j6g.a;
            case 2:
                ((Integer) obj2).getClass();
                ((h78) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 3:
                ((Integer) obj2).getClass();
                b88.e((c88) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 4:
                i5a i5aVar = (i5a) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zE = ((bp7) cr8.p(bp7.class)).e();
                    bu8 bu8Var = bu8.a;
                    bu8Var.getClass();
                    rj0 rj0Var = bu8.X;
                    qf8<Object>[] qf8VarArr = bu8.b;
                    kjg kjgVar = new kjg((String) rj0Var.b(qf8VarArr[5], bu8Var), (String) bu8.Y.b(qf8VarArr[6], bu8Var));
                    ne4 ne4Var2 = p97.a;
                    dd4 dd4Var = dd4.a;
                    ad4 ad4Var = dd4.n().a;
                    ad4Var.getClass();
                    ad4Var.e(cd4.a.D0);
                    cd4.i3.a.getClass();
                    rm2.a(ne4Var2.a(h07.a), bh2.c(33137322, new h5a(zE, i5aVar, kjgVar), bVar2), bVar2, 56);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 5:
                ah2 ah2Var = (ah2) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ah2Var.invoke(bVar3, 0);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 6:
                ((Integer) obj2).getClass();
                rmb.a((Uri) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 7:
                ps7 ps7Var = (ps7) obj;
                ps7Var.getClass();
                ((wu5) obj3).q(ps7Var, (List) obj2, "Skills List");
                return j6g.a;
            case 8:
                ((Integer) obj2).getClass();
                ((izc) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                final SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj3;
                b bVar4 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dd4 dd4Var2 = dd4.a;
                    ad4 ad4Var2 = dd4.n().a;
                    ad4Var2.getClass();
                    int iE = ad4Var2.e(cd4.a.T0);
                    int value = cd4.p2.c.getValue();
                    b.a.C0020a c0020a = b.a.a;
                    if (iE == value || ((h2g) cr8.p(h2g.class)).a()) {
                        bVar4.L(839563439);
                        SearchType searchTypeM = searchOverlayFragment.I().m();
                        String str = searchOverlayFragment.I().l().a;
                        lyg lygVar = (lyg) ((gme) searchOverlayFragment.I().b0).getValue();
                        kyg kygVarN = searchOverlayFragment.I().n();
                        String str2 = searchOverlayFragment.I().l().b;
                        azg azgVar = (azg) ((gme) searchOverlayFragment.I().e0).getValue();
                        zyg zygVar = (zyg) ((gme) searchOverlayFragment.I().f0).getValue();
                        String str3 = searchOverlayFragment.I().l0;
                        rsc rscVarK = searchOverlayFragment.I().k();
                        boolean zJ = searchOverlayFragment.I().j();
                        boolean z = !((Boolean) ((gme) searchOverlayFragment.I().X).getValue()).booleanValue();
                        boolean zX = bVar4.x(searchOverlayFragment);
                        Object objV = bVar4.v();
                        if (zX || objV == c0020a) {
                            objV = new k1(searchOverlayFragment, 17);
                            bVar4.p(objV);
                        }
                        Function1 function1 = (Function1) objV;
                        boolean zX2 = bVar4.x(searchOverlayFragment);
                        Object objV2 = bVar4.v();
                        if (zX2 || objV2 == c0020a) {
                            objV2 = new yh(searchOverlayFragment, 15);
                            bVar4.p(objV2);
                        }
                        Function1 function12 = (Function1) objV2;
                        boolean zX3 = bVar4.x(searchOverlayFragment);
                        Object objV3 = bVar4.v();
                        if (zX3 || objV3 == c0020a) {
                            objV3 = new ma(searchOverlayFragment, 16);
                            bVar4.p(objV3);
                        }
                        Function1 function13 = (Function1) objV3;
                        boolean zX4 = bVar4.x(searchOverlayFragment);
                        Object objV4 = bVar4.v();
                        if (zX4 || objV4 == c0020a) {
                            objV4 = new ji(searchOverlayFragment, 11);
                            bVar4.p(objV4);
                        }
                        Function1 function14 = (Function1) objV4;
                        boolean zX5 = bVar4.x(searchOverlayFragment);
                        Object objV5 = bVar4.v();
                        if (zX5 || objV5 == c0020a) {
                            objV5 = new ir(searchOverlayFragment, 14);
                            bVar4.p(objV5);
                        }
                        Function1 function15 = (Function1) objV5;
                        boolean zX6 = bVar4.x(searchOverlayFragment);
                        Object objV6 = bVar4.v();
                        if (zX6 || objV6 == c0020a) {
                            objV6 = new cq0(searchOverlayFragment, 15);
                            bVar4.p(objV6);
                        }
                        gu5 gu5Var = (gu5) objV6;
                        boolean zX7 = bVar4.x(searchOverlayFragment);
                        Object objV7 = bVar4.v();
                        if (zX7 || objV7 == c0020a) {
                            objV7 = new o91(searchOverlayFragment, 21);
                            bVar4.p(objV7);
                        }
                        gu5 gu5Var2 = (gu5) objV7;
                        boolean zX8 = bVar4.x(searchOverlayFragment);
                        Object objV8 = bVar4.v();
                        if (zX8 || objV8 == c0020a) {
                            objV8 = new oq(searchOverlayFragment, 25);
                            bVar4.p(objV8);
                        }
                        gu5 gu5Var3 = (gu5) objV8;
                        boolean zX9 = bVar4.x(searchOverlayFragment);
                        Object objV9 = bVar4.v();
                        if (zX9 || objV9 == c0020a) {
                            objV9 = new dd(searchOverlayFragment, 18);
                            bVar4.p(objV9);
                        }
                        gu5 gu5Var4 = (gu5) objV9;
                        boolean zX10 = bVar4.x(searchOverlayFragment);
                        Object objV10 = bVar4.v();
                        if (zX10 || objV10 == c0020a) {
                            objV10 = new qq(searchOverlayFragment, 23);
                            bVar4.p(objV10);
                        }
                        gu5 gu5Var5 = (gu5) objV10;
                        boolean zX11 = bVar4.x(searchOverlayFragment);
                        Object objV11 = bVar4.v();
                        if (zX11 || objV11 == c0020a) {
                            objV11 = new pr(searchOverlayFragment, 6);
                            bVar4.p(objV11);
                        }
                        Function2 function2 = (Function2) objV11;
                        boolean zX12 = bVar4.x(searchOverlayFragment);
                        Object objV12 = bVar4.v();
                        if (zX12 || objV12 == c0020a) {
                            objV12 = new me(searchOverlayFragment, 18);
                            bVar4.p(objV12);
                        }
                        Function1 function16 = (Function1) objV12;
                        boolean zX13 = bVar4.x(searchOverlayFragment);
                        Object objV13 = bVar4.v();
                        if (zX13 || objV13 == c0020a) {
                            objV13 = new gu5() { // from class: xtd
                                @Override // defpackage.gu5
                                public final Object invoke() {
                                    int i4 = i3;
                                    SearchOverlayFragment searchOverlayFragment2 = searchOverlayFragment;
                                    switch (i4) {
                                        case 0:
                                            searchOverlayFragment2.H().f();
                                            cud cudVarI = searchOverlayFragment2.I();
                                            rsc rscVarK2 = cudVarI.k();
                                            rsc.a aVar = rscVarK2 instanceof rsc.a ? (rsc.a) rscVarK2 : null;
                                            if (aVar != null) {
                                                ((gme) cudVarI.j0).setValue(rsc.a.b(aVar, null, 3));
                                            }
                                            break;
                                        default:
                                            aud audVarH = searchOverlayFragment2.H();
                                            audVarH.getClass();
                                            Lazy<s87> lazy = s87.f;
                                            s87.a.a(audVarH.a(), tx5.k(audVarH.b, ak2.M(SearchType.c), "current-location", null, 12));
                                            cud cudVarI2 = searchOverlayFragment2.I();
                                            m19 m19Var = cudVarI2.f;
                                            if (m19Var.j()) {
                                                cudVarI2.y(azg.h.a);
                                                cudVarI2.z();
                                            } else {
                                                m19Var.A();
                                            }
                                            break;
                                    }
                                    return j6g.a;
                                }
                            };
                            bVar4.p(objV13);
                        }
                        gu5 gu5Var6 = (gu5) objV13;
                        boolean zX14 = bVar4.x(searchOverlayFragment);
                        Object objV14 = bVar4.v();
                        if (zX14 || objV14 == c0020a) {
                            objV14 = new oe(searchOverlayFragment, 18);
                            bVar4.p(objV14);
                        }
                        gu5 gu5Var7 = (gu5) objV14;
                        boolean zX15 = bVar4.x(searchOverlayFragment);
                        Object objV15 = bVar4.v();
                        if (zX15 || objV15 == c0020a) {
                            objV15 = new z0(searchOverlayFragment, 21);
                            bVar4.p(objV15);
                        }
                        ec2.a(searchTypeM, str, lygVar, kygVarN, str2, azgVar, zygVar, str3, rscVarK, zJ, z, function1, function12, function13, function14, function15, gu5Var, gu5Var2, gu5Var3, gu5Var4, gu5Var5, function2, function16, gu5Var6, gu5Var7, (gu5) objV15, bVar4, 0);
                        bVar4.F();
                    } else {
                        int i4 = 22;
                        if (searchOverlayFragment.I().m() == SearchType.b) {
                            bVar4.L(844503630);
                            String str4 = searchOverlayFragment.I().l().a;
                            kyg kygVarN2 = searchOverlayFragment.I().n();
                            lyg lygVar2 = (lyg) ((gme) searchOverlayFragment.I().b0).getValue();
                            rsc rscVarK2 = searchOverlayFragment.I().k();
                            boolean zJ2 = searchOverlayFragment.I().j();
                            boolean z2 = !((Boolean) ((gme) searchOverlayFragment.I().X).getValue()).booleanValue();
                            boolean zX16 = bVar4.x(searchOverlayFragment);
                            Object objV16 = bVar4.v();
                            if (zX16 || objV16 == c0020a) {
                                objV16 = new pe0(searchOverlayFragment, 13);
                                bVar4.p(objV16);
                            }
                            Function1 function17 = (Function1) objV16;
                            boolean zX17 = bVar4.x(searchOverlayFragment);
                            Object objV17 = bVar4.v();
                            if (zX17 || objV17 == c0020a) {
                                objV17 = new fk0(searchOverlayFragment, 18);
                                bVar4.p(objV17);
                            }
                            gu5 gu5Var8 = (gu5) objV17;
                            boolean zX18 = bVar4.x(searchOverlayFragment);
                            Object objV18 = bVar4.v();
                            if (zX18 || objV18 == c0020a) {
                                objV18 = new le(searchOverlayFragment, 18);
                                bVar4.p(objV18);
                            }
                            gu5 gu5Var9 = (gu5) objV18;
                            boolean zX19 = bVar4.x(searchOverlayFragment);
                            Object objV19 = bVar4.v();
                            if (zX19 || objV19 == c0020a) {
                                objV19 = new qr(searchOverlayFragment, 20);
                                bVar4.p(objV19);
                            }
                            gu5 gu5Var10 = (gu5) objV19;
                            boolean zX20 = bVar4.x(searchOverlayFragment);
                            Object objV20 = bVar4.v();
                            if (zX20 || objV20 == c0020a) {
                                final int i5 = false ? 1 : 0;
                                objV20 = new gu5() { // from class: xtd
                                    @Override // defpackage.gu5
                                    public final Object invoke() {
                                        int i42 = i5;
                                        SearchOverlayFragment searchOverlayFragment2 = searchOverlayFragment;
                                        switch (i42) {
                                            case 0:
                                                searchOverlayFragment2.H().f();
                                                cud cudVarI = searchOverlayFragment2.I();
                                                rsc rscVarK22 = cudVarI.k();
                                                rsc.a aVar = rscVarK22 instanceof rsc.a ? (rsc.a) rscVarK22 : null;
                                                if (aVar != null) {
                                                    ((gme) cudVarI.j0).setValue(rsc.a.b(aVar, null, 3));
                                                }
                                                break;
                                            default:
                                                aud audVarH = searchOverlayFragment2.H();
                                                audVarH.getClass();
                                                Lazy<s87> lazy = s87.f;
                                                s87.a.a(audVarH.a(), tx5.k(audVarH.b, ak2.M(SearchType.c), "current-location", null, 12));
                                                cud cudVarI2 = searchOverlayFragment2.I();
                                                m19 m19Var = cudVarI2.f;
                                                if (m19Var.j()) {
                                                    cudVarI2.y(azg.h.a);
                                                    cudVarI2.z();
                                                } else {
                                                    m19Var.A();
                                                }
                                                break;
                                        }
                                        return j6g.a;
                                    }
                                };
                                bVar4.p(objV20);
                            }
                            gu5 gu5Var11 = (gu5) objV20;
                            boolean zX21 = bVar4.x(searchOverlayFragment);
                            Object objV21 = bVar4.v();
                            if (zX21 || objV21 == c0020a) {
                                objV21 = new zh(searchOverlayFragment, i4);
                                bVar4.p(objV21);
                            }
                            gu5 gu5Var12 = (gu5) objV21;
                            boolean zX22 = bVar4.x(searchOverlayFragment);
                            Object objV22 = bVar4.v();
                            if (zX22 || objV22 == c0020a) {
                                objV22 = new vx0(searchOverlayFragment, 9);
                                bVar4.p(objV22);
                            }
                            Function1 function18 = (Function1) objV22;
                            boolean zX23 = bVar4.x(searchOverlayFragment);
                            Object objV23 = bVar4.v();
                            if (zX23 || objV23 == c0020a) {
                                objV23 = new t5(searchOverlayFragment, 6);
                                bVar4.p(objV23);
                            }
                            Function2 function22 = (Function2) objV23;
                            boolean zX24 = bVar4.x(searchOverlayFragment);
                            Object objV24 = bVar4.v();
                            if (zX24 || objV24 == c0020a) {
                                objV24 = new ui(searchOverlayFragment, 13);
                                bVar4.p(objV24);
                            }
                            jyg.c(str4, kygVarN2, lygVar2, rscVarK2, zJ2, z2, function17, gu5Var8, gu5Var9, gu5Var10, gu5Var11, gu5Var12, function18, function22, (Function1) objV24, bVar4, 0);
                            bVar4.F();
                        } else {
                            bVar4.L(847301070);
                            String str5 = searchOverlayFragment.I().l().b;
                            String str6 = searchOverlayFragment.I().l0;
                            zyg zygVar2 = (zyg) ((gme) searchOverlayFragment.I().f0).getValue();
                            azg azgVar2 = (azg) ((gme) searchOverlayFragment.I().e0).getValue();
                            boolean zJ3 = searchOverlayFragment.I().j();
                            boolean z3 = !((Boolean) ((gme) searchOverlayFragment.I().X).getValue()).booleanValue();
                            boolean zX25 = bVar4.x(searchOverlayFragment);
                            Object objV25 = bVar4.v();
                            if (zX25 || objV25 == c0020a) {
                                objV25 = new j91(searchOverlayFragment, 15);
                                bVar4.p(objV25);
                            }
                            Function1 function19 = (Function1) objV25;
                            boolean zX26 = bVar4.x(searchOverlayFragment);
                            Object objV26 = bVar4.v();
                            if (zX26 || objV26 == c0020a) {
                                objV26 = new j30(searchOverlayFragment, 16);
                                bVar4.p(objV26);
                            }
                            gu5 gu5Var13 = (gu5) objV26;
                            boolean zX27 = bVar4.x(searchOverlayFragment);
                            Object objV27 = bVar4.v();
                            if (zX27 || objV27 == c0020a) {
                                objV27 = new k30(searchOverlayFragment, i4);
                                bVar4.p(objV27);
                            }
                            gu5 gu5Var14 = (gu5) objV27;
                            boolean zX28 = bVar4.x(searchOverlayFragment);
                            Object objV28 = bVar4.v();
                            if (zX28 || objV28 == c0020a) {
                                objV28 = new n30(searchOverlayFragment, 14);
                                bVar4.p(objV28);
                            }
                            gu5 gu5Var15 = (gu5) objV28;
                            boolean zX29 = bVar4.x(searchOverlayFragment);
                            Object objV29 = bVar4.v();
                            if (zX29 || objV29 == c0020a) {
                                objV29 = new ye(searchOverlayFragment, 21);
                                bVar4.p(objV29);
                            }
                            gu5 gu5Var16 = (gu5) objV29;
                            boolean zX30 = bVar4.x(searchOverlayFragment);
                            Object objV30 = bVar4.v();
                            if (zX30 || objV30 == c0020a) {
                                objV30 = new hg(searchOverlayFragment, 9);
                                bVar4.p(objV30);
                            }
                            Function1 function110 = (Function1) objV30;
                            boolean zX31 = bVar4.x(searchOverlayFragment);
                            Object objV31 = bVar4.v();
                            if (zX31 || objV31 == c0020a) {
                                objV31 = new vv(searchOverlayFragment, i4);
                                bVar4.p(objV31);
                            }
                            gu5 gu5Var17 = (gu5) objV31;
                            boolean zX32 = bVar4.x(searchOverlayFragment);
                            Object objV32 = bVar4.v();
                            if (zX32 || objV32 == c0020a) {
                                objV32 = new oa(searchOverlayFragment, 25);
                                bVar4.p(objV32);
                            }
                            yyg.e(zygVar2, azgVar2, str5, str6, zJ3, z3, function19, gu5Var13, gu5Var14, gu5Var15, gu5Var16, function110, gu5Var17, (gu5) objV32, bVar4, 0);
                            bVar4.F();
                        }
                    }
                } else {
                    bVar4.D();
                }
                return j6g.a;
            default:
                List list = (List) obj3;
                b bVar5 = (b) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (bVar5.o(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ehd ehdVarA = chd.a(vs0.a, c20.a.k, bVar5, 48);
                    int iG = bVar5.G();
                    t8b t8bVarM = bVar5.m();
                    e eVarC = c.c(bVar5, e.a.b);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    ArrayList arrayList = null;
                    if (bVar5.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar5.B();
                    if (bVar5.f()) {
                        bVar5.y(aVar);
                    } else {
                        bVar5.n();
                    }
                    ygg.y(bVar5, ehdVarA, gl2.a.g);
                    ygg.y(bVar5, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar5.f() || !wl7.b(bVar5.v(), Integer.valueOf(iG))) {
                        uz.g(iG, bVar5, iG, c0251a);
                    }
                    ygg.y(bVar5, eVarC, gl2.a.d);
                    b4g.h(list, bVar5, 0);
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            saa saaVar = ((raa) obj4).a;
                            if (!wl7.b(saaVar, saa.a.a) && !wl7.b(saaVar, saa.b.a) && !wl7.b(saaVar, saa.i.a)) {
                                arrayList.add(obj4);
                            }
                        }
                    }
                    if (arrayList == null) {
                        bVar5.L(-1491669930);
                    } else {
                        bVar5.L(-1491669929);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            b4g.j((raa) it.next(), bVar5, 0);
                        }
                    }
                    bVar5.F();
                    bVar5.q();
                } else {
                    bVar5.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ fr2(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
