package defpackage;

import androidx.compose.ui.layout.w;
import com.indeed.android.myjobs.data.model.ApiResponse;
import com.indeed.android.myjobs.data.model.AppStatusJob;
import com.indeed.android.myjobs.data.model.Body;
import com.indeed.android.myjobs.data.model.dto.DtoExtensionKt;
import defpackage.hf3;
import defpackage.ua4;
import defpackage.v94;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o72 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o72(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        List<AppStatusJob> appStatusJobs;
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj3;
                ooa ooaVar = (ooa) obj;
                mif mifVar = (mif) ((g4a) obj2).getValue();
                if (mifVar != null) {
                    function1.invoke(Integer.valueOf(mifVar.b.g(ooaVar.a)));
                }
                break;
            case 1:
                na4 na4Var = (na4) obj2;
                wa4 wa4Var = (wa4) obj3;
                long jG = ooa.g(((v94.b) obj).a, wa4Var.t0 ? -1.0f : 1.0f);
                dwa dwaVar = wa4Var.p0;
                ua4.a aVar = ua4.a;
                na4Var.a(Float.intBitsToFloat((int) (dwaVar == dwa.a ? jG & 4294967295L : jG >> 32)));
                break;
            case 2:
                jhf jhfVar = (jhf) obj;
                jhfVar.getClass();
                ((g4a) obj2).setValue(jhfVar);
                ((g4a) obj3).setValue(jhfVar.a.b);
                break;
            case 3:
                w.a aVar2 = (w.a) obj;
                ArrayList arrayListF = nd1.f((List) obj2, ((gy8) obj3).a);
                if (arrayListF != null) {
                    int size = arrayListF.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Pair pair = (Pair) arrayListF.get(i2);
                        w wVar = (w) pair.a();
                        gu5 gu5Var = (gu5) pair.b();
                        w.a.w(aVar2, wVar, gu5Var != null ? ((lh7) gu5Var.invoke()).a : 0L);
                    }
                }
                break;
            case 4:
                w.a aVar3 = (w.a) obj;
                na0 na0Var = new na0((ArrayList) obj3, 16);
                aVar3.a = true;
                na0Var.invoke(aVar3);
                aVar3.a = false;
                ((g4a) obj2).getValue();
                break;
            case 5:
                break;
            case 6:
                old oldVarI = ((pld) obj2).i();
                Body body = ((ApiResponse) ((hf3.c) ((hf3) obj3)).a).getBody();
                if (body == null || (appStatusJobs = body.getAppStatusJobs()) == null) {
                    arrayList = null;
                } else {
                    List<AppStatusJob> list = appStatusJobs;
                    arrayList = new ArrayList(t92.r0(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(DtoExtensionKt.toSavedJobDTO((AppStatusJob) it.next()));
                    }
                }
                break;
            case 7:
                p2e p2eVar = (p2e) obj;
                ((j4e) obj2).m(p2eVar);
                ((Function1) obj3).invoke(p2eVar);
                break;
            case 8:
                ((Function1) obj3).invoke(obj);
                ((Function1) obj2).invoke(obj);
                break;
            default:
                iy3 iy3Var = (iy3) obj3;
                m94 m94Var = (m94) obj;
                ((g4a) obj2).setValue(new th7((((long) iy3Var.x0(m94.b(m94Var.a))) << 32) | (((long) iy3Var.x0(m94.a(m94Var.a))) & 4294967295L)));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ o72(int i, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
