package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zac extends tp3 {

    public static final class a extends zac {
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final e9a f;

        public a(String str, String str2, String str3, String str4, e9a e9aVar) {
            super(e9aVar);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = e9aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.b, aVar.b) && wl7.b(this.c, aVar.c) && wl7.b(this.d, aVar.d) && wl7.b(this.e, aVar.e) && this.f.equals(aVar.f);
        }

        public final int hashCode() {
            String str = this.b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            return this.f.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        @Override // defpackage.tp3, defpackage.oec
        public final Bundle toBundle() {
            Bundle bundle = super.toBundle();
            String str = this.b;
            if (str != null) {
                bundle.putString("conversationId", str);
            }
            String str2 = this.c;
            if (str2 != null) {
                bundle.putString("starterMessage", str2);
            }
            String str3 = this.d;
            if (str3 != null) {
                bundle.putString("agentType", str3);
            }
            String str4 = this.e;
            if (str4 != null) {
                bundle.putString("url", str4);
            }
            return bundle;
        }

        public final String toString() {
            StringBuilder sbF = u40.f("HubWithDeeplink(conversationId=", this.b, ", starterMessage=", this.c, ", agentType=");
            ia.r(sbF, this.d, ", url=", this.e, ", nativeContext=");
            sbF.append(this.f);
            sbF.append(")");
            return sbF.toString();
        }
    }
}
