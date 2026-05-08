package com.indeed.android.rnprofile;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.p;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import defpackage.ag9;
import defpackage.c20;
import defpackage.c3a;
import defpackage.d3a;
import defpackage.da2;
import defpackage.e9a;
import defpackage.ev2;
import defpackage.g4a;
import defpackage.gl2;
import defpackage.gu5;
import defpackage.hl1;
import defpackage.ja;
import defpackage.l7;
import defpackage.lr5;
import defpackage.o61;
import defpackage.pm8;
import defpackage.t8b;
import defpackage.to4;
import defpackage.v40;
import defpackage.wl7;
import defpackage.ygg;
import defpackage.ytc;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final void a(final lr5 lr5Var, e9a e9aVar, b bVar, int i) {
        final e9a e9aVarA;
        c cVarH = bVar.h(1943300539);
        int i2 = (cVarH.x(lr5Var) ? 4 : 2) | i | 16;
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            cVarH.v0();
            if ((i & 1) == 0 || cVarH.c0()) {
                e9aVarA = e9a.a.a(null, null);
            } else {
                cVarH.D();
                e9aVarA = e9aVar;
            }
            cVarH.V();
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.FALSE);
                cVarH.p(objV);
            }
            final g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = p.a(0);
                cVarH.p(objV2);
            }
            final c3a c3aVar = (c3a) objV2;
            e.a aVar = e.a.b;
            e eVarB = androidx.compose.foundation.a.b(g.d(aVar, 1.0f), da2.h, ytc.a);
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = v40.a(cVarH);
            }
            d3a d3aVar = (d3a) objV3;
            Object objV4 = cVarH.v();
            if (objV4 == c0020a) {
                objV4 = new l7(17);
                cVarH.p(objV4);
            }
            e eVarB2 = androidx.compose.foundation.b.b(eVarB, d3aVar, null, false, null, null, (gu5) objV4, 28);
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarB2);
            gl2.j.getClass();
            pm8.a aVar2 = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar2);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            boolean zX = cVarH.x(lr5Var) | cVarH.x(e9aVarA);
            Object objV5 = cVarH.v();
            if (zX || objV5 == c0020a) {
                objV5 = new Function1() { // from class: eec
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        final Context context2 = (Context) obj;
                        context2.getClass();
                        final FragmentContainerView fragmentContainerView = new FragmentContainerView(context2);
                        fragmentContainerView.setId(View.generateViewId());
                        c3aVar.h(fragmentContainerView.getId());
                        fragmentContainerView.setBackgroundColor(0);
                        fragmentContainerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        final lr5 lr5Var2 = lr5Var;
                        final e9a e9aVar2 = e9aVarA;
                        final g4a g4aVar2 = g4aVar;
                        fragmentContainerView.post(new Runnable() { // from class: fec
                            @Override // java.lang.Runnable
                            public final void run() {
                                Context context3 = context2;
                                if ((context3 instanceof androidx.fragment.app.g ? (androidx.fragment.app.g) context3 : null) != null) {
                                    lr5 lr5Var3 = lr5Var2;
                                    if (lr5Var3.D("RNProfileModalOverlay") == null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putBundle("nativeContext", e9aVar2.toBundle());
                                        ija ijaVar = new ija();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("arg_component_name", "RNProfileModalOverlay");
                                        bundle2.putBundle("arg_launch_options", bundle);
                                        bundle2.putBoolean("arg_fabric_enabled", false);
                                        ijaVar.setArguments(bundle2);
                                        a aVar3 = new a(lr5Var3);
                                        aVar3.e(fragmentContainerView.getId(), ijaVar, "RNProfileModalOverlay");
                                        aVar3.h(true);
                                        g4aVar2.setValue(Boolean.TRUE);
                                    }
                                }
                            }
                        });
                        return fragmentContainerView;
                    }
                };
                cVarH.p(objV5);
            }
            androidx.compose.ui.viewinterop.a.a((Function1) objV5, g.d(aVar, 1.0f), null, cVarH, 48, 4);
            cVarH.U(true);
            Integer numValueOf = Integer.valueOf(c3aVar.e());
            boolean zX2 = cVarH.x(context);
            Object objV6 = cVarH.v();
            if (zX2 || objV6 == c0020a) {
                objV6 = new ev2(3, context, g4aVar);
                cVarH.p(objV6);
            }
            to4.b(numValueOf, (Function1) objV6, cVarH);
        } else {
            cVarH.D();
            e9aVarA = e9aVar;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new o61(lr5Var, i, 4, e9aVarA);
        }
    }
}
