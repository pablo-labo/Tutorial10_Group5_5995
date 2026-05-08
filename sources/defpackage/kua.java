package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class kua {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public static final class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public ArrayList e;
        public ArrayList f;
        public ArrayList g;
    }

    public kua(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
    }

    public final String toString() {
        return "OpenIdDiscoveryDocument{issuer='" + this.a + "', authorizationEndpoint='" + this.b + "', tokenEndpoint='" + this.c + "', jwksUri='" + this.d + "', responseTypesSupported=" + this.e + ", subjectTypesSupported=" + this.f + ", idTokenSigningAlgValuesSupported=" + this.g + '}';
    }
}
