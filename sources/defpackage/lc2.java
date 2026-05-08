package defpackage;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.Button;
import androidx.fragment.app.g;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lc2 implements DialogInterface.OnShowListener {
    public final /* synthetic */ AlertDialog a;
    public final /* synthetic */ g b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ lc2(AlertDialog alertDialog, g gVar, Bundle bundle, boolean z) {
        this.a = alertDialog;
        this.b = gVar;
        this.c = bundle;
        this.d = z;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        AlertDialog alertDialog = this.a;
        Button button = alertDialog.getButton(-1);
        Button button2 = alertDialog.getButton(-2);
        Button button3 = alertDialog.getButton(-3);
        TypedValue typedValue = new TypedValue();
        g gVar = this.b;
        gVar.getTheme().resolveAttribute(R.attr.textColorPrimary, typedValue, true);
        int i = typedValue.resourceId;
        int color = i != 0 ? gVar.getColor(i) : typedValue.data;
        Bundle bundle = this.c;
        boolean z = this.d;
        mc2.e(button, "positive", bundle, z, color);
        mc2.e(button2, "negative", bundle, z, color);
        mc2.e(button3, "neutral", bundle, z, color);
    }
}
