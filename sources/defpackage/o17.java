package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public interface o17 {

    public interface a {
        void a(Bitmap bitmap);

        void onFailure(Exception exc);
    }

    void a(String str, a aVar);

    jge b(String str);
}
