package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes.dex */
public final class atg extends nsf {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ btg d;

    public atg(btg btgVar, ViewGroup viewGroup, View view, View view2) {
        this.d = btgVar;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // defpackage.nsf, esf.d
    public final void a() {
        this.a.getOverlay().remove(this.b);
    }

    @Override // defpackage.nsf, esf.d
    public final void c() {
        View view = this.b;
        if (view.getParent() == null) {
            this.a.getOverlay().add(view);
        } else {
            this.d.cancel();
        }
    }

    @Override // esf.d
    public final void d(esf esfVar) {
        this.c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        esfVar.x(this);
    }
}
