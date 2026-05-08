package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uxc {
    public final e77 a;
    public final String b;
    public final String c;
    public final String d;
    public final b8c e;

    public uxc(e77 e77Var, String str, String str2, String str3, b8c b8cVar) {
        yab yabVar = yab.ANDROID;
        z63 z63Var = z63.FIREBASE;
        e77Var.getClass();
        str.getClass();
        this.a = e77Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = b8cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxc)) {
            return false;
        }
        uxc uxcVar = (uxc) obj;
        yab yabVar = yab.ANDROID;
        z63 z63Var = z63.FIREBASE;
        return this.a == uxcVar.a && wl7.b(this.b, uxcVar.b) && this.c.equals(uxcVar.c) && this.d.equals(uxcVar.d) && this.e == uxcVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + akb.d(akb.d(akb.d((this.a.hashCode() + ((z63.FIREBASE.hashCode() + (yab.ANDROID.hashCode() * 31)) * 31)) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        yab yabVar = yab.ANDROID;
        z63 z63Var = z63.FIREBASE;
        StringBuilder sb = new StringBuilder("RegisterDeviceInput(platform=");
        sb.append(yabVar);
        sb.append(", credentialType=");
        sb.append(z63Var);
        sb.append(", appName=");
        sb.append(this.a);
        sb.append(", pushToken=");
        sb.append(this.b);
        sb.append(", clientVersion=");
        ia.r(sb, this.c, ", deviceId=", this.d, ", deviceType=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
