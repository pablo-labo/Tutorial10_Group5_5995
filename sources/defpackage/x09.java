package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import defpackage.ke3;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class x09<T> implements ke3<T> {
    public final Uri a;
    public final ContentResolver b;
    public T c;

    public x09(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
    }

    @Override // defpackage.ke3
    public final void b() {
        T t = this.c;
        if (t != null) {
            try {
                c(t);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t);

    @Override // defpackage.ke3
    public final void cancel() {
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.Object] */
    @Override // defpackage.ke3
    public final void d(knb knbVar, ke3.a<? super T> aVar) {
        try {
            ?? r2 = (T) f(this.b, this.a);
            this.c = r2;
            aVar.f(r2);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            aVar.c(e);
        }
    }

    @Override // defpackage.ke3
    public final xe3 e() {
        return xe3.a;
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri);
}
