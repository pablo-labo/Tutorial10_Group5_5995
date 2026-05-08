package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.indeed.android.jobsearch.R;
import defpackage.epg;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class v29 extends Dialog {
    public final View a;

    public v29(Activity activity, View view) {
        super(activity, R.style.Theme_Catalyst_LogBox);
        this.a = view;
        requestWindowFeature(1);
        if (view != null) {
            setContentView(view);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
        }
        View view = this.a;
        if (view != null) {
            final im0 im0Var = new im0(10, (byte) 0);
            tpa tpaVar = new tpa() { // from class: u29
                @Override // defpackage.tpa
                public final rzg b(View view2, rzg rzgVar) {
                    view2.getClass();
                    return (rzg) im0Var.invoke(view2, rzgVar);
                }
            };
            WeakHashMap<View, prg> weakHashMap = epg.a;
            epg.d.m(view, tpaVar);
        }
    }
}
