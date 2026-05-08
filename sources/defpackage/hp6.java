package defpackage;

import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hp6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IanMainFragment b;

    public /* synthetic */ hp6(IanMainFragment ianMainFragment, int i) {
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
                    IanMainFragment.U(ianMainFragment, xj1.W, str, 4);
                }
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                IanMainFragment.U(ianMainFragment, xj1.c, str2, 4);
                break;
        }
        return j6g.a;
    }
}
