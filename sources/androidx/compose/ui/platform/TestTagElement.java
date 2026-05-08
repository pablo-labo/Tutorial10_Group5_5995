package androidx.compose.ui.platform;

import androidx.compose.ui.e;
import defpackage.acf;
import defpackage.qx9;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/TestTagElement;", "Lqx9;", "Lacf;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class TestTagElement extends qx9<acf> {
    public final String b;

    public TestTagElement(String str) {
        this.b = str;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        acf acfVar = new acf();
        acfVar.d0 = this.b;
        return acfVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        ((acf) cVar).d0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestTagElement)) {
            return false;
        }
        return wl7.b(this.b, ((TestTagElement) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
