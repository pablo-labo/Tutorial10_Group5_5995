package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import com.indeed.android.profile.screens.sheets.profilesubtab.certifications.a;
import defpackage.c20;
import defpackage.cd4;
import defpackage.gl2;
import defpackage.pm8;
import expo.modules.video.VideoView;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yo0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yo0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                zo0.a((e) obj3, (b) obj, ka2.L(7));
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                ((gy1) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 2:
                tg2 tg2Var = (tg2) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(1 & iIntValue, (iIntValue & 3) != 2)) {
                    Iterator<T> it = tg2Var.c.iterator();
                    while (it.hasNext()) {
                        le4.b((tg2) it.next(), null, bVar, 0, 2);
                    }
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 3:
                ((Integer) obj2).getClass();
                ((a) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 4:
                IanMainFragment ianMainFragment = (IanMainFragment) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ne4 ne4Var = p97.a;
                    dd4 dd4Var = dd4.a;
                    ad4 ad4Var = dd4.n().a;
                    ad4Var.getClass();
                    ad4Var.e(cd4.a.D0);
                    cd4.i3.a.getClass();
                    rm2.a(ne4Var.a(h07.a), bh2.c(-1731700726, new ct(ianMainFragment, 3), bVar2), bVar2, 56);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 5:
                ((Integer) obj2).getClass();
                vj7.d((wj7) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 6:
                q87 q87Var = (q87) obj3;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return q87Var;
            case 7:
                h5b h5bVar = (h5b) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar3, 0);
                    int iHashCode = Long.hashCode(bVar3.k());
                    t8b t8bVarM = bVar3.m();
                    e.a aVar = e.a.b;
                    e eVarC = c.c(bVar3, aVar);
                    gl2.j.getClass();
                    pm8.a aVar2 = gl2.a.b;
                    if (bVar3.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar3.B();
                    if (bVar3.f()) {
                        bVar3.y(aVar2);
                    } else {
                        bVar3.n();
                    }
                    gl2.a.d dVar = gl2.a.g;
                    ygg.y(bVar3, ob2VarA, dVar);
                    gl2.a.f fVar = gl2.a.f;
                    ygg.y(bVar3, t8bVarM, fVar);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar3, iHashCode, c0251a);
                    }
                    gl2.a.e eVar = gl2.a.d;
                    ygg.y(bVar3, eVarC, eVar);
                    ag9 ag9VarD = hl1.d(c20.a.a, false);
                    int iHashCode2 = Long.hashCode(bVar3.k());
                    t8b t8bVarM2 = bVar3.m();
                    e eVarC2 = c.c(bVar3, aVar);
                    if (bVar3.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar3.B();
                    if (bVar3.f()) {
                        bVar3.y(aVar2);
                    } else {
                        bVar3.n();
                    }
                    ygg.y(bVar3, ag9VarD, dVar);
                    ygg.y(bVar3, t8bVarM2, fVar);
                    if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar3, iHashCode2, c0251a);
                    }
                    ygg.y(bVar3, eVarC2, eVar);
                    boolean zBooleanValue = ((Boolean) ((gme) h5bVar.P().b).getValue()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) ((gme) h5bVar.P().c).getValue()).booleanValue();
                    ex4 ex4Var = (ex4) ((gme) h5bVar.P().d).getValue();
                    boolean zX = bVar3.x(h5bVar);
                    Object objV = bVar3.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (zX || objV == c0020a) {
                        objV = new n30(h5bVar, 8);
                        bVar3.p(objV);
                    }
                    gu5 gu5Var = (gu5) objV;
                    boolean zX2 = bVar3.x(h5bVar);
                    Object objV2 = bVar3.v();
                    if (zX2 || objV2 == c0020a) {
                        objV2 = new ye(h5bVar, 13);
                        bVar3.p(objV2);
                    }
                    gu5 gu5Var2 = (gu5) objV2;
                    boolean zX3 = bVar3.x(h5bVar);
                    Object objV3 = bVar3.v();
                    if (zX3 || objV3 == c0020a) {
                        objV3 = new la(h5bVar, 20);
                        bVar3.p(objV3);
                    }
                    gu5 gu5Var3 = (gu5) objV3;
                    ModalWebview modalWebviewN = h5bVar.N();
                    boolean zBooleanValue3 = ((Boolean) ((gme) h5bVar.P().e).getValue()).booleanValue();
                    boolean zBooleanValue4 = ((Boolean) ((gme) h5bVar.P().f).getValue()).booleanValue();
                    boolean zX4 = bVar3.x(h5bVar);
                    Object objV4 = bVar3.v();
                    if (zX4 || objV4 == c0020a) {
                        objV4 = new ig(h5bVar, 14);
                        bVar3.p(objV4);
                    }
                    g5b.a(zBooleanValue, zBooleanValue2, ex4Var, gu5Var, gu5Var2, gu5Var3, modalWebviewN, zBooleanValue3, zBooleanValue4, (gu5) objV4, bVar3, 0, 0);
                    bVar3.q();
                    bVar3.q();
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 8:
                Context context = (Context) obj;
                Uri uri = (Uri) obj2;
                context.getClass();
                uri.getClass();
                ((x1c) obj3).H(context, uri, null);
                return j6g.a;
            default:
                return VideoView.autoEnterPiP_delegate$lambda$1((VideoView) obj3, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
        }
    }

    public /* synthetic */ yo0(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
