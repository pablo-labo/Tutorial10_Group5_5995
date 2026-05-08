package defpackage;

import android.graphics.Outline;

/* JADX INFO: loaded from: classes.dex */
public final class nwa {
    public static void a(Outline outline, v5b v5bVar) {
        if (v5bVar instanceof m80) {
            outline.setPath(((m80) v5bVar).a);
        } else {
            b0.u("Unable to obtain android.graphics.Path");
        }
    }
}
