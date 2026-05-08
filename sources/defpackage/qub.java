package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqub;", "Lec1;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class qub extends ec1 {
    public Function1<? super ms7, j6g> t0;

    @Override // defpackage.ec1
    public final String P() {
        return "profile-resume-data-import-bottom-sheet-modal";
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        String str = this.r0;
        if (wl7.b(str, "completed")) {
            Function1<? super ms7, j6g> function1 = this.t0;
            if (function1 != null) {
                function1.invoke(ms7.b);
                return;
            }
            return;
        }
        boolean zB = wl7.b(str, "cancel");
        Function1<? super ms7, j6g> function12 = this.t0;
        ms7 ms7Var = ms7.a;
        if (zB) {
            if (function12 != null) {
                function12.invoke(ms7Var);
            }
        } else if (function12 != null) {
            function12.invoke(ms7Var);
        }
    }
}
