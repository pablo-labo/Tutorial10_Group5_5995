package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public interface sw4 {
    public static final a l = new a();

    public static class a implements sw4 {
        @Override // defpackage.sw4
        public final void a(t52 t52Var, ArrayList arrayList) {
        }

        @Override // defpackage.sw4
        public final void d(hv1 hv1Var) {
            if (hv1Var == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1", "reportCannotInferVisibility"));
            }
        }
    }

    void a(t52 t52Var, ArrayList arrayList);

    void d(hv1 hv1Var);
}
