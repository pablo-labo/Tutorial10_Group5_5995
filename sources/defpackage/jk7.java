package defpackage;

import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljk7;", "Lec1;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class jk7 extends ec1 {
    public ar7 t0;

    @Override // defpackage.ec1
    public final String P() {
        return "interview-scheduling-bottom-sheet-modal";
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String strF;
        super.onDestroyView();
        String str = this.r0;
        if (str != null) {
            Locale locale = Locale.ROOT;
            strF = r6.f(locale, str, locale);
        } else {
            strF = null;
        }
        iq7 iq7Var = wl7.b(strF, "success") ? iq7.b : iq7.a;
        ar7 ar7Var = this.t0;
        if (ar7Var != null) {
            ar7Var.invoke(iq7Var);
        }
    }
}
