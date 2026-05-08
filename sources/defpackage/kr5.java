package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.NavHostFragment;
import defpackage.ald;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kr5 implements ald.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kr5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // ald.b
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((FragmentManager) obj).Y();
            default:
                NavHostFragment navHostFragment = (NavHostFragment) obj;
                navHostFragment.getClass();
                int i2 = navHostFragment.c;
                if (i2 != 0) {
                    return aq1.a(new Pair("android-support-nav:fragment:graphId", Integer.valueOf(i2)));
                }
                Bundle bundle = Bundle.EMPTY;
                bundle.getClass();
                return bundle;
        }
    }
}
