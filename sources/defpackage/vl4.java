package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vl4 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vl4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                g4a g4aVar = (g4a) obj5;
                g4a g4aVar2 = (g4a) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e eVarH = f.h(e.a.b, v1c.e, 0.0f, 2);
                    ag9 ag9VarD = hl1.d(c20.a.a, false);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarH);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    String strE = null;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar);
                    } else {
                        bVar.n();
                    }
                    ygg.y(bVar, ag9VarD, gl2.a.g);
                    ygg.y(bVar, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    ygg.y(bVar, eVarC, gl2.a.d);
                    String str = (String) g4aVar.getValue();
                    if (str == null) {
                        str = "";
                    }
                    Object objV = bVar.v();
                    if (objV == c0020a) {
                        objV = new k23(3, g4aVar);
                        bVar.p(objV);
                    }
                    Function1 function1 = (Function1) objV;
                    String strI = ak2.I(R.string.url_field_label, bVar);
                    String strI2 = ak2.I(R.string.url_field_label, bVar);
                    Object objV2 = bVar.v();
                    if (objV2 == c0020a) {
                        objV2 = new wl4(0, g4aVar);
                        bVar.p(objV2);
                    }
                    gu5 gu5Var = (gu5) objV2;
                    if (((Boolean) g4aVar2.getValue()).booleanValue()) {
                        strE = l.e(bVar, -916034846, R.string.invalid_url_alert_text, bVar);
                    } else {
                        bVar.L(-915917295);
                        bVar.F();
                    }
                    jyb.a(str, function1, strI, false, strI2, false, null, null, gu5Var, true, null, "EditPublicationUrl", null, null, strE, bVar, 905972784, 48, 13536);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                z13 z13Var = (z13) obj5;
                o97 o97Var = (o97) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    cif.b(z13Var.c, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.f, bVar2, 0, 0, 65534);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            default:
                List list = (List) obj5;
                pld pldVar = (pld) obj4;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    bVar3.L(1854392428);
                    List<SavedJobsDto> list2 = list;
                    ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
                    for (SavedJobsDto savedJobsDto : list2) {
                        String title = savedJobsDto.getTitle();
                        String description = savedJobsDto.getDescription();
                        String location = savedJobsDto.getLocation();
                        boolean zX = bVar3.x(pldVar) | bVar3.x(savedJobsDto);
                        Object objV3 = bVar3.v();
                        if (zX || objV3 == c0020a) {
                            objV3 = new ky(5, pldVar, savedJobsDto);
                            bVar3.p(objV3);
                        }
                        gu5 gu5Var2 = (gu5) objV3;
                        boolean zX2 = bVar3.x(pldVar) | bVar3.x(savedJobsDto);
                        Object objV4 = bVar3.v();
                        if (zX2 || objV4 == c0020a) {
                            objV4 = new np0(8, pldVar, savedJobsDto);
                            bVar3.p(objV4);
                        }
                        arrayList.add(new bka(title, description, location, gu5Var2, (gu5) objV4));
                    }
                    bVar3.F();
                    cka.a(arrayList, bVar3, 0);
                } else {
                    bVar3.D();
                }
                return j6g.a;
        }
    }
}
