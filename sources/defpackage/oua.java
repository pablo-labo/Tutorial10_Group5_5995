package defpackage;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes.dex */
public interface oua {

    @SuppressLint({"SyntheticAccessor"})
    public static final a.c a = new a.c();

    @SuppressLint({"SyntheticAccessor"})
    public static final a.b b = new a.b();

    public static abstract class a {

        /* JADX INFO: renamed from: oua$a$a, reason: collision with other inner class name */
        public static final class C0382a extends a {
            public final Throwable a;

            public C0382a(Throwable th) {
                this.a = th;
            }

            public final String toString() {
                return "FAILURE (" + this.a.getMessage() + ")";
            }
        }

        public static final class b extends a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends a {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
