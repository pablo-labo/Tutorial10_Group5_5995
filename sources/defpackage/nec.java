package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.f;
import androidx.compose.ui.viewinterop.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import com.indeed.android.rnprofile.RNProfileScreenModule;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.saa;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class nec {
    public static final long a = pnb.g(4293849598L);

    public static final void a(final int i, final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, b bVar, final boolean z) {
        c cVarH = bVar.h(1503006582);
        int i2 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(gu5Var3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            ArrayList arrayList = new ArrayList();
            if (((h2g) cr8.p(h2g.class)).a()) {
                arrayList.add(new raa(saa.a.a, "rich-profile-home-screen", (String) null, (Integer) null, gu5Var3, 28));
            }
            if (z) {
                cVarH.L(1280336287);
                arrayList.add(new raa(new saa.d(R.drawable.ic_idl_upload_24), "rich-profile-home-screen", ak2.I(R.string.upload_resume, cVarH), (Integer) null, gu5Var2, 24));
            } else {
                cVarH.L(1022734668);
            }
            cVarH.U(false);
            b4g.p(arrayList, u63.Z(new raa(new saa.e(fv6.W3, ak2.I(R.string.menu, cVarH), "Menu", 4), "rich-profile-home-screen", (String) null, (Integer) null, gu5Var, 28)), null, new da2(a), false, cVarH, 3072, 52);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, gu5Var, gu5Var2, gu5Var3, z) { // from class: hec
                public final /* synthetic */ boolean a;
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ gu5 d;

                {
                    this.a = z;
                    this.b = gu5Var;
                    this.c = gu5Var2;
                    this.d = gu5Var3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nec.a(ka2.L(433), this.b, this.c, this.d, (b) obj, this.a);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final int i, gu5 gu5Var, gu5 gu5Var2, final gu5 gu5Var3, b bVar, final boolean z) {
        final gu5 gu5Var4;
        final gu5 gu5Var5;
        c cVarH = bVar.h(583154166);
        int i2 = i | (cVarH.a(z) ? 4 : 2) | (cVarH.x(gu5Var3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            gu5Var5 = gu5Var2;
            gu5Var4 = gu5Var;
            iv6.a(c0h.W, f.a(e.a.b, "TopNavHome"), false, null, false, new da2(a), bh2.c(-1091286413, new wu5() { // from class: iec
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((fhd) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        boolean zA = ((h2g) cr8.p(h2g.class)).a();
                        boolean z2 = z;
                        gu5 gu5Var6 = gu5Var5;
                        if (zA) {
                            bVar2.L(-1905998584);
                            ehd ehdVarA = chd.a(vs0.a, c20.a.j, bVar2, 0);
                            int iHashCode = Long.hashCode(bVar2.k());
                            t8b t8bVarM = bVar2.m();
                            e eVarC = androidx.compose.ui.c.c(bVar2, e.a.b);
                            gl2.j.getClass();
                            pm8.a aVar = gl2.a.b;
                            if (bVar2.j() == null) {
                                pg8.B();
                                throw null;
                            }
                            bVar2.B();
                            if (bVar2.f()) {
                                bVar2.y(aVar);
                            } else {
                                bVar2.n();
                            }
                            ygg.y(bVar2, ehdVarA, gl2.a.g);
                            ygg.y(bVar2, t8bVarM, gl2.a.f);
                            gl2.a.C0251a c0251a = gl2.a.j;
                            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                                uz.g(iHashCode, bVar2, iHashCode, c0251a);
                            }
                            ygg.y(bVar2, eVarC, gl2.a.d);
                            nec.e(gu5Var3, bVar2, 0);
                            if (z2) {
                                bVar2.L(633025579);
                                nec.g(gu5Var6, bVar2, 0);
                            } else {
                                bVar2.L(618170286);
                            }
                            bVar2.F();
                            bVar2.q();
                            bVar2.F();
                        } else {
                            if (z2) {
                                bVar2.L(-1905715492);
                                nec.g(gu5Var6, bVar2, 0);
                            } else {
                                bVar2.L(-1920728017);
                            }
                            bVar2.F();
                        }
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), bh2.c(1380493620, new jec(0, gu5Var4), cVarH), cVarH, 113442870, 92);
        } else {
            gu5Var4 = gu5Var;
            gu5Var5 = gu5Var2;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            final gu5 gu5Var6 = gu5Var5;
            iVarW.d = new Function2(i, gu5Var4, gu5Var6, gu5Var3, z) { // from class: kec
                public final /* synthetic */ boolean a;
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ gu5 d;

                {
                    this.a = z;
                    this.b = gu5Var4;
                    this.c = gu5Var6;
                    this.d = gu5Var3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nec.b(ka2.L(433), this.b, this.c, this.d, (b) obj, this.a);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final x1c x1cVar, final yvb yvbVar, final aub aubVar, final p9d p9dVar, final j7d j7dVar, final lr5 lr5Var, b bVar, int i) {
        x1c x1cVar2;
        lr5 lr5Var2;
        c cVar;
        x1cVar.getClass();
        yvbVar.getClass();
        aubVar.getClass();
        p9dVar.getClass();
        j7dVar.getClass();
        c cVarH = bVar.h(550213833);
        int i2 = i | (cVarH.x(x1cVar) ? 4 : 2) | (cVarH.x(yvbVar) ? 32 : 16) | (cVarH.x(aubVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(p9dVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(j7dVar) ? 16384 : 8192) | (cVarH.x(lr5Var) ? 131072 : 65536);
        if (cVarH.o(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                RNProfileScreenModule.INSTANCE.getClass();
                objV = r.f(Boolean.valueOf(RNProfileScreenModule.shouldShowTopNavResumeUploadButton));
                cVarH.p(objV);
            }
            final g4a g4aVar = (g4a) objV;
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            r8 r8Var = new r8();
            boolean zX = cVarH.x(x1cVar) | cVarH.x(context);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new yc1(7, x1cVar, context);
                cVarH.p(objV2);
            }
            final ra9 ra9VarL = ypd.L(r8Var, (Function1) objV2, cVarH);
            j6g j6gVar = j6g.a;
            boolean zX2 = ((i2 & 57344) == 16384 || cVarH.x(j7dVar)) | ((i2 & 7168) == 2048 || cVarH.x(p9dVar)) | cVarH.x(x1cVar) | cVarH.x(yvbVar) | cVarH.x(aubVar) | cVarH.x(lr5Var) | cVarH.x(ra9VarL);
            Object objV3 = cVarH.v();
            if (zX2 || objV3 == c0020a) {
                Function1 function1 = new Function1() { // from class: lec
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        x1c x1cVar3 = x1cVar;
                        yvb yvbVar2 = yvbVar;
                        aub aubVar2 = aubVar;
                        p9d p9dVar2 = p9dVar;
                        j7d j7dVar2 = j7dVar;
                        lr5 lr5Var3 = lr5Var;
                        g4a g4aVar2 = g4aVar;
                        ra9 ra9Var = ra9VarL;
                        ((m74) obj).getClass();
                        ArrayList arrayList = lz2.a;
                        Log.d("RNProfileScreenContainer", "Setting ViewModels in bridge", null);
                        boolean z = x1cVar3 != null;
                        boolean z2 = yvbVar2 != null;
                        boolean z3 = aubVar2 != null;
                        boolean z4 = p9dVar2 != null;
                        boolean z5 = j7dVar2 != null;
                        StringBuilder sb = new StringBuilder("Setting ViewModels - profile: ");
                        sb.append(z);
                        sb.append(", sections: ");
                        sb.append(z2);
                        sb.append(", preferences: ");
                        p6.j(sb, z3, ", resume: ", z4, ", responsiveness: ");
                        sb.append(z5);
                        sb.append(", fragmentManager: ");
                        sb.append(true);
                        Log.d("ProfileViewModelBridge", sb.toString(), null);
                        m2c.a = x1cVar3;
                        m2c.b = yvbVar2;
                        m2c.c = aubVar2;
                        m2c.d = p9dVar2;
                        m2c.e = lr5Var3;
                        ee3.f0 = new yxb();
                        RNProfileScreenModule.Companion companion = RNProfileScreenModule.INSTANCE;
                        uu uuVar = new uu(3, g4aVar2);
                        companion.getClass();
                        RNProfileScreenModule.onUploadButtonVisibilityChanged = uuVar;
                        RNProfileScreenModule.onOpenResumeUploadFlowCallback = new oa(ra9Var, 21);
                        return new bz(1);
                    }
                };
                x1cVar2 = x1cVar;
                lr5Var2 = lr5Var;
                cVarH.p(function1);
                objV3 = function1;
            } else {
                x1cVar2 = x1cVar;
                lr5Var2 = lr5Var;
            }
            to4.b(j6gVar, (Function1) objV3, cVarH);
            e.a aVar = e.a.b;
            e eVarD = g.d(aVar, 1.0f);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarD);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ag9VarD, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar);
            e eVarD2 = g.d(aVar, 1.0f);
            ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarD2);
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ob2VarA, dVar);
            ygg.y(cVarH, t8bVarP2, fVar);
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
            }
            ygg.y(cVarH, eVarC2, eVar);
            boolean zBooleanValue = ((Boolean) g4aVar.getValue()).booleanValue();
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = new ym0(13);
                cVarH.p(objV4);
            }
            gu5 gu5Var = (gu5) objV4;
            Object objV5 = cVarH.v();
            if (objV5 == c0020a) {
                objV5 = new cn0(19);
                cVarH.p(objV5);
            }
            gu5 gu5Var2 = (gu5) objV5;
            boolean zX3 = cVarH.x(x1cVar2);
            Object objV6 = cVarH.v();
            if (zX3 || objV6 == c0020a) {
                objV6 = new vub(x1cVar2, 1);
                cVarH.p(objV6);
            }
            d(432, gu5Var, gu5Var2, (gu5) objV6, cVarH, zBooleanValue);
            e eVarD3 = g.d(aVar, 1.0f);
            Object objV7 = cVarH.v();
            if (objV7 == c0020a) {
                objV7 = new iq0(12);
                cVarH.p(objV7);
            }
            Function1 function12 = (Function1) objV7;
            boolean zX4 = cVarH.x(lr5Var2);
            Object objV8 = cVarH.v();
            if (zX4 || objV8 == c0020a) {
                objV8 = new ne(lr5Var2, 14);
                cVarH.p(objV8);
            }
            a.a(function12, eVarD3, (Function1) objV8, cVarH, 54, 0);
            cVarH.U(true);
            boolean z = x1cVar2.j().a;
            tz6.a(0, 888, null, x1cVar2.j().d, x1cVar2.j().c, cVarH, null, x1cVar2.j().b, null, null, null, z);
            cVar = cVarH;
            cVar.U(true);
        } else {
            x1cVar2 = x1cVar;
            lr5Var2 = lr5Var;
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new ql4(x1cVar2, yvbVar, aubVar, p9dVar, j7dVar, lr5Var2, i, 2);
        }
    }

    public static final void d(final int i, gu5 gu5Var, gu5 gu5Var2, gu5 gu5Var3, b bVar, boolean z) {
        gu5 gu5Var4;
        gu5 gu5Var5;
        gu5 gu5Var6;
        boolean z2;
        c cVarH = bVar.h(-592019556);
        int i2 = (cVarH.a(z) ? 4 : 2) | i | (cVarH.x(gu5Var3) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (!cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            gu5Var4 = gu5Var;
            gu5Var5 = gu5Var2;
            gu5Var6 = gu5Var3;
            z2 = z;
            cVarH.D();
        } else if (((h2g) cr8.p(h2g.class)).c()) {
            cVarH.L(-1718631014);
            gu5Var4 = gu5Var;
            gu5Var5 = gu5Var2;
            gu5Var6 = gu5Var3;
            z2 = z;
            a(i2 & 8190, gu5Var4, gu5Var5, gu5Var6, cVarH, z2);
            cVarH.U(false);
        } else {
            gu5Var4 = gu5Var;
            gu5Var5 = gu5Var2;
            gu5Var6 = gu5Var3;
            z2 = z;
            cVarH.L(-1718359330);
            b(i2 & 8190, gu5Var4, gu5Var5, gu5Var6, cVarH, z2);
            cVarH.U(false);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            final gu5 gu5Var7 = gu5Var4;
            final gu5 gu5Var8 = gu5Var5;
            final gu5 gu5Var9 = gu5Var6;
            final boolean z3 = z2;
            iVarW.d = new Function2(i, gu5Var7, gu5Var8, gu5Var9, z3) { // from class: mec
                public final /* synthetic */ boolean a;
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ gu5 c;
                public final /* synthetic */ gu5 d;

                {
                    this.a = z3;
                    this.b = gu5Var7;
                    this.c = gu5Var8;
                    this.d = gu5Var9;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nec.d(ka2.L(433), this.b, this.c, this.d, (b) obj, this.a);
                    return j6g.a;
                }
            };
        }
    }

    public static final void e(gu5<j6g> gu5Var, b bVar, int i) {
        gu5<j6g> gu5Var2;
        c cVarH = bVar.h(1518695184);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            gu5Var2 = gu5Var;
            rq6.b(gu5Var2, f.a(e.a.b, "TopNavBackButton"), false, null, null, c0h.Z, cVarH, (i2 & 14) | 196656, 28);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new lr(gu5Var2, i, 10);
        }
    }

    public static final void f(gu5<j6g> gu5Var, b bVar, int i) {
        gu5<j6g> gu5Var2;
        c cVarH = bVar.h(-1274098560);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            gu5Var2 = gu5Var;
            rq6.b(gu5Var2, f.a(e.a.b, "TopNavHamburgerMenuIcon"), false, null, null, c0h.Y, cVarH, (i2 & 14) | 196656, 28);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new e24(i, 2, gu5Var2);
        }
    }

    public static final void g(gu5<j6g> gu5Var, b bVar, int i) {
        gu5<j6g> gu5Var2;
        c cVarH = bVar.h(-1692734402);
        int i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            gu5Var2 = gu5Var;
            rq6.b(gu5Var2, f.a(e.a.b, "TopNavUploadResumeButton"), false, null, null, c0h.X, cVarH, (i2 & 14) | 196656, 28);
        } else {
            gu5Var2 = gu5Var;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new e45(gu5Var2, i, 8);
        }
    }
}
