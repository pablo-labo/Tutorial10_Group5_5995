package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class hja extends wpa {
    public final /* synthetic */ ija d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hja(ija ijaVar) {
        super(false);
        this.d = ijaVar;
    }

    @Override // defpackage.wpa
    public final void b() {
        boolean z = w74.i0;
        ija ijaVar = this.d;
        if (z) {
            ijaVar.i();
            return;
        }
        w74.h0 = new WeakReference(ijaVar);
        ((np7) cr8.p(np7.class)).e("NonDestructiveReactFragment", ijaVar.getViewName().concat(" is handling the back press event"));
        ekc ekcVar = ijaVar.a;
        if (ekcVar != null) {
            ekcVar.f();
        } else {
            wl7.g("reactDelegate");
            throw null;
        }
    }
}
