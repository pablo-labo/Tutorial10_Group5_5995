package defpackage;

import android.content.Context;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.fragment.app.g;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g1c implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g1c(Object obj, Context context, int i) {
        this.a = i;
        this.b = context;
        this.c = obj;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj4 = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                g gVar = (g) context;
                wu5 wu5Var = (wu5) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zX = bVar.x(gVar) | bVar.K(wu5Var);
                    Object objV = bVar.v();
                    if (zX || objV == c0020a) {
                        objV = new pyb(gVar, wu5Var, 0);
                        bVar.p(objV);
                    }
                    q1c.c(48, (gu5) objV, bVar, "Review Relocation Suggestion", true);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                g gVar2 = (g) context;
                wu5 wu5Var2 = (wu5) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zX2 = bVar2.x(gVar2) | bVar2.K(wu5Var2);
                    Object objV2 = bVar2.v();
                    if (zX2 || objV2 == c0020a) {
                        objV2 = new yyb(gVar2, wu5Var2, 0);
                        bVar2.p(objV2);
                    }
                    q1c.c(48, (gu5) objV2, bVar2, "Review Work Experience Suggestion", true);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            default:
                ArrayList arrayList = (ArrayList) obj4;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar3, 0);
                    int iHashCode = Long.hashCode(bVar3.k());
                    t8b t8bVarM = bVar3.m();
                    e eVarC = c.c(bVar3, e.a.b);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    if (bVar3.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar3.B();
                    if (bVar3.f()) {
                        bVar3.y(aVar);
                    } else {
                        bVar3.n();
                    }
                    ygg.y(bVar3, ob2VarA, gl2.a.g);
                    ygg.y(bVar3, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar3, iHashCode, c0251a);
                    }
                    ygg.y(bVar3, eVarC, gl2.a.d);
                    String string = context.getString(R.string.section_header_pending);
                    string.getClass();
                    qq0.f(string, bVar3, 0);
                    Integer numValueOf = Integer.valueOf(arrayList.size());
                    boolean zX3 = bVar3.x(arrayList);
                    Object objV3 = bVar3.v();
                    if (zX3 || objV3 == c0020a) {
                        objV3 = new sq0(arrayList, null);
                        bVar3.p(objV3);
                    }
                    to4.d(bVar3, numValueOf, (Function2) objV3);
                    bVar3.q();
                } else {
                    bVar3.D();
                }
                return j6g.a;
        }
    }
}
