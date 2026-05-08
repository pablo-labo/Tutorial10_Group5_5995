package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import defpackage.j94;
import defpackage.m7g;
import defpackage.qx9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "Lqx9;", "Lm7g;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class UnspecifiedConstraintsElement extends qx9<m7g> {
    public final float b;
    public final float c;

    public UnspecifiedConstraintsElement(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        m7g m7gVar = new m7g();
        m7gVar.d0 = this.b;
        m7gVar.e0 = this.c;
        return m7gVar;
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        m7g m7gVar = (m7g) cVar;
        m7gVar.d0 = this.b;
        m7gVar.e0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return j94.c(this.b, unspecifiedConstraintsElement.b) && j94.c(this.c, unspecifiedConstraintsElement.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }
}
