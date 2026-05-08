package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class gaa {
    public final /* synthetic */ ViewGroupManager a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Set d;
    public final /* synthetic */ int e;
    public final /* synthetic */ haa f;

    public gaa(haa haaVar, ViewGroupManager viewGroupManager, ViewGroup viewGroup, View view, Set set, int i) {
        this.f = haaVar;
        this.a = viewGroupManager;
        this.b = viewGroup;
        this.c = view;
        this.d = set;
        this.e = i;
    }

    public final void a() {
        UiThreadUtil.assertOnUiThread();
        ViewGroupManager viewGroupManager = this.a;
        ViewGroup viewGroup = this.b;
        View view = this.c;
        viewGroupManager.removeView(viewGroup, view);
        haa haaVar = this.f;
        haaVar.f(view);
        Integer numValueOf = Integer.valueOf(view.getId());
        Set set = this.d;
        set.remove(numValueOf);
        if (set.isEmpty()) {
            haaVar.j.remove(Integer.valueOf(this.e));
        }
    }
}
