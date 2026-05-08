package defpackage;

import androidx.compose.runtime.b;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ld0 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ld0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj3).getClass();
                ((qd0) obj).getClass();
                ((ah2) obj4).invoke((b) obj2, 0);
                break;
            default:
                IanMainFragment ianMainFragment = (IanMainFragment) obj4;
                b bVar = (b) obj2;
                ((Integer) obj3).getClass();
                ((qd0) obj).getClass();
                String strB = zwc.b();
                String strA = zwc.a("privacypolicy");
                String strA2 = zwc.a("Cookies");
                boolean zX = bVar.x(ianMainFragment);
                Object objV = bVar.v();
                b.a.C0020a c0020a = b.a.a;
                if (zX || objV == c0020a) {
                    objV = new qr(ianMainFragment, 5);
                    bVar.p(objV);
                }
                gu5 gu5Var = (gu5) objV;
                boolean zX2 = bVar.x(ianMainFragment);
                Object objV2 = bVar.v();
                if (zX2 || objV2 == c0020a) {
                    objV2 = new ne(ianMainFragment, 6);
                    bVar.p(objV2);
                }
                xof.a(strB, strA, strA2, gu5Var, (Function1) objV2, bVar, 0);
                break;
        }
        return j6g.a;
    }
}
