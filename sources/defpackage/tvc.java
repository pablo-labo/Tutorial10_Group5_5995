package defpackage;

import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class tvc extends vvc implements jw7 {
    public final Class<?> a;
    public final zr4 b = zr4.a;

    public tvc(Class<?> cls) {
        this.a = cls;
    }

    @Override // defpackage.ku7
    public final Collection<fu7> getAnnotations() {
        return this.b;
    }

    @Override // defpackage.vvc
    public final Type s() {
        return this.a;
    }

    public final bnb t() {
        Class cls = Void.TYPE;
        Class<?> cls2 = this.a;
        if (wl7.b(cls2, cls)) {
            return null;
        }
        return md8.c(cls2.getName()).h();
    }
}
