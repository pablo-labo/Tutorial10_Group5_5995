package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.ui.layout.d0;
import androidx.compose.ui.layout.e0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.indeed.android.jobsearch.R;
import defpackage.d90;
import defpackage.ekd;
import defpackage.g4a;
import defpackage.gd1;
import defpackage.ir4;
import defpackage.j6g;
import defpackage.mr8;
import defpackage.nr8;
import defpackage.qq8;
import defpackage.to4;
import defpackage.tq8;
import defpackage.wlb;
import defpackage.wu5;
import defpackage.xlb;
import defpackage.zq8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class d implements wu5<ekd, androidx.compose.runtime.b, Integer, j6g> {
    public final /* synthetic */ mr8 a;
    public final /* synthetic */ androidx.compose.ui.e b;
    public final /* synthetic */ zq8 c;
    public final /* synthetic */ g4a d;

    public d(mr8 mr8Var, androidx.compose.ui.e eVar, zq8 zq8Var, g4a g4aVar) {
        this.a = mr8Var;
        this.b = eVar;
        this.c = zq8Var;
        this.d = g4aVar;
    }

    @Override // defpackage.wu5
    public final j6g q(ekd ekdVar, androidx.compose.runtime.b bVar, Integer num) {
        androidx.compose.ui.e eVarO;
        ekd ekdVar2 = ekdVar;
        androidx.compose.runtime.b bVar2 = bVar;
        num.intValue();
        Object objV = bVar2.v();
        b.a.C0020a c0020a = b.a.a;
        if (objV == c0020a) {
            objV = new qq8(ekdVar2, new gd1(5, this.d));
            bVar2.p(objV);
        }
        final qq8 qq8Var = (qq8) objV;
        Object objV2 = bVar2.v();
        if (objV2 == c0020a) {
            objV2 = new e0(new tq8(qq8Var));
            bVar2.p(objV2);
        }
        final e0 e0Var = (e0) objV2;
        final mr8 mr8Var = this.a;
        if (mr8Var != null) {
            bVar2.L(1743490539);
            final wlb wlbVar = mr8Var.a;
            if (wlbVar == null) {
                bVar2.L(887527095);
                wlbVar = xlb.a;
                if (wlbVar != null) {
                    bVar2.L(1345648624);
                    bVar2.F();
                } else {
                    bVar2.L(1345697697);
                    View view = (View) bVar2.M(AndroidCompositionLocals_androidKt.f);
                    boolean zK = bVar2.K(view);
                    Object objV3 = bVar2.v();
                    if (zK || objV3 == c0020a) {
                        Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                        objV3 = tag instanceof wlb ? (wlb) tag : null;
                        if (objV3 == null) {
                            objV3 = new d90(view);
                            view.setTag(R.id.compose_prefetch_scheduler, objV3);
                        }
                        bVar2.p(objV3);
                    }
                    bVar2.F();
                    wlbVar = (wlb) objV3;
                }
            } else {
                bVar2.L(887526010);
            }
            bVar2.F();
            Object[] objArr = {mr8Var, qq8Var, e0Var, wlbVar};
            boolean zK2 = bVar2.K(mr8Var) | bVar2.x(qq8Var) | bVar2.x(e0Var) | bVar2.x(wlbVar);
            Object objV4 = bVar2.v();
            if (zK2 || objV4 == c0020a) {
                objV4 = new Function1() { // from class: wq8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        slb slbVar = new slb(qq8Var, e0Var, wlbVar);
                        mr8 mr8Var2 = mr8Var;
                        mr8Var2.d = slbVar;
                        return new xq8(mr8Var2);
                    }
                };
                bVar2.p(objV4);
            }
            to4.c(objArr, (Function1) objV4, bVar2);
            bVar2.F();
        } else {
            bVar2.L(1744076749);
            bVar2.F();
        }
        int i = nr8.a;
        androidx.compose.ui.e eVar = this.b;
        if (mr8Var != null && (eVarO = eVar.o(new TraversablePrefetchStateModifierElement(mr8Var))) != null) {
            eVar = eVarO;
        }
        boolean zK3 = bVar2.K(qq8Var);
        zq8 zq8Var = this.c;
        boolean zK4 = zK3 | bVar2.K(zq8Var);
        Object objV5 = bVar2.v();
        if (zK4 || objV5 == c0020a) {
            objV5 = new ir4(3, qq8Var, zq8Var);
            bVar2.p(objV5);
        }
        d0.b(e0Var, eVar, (Function2) objV5, bVar2, 8, 0);
        return j6g.a;
    }
}
