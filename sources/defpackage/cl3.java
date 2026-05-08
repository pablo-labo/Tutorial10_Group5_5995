package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.e;
import androidx.navigation.k;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanInitialState;
import com.indeed.android.jobsearch.tare.nav.a;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cl3 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cl3(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                u63.Y((e13) obj3, null, null, new l67((hee) obj2, (g4a) obj, null), 3);
                break;
            default:
                e eVar = (e) obj3;
                String str = (String) obj2;
                a aVar = (a) obj;
                k kVarI = eVar.i();
                if (kVarI == null || kVarI.W != R.id.ianMainFragment) {
                    Serializable ianInitialState = new IanInitialState(xj1.b, null, str, 2);
                    Bundle bundle = new Bundle();
                    if (Parcelable.class.isAssignableFrom(IanInitialState.class)) {
                        bundle.putParcelable("initialState", (Parcelable) ianInitialState);
                    } else if (Serializable.class.isAssignableFrom(IanInitialState.class)) {
                        bundle.putSerializable("initialState", ianInitialState);
                    }
                    bundle.putBoolean("fromOnboarding", false);
                    bundle.putBoolean("fromRegPromo", false);
                    eVar.n(R.id.navActionDirectlyBottomNav, bundle);
                } else {
                    aVar.c.k(new jz2<>(str));
                }
                break;
        }
        return j6g.a;
    }
}
