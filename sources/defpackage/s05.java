package defpackage;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class s05 implements d65<String> {
    public final Provider<Context> a;

    public s05(Provider<Context> provider) {
        this.a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        String packageName = this.a.get().getPackageName();
        if (packageName != null) {
            return packageName;
        }
        ja.k("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }
}
