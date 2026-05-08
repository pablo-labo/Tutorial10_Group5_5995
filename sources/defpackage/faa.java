package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.kpg;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class faa extends FrameLayout {
    public ComposeView a;
    public int b;
    public Function1<? super Integer, j6g> c;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTabContent$lambda$3(faa faaVar) {
        faaVar.requestLayout();
        faaVar.invalidate();
    }

    public final void b(String str, String str2, b bVar, int i) {
        int i2;
        String str3;
        c cVar;
        c cVarH = bVar.h(-1192977775);
        if ((i & 6) == 0) {
            i2 = i | (cVarH.K(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(str2) ? 32 : 16;
        }
        int i3 = i2;
        int i4 = 0;
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            e.a aVar = e.a.b;
            e eVarF = f.f(a.b(g.f(aVar, 1.0f), pnb.g(4294309365L), ytc.a), 16.0f);
            ag9 ag9VarD = hl1.d(c20.a.e, false);
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
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
            ob2 ob2VarA = mb2.a(new vs0.i(8.0f, true, new us0(i4)), c20.a.n, cVarH, 54);
            int iHashCode2 = Long.hashCode(cVarH.T);
            t8b t8bVarP2 = cVarH.P();
            e eVarC2 = androidx.compose.ui.c.c(cVarH, aVar);
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
            cif.b(str, null, da2.b, hh2.t(20), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, cVarH, (i3 & 14) | 3456, 0, 131058);
            str3 = str2;
            cif.b(str3, null, da2.c, hh2.t(14), null, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, null, cVarH, (14 & (i3 >> 3)) | 3456, 0, 130546);
            cVar = cVarH;
            cVar.U(true);
            cVar.U(true);
        } else {
            str3 = str2;
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new eaa(this, str, str3, i);
        }
    }

    public final void c(int i, b bVar) {
        faa faaVar;
        c cVarH = bVar.h(2065651362);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new md1(7);
                cVarH.p(objV);
            }
            faaVar = this;
            faaVar.f("Preferences Tab", (Function1) objV, r03.f, cVarH, ((i2 << 9) & 7168) | 438);
        } else {
            faaVar = this;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new w91(faaVar, i, 6);
        }
    }

    public final void d(int i, b bVar) {
        faa faaVar;
        c cVarH = bVar.h(-326549231);
        int i2 = 4;
        int i3 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new bj(i2);
                cVarH.p(objV);
            }
            faaVar = this;
            faaVar.f("Profile Tab", (Function1) objV, r03.e, cVarH, ((i3 << 9) & 7168) | 438);
        } else {
            faaVar = this;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new pj(faaVar, i, 8);
        }
    }

    public final void e(int i, b bVar) {
        c cVarH = bVar.h(966002373);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            yxb yxbVar = ee3.f0;
            if (yxbVar == null || m2c.a == null || m2c.d == null) {
                cVarH.L(1896570066);
                b("Resume Tab", "Waiting for content provider to be registered.", cVarH, ((i2 << 6) & 896) | 54);
                cVarH.U(false);
            } else {
                cVarH.L(1895991823);
                e eVarF = g.f(e.a.b, 1.0f);
                ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
                int iHashCode = Long.hashCode(cVarH.T);
                t8b t8bVarP = cVarH.P();
                e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
                gl2.j.getClass();
                pm8.a aVar = gl2.a.b;
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ob2VarA, gl2.a.g);
                ygg.y(cVarH, t8bVarP, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                    ja.h(iHashCode, cVarH, iHashCode, c0251a);
                }
                ygg.y(cVarH, eVarC, gl2.a.d);
                Object objV = cVarH.v();
                b.a.C0020a c0020a = b.a.a;
                if (objV == c0020a) {
                    objV = new xi(9);
                    cVarH.p(objV);
                }
                Function1 function1 = (Function1) objV;
                boolean zX = cVarH.x(this);
                Object objV2 = cVarH.v();
                if (zX || objV2 == c0020a) {
                    objV2 = new la(this, 18);
                    cVarH.p(objV2);
                }
                yxbVar.e(54, (gu5) objV2, cVarH, function1);
                cVarH.U(true);
                cVarH.U(false);
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new uv(this, i, 8);
        }
    }

    public final void f(String str, Function1 function1, ah2 ah2Var, b bVar, int i) {
        int i2;
        c cVarH = bVar.h(2007022155);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(ah2Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(this) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            yxb yxbVar = ee3.f0;
            if (yxbVar == null || !((Boolean) function1.invoke(yxbVar)).booleanValue()) {
                cVarH.L(957724720);
                b(str, "Waiting for content provider to be registered.", cVarH, ((i2 >> 3) & 896) | (i2 & 14) | 48);
                cVarH.U(false);
            } else {
                cVarH.L(957602115);
                e eVarF = g.f(e.a.b, 1.0f);
                ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, cVarH, 0);
                int iHashCode = Long.hashCode(cVarH.T);
                t8b t8bVarP = cVarH.P();
                e eVarC = androidx.compose.ui.c.c(cVarH, eVarF);
                gl2.j.getClass();
                pm8.a aVar = gl2.a.b;
                cVarH.B();
                if (cVarH.S) {
                    cVarH.y(aVar);
                } else {
                    cVarH.n();
                }
                ygg.y(cVarH, ob2VarA, gl2.a.g);
                ygg.y(cVarH, t8bVarP, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                    ja.h(iHashCode, cVarH, iHashCode, c0251a);
                }
                ygg.y(cVarH, eVarC, gl2.a.d);
                ah2Var.q(yxbVar, cVarH, Integer.valueOf((i2 >> 3) & 112));
                cVarH.U(true);
                cVarH.U(false);
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new daa(this, str, function1, ah2Var, i, 0);
        }
    }

    public final Function1<Integer, j6g> getOnHeightChanged() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a != null) {
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!isAttachedToWindow()) {
            setMeasuredDimension(0, 0);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0;
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        if (measuredHeight <= 0 || measuredHeight == this.b) {
            return;
        }
        this.b = measuredHeight;
        Function1<? super Integer, j6g> function1 = this.c;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(measuredHeight));
        }
    }

    public final void setOnHeightChanged(Function1<? super Integer, j6g> function1) {
        this.c = function1;
    }

    public final void setTabContent(dyb dybVar) {
        dybVar.getClass();
        View view = this.a;
        if (view != null) {
            removeView(view);
        }
        this.a = null;
        Context context = getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        composeView.setViewCompositionStrategy(kpg.a.a);
        composeView.setContent(new ah2(-315178616, new gt(4, dybVar, this), true));
        this.a = composeView;
        addView(composeView);
        post(new v7(this, 5));
    }
}
