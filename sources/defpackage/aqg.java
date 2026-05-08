package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class aqg implements r6e<View> {
    public final /* synthetic */ ViewGroup a;

    public aqg(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // defpackage.r6e
    public final Iterator<View> iterator() {
        return new knc(this.a, 1);
    }
}
