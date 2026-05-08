package defpackage;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* JADX INFO: loaded from: classes2.dex */
public final class n6h extends YogaNodeJNIBase {
    public final void finalize() throws Throwable {
        try {
            long j = this.f;
            if (j != 0) {
                this.f = 0L;
                YogaNative.jni_YGNodeFinalizeJNI(j);
            }
        } finally {
            super.finalize();
        }
    }
}
