package com.github.douglasjunior.reactNativePdfRenderer.modules;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public final HashSet a = new HashSet();
    public float b = 1.0f;

    /* JADX INFO: renamed from: com.github.douglasjunior.reactNativePdfRenderer.modules.a$a, reason: collision with other inner class name */
    public interface InterfaceC0147a {
        void a(float f);
    }

    public final void a(float f) {
        if (f == this.b) {
            return;
        }
        this.b = f;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0147a) it.next()).a(this.b);
        }
    }
}
