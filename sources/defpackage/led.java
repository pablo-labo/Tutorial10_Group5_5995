package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lled;", "Lija;", "<init>", "()V", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class led extends ija {
    public qr d;

    public static final class a extends wpa {
        public a() {
            super(true);
        }

        @Override // defpackage.wpa
        public final void b() {
            g activity = led.this.getActivity();
            lr5 lr5VarU = activity != null ? activity.u() : null;
            if (lr5VarU != null) {
                ((i1g) cr8.p(i1g.class)).c(lr5VarU, "RnNextStepsDashboardFragment");
            }
        }
    }

    @Override // defpackage.ija, androidx.fragment.app.Fragment
    public final void onDestroy() throws Exception {
        super.onDestroy();
        qr qrVar = this.d;
        if (qrVar != null) {
            qrVar.invoke();
        }
        this.d = null;
    }

    @Override // defpackage.ija, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        dqa dqaVarR;
        view.getClass();
        super.onViewCreated(view, bundle);
        g activity = getActivity();
        if (activity == null || (dqaVarR = activity.r()) == null) {
            return;
        }
        zv8 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dqaVarR.a(viewLifecycleOwner, new a());
    }
}
