package defpackage;

import app.rive.runtime.kotlin.core.ViewModelInstance;

/* JADX INFO: loaded from: classes3.dex */
public final class h4c {
    public final ViewModelInstance a;
    public final String b;
    public final String c;
    public final uqe d;

    public h4c(ViewModelInstance viewModelInstance, String str, String str2, uqe uqeVar) {
        this.a = viewModelInstance;
        this.b = str;
        this.c = str2;
        this.d = uqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h4c) {
            h4c h4cVar = (h4c) obj;
            if (this.a == h4cVar.a && this.b.equals(h4cVar.b) && this.c.equals(h4cVar.c) && this.d.equals(h4cVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "PropertyListener(instance=" + this.a + ", path=" + this.b + ", propertyType=" + this.c + ", job=" + this.d + ")";
    }
}
