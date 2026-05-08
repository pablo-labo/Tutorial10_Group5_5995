package androidx.compose.animation;

import androidx.compose.ui.e;
import defpackage.af1;
import defpackage.c20;
import defpackage.lie;
import defpackage.qx9;
import defpackage.vpe;
import defpackage.wl7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "Lqx9;", "Llie;", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class SizeAnimationModifierElement extends qx9<lie> {
    public final vpe b;
    public final af1 c = c20.a.a;

    public SizeAnimationModifierElement(vpe vpeVar) {
        this.b = vpeVar;
    }

    @Override // defpackage.qx9
    public final e.c a() {
        return new lie(this.b, this.c);
    }

    @Override // defpackage.qx9
    public final void b(e.c cVar) {
        lie lieVar = (lie) cVar;
        lieVar.d0 = this.b;
        lieVar.e0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        return wl7.b(this.b, sizeAnimationModifierElement.b) && wl7.b(this.c, sizeAnimationModifierElement.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.b + ", alignment=" + this.c + ", finishedListener=null)";
    }
}
