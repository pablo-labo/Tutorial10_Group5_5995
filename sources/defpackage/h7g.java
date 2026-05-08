package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.le0;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class h7g {
    public static final void a(e eVar, gu5 gu5Var, String str, gu5 gu5Var2, b bVar, int i) {
        gu5 gu5Var3;
        c cVar;
        e eVar2;
        gu5Var.getClass();
        str.getClass();
        gu5Var2.getClass();
        c cVarH = bVar.h(-2056944031);
        int i2 = i | 6 | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.K(str) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        int i3 = 1;
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = new sm5();
                cVarH.p(objV);
            }
            sm5 sm5Var = (sm5) objV;
            String strI = ak2.I(R.string.has_been_unsaved, cVarH);
            o97 o97Var = (o97) cVarH.M(p97.a);
            af1.b bVar2 = c20.a.j;
            vs0.i iVar = new vs0.i(8.0f, false, new pa(bVar2, i3));
            e.a aVar = e.a.b;
            e eVarF = g.f(aVar, 1.0f);
            o97.b bVar3 = o97Var.e;
            o97.c cVar2 = o97Var.f;
            o97.a aVar2 = o97Var.c;
            o97.a.e eVar3 = aVar2.a;
            long j = bVar3.h;
            long j2 = bVar3.g;
            e eVarB = a.b(ygg.h(eVarF, ggd.a(bkf.c(bVar3.f))), aVar2.b.i.b.c, ytc.a);
            bj1 bj1VarF = ee3.f(aVar2.c.b, 1.0f);
            e eVarA = androidx.compose.ui.focus.c.a(androidx.compose.foundation.c.b(ti1.b(eVarB, bj1VarF.a, bj1VarF.b, ggd.a(8.0f)), true, 2), sm5Var);
            ob2 ob2VarA = mb2.a(iVar, c20.a.m, cVarH, 6);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarA);
            gl2.j.getClass();
            pm8.a aVar3 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar3);
            } else {
                cVarH.n();
            }
            gl2.a.d dVar = gl2.a.g;
            ygg.y(cVarH, ob2VarA, dVar);
            gl2.a.f fVar = gl2.a.f;
            ygg.y(cVarH, t8bVarP, fVar);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            gl2.a.e eVar4 = gl2.a.d;
            ygg.y(cVarH, eVarC, eVar4);
            cVarH.L(887726930);
            le0.b bVar4 = new le0.b();
            le0.b.a aVar4 = new le0.b.a(bVar4.a.length(), 0, 12, new l3b(Integer.MIN_VALUE, Integer.MIN_VALUE, hh2.t(21), null, null, null, 0, Integer.MIN_VALUE, null), null);
            ArrayList arrayList = bVar4.b;
            arrayList.add(aVar4);
            bVar4.c.add(aVar4);
            arrayList.size();
            int iK = bVar4.k(new foe(eVar3.c, hh2.y(4294967296L, bkf.c(j2)), to5.d0, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65528));
            try {
                bVar4.g(str.concat(" "));
                j6g j6gVar = j6g.a;
                bVar4.i(iK);
                iK = bVar4.k(new foe(eVar3.c, hh2.y(4294967296L, bkf.c(j2)), cVar2.c, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65528));
                try {
                    bVar4.g(strI);
                    bVar4.i(iK);
                    bVar4.j("undo", "undo");
                    cVarH.L(887749780);
                    iK = bVar4.k(new foe(eVar3.d, hh2.y(4294967296L, bkf.c(j2)), cVar2.c, (mo5) null, (no5) null, (pn5) null, (String) null, 0L, (lc1) null, (lhf) null, (b19) null, 0L, (odf) null, (vbe) null, 65528));
                    try {
                        bVar4.g(ak2.I(R.string.undo, cVarH));
                        bVar4.i(iK);
                        cVarH.U(false);
                        bVar4.h();
                        le0 le0VarL = bVar4.l();
                        cVarH.U(false);
                        e eVarF2 = g.f(f.f(aVar, bkf.c(bVar3.f)), 1.0f);
                        ehd ehdVarA = chd.a(vs0.g, bVar2, cVarH, 54);
                        int iHashCode2 = Long.hashCode(cVarH.T);
                        t8b t8bVarP2 = cVarH.P();
                        e eVarC2 = androidx.compose.ui.c.c(cVarH, eVarF2);
                        cVarH.B();
                        if (cVarH.S) {
                            cVarH.y(aVar3);
                        } else {
                            cVarH.n();
                        }
                        ygg.y(cVarH, ehdVarA, dVar);
                        ygg.y(cVarH, t8bVarP2, fVar);
                        if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode2))) {
                            ja.h(iHashCode2, cVarH, iHashCode2, c0251a);
                        }
                        ygg.y(cVarH, eVarC2, eVar4);
                        e eVarO = f.j(aVar, 0.0f, 0.0f, bkf.c(j), 0.0f, 11).o(new LayoutWeightElement(1.0f, true));
                        boolean zK = cVarH.K(le0VarL) | ((i2 & 7168) == 2048);
                        Object objV2 = cVarH.v();
                        if (zK || objV2 == c0020a) {
                            objV2 = new pu(6, le0VarL, gu5Var2);
                            cVarH.p(objV2);
                        }
                        cVar = cVarH;
                        p72.a(le0VarL, eVarO, null, false, 0, 0, null, (Function1) objV2, cVar, 0, 124);
                        x2b x2bVarA = z2b.a(R.drawable.close_icon, 0, cVar);
                        String strI2 = ak2.I(R.string.close_icon, cVar);
                        long j3 = eVar3.c;
                        e eVarH = g.h(g.r(f.j(aVar, 0.0f, 0.0f, bkf.c(j), 0.0f, 11), bkf.c(j2)), bkf.c(j2));
                        boolean z = (i2 & 112) == 32;
                        Object objV3 = cVar.v();
                        if (z || objV3 == c0020a) {
                            gu5Var3 = gu5Var;
                            objV3 = new cl6(7, gu5Var3);
                            cVar.p(objV3);
                        } else {
                            gu5Var3 = gu5Var;
                        }
                        vq6.b(x2bVarA, strI2, androidx.compose.foundation.b.d(eVarH, false, null, null, (gu5) objV3, 15), j3, cVar, 0, 0);
                        cVar.U(true);
                        j6g j6gVar2 = j6g.a;
                        boolean zX = ((i2 & 896) == 256) | cVar.x(context) | cVar.K(strI);
                        Object objV4 = cVar.v();
                        if (zX || objV4 == c0020a) {
                            g7g g7gVar = new g7g(context, str, strI, sm5Var, null);
                            cVar.p(g7gVar);
                            objV4 = g7gVar;
                        }
                        to4.d(cVar, j6gVar2, (Function2) objV4);
                        cVar.U(true);
                        eVar2 = aVar;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } else {
            gu5Var3 = gu5Var;
            cVar = cVarH;
            cVar.D();
            eVar2 = eVar;
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new ktd(eVar2, gu5Var3, str, gu5Var2, i);
        }
    }

    public static final void b(Context context, String str) {
        context.getClass();
        str.getClass();
        try {
            Object systemService = context.getSystemService("accessibility");
            systemService.getClass();
            AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
            if (accessibilityManager.isEnabled()) {
                AccessibilityEvent accessibilityEventA = Build.VERSION.SDK_INT >= 30 ? u5.a() : AccessibilityEvent.obtain(16384);
                accessibilityEventA.setEventType(16384);
                accessibilityEventA.setClassName(context.getClass().getName());
                accessibilityEventA.setPackageName(context.getPackageName());
                accessibilityEventA.getText().add(str);
                accessibilityManager.sendAccessibilityEvent(accessibilityEventA);
            }
        } catch (Exception unused) {
            ArrayList arrayList = lz2.a;
            lz2.c("UnsaveJobcard", "Exception thrown while accessing ACCESSIBILITY_SERVICE", false, null, 12);
        }
    }
}
