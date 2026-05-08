package defpackage;

import com.facebook.yoga.YogaNative;

/* JADX INFO: loaded from: classes2.dex */
public final class d6h extends c6h {
    public final void finalize() throws Throwable {
        try {
            long j = this.a;
            if (j != 0) {
                this.a = 0L;
                YogaNative.jni_YGConfigFreeJNI(j);
            }
        } finally {
            super.finalize();
        }
    }
}
