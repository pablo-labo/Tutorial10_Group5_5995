package defpackage;

import android.view.View;
import defpackage.epg;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wzg implements l74 {
    public final /* synthetic */ xzg a;
    public final /* synthetic */ View b;

    public wzg(xzg xzgVar, View view) {
        this.a = xzgVar;
        this.b = view;
    }

    @Override // defpackage.l74
    public final void dispose() {
        xzg xzgVar = this.a;
        int i = xzgVar.t - 1;
        xzgVar.t = i;
        if (i == 0) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            View view = this.b;
            epg.d.m(view, null);
            epg.q(view, null);
            view.removeOnAttachStateChangeListener(xzgVar.u);
        }
    }
}
