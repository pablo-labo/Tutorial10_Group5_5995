package defpackage;

import android.view.View;
import com.wlappdebug.DebugActivity;
import defpackage.w24;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dh3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dh3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((DebugActivity.c) obj).e.invoke();
                return;
            case 1:
                yta ytaVar = ((xta) obj).a;
                if (ytaVar != null) {
                    ytaVar.P0.toggle();
                    return;
                } else {
                    wl7.g("binding");
                    throw null;
                }
            default:
                ((w24.a) obj).a();
                return;
        }
    }
}
