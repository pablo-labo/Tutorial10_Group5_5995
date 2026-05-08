package defpackage;

import com.facebook.yoga.YogaNative;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c6h extends b6h {
    public long a;

    public c6h() {
        long jJni_YGConfigNewJNI = YogaNative.jni_YGConfigNewJNI();
        if (jJni_YGConfigNewJNI != 0) {
            this.a = jJni_YGConfigNewJNI;
        } else {
            r6.g("Failed to allocate native memory");
            throw null;
        }
    }
}
