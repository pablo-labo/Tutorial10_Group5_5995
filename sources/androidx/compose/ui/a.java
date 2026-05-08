package androidx.compose.ui;

import androidx.compose.ui.e;
import defpackage.mj8;
import defpackage.w40;
import defpackage.wl7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {
    public final e b;
    public final e c;

    /* JADX INFO: renamed from: androidx.compose.ui.a$a, reason: collision with other inner class name */
    public static final class C0021a extends mj8 implements Function2<String, e.b, String> {
        public static final C0021a a = new C0021a(2);

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, e.b bVar) {
            String str2 = str;
            e.b bVar2 = bVar;
            if (str2.length() == 0) {
                return bVar2.toString();
            }
            return str2 + ", " + bVar2;
        }
    }

    public a(e eVar, e eVar2) {
        this.b = eVar;
        this.c = eVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.e
    public final <R> R c(R r, Function2<? super R, ? super e.b, ? extends R> function2) {
        return (R) this.c.c(this.b.c(r, function2), function2);
    }

    @Override // androidx.compose.ui.e
    public final boolean e(Function1<? super e.b, Boolean> function1) {
        return this.b.e(function1) && this.c.e(function1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.b.equals(aVar.b) && wl7.b(this.c, aVar.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return w40.f(new StringBuilder("["), (String) c("", C0021a.a), ']');
    }
}
