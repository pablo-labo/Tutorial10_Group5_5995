package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface gza {

    public static final class a implements gza {
        @Override // defpackage.gza
        public final float a() {
            return 2.0f;
        }

        @Override // defpackage.gza
        public final float b(vl8 vl8Var) {
            return 4.0f;
        }

        @Override // defpackage.gza
        public final float c(vl8 vl8Var) {
            return 4.0f;
        }

        @Override // defpackage.gza
        public final float d() {
            return 2.0f;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof a) && j94.c(4.0f, 4.0f) && j94.c(2.0f, 2.0f) && j94.c(4.0f, 4.0f) && j94.c(2.0f, 2.0f);
        }

        public final int hashCode() {
            return Float.hashCode(2.0f) + k6.c(k6.c(Float.hashCode(4.0f) * 31, 2.0f, 31), 4.0f, 31);
        }

        public final String toString() {
            return "PaddingValues.Absolute(left=" + ((Object) j94.e(4.0f)) + ", top=" + ((Object) j94.e(2.0f)) + ", right=" + ((Object) j94.e(4.0f)) + ", bottom=" + ((Object) j94.e(2.0f)) + ')';
        }
    }

    float a();

    float b(vl8 vl8Var);

    float c(vl8 vl8Var);

    float d();
}
