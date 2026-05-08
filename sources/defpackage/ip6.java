package defpackage;

import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ip6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IanMainFragment b;

    public /* synthetic */ ip6(IanMainFragment ianMainFragment, int i) {
        this.a = i;
        this.b = ianMainFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        IanMainFragment ianMainFragment = this.b;
        switch (i) {
            case 0:
                String str = (String) ((jz2) obj).a();
                if (str != null) {
                    dd4 dd4Var = dd4.a;
                    IanMainFragment.U(ianMainFragment, dd4.g() ? xj1.b0 : xj1.d, str, 4);
                }
                break;
            default:
                Exception exc = (Exception) obj;
                exc.getClass();
                ArrayList arrayList = lz2.a;
                lz2.b("IanMainFragment", "Error checking keyboard visibility for view " + ianMainFragment.getView() + ": " + exc, false, exc);
                break;
        }
        return j6g.a;
    }
}
