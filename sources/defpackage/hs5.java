package defpackage;

import android.view.View;
import defpackage.epg;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hs5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;

    public hs5(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.a; i++) {
            View view = (View) this.b.get(i);
            String str = (String) this.c.get(i);
            WeakHashMap<View, prg> weakHashMap = epg.a;
            epg.d.n(view, str);
            epg.d.n((View) this.d.get(i), (String) this.e.get(i));
        }
    }
}
