package defpackage;

import androidx.compose.runtime.b;
import androidx.navigation.d;
import com.indeed.android.jobsearch.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sh implements xu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;
    public final /* synthetic */ g4a c;

    public /* synthetic */ sh(iba ibaVar, g4a g4aVar, int i) {
        this.a = i;
        this.b = ibaVar;
        this.c = g4aVar;
    }

    @Override // defpackage.xu5
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        g4a g4aVar = this.c;
        iba ibaVar = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj3;
                s6.g((Integer) obj4, (bd0) obj, (d) obj2);
                j6g j6gVar = j6g.a;
                Object objV = bVar.v();
                if (objV == c0020a) {
                    objV = new zg(0);
                    bVar.p(objV);
                }
                to4.b(j6gVar, (Function1) objV, bVar);
                List<String> list = p23.a;
                String strI = ak2.I(R.string.state, bVar);
                boolean zX = bVar.x(ibaVar);
                Object objV2 = bVar.v();
                if (zX || objV2 == c0020a) {
                    objV2 = new ah(ibaVar, g4aVar, 0);
                    bVar.p(objV2);
                }
                Function1 function1 = (Function1) objV2;
                boolean zX2 = bVar.x(ibaVar);
                Object objV3 = bVar.v();
                if (zX2 || objV3 == c0020a) {
                    objV3 = new jb(ibaVar, 1);
                    bVar.p(objV3);
                }
                gu5 gu5Var = (gu5) objV3;
                boolean zX3 = bVar.x(ibaVar);
                Object objV4 = bVar.v();
                if (zX3 || objV4 == c0020a) {
                    objV4 = new kb(ibaVar, 1);
                    bVar.p(objV4);
                }
                tzd.a(list, strI, function1, gu5Var, (gu5) objV4, bVar, 0);
                return j6gVar;
            default:
                b bVar2 = (b) obj3;
                s6.g((Integer) obj4, (bd0) obj, (d) obj2);
                j6g j6gVar2 = j6g.a;
                Object objV5 = bVar2.v();
                if (objV5 == c0020a) {
                    objV5 = new kd(2);
                    bVar2.p(objV5);
                }
                to4.b(j6gVar2, (Function1) objV5, bVar2);
                List<String> list2 = p23.a;
                String strI2 = ak2.I(R.string.state, bVar2);
                boolean zX4 = bVar2.x(ibaVar);
                Object objV6 = bVar2.v();
                if (zX4 || objV6 == c0020a) {
                    objV6 = new ft(ibaVar, g4aVar, 0);
                    bVar2.p(objV6);
                }
                Function1 function12 = (Function1) objV6;
                boolean zX5 = bVar2.x(ibaVar);
                Object objV7 = bVar2.v();
                if (zX5 || objV7 == c0020a) {
                    objV7 = new hd(ibaVar, 1);
                    bVar2.p(objV7);
                }
                gu5 gu5Var2 = (gu5) objV7;
                boolean zX6 = bVar2.x(ibaVar);
                Object objV8 = bVar2.v();
                if (zX6 || objV8 == c0020a) {
                    objV8 = new id(ibaVar, 2);
                    bVar2.p(objV8);
                }
                tzd.a(list2, strI2, function12, gu5Var2, (gu5) objV8, bVar2, 0);
                return j6gVar2;
        }
    }
}
