package defpackage;

import android.view.View;
import androidx.navigation.e;
import com.indeed.android.jobsearch.R;
import defpackage.lx5;
import defpackage.mja;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class zx5 extends mj8 implements Function1 {
    public static final zx5 b;
    public static final zx5 c;
    public static final zx5 d;
    public static final zx5 e;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new zx5(i, 0);
        c = new zx5(i, 1);
        d = new zx5(i, 2);
        e = new zx5(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zx5(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((lx5.b) obj).getClass();
                return j6g.a;
            case 1:
                View view = (View) obj;
                view.getClass();
                Object tag = view.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (e) ((WeakReference) tag).get();
                }
                if (tag instanceof e) {
                    return (e) tag;
                }
                return null;
            case 2:
                ((mja.a) obj).getClass();
                return j6g.a;
            default:
                return Boolean.TRUE;
        }
    }
}
