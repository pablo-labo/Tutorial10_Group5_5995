package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface p35 extends bqf {

    public static final class a {
        public final wpf a;
        public final int[] b;

        public a(int i, wpf wpfVar, int[] iArr) {
            if (iArr.length == 0) {
                zkd.x("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.a = wpfVar;
            this.b = iArr;
        }
    }

    boolean a(int i, long j);

    int c();

    default boolean d(long j, k42 k42Var, List<? extends lg9> list) {
        return false;
    }

    void disable();

    void enable();

    boolean g(int i, long j);

    void h(float f);

    Object i();

    default void j() {
    }

    void l(long j, long j2, long j3, List<? extends lg9> list, mg9[] mg9VarArr);

    default void n(boolean z) {
    }

    int o(long j, List<? extends lg9> list);

    int p();

    androidx.media3.common.a q();

    int r();

    default void s() {
    }
}
