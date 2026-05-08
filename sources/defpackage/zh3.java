package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.swmansion.rnscreens.f;
import com.wlappdebug.DebugProctorActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zh3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ zh3(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                int i2 = DebugProctorActivity.t0;
                ((DebugProctorActivity) callback).finish();
                return;
            case 1:
                buc bucVar = (buc) callback;
                fuc fucVar = bucVar.b;
                w24 w24Var = bucVar.a;
                if (fucVar == null || !fucVar.a() || bucVar.W) {
                    return;
                }
                bucVar.W = true;
                TextView textView = bucVar.e;
                if (textView == null) {
                    wl7.g("reportTextView");
                    throw null;
                }
                textView.setText("Reporting...");
                TextView textView2 = bucVar.e;
                if (textView2 == null) {
                    wl7.g("reportTextView");
                    throw null;
                }
                textView2.setVisibility(0);
                ProgressBar progressBar = bucVar.f;
                if (progressBar == null) {
                    wl7.g("loadingIndicator");
                    throw null;
                }
                progressBar.setVisibility(0);
                View view2 = bucVar.V;
                if (view2 == null) {
                    wl7.g("lineSeparator");
                    throw null;
                }
                view2.setVisibility(0);
                Button button = bucVar.d;
                if (button == null) {
                    wl7.g("reportButton");
                    throw null;
                }
                button.setEnabled(false);
                if (w24Var.d() == null) {
                    r6.g("Required value was null.");
                    return;
                }
                if (w24Var.u() == null) {
                    r6.g("Required value was null.");
                    return;
                } else if (w24Var.m() == null) {
                    r6.g("Required value was null.");
                    return;
                } else {
                    view.getContext().getClass();
                    fucVar.c();
                    return;
                }
            default:
                f.a((f) callback);
                return;
        }
    }
}
