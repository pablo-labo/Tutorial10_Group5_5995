package defpackage;

import android.content.res.AssetManager;
import android.util.Log;
import defpackage.ke3;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class hu0<T> implements ke3<T> {
    public final String a;
    public final AssetManager b;
    public T c;

    public hu0(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    @Override // defpackage.ke3
    public final void b() {
        T t = this.c;
        if (t == null) {
            return;
        }
        try {
            c(t);
        } catch (IOException unused) {
        }
    }

    public abstract void c(T t);

    @Override // defpackage.ke3
    public final void cancel() {
    }

    @Override // defpackage.ke3
    public final void d(knb knbVar, ke3.a<? super T> aVar) {
        try {
            T tF = f(this.b, this.a);
            this.c = tF;
            aVar.f(tF);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            aVar.c(e);
        }
    }

    @Override // defpackage.ke3
    public final xe3 e() {
        return xe3.a;
    }

    public abstract T f(AssetManager assetManager, String str);
}
