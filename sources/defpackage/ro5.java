package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ro5 implements po5 {
    public final int a;

    public ro5(int i) {
        this.a = i;
    }

    @Override // defpackage.po5
    public final float a() {
        return this.a;
    }

    @Override // defpackage.po5
    public final String b() {
        return "wght";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ro5) && this.a == ((ro5) obj).a;
    }

    public final int hashCode() {
        return 113071012 + this.a;
    }

    public final String toString() {
        return k6.h(new StringBuilder("FontVariation.Setting(axisName='wght', value="), this.a, ')');
    }
}
