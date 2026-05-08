package androidx.media3.ui;

import android.content.Context;
import android.view.View;
import androidx.media3.ui.SubtitleView;
import defpackage.cye;
import defpackage.gx1;
import defpackage.n83;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends View implements SubtitleView.a {
    public final ArrayList a;
    public List<n83> b;
    public int c;
    public float d;
    public gx1 e;
    public float f;

    public a(Context context, int i) {
        super(context, null);
        this.a = new ArrayList();
        this.b = Collections.EMPTY_LIST;
        this.c = 0;
        this.d = 0.0533f;
        this.e = gx1.g;
        this.f = 0.08f;
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public final void a(List<n83> list, gx1 gx1Var, float f, int i, float f2) {
        this.b = list;
        this.e = gx1Var;
        this.d = f;
        this.c = i;
        this.f = f2;
        while (true) {
            ArrayList arrayList = this.a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new cye(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0463  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchDraw(android.graphics.Canvas r37) {
        /*
            Method dump skipped, instruction units count: 1169
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.a.dispatchDraw(android.graphics.Canvas):void");
    }
}
