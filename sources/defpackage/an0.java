package defpackage;

import android.os.Bundle;
import androidx.fragment.app.g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lan0;", "Lf91;", "<init>", "()V", "uiplugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class an0 extends f91 {
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        g activity;
        super.onCreate(bundle);
        if (((r0g) cr8.p(r0g.class)).b() || (activity = getActivity()) == null) {
            return;
        }
        ((r0g) cr8.p(r0g.class)).a(activity, this);
    }
}
