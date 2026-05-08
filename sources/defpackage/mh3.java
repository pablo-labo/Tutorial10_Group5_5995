package defpackage;

import android.view.View;
import androidx.media3.ui.c;
import androidx.recyclerview.widget.RecyclerView;
import com.wlappdebug.DebugFlagsActivity;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mh3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mh3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RecyclerView recyclerView;
        RecyclerView.e<? extends RecyclerView.b0> adapter;
        int iJ;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                DebugFlagsActivity debugFlagsActivity = (DebugFlagsActivity) obj;
                int i2 = DebugFlagsActivity.t0;
                Iterator it = debugFlagsActivity.r0.iterator();
                if (!it.hasNext()) {
                    debugFlagsActivity.finish();
                    return;
                } else {
                    throw null;
                }
            default:
                c.f fVar = (c.f) obj;
                c cVar = c.this;
                int i3 = -1;
                if (fVar.s != null && (recyclerView = fVar.r) != null && (adapter = recyclerView.getAdapter()) != null && (iJ = fVar.r.J(fVar)) != -1 && fVar.s == adapter) {
                    i3 = iJ;
                }
                View view2 = cVar.x0;
                if (i3 == 0) {
                    c.d dVar = cVar.e0;
                    view2.getClass();
                    cVar.e(dVar, view2);
                    return;
                } else {
                    if (i3 != 1) {
                        cVar.i0.dismiss();
                        return;
                    }
                    c.a aVar = cVar.g0;
                    view2.getClass();
                    cVar.e(aVar, view2);
                    return;
                }
        }
    }
}
