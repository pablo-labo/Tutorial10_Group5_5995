package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.e;
import defpackage.c80;
import defpackage.de7;
import defpackage.hu8;
import defpackage.lu8;
import defpackage.qx9;
import defpackage.rgf;
import defpackage.wl7;
import defpackage.zt8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "Lqx9;", "Lzt8;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class LegacyAdaptingPlatformTextInputModifier extends qx9<zt8> {
    public final hu8 b;
    public final lu8 c;
    public final rgf d;

    public LegacyAdaptingPlatformTextInputModifier(hu8 hu8Var, lu8 lu8Var, rgf rgfVar) {
        this.b = hu8Var;
        this.c = lu8Var;
        this.d = rgfVar;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new zt8(this.b, this.c, this.d);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) throws Throwable {
        zt8 zt8Var = (zt8) cVar;
        if (zt8Var.c0) {
            ((c80) zt8Var.d0).c();
            zt8Var.d0.j(zt8Var);
        }
        hu8 hu8Var = this.b;
        zt8Var.d0 = hu8Var;
        if (zt8Var.c0) {
            if (hu8Var.a != null) {
                de7.c("Expected textInputModifierNode to be null");
            }
            hu8Var.a = zt8Var;
        }
        zt8Var.e0 = this.c;
        zt8Var.f0 = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return wl7.b(this.b, legacyAdaptingPlatformTextInputModifier.b) && wl7.b(this.c, legacyAdaptingPlatformTextInputModifier.c) && wl7.b(this.d, legacyAdaptingPlatformTextInputModifier.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.b + ", legacyTextFieldState=" + this.c + ", textFieldSelectionManager=" + this.d + ')';
    }
}
