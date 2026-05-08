package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class si0 implements tpa {
    public final /* synthetic */ AppBarLayout a;

    public si0(AppBarLayout appBarLayout) {
        this.a = appBarLayout;
    }

    @Override // defpackage.tpa
    public final rzg b(View view, rzg rzgVar) {
        WeakHashMap<View, prg> weakHashMap = epg.a;
        AppBarLayout appBarLayout = this.a;
        rzg rzgVar2 = appBarLayout.getFitsSystemWindows() ? rzgVar : null;
        if (!Objects.equals(appBarLayout.V, rzgVar2)) {
            appBarLayout.V = rzgVar2;
            appBarLayout.setWillNotDraw(!(appBarLayout.i0 != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return rzgVar;
    }
}
