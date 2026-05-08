package androidx.compose.ui.focus;

import androidx.compose.ui.e;
import defpackage.ev5;
import defpackage.qm5;
import defpackage.vu5;
import defpackage.wl7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    public static final class a implements qm5, ev5 {
        public final /* synthetic */ Function1 a;

        public a(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.ev5
        public final vu5<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof qm5) || !(obj instanceof ev5)) {
                return false;
            }
            return wl7.b(this.a, ((ev5) obj).c());
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final e a(Function1 function1) {
        return new FocusPropertiesElement(new a(function1));
    }
}
