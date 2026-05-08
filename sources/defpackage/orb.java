package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class orb extends qpg {
    public static final /* synthetic */ int G0 = 0;
    public final EditText D0;
    public final TextView E0;
    public gua F0;

    public orb(vd3 vd3Var, View view, EditText editText, TextView textView) {
        super(vd3Var, view, 1);
        this.D0 = editText;
        this.E0 = textView;
    }

    public abstract void e0(gua guaVar);
}
