package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vgg {
    public final ex4 a;
    public final boolean b;

    public vgg(ex4 ex4Var, boolean z) {
        this.a = ex4Var;
        this.b = z;
    }

    public static vgg a(vgg vggVar, boolean z) {
        vggVar.getClass();
        ex4 ex4Var = vggVar.a;
        vggVar.getClass();
        ex4Var.getClass();
        return new vgg(ex4Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgg)) {
            return false;
        }
        vgg vggVar = (vgg) obj;
        return this.a == vggVar.a && this.b == vggVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + ((this.a.hashCode() + (Boolean.hashCode(false) * 31)) * 31);
    }

    public final String toString() {
        return "UpdatedTermsState(shouldShowFullScreenError=false, errorScreenType=" + this.a + ", shouldShowRecordConsentError=" + this.b + ")";
    }

    public vgg() {
        this(0);
    }

    public /* synthetic */ vgg(int i) {
        this(ex4.c, false);
    }
}
