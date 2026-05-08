package defpackage;

import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fp6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IanMainFragment b;

    public /* synthetic */ fp6(IanMainFragment ianMainFragment, int i) {
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
                    IanMainFragment.U(ianMainFragment, IanMainFragment.I(), str, 4);
                }
                break;
            default:
                int i2 = (int) (((th7) obj).a & 4294967295L);
                if (i2 != 0 && ((Number) ((gme) ianMainFragment.J().a0).getValue()).intValue() != i2) {
                    ((gme) ianMainFragment.J().a0).setValue(Integer.valueOf(i2));
                }
                break;
        }
        return j6g.a;
    }
}
