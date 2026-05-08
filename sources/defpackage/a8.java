package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a8 extends qpg {
    public static final /* synthetic */ int I0 = 0;
    public final Button D0;
    public final ComposeView E0;
    public final EditText F0;
    public final Button G0;
    public oc9 H0;

    public a8(vd3 vd3Var, View view, Button button, ComposeView composeView, EditText editText, Button button2) {
        super(vd3Var, view, 0);
        this.D0 = button;
        this.E0 = composeView;
        this.F0 = editText;
        this.G0 = button2;
    }

    public abstract void e0(oc9 oc9Var);
}
