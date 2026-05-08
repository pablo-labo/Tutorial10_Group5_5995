package defpackage;

import com.indeed.android.myjobs.data.model.BrandedAdsApiRequestParams;

/* JADX INFO: loaded from: classes3.dex */
public final class a06 {
    public final cm1 a;

    public static final class a {
        public final BrandedAdsApiRequestParams a;

        public a(BrandedAdsApiRequestParams brandedAdsApiRequestParams) {
            this.a = brandedAdsApiRequestParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Params(params=" + this.a + ")";
        }
    }

    public a06(cm1 cm1Var) {
        this.a = cm1Var;
    }
}
