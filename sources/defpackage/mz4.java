package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.layout.w;
import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mz4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mz4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iG;
        int iJ;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj3;
                String str2 = (String) obj2;
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("subTabName", "Invitations");
                if (str != null) {
                    bVar.a("entityId", str);
                }
                if (str2 != null) {
                    bVar.a("jobKey", str2);
                }
                break;
            case 1:
                bl5 bl5Var = (bl5) obj3;
                gl5 gl5Var = (gl5) obj2;
                w wVar = (w) obj;
                if (wVar != null) {
                    iG = gl5Var.g(wVar);
                    iJ = gl5Var.j(wVar);
                } else {
                    iG = 0;
                    iJ = 0;
                }
                bl5Var.g = new eh7(eh7.a(iG, iJ));
                bl5Var.e = wVar;
                break;
            case 2:
                break;
            case 3:
                fza fzaVar = (fza) obj3;
                w wVar2 = (w) obj2;
                w.a aVar = (w.a) obj;
                boolean z = fzaVar.h0;
                float f = fzaVar.d0;
                if (z) {
                    w.a.y(aVar, wVar2, aVar.x0(f), aVar.x0(fzaVar.e0));
                } else {
                    aVar.r(wVar2, aVar.x0(f), aVar.x0(fzaVar.e0), 0.0f);
                }
                break;
            case 4:
                x1c x1cVar = (x1c) obj3;
                Context context = (Context) obj2;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    x1cVar.H(context, uri, null);
                }
                break;
            default:
                ese eseVar = (ese) obj3;
                ese eseVar2 = (ese) obj2;
                gb4 gb4Var = (gb4) obj;
                float fT1 = gb4Var.t1(2.0f);
                float f2 = fT1 / 2.0f;
                gb4.q0(gb4Var, ((da2) eseVar.getValue()).a, gb4Var.t1(bic.a) - f2, 0L, new bwe(fT1, 0.0f, 0, 0, null, 30), 108);
                if (Float.compare(((j94) eseVar2.getValue()).a, 0.0f) > 0) {
                    gb4.q0(gb4Var, ((da2) eseVar.getValue()).a, gb4Var.t1(((j94) eseVar2.getValue()).a) - f2, 0L, ib5.a, 108);
                }
                break;
        }
        return j6g.a;
    }
}
