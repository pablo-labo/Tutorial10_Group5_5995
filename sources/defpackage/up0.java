package defpackage;

import androidx.compose.runtime.b;
import androidx.fragment.app.g;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class up0 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ up0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                List list = (List) obj5;
                fr0 fr0Var = (fr0) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    bVar.L(840475012);
                    List<SavedJobsDto> list2 = list;
                    ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
                    for (SavedJobsDto savedJobsDto : list2) {
                        String title = savedJobsDto.getTitle();
                        String description = savedJobsDto.getDescription();
                        String location = savedJobsDto.getLocation();
                        boolean zX = bVar.x(fr0Var) | bVar.x(savedJobsDto);
                        Object objV = bVar.v();
                        if (zX || objV == c0020a) {
                            objV = new gx(1, fr0Var, savedJobsDto);
                            bVar.p(objV);
                        }
                        gu5 gu5Var = (gu5) objV;
                        boolean zX2 = bVar.x(fr0Var) | bVar.x(savedJobsDto);
                        Object objV2 = bVar.v();
                        if (zX2 || objV2 == c0020a) {
                            objV2 = new jp0(0, fr0Var, savedJobsDto);
                            bVar.p(objV2);
                        }
                        arrayList.add(new bka(title, description, location, gu5Var, (gu5) objV2));
                    }
                    bVar.F();
                    cka.a(arrayList, bVar, 0);
                } else {
                    bVar.D();
                }
                break;
            default:
                g gVar = (g) obj5;
                wu5 wu5Var = (wu5) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zX3 = bVar2.x(gVar) | bVar2.K(wu5Var);
                    Object objV3 = bVar2.v();
                    if (zX3 || objV3 == c0020a) {
                        objV3 = new nyb(gVar, wu5Var, 2);
                        bVar2.p(objV3);
                    }
                    q1c.c(48, (gu5) objV3, bVar2, "Review Preferred Job Title Suggestion", true);
                } else {
                    bVar2.D();
                }
                break;
        }
        return j6g.a;
    }
}
