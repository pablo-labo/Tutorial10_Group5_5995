package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qo5 implements po5 {
    public final float a;

    public qo5(float f) {
        this.a = f;
    }

    @Override // defpackage.po5
    public final float a() {
        return this.a;
    }

    @Override // defpackage.po5
    public final String b() {
        return "ital";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qo5) && this.a == ((qo5) obj).a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a) + 100522026;
    }

    public final String toString() {
        return l6.h(new StringBuilder("FontVariation.Setting(axisName='ital', value="), this.a, ')');
    }
}
